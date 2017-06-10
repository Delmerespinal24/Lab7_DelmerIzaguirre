/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class adminBinarios {

    private ArrayList<Doctor> listaPersonas = new ArrayList();
    private File archivo = null;

    public adminBinarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Doctor> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Doctor> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas + '}';
    }

    //Extra mutador
    public void setPersona(Doctor p) {
        this.listaPersonas.add(p);
    }

    public void CargarArchivo() {
        try {
            listaPersonas = new ArrayList();
            Doctor temp;

            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Doctor) objeto.readObject()) != null) {
                        listaPersonas.add(temp);
                    }
                } catch (EOFException e) {
                    //Encontro el final del archivo
                }
                objeto.close();
                entrada.close();

            }
        } catch (Exception e) {
        }

    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Persona t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }

    }

}

