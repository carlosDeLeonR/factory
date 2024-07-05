/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Carlos Andres
 */
public class NotificacionFactory {
    
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "email":
                return new EmailNotificacion();
            case "sms":
                return new SMSNotificacion();
            case "app":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación desconocido: " + tipo);
        }
    }
}
