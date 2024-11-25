/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejemplo_Incorrecto obj = new Ejemplo_Incorrecto(10);

        // Intentar acceder directamente al atributo privado (ERROR)
        // System.out.println(obj.numero); // ERROR: 'numero' tiene acceso privado
        
    }
    
    
    /*
    No implementar métodos get y set:
    Si una clase no incluye métodos get y set para un atributo privado, ese atributo será completamente inaccesible desde fuera de la clase, lo que podría dificultar el uso práctico de esa propiedad.
    */
    
}
