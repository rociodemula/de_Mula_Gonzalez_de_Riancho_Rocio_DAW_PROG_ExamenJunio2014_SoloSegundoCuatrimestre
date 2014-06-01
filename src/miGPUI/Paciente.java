package miGPUI;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Profesor
 */
public abstract class Paciente implements Serializable, ReceptorDeMensajes {

    private static int numeroTotalPacientes;

    private String nif;
    private int annioPrimeraConsulta;
    private String nombrePaciente;
    private int numeroTratamientosPorFacturar;
    private String emailNotificaciones;

    public Paciente(String nif, int annioPrimeraConsulta, String nombrePaciente, int numeroTratamientosPorFacturar, String emailNotificaciones) throws IllegalArgumentException {
        this.setNif(nif);
        this.setAnnioPrimeraConsulta(annioPrimeraConsulta);
        this.setNombrePaciente(nombrePaciente);
        this.setNumeroTratamientosPorFacturar(numeroTratamientosPorFacturar);
        this.setEmailNotificaciones(emailNotificaciones);
        Paciente.numeroTotalPacientes++;
    }

    /**
     * @return the numeroTotalPacientes
     */
    protected static int getNumeroTotalPacientes() {
        return numeroTotalPacientes;
    }

    protected static void setNumeroTotalPacientes(int numeroTotalPacientes) {
        if (numeroTotalPacientes >= 0) {
            Paciente.numeroTotalPacientes = numeroTotalPacientes;
        } else {
            throw new IllegalArgumentException("Error: El número de pacientes no puede ser negativo.");
        }
    }

    /**
     * @return the nif
     */
    protected String getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    protected void setNif(String nif) throws IllegalArgumentException {
        if (Paciente.validarNif(nif)) {
            this.nif = nif;
        } else {
            throw new IllegalArgumentException("Error: El NIF que se quiere asignar no es válido.");
        }
    }

    /**
     * @return the annioPrimeraConsulta
     */
    protected int getAnnioPrimeraConsulta() {
        return annioPrimeraConsulta;
    }

    /**
     * @param annioPrimeraConsulta the annioPrimeraConsulta to set
     */
    protected void setAnnioPrimeraConsulta(int annioPrimeraConsulta) throws IllegalArgumentException {
        if (Paciente.validarAnnioPrimeraConsulta(annioPrimeraConsulta)) {
            this.annioPrimeraConsulta = annioPrimeraConsulta;
        } else {
            throw new IllegalArgumentException("Error: La primera consulta no puede ser anterior a 2000 (año de apertura de la clínica)\n"
                    + " ni posterior al año actual");
        }

    }

    /**
     * @return the nombrePaciente
     */
    protected String getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * @param nombrePaciente the nombrePaciente to set
     */
    protected void setNombrePaciente(String nombrePaciente) throws IllegalArgumentException {
        if (nombrePaciente == null) {
            throw new IllegalArgumentException("Error: No se ha proporcionado un nombre para asignar.");
        } else {
            if (nombrePaciente.length() > 100) {
                throw new IllegalArgumentException("Error: El nombre no puede exceder los 100 caracteres.");
            } else {
                this.nombrePaciente = nombrePaciente;
            }
        }
    }

    protected int getNumeroTratamientosPorFacturar() {
        return this.numeroTratamientosPorFacturar;
    }

    protected void setNumeroTratamientosPorFacturar(int numeroTratamientosPorFacturar) throws IllegalArgumentException {
        if (numeroTratamientosPorFacturar >= 0 && numeroTratamientosPorFacturar < 5) {
            this.numeroTratamientosPorFacturar = numeroTratamientosPorFacturar;
        } else {
            throw new IllegalArgumentException("Error: El número de tratamientos por facturar debe ser un número entre 0 y 4");
        }
    }

    /**
     * @return the emailNotificaciones
     */
    protected String getEmailNotificaciones() throws IllegalArgumentException {
        return emailNotificaciones;
    }

    /**
     * @param emailNotificaciones the emailNotificaciones to set
     */
    protected void setEmailNotificaciones(String emailNotificaciones) {
        if (Paciente.validarEmailNotificaciones(emailNotificaciones)) {
            this.emailNotificaciones = emailNotificaciones;
        } else {
            throw new IllegalArgumentException("Error: El email no es una dirección de email válida");
        }
    }

    protected int getAntiguedad() {
        int annioActual = Calendar.getInstance().get(Calendar.YEAR);
        return annioActual - this.getAnnioPrimeraConsulta();
    }

