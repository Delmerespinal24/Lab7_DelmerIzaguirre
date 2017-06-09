
package Principal;

import Organos.Organo;
import java.util.*;

/**
 *
 * @author Owner
 */
public class Paciente extends Persona{
    private ArrayList<String> Enfermedades = new ArrayList();
    private Date fecha_ingreso;
    private Date fecha_alta;
    private ArrayList<String> Alergias = new ArrayList();
    private ArrayList<Organo> ListaOrganos = new ArrayList();

    public Paciente(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    public ArrayList<String> getEnfermedades() {
        return Enfermedades;
    }

    public void setEnfermedades(ArrayList<String> Enfermedades) {
        this.Enfermedades = Enfermedades;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public ArrayList<String> getAlergias() {
        return Alergias;
    }

    public void setAlergias(ArrayList<String> Alergias) {
        this.Alergias = Alergias;
    }

    public ArrayList<Organo> getListaOrganos() {
        return ListaOrganos;
    }

    public void setListaOrganos(ArrayList<Organo> ListaOrganos) {
        this.ListaOrganos = ListaOrganos;
    }
    
    public void addAlergias(String A) {
        this.Alergias.add(A);
    }
    
    public void addOrganos(Organo O) {
        this.ListaOrganos.add(O);
    }
    
    public void addEnfermedad(String E) {
        this.Enfermedades.add(E);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
   
}
