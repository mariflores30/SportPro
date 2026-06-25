/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;
import entrenadores.Entrenador;
import entranamientos.Entrenamiento;
import participantes.Participante;

/**
 *
 * @author María J
 */
public class Disciplina {

    private TipoDisciplina nombre;
    private TipoCategoria categoria;
    private int capacidadMaxima;

    private Entrenador[] entrenadores;
    private Participante[] participantes;
    private Entrenamiento[] entrenamientos;

    public Disciplina() {
    }

    public Disciplina(TipoDisciplina nombre, TipoCategoria categoria,
            int capacidadMaxima, Entrenador[] entrenadores,
            Participante[] participantes,
            Entrenamiento[] entrenamientos) {

        this.nombre = nombre;
        this.categoria = categoria;
        this.capacidadMaxima = capacidadMaxima;
        this.entrenadores = entrenadores;
        this.participantes = participantes;
        this.entrenamientos = entrenamientos;
    }

    public TipoDisciplina getNombre() {
        return nombre;
    }

    public void setNombre(TipoDisciplina nombre) {
        this.nombre = nombre;
    }

    public TipoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria) {
        this.categoria = categoria;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Entrenador[] getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenador[] entrenadores) {
        this.entrenadores = entrenadores;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public Entrenamiento[] getEntrenamientos() {
        return entrenamientos;
    }

    public void setEntrenamientos(Entrenamiento[] entrenamientos) {
        this.entrenamientos = entrenamientos;
    }

    public boolean verificarEspaciosDisponibles() {
        return obtenerCantidadParticipantes() < capacidadMaxima;
    }

    public boolean alcanzoCapacidadMaxima() {
        return obtenerCantidadParticipantes() >= capacidadMaxima;
    }

    public int obtenerCantidadParticipantes() {

        if (participantes == null) {
            return 0;
        }

        int contador = 0;

        for (Participante p : participantes) {
            if (p != null) {
                contador++;
            }
        }

        return contador;
    }
}