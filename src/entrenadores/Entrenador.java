/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;

import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author marii
 */
public class Entrenador extends Persona {
    protected String especialidad;
    protected int tiempoExperiencia;

    public String getEspecialidad() {
        return especialidad;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    } 
    
    public Entrenador(String nombre, LocalDate fecha, String telefono, String id, String especialidad, int tiempoExperiencia) {
        super(nombre, fecha, telefono, id);
        this.especialidad= especialidad;
        this.tiempoExperiencia= tiempoExperiencia;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nFecha Nacimiento: "+fecha+"\nTelefono: "+telefono+
                "\nIdentificacion: "+id+"\nEspecialidad: "+especialidad+ "Tiempo de Experiencia: "+tiempoExperiencia;
    
    
}
}