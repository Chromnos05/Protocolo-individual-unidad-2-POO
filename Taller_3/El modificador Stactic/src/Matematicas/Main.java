/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matematicas;

/**
 *
 * @author cscam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Llama a los métodos estáticos de Matematicas sin necesidad de crear un objeto
        System.out.println("Suma: " + Matematica.suma(5, 3)); // Suma 5 + 3
        System.out.println("Resta: " + Matematica.resta(5, 3)); // Resta 5 - 3
        System.out.println("Multiplicacion: " + Matematica.multiplicacion(5, 3)); // Multiplica 5 * 3
        System.out.println("Division: " + Matematica.division(5, 2)); // Divide 5 / 2
    }
    
}
