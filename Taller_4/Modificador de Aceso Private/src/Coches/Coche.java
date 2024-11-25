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
    
    // Propiedades privadas
    private String marca; // Marca del coche
    private String modelo; // Modelo del coche
    private int velocidadMaxima; // Velocidad máxima del coche

    // Constructor para inicializar las propiedades
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método público para incrementar la velocidad máxima
    public void acelerar(int incremento) {
        if (incremento > 0) { // Solo se incrementa si el valor es positivo
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    // Métodos getter y setter para acceder a las propiedades privadas
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
}
