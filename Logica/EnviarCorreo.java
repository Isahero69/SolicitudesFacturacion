package Logica;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class EnviarCorreo {

    private final String correo = "isaiasgustavohernandezroman@gmail.com";
    private final String contrasena = "uzjmhuzqqirupcih";
    private final String correoDestino = "isaiasgustavohernandezroman@gmail.com";

    public void SendMail(List<File> archivoAdjunto, String html) throws MessagingException {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.user", correo);
        props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);

        Multipart multipart = new MimeMultipart();

        String mensajeHtml = html;//recibe info html  
        //creamos el cuerpo del correo con BodyPart
        BodyPart texto = new MimeBodyPart();
        texto.setContent(mensajeHtml, "text/html; charset=utf-8");
        multipart.addBodyPart(texto);

        //Adjuntar Archivos
        for (File recorrer : archivoAdjunto) {
            MimeBodyPart Aradjunto = new MimeBodyPart();
            try {
                Aradjunto.attachFile(recorrer);
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
            multipart.addBodyPart(Aradjunto);

        }

        try {
            Message enviarMensaje = new MimeMessage(session);
            enviarMensaje.setFrom(new InternetAddress(correo));
            enviarMensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
            enviarMensaje.setSubject("Solicitud Facturacion Electronica");
            enviarMensaje.setContent(multipart);

            Transport t = session.getTransport("smtp");
            t.connect(correo, contrasena);
            t.sendMessage(enviarMensaje, enviarMensaje.getAllRecipients());
            t.close();
        } catch (MessagingException e) {
            System.out.println(e.toString());
        }

    }

    public void SendMailSinAdjuntos(String html) throws MessagingException {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.user", correo);
        props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);

        Multipart multipart = new MimeMultipart();

        String mensajeHtml = html;//recibe info html  
        //creamos el cuerpo del correo con BodyPart
        BodyPart texto = new MimeBodyPart();
        texto.setContent(mensajeHtml, "text/html; charset=utf-8");
        multipart.addBodyPart(texto);

        try {
            Message enviarMensaje = new MimeMessage(session);
            enviarMensaje.setFrom(new InternetAddress(correo));
            enviarMensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
            enviarMensaje.setSubject("Solicitud Facturacion Electronica");
            enviarMensaje.setContent(multipart);

            Transport t = session.getTransport("smtp");
            t.connect(correo, contrasena);
            t.sendMessage(enviarMensaje, enviarMensaje.getAllRecipients());
            t.close();
        } catch (MessagingException e) {
            System.out.println(e.toString());
        }

    }

}
