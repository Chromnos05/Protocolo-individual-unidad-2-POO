/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;

/**
 *
 * @author Oscar Mercado
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Estudiante genérico";
        this.edad = 18;
        this.curso = "Sin asignar";
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this(); // Llama al constructor por defecto
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor con tres parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor con dos parámetros
        this.curso = curso;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso);
    }
    
}
