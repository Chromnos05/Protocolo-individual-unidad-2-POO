/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oscar Mercado
 */
public class Ejemplo_Incorrecto_y_Solucion {
    
    private int numero; // Atributo no estático (pertenece a cada instancia)

    // Método estático: intenta acceder al atributo no estático (INCORRECTO)
    public static void metodoIncorrecto() {
        // Esto provocará un error de compilación porque 'numero' es no estático
        // System.out.println(numero); // ERROR: No se puede acceder a un atributo de instancia desde un contexto estático
    }

    // Método correcto: convierte el atributo a estático o accede desde una instancia
    public void metodoCorrecto() {
        System.out.println(numero); // Esto funciona porque el método es no estático
    }
    
    /*
    -Un método estático no puede acceder directamente a atributos no estáticos porque estos últimos pertenecen a las instancias y no a la clase.
    -Para corregir el error, o bien se convierte el atributo a estático, o el método que accede a él debe ser no estático.
    */
    
}
