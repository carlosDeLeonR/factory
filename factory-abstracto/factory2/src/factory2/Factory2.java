/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory2;

/**
 *
 * @author Carlos Andres
 */
public class Factory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NotificacionFactory urgenteFactory = new UrgenteNotificacionFactory();
        NotificacionFactory regularFactory = new RegularNotificacionFactory();

        EmailNotificacion emailUrgente = urgenteFactory.crearEmailNotificacion();
        SMSNotificacion smsUrgente = urgenteFactory.crearSMSNotificacion();

        emailUrgente.enviarMensaje("se ha recivido un correo urgente");
        smsUrgente.enviarMensaje("se ha recivido un sms urgente");

        EmailNotificacion emailRegular = regularFactory.crearEmailNotificacion();
        SMSNotificacion smsRegular = regularFactory.crearSMSNotificacion();

        emailRegular.enviarMensaje("se ha recivido un correo");
        smsRegular.enviarMensaje("se ha recivido un sms.");


    }
    
}
