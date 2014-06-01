
package miGPUI;

import javax.mail.MessagingException;

/**
 * Interfaz que define el comportamiento de un receptor de mensajes, proporcionando un método recibirEmail()
 * que envía un email  a la dirección que figure como atributo del objeto que lo invoque. 
 * @param asunto. El asunto (Subject) del mensaje. 
 * @param textoMensaje. El texto que irá como cuerpo del mensaje. Puede ir escrito en html. 
 * @author Profesor
 */
public interface ReceptorDeMensajes {
   public void enviarleEmail(String asunto, String textoMensaje, String usuarioRemitente, String contrasenia)throws MessagingException;
}
