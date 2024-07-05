/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

/**
 *
 * @author Carlos Andres
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion emailNotificacion = factory.crearNotificacion("email");
        Notificacion smsNotificacion = factory.crearNotificacion("sms");
        Notificacion appNotificacion = factory.crearNotificacion("app");

        emailNotificacion.enviarMensaje("se enviara un correo");
        smsNotificacion.enviarMensaje("mensajeando al numero 555231");
        appNotificacion.enviarMensaje("contactando con la aplicacion");
    }
    
}
