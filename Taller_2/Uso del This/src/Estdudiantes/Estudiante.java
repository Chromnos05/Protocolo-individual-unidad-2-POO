/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estdudiantes;

/**
 *
 * @author Oscar Mercado
 */
public class Estudiante {
    
    private String nombre;
    private int edad;

    // Constructor que recibe parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor por defecto que llama al constructor con parámetros
    public Estudiante() {
        this("Estudiante generico", 18); // Llama al otro constructor
    }

    // Método para imprimir los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
    
}
