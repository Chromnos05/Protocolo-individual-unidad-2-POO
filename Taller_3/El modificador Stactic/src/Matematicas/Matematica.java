/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematicas;

/**
 *
 * @author Oscar Mercado
 */
public class Matematica {
    
    // Método estático para sumar dos números
    public static int suma(int a, int b) {
        return a + b; // Devuelve la suma de a y b
    }

    // Método estático para restar dos números
    public static int resta(int a, int b) {
        return a - b; // Devuelve la resta de a y b
    }

    // Método estático para multiplicar dos números
    public static int multiplicacion(int a, int b) {
        return a * b; // Devuelve el producto de a y b
    }

    // Método estático para dividir dos números (tipo double)
    public static double division(double a, double b) {
        if (b != 0) { // Comprueba que no se divida entre cero
            return a / b; // Devuelve el cociente
        } else {
            // Lanza una excepción si se intenta dividir entre cero
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
    
}