    protected static boolean validarNif(String nif) throws IllegalArgumentException {
        // Variable que devolverá el método
        boolean correcto = false;

        if (nif != null) {
            // Se pasa a mayúscula en caso de que se introduzca minúscula y así comparar sólo con mayúsculas.
            nif = nif.toUpperCase();

            // Extraemos el número en sí, sin la letra
            String dni = nif.substring(0, nif.length() - 1);

            // Letra del nif
            char letraDni = nif.charAt(nif.length() - 1);

            int numeroDni;

            // Si la longitud del nif es correcta
            if (nif.length() >= 2 && nif.length() <= 9) {
                while (nif.length() < 9) { //Para nº de DNI de menos de 8 dígitos, rellenamos con ceros a la izquierda. 
                    nif = "0" + nif;
                }
                try {
                    // Número como entero
                    numeroDni = Integer.parseInt(dni);
                    String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
                    char letra = cadena.charAt(numeroDni % 23);
                    if (letraDni == letra) {
                        correcto = true;
                    } else {
                        throw new IllegalArgumentException("Error: La letra del NIF no es la que corresponde a ese número de DNI.");
                    }

                } catch (NumberFormatException nfe) {
                    throw new IllegalArgumentException("Error: El nº de  DNI no es un número entero válido.");
                }
            } else {
                throw new IllegalArgumentException("Error: El nº de  DNI debe tener al menos dos caracteres (dígito y letra) y como máximo 9");
            }
        } else {
            throw new IllegalArgumentException("Error: No se ha introducido ningún nif.");
        }
        return correcto;
    }

    protected static boolean validarAnnioPrimeraConsulta(int annioPrimeraConsulta) {
        /*
         * La primera consulta no puede ser anterior a la apertura de la clínica en 2000, ni posterior al año actual.
         */
        boolean valido = false;
        Calendar calendario = Calendar.getInstance();
        int annioActual = calendario.get(Calendar.YEAR);
        if (annioPrimeraConsulta >= 2000 && annioPrimeraConsulta <= annioActual) {
            valido = true;
        }
        return valido;
    }

    protected static boolean validarEmailNotificaciones(String emailNotificaciones) {

        boolean valido = false;

        Pattern patronEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mEmail = patronEmail.matcher(emailNotificaciones.toLowerCase());
        if (mEmail.matches()) {
            valido = true;
        }
        return valido;
    }

    public void enviarleEmail(String asunto, String textoMensaje, String usuarioRemitente, String contrasenia) throws MessagingException {
        Properties propiedadesSesion = new Properties();

        // Nombre del host de correo
        propiedadesSesion.setProperty("mail.smtp.host", "smtp.gmail.com");

        // TLS si está disponible
        propiedadesSesion.setProperty("mail.smtp.starttls.enable", "true");

        // Puerto de gmail para envio de correos
        propiedadesSesion.setProperty("mail.smtp.port", "587");

        // Nombre del usuario
        propiedadesSesion.setProperty("mail.smtp.user", "Liquidación de Impuesto de vehículos");

        // Si requiere o no usuario y password para conectarse. En este caso, indicamos que sí. 
        propiedadesSesion.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(propiedadesSesion);

        // En lugar de capturar la excepción, dejamos que se produzca y la delegamos, para que el código que hace la llamada al método
        // mande el aviso adecuado. 
        try {
            /*
             * Ahora construimos el mensaje. 
             */
            MimeMessage mensaje = new MimeMessage(sesion);

            // Quién envia el correo.
            // en este caso pongo una cuenta ficticia del club deportivo, desde la que se supone que se mandará la información 
            // del boletón mensual a los socios. Para hacer pruebas, podréis probar con una cuenta de gmail que probéis, o con la
            // vuestra actualizando el host de vuestro servidor de correo en propiedades. 
            mensaje.setFrom(new InternetAddress(usuarioRemitente));

            // A quién va dirigido. 
            // Podríamos añadir "un recipiente" por cada dirección a la que queramos enviar el mensaje. 
            // En este caso, se envía a una única dirección, un mensaje a un propeitario concreto para el que se invoca al método. 
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(this.getEmailNotificaciones()));

            // Qué asunto queremos que muestre.
            mensaje.setSubject(asunto);

            // Qué texto llevará el cuerpo del mensaje
            mensaje.setText(textoMensaje, "UTF-8", "html");

            // Enviamos el mensaje. 
            Transport t = sesion.getTransport("smtp");
            // Como le dijimos que era necesaria la autentificación, debe pedir usuario y contraseña. 
            // Naturalmente como es una cuenta ficticia, la contraseña no es auténtica  así que con estos datos no funcionará, pero probad con 
            // una cuenta válida de gmail, y la contraseña correspondiente, y debe funcionar. 
            t.connect(usuarioRemitente, contrasenia);
            t.sendMessage(mensaje, mensaje.getAllRecipients());

        } catch (MessagingException mex) {
            throw new MessagingException("Fallo en el envío. Usuario y Contraseña no válidos: \n" + mex.getMessage());
        }
    }

    protected abstract double liquidarFacturacion();

    public String toString() {
        String cadenaPacienteComoString = "";
        cadenaPacienteComoString += "NIF: " + this.getNif() + ". Año de primera consulta: " + this.getAnnioPrimeraConsulta()
                + ". Nombre paciente: " + this.getNombrePaciente() + ". Email para notificaciones: " + this.getEmailNotificaciones() + ". \n";
        return cadenaPacienteComoString;
    }
}
