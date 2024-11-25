/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Coches;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 180);

        // Intentar acceder directamente a las propiedades privadas (ERROR)
        // miCoche.marca = "Honda"; // ERROR: marca tiene acceso privado
        // miCoche.modelo = "Civic"; // ERROR: modelo tiene acceso privado

        // Usar los métodos públicos para interactuar con las propiedades
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad máxima: " + miCoche.getVelocidadMaxima());

        // Incrementar la velocidad máxima usando el método acelerar
        miCoche.acelerar(20);
        System.out.println("Nueva velocidad máxima: " + miCoche.getVelocidadMaxima());
        
    }
    
}
