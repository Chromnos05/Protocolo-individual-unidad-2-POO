/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos.Refactor;

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
        Ejemplo_Correcto miCoche = new Ejemplo_Correcto("Toyota", "Corolla", 180);

        // Usar métodos getter para obtener los valores de los atributos
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad maxima: " + miCoche.getVelocidadMaxima() + " km/h");

        // Intentar incrementar la velocidad máxima
        miCoche.acelerar(20); // Incremento válido
        System.out.println("Nueva velocidad maxima: " + miCoche.getVelocidadMaxima() + " km/h");

        // Intentar asignar una velocidad máxima inválida
        miCoche.setVelocidadMaxima(-50); // Este cambio no será aceptado
        System.out.println("Velocidad maxima tras intento invalido: " + miCoche.getVelocidadMaxima() + " km/h");

        // Cambiar marca y modelo usando los setters
        miCoche.setMarca("Honda");
        miCoche.setModelo("Civic");
        System.out.println("Nueva marca: " + miCoche.getMarca());
        System.out.println("Nuevo modelo: " + miCoche.getModelo());
    }
        
    
    
}
