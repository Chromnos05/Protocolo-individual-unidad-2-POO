/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

/**
 *
 * @author Oscar Mercado
 */
public class Producto {
    
    private String nombre;
    private double precio;

    // Constructor que utiliza this para diferenciar atributos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para imprimir los detalles del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + ", Precio: $" + this.precio);
    }

    // Métodos de acceso (getters)
    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    // Clase principal para probar
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1200.99);
        producto.mostrarProducto(); // Salida: Producto: Laptop, Precio: $1200.99
    }
    
}
