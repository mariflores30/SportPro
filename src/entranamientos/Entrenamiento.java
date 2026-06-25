/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entranamientos;

import disciplinas.Disciplina;
import disciplinas.TipoCategoria;
import disciplinas.TipoDisciplina;
import entrenadores.Entrenador;
import java.time.LocalDate;
import participantes.Participante;


/**
 *
 * @author PC
 */
public class Entrenamiento extends Disciplina {
    protected int horaInicio;
    protected int horaFinal;
    protected int minInicio;
    protected int minfinal;
    protected LocalDate fecha;
    protected double duracion;
    
    
    

    public LocalDate getFecha() {
        return fecha;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setFecha() {
        this.fecha = fecha;
    }
    
    public int getHoraFinal(){
        return horaFinal;
    }
    public int getMinInicio(){
        return minInicio;
            }    
    public int getMinfinal(){
        return minfinal;
    }

    @Override
    public TipoDisciplina getNombre() {
        return super.getNombre(); 
    }

   

    public Entrenamiento(int horaInicio, int horaFinal, int minInicio, int minfinal, LocalDate fecha, double duracion, TipoDisciplina nombre, TipoCategoria categoria, int capacidadMaxima, Entrenador[] entrenadores, Participante[] participantes, Entrenamiento[] entrenamientos) {
        super(nombre, categoria, capacidadMaxima, entrenadores, participantes, entrenamientos);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.minInicio = minInicio;
        this.minfinal = minfinal;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    
    
   
    
    
    
    
    
    public void calcularDuracion(){
        int inicio = horaInicio * 60 + minInicio;
        int end = horaFinal * 60 + minfinal;
         
        duracion = end - inicio;
        
        
        
        
    }

    public String toString() {
        return "Entrenamiento{ horaInicio=" + horaInicio + 
                "/n horaFinal=" + horaFinal + 
                "/n minInicio=" + minInicio + 
                "/n minfinal=" + minfinal +
                "/n fecha=" + fecha + 
                "/n duracion=" + duracion + 
                "/n disciplina= "+ getNombre()+
                "}";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
}
