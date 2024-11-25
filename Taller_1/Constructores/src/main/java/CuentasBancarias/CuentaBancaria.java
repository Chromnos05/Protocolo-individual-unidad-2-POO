/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasBancarias;

/**
 *
 * @author Oscar Mercado
 */
public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // Constructor con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicial predeterminado
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Métodos getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo: " + tipoCuenta);
    }
    
}
