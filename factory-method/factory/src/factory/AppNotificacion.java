/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Carlos Andres
 */
public class AppNotificacion implements Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("mensaje enviado a la app es: " + mensaje);
    }
    
}
