/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Refactor;

/**
 *
 * @author Oscar Mercado
 */
public class Ejemplo_Correcto {
    
    // Atributos privados (accesibles solo dentro de la clase)
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor para inicializar los atributos
    public Ejemplo_Correcto(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadMaxima > 0) { // Validación para asegurar que sea positivo
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0; // Valor por defecto en caso de valor inválido
        }
    }

    // Método público para incrementar la velocidad máxima
    public void acelerar(int incremento) {
        if (incremento > 0) { // Solo aumenta si el incremento es positivo
            velocidadMaxima += incremento;
            System.out.println("La velocidad máxima se incrementó en " + incremento + " km/h.");
        } else {
            System.out.println("El incremento debe ser positivo. No se realizó ningún cambio.");
        }
    }

    // Métodos getter y setter con validaciones
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca; // Asignación sin restricciones en este caso
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; // Asignación sin restricciones en este caso
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0) { // Validación: la velocidad máxima debe ser positiva
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad máxima debe ser positiva. No se realizó ningún cambio.");
        }
    }
    
}
