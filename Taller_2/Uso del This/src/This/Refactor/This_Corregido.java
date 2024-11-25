/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package This.Refactor;

/**
 *
 * @author cscam
 */
public class This_Corregido {
    
    private String mensaje = "Hola desde Java";

    // Método no estático que puede usar this
    public void imprimirMensaje() {
        System.out.println(this.mensaje); // Correcto
    }
    
}
