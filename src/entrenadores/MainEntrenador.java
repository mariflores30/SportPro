/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrenadores;

import java.time.LocalDate;

/**
 *
 * @author marii
 */
public class MainEntrenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Entrenador entrenador = new Entrenador(
                "Carlos Mora",
                LocalDate.of(1985, 5, 10),
                "8888-9999",
                "123456789",
                "Futbol",
                12
        );

        System.out.println(entrenador);

        System.out.println("Nombre: " + entrenador.getNombre());
        System.out.println("Especialidad: " + entrenador.getEspecialidad());
        System.out.println("Años de experiencia: " + entrenador.getTiempoExperiencia());
    }
    
}
