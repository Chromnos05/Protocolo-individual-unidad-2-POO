/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estdudiantes;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante(); // Constructor por defecto
        estudiante1.mostrarDetalles(); // Salida: Nombre: Estudiante genérico, Edad: 18

        Estudiante estudiante2 = new Estudiante("Ana", 20); // Constructor parametrizado
        estudiante2.mostrarDetalles(); // Salida: Nombre: Ana, Edad: 20
        
    }
    
}
