/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Doctor extends Persona{
    private ArrayList<String> especialidades = new ArrayList();
    private ArrayList<Paciente> pacientes = new ArrayList();
    private String HorarioTrabajo;
    private int aniosTrabajo;
    private ArrayList<String> DiasTrabajo = new ArrayList();

    public Doctor() {
        super();
    }

    public Doctor(String HorarioTrabajo, int aniosTrabajo, String nombre, int edad, int ID, double altura, double peso, String sexo) {
        super(nombre, edad, ID, altura, peso, sexo);
        this.HorarioTrabajo = HorarioTrabajo;
        this.aniosTrabajo = aniosTrabajo;
    }
    
    
    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public String getHorarioTrabajo() {
        return HorarioTrabajo;
    }

    public void setHorarioTrabajo(String HorarioTrabajo) {
        this.HorarioTrabajo = HorarioTrabajo;
    }

    public int getAniosTrabajo() {
        return aniosTrabajo;
    }

    public void setAniosTrabajo(int aniosTrabajo) {
        this.aniosTrabajo = aniosTrabajo;
    }

    public ArrayList<String> getDiasTrabajo() {
        return DiasTrabajo;
    }

    public void setDiasTrabajo(ArrayList<String> DiasTrabajo) {
        this.DiasTrabajo = DiasTrabajo;
    }
    
    public void addPaciente(Paciente p){
        this.pacientes.add(p);
    }
    
    public boolean compararDoctor(Doctor d){
        if(super.getNombre().equals(d.getNombre()) && super.getAltura() == d.getAltura() && super.getEdad() == d.getEdad()){
            if(super.getID() == d.getID() && super.getPeso() == d.getPeso() && super.getSexo().equals(d.getSexo())){
                return true;
            }
            
        }
        return false;
    }
    
    
    @Override
    public String toString() {
        return super.getNombre();
    }
      
}
