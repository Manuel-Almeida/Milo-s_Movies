
package menu;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Email {
    
    public String enviarCorreo(String correo, String password){
        
        //Caracteres para generar codigo de recuperacion
        String caracter1 = String.valueOf(password.length());
        String caracter2 = String.valueOf(password.charAt(password.length()-1));
        String caracter3 = String.valueOf(password.charAt(0));
        String caracter4 = String.valueOf(correo.charAt(0));
        String caracter5 = String.valueOf(correo.charAt(2));
        String caracter6 = String.valueOf(correo.charAt(3));
       
        //Codigo de recuperación
        String codigo = caracter1 + "-" + caracter2 + caracter3 + caracter4 + caracter5 + caracter6;
        
        try {
            
            JOptionPane.showMessageDialog(null, "Enviando Correo...");
            
            Properties props = new Properties();
            
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            
            Session session = Session.getDefaultInstance(props);
            
            String correoRemitente = "milosmovies7u7@gmail.com";
            String passwordRemitente = "CarlosHack";
            String correoReceptor = correo;
            String asunto = "Restauración de Contraseña";
            String mensaje = "Código de restauración: " + codigo;
            
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));
            
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje);
            
            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            
            JOptionPane.showMessageDialog(null, "Correo Enviado!!");
            
        } catch (AddressException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return codigo;
    }
}
