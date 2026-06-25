/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author PC
 */
public class Persona  {
    protected String nombre;
    protected LocalDate fecha;
    protected String telefono;
    protected String id;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfecha() {
        return fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(String nombre, LocalDate fecha, String telefono, String id) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.telefono = telefono;
        this.id = id;
    }
    
    
    public void calcularEdad(){
        Period.between(fecha, LocalDate.now()).getYears();
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
