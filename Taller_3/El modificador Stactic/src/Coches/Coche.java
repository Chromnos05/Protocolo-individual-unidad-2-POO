/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coches;

/**
 *
 * @author Oscar Mercado
 */
public class Coche {
    
    // Atributos de instancia (pertenecen a cada objeto individual de la clase)
    private String marca; // Marca del coche
    private String modelo; // Modelo del coche

    // Atributo estático (compartido por todas las instancias de la clase)
    private static int contadorCoches = 0;

    // Constructor: se ejecuta al crear un nuevo objeto de la clase Coche
    public Coche(String marca, String modelo) {
        this.marca = marca; // Asigna el valor de la marca al atributo de la instancia
        this.modelo = modelo; // Asigna el valor del modelo al atributo de la instancia
        contadorCoches++; // Incrementa el contador de coches (atributo estático)
    }

    // Método estático: devuelve el número de coches creados
    public static int getContadorCoches() {
        return contadorCoches; // Accede al atributo estático directamente
    }

    // Métodos getter para acceder a los atributos de instancia
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
}
