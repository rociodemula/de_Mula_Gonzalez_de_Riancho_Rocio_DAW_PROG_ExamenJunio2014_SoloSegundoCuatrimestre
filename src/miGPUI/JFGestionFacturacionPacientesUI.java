/*
* Apellidos: de Mula González de Riancho
* Nombre: Rocío
* Me examino de: Sólo del SEGUNDO parcial.
*/
package miGPUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Nar
 */
public class JFGestionFacturacionPacientesUI extends javax.swing.JFrame {

     // Declarar arraylist para almacenar a los pacientes
    private static ArrayList <Paciente> listaPacientes = new ArrayList<>();
    // Variable para controlar si se da a Salir de la aplicación sin grabar
    private static boolean hayCambios = false;

    /**
     * Creates new form JFGestionFacturacionPacientesUI
     */
    public JFGestionFacturacionPacientesUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLNIFABuscar = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBSalirAplicacion = new javax.swing.JButton();
        jTFNifABuscar = new javax.swing.JTextField();
        jmbBarraMenus = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMIAbrir = new javax.swing.JMenuItem();
        jMIGuardar = new javax.swing.JMenuItem();
        jMISalir = new javax.swing.JMenuItem();
        jMPacientes = new javax.swing.JMenu();
        jMIAltaPacientes = new javax.swing.JMenu();
        jMIAltaPacientePrivado = new javax.swing.JMenuItem();
        jMIAltaPacienteSeguroMedico = new javax.swing.JMenuItem();
        jMIListarPacientes = new javax.swing.JMenuItem();
        jMUtilidades = new javax.swing.JMenu();
        jMIEnvioLiquidacionesFacturacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Clínica dental: Gestión de Facturación a Pacientes.");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar  para Mostrar/ Actualizar / Eliminar"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLNIFABuscar.setText("NIF:");
        jLNIFABuscar.setToolTipText("");

        jBBuscar.setMnemonic('B');
        jBBuscar.setText("Buscar");
        jBBuscar.setToolTipText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSalirAplicacion.setMnemonic('S');
        jBSalirAplicacion.setText("Salir de la aplicación");
        jBSalirAplicacion.setToolTipText("Salir de la aplicación");
        jBSalirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirAplicacionjButtonSalirDeAplicacionActionPerformed(evt);
            }
        });

        jTFNifABuscar.setText("Introducir aquí  el NIF a buscar.");
        jTFNifABuscar.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLNIFABuscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addComponent(jBBuscar))
                    .addComponent(jTFNifABuscar))
                .addGap(44, 44, 44)
                .addComponent(jBSalirAplicacion)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNIFABuscar)
                    .addComponent(jTFNifABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jBSalirAplicacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMArchivo.setMnemonic('A');
        jMArchivo.setText("Archivo");
        jMArchivo.setToolTipText("Archivo");

        jMIAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMIAbrir.setMnemonic('b');
        jMIAbrir.setText("Abrir");
        jMIAbrir.setToolTipText("Abrir");
        jMIAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAbrirActionPerformed(evt);
            }
        });
        jMArchivo.add(jMIAbrir);

        jMIGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMIGuardar.setMnemonic('G');
        jMIGuardar.setText("Guardar");
        jMIGuardar.setToolTipText("Guardar");
        jMIGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGuardarActionPerformed(evt);
            }
        });
        jMArchivo.add(jMIGuardar);

        jMISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMISalir.setMnemonic('S');
        jMISalir.setText("Salir");
        jMISalir.setToolTipText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMArchivo.add(jMISalir);

        jmbBarraMenus.add(jMArchivo);

        jMPacientes.setMnemonic('P');
        jMPacientes.setText("Pacientes");
        jMPacientes.setToolTipText("Pacientes");

        jMIAltaPacientes.setMnemonic('t');
        jMIAltaPacientes.setText("Alta de Pacientes");
        jMIAltaPacientes.setToolTipText("Alta de Pacientes");

        jMIAltaPacientePrivado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMIAltaPacientePrivado.setMnemonic('v');
        jMIAltaPacientePrivado.setText("Alta de un Paciente Privado");
        jMIAltaPacientePrivado.setToolTipText("Alta de un Paciente Privado");
        jMIAltaPacientePrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAltaPacientePrivadoActionPerformed(evt);
            }
        });
        jMIAltaPacientes.add(jMIAltaPacientePrivado);

        jMIAltaPacienteSeguroMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMIAltaPacienteSeguroMedico.setMnemonic('m');
        jMIAltaPacienteSeguroMedico.setText("Alta de un Paciente con Seguro Médico");
        jMIAltaPacienteSeguroMedico.setToolTipText("Alta de un Paciente con Seguro Médico");
        jMIAltaPacienteSeguroMedico.setEnabled(false);
        jMIAltaPacientes.add(jMIAltaPacienteSeguroMedico);

        jMPacientes.add(jMIAltaPacientes);

        jMIListarPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMIListarPacientes.setMnemonic('L');
        jMIListarPacientes.setText("Listar Pacientes");
        jMIListarPacientes.setToolTipText("Listar Pacientes");
        jMIListarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListarPacientesActionPerformed(evt);
            }
        });
        jMPacientes.add(jMIListarPacientes);

        jmbBarraMenus.add(jMPacientes);

        jMUtilidades.setMnemonic('U');
        jMUtilidades.setText("Utilidades");
        jMUtilidades.setToolTipText("Utilidades");

        jMIEnvioLiquidacionesFacturacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMIEnvioLiquidacionesFacturacion.setMnemonic('E');
        jMIEnvioLiquidacionesFacturacion.setText("Envío Liquidaciones Facturación");
        jMIEnvioLiquidacionesFacturacion.setToolTipText("Envío de Liquidaciones de Facturación");
        jMIEnvioLiquidacionesFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEnvioLiquidacionesFacturacionActionPerformed(evt);
            }
        });
        jMUtilidades.add(jMIEnvioLiquidacionesFacturacion);

        jmbBarraMenus.add(jMUtilidades);

        setJMenuBar(jmbBarraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // Comprobar el texto que e haya introducido
        String texto = jTFNifABuscar.getText() ;
        String nifABuscar = texto.trim() ;
        buscar(nifABuscar, this);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSalirAplicacionjButtonSalirDeAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirAplicacionjButtonSalirDeAplicacionActionPerformed
        if (JFGestionFacturacionPacientesUI.hayCambios){ 
            if (JOptionPane.showConfirmDialog(null, 
                    "Ha habido cambios que no se han guardado. ¿Desea salir sin guardar?",
                "Salir de la aplicación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                //si hay cambios pedimos confirmación antes de salir... y si respondemos que sí, salimos.
            
            System.exit(0);
           }// si hay cambios, y respondemos que no... no hay que hacer nada, seguimos donde estábamos. 
        }else{ //si no hay cambios, salimos directamente. 
            System.exit(0);
        }
    }//GEN-LAST:event_jBSalirAplicacionjButtonSalirDeAplicacionActionPerformed

    private void jMIAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAbrirActionPerformed
        File ficheroElegido=null;
        try{
            
            // Mostrar para elegir el fichero desde donde restaurar
            JFileChooser fileChooser = new JFileChooser(".");  // inicializado para mostrar el contenido de la carpeta del proyecto

            int status = fileChooser.showOpenDialog(null);// Abre un JFileChooser con un botón Abrir. Devuelve un entero para indicar si se acepta o se cancela

            // Si apretamos en aceptar ocurrirá esto
            if (status == JFileChooser.APPROVE_OPTION) {
                ficheroElegido = fileChooser.getSelectedFile();
                FileInputStream fichero = new FileInputStream(ficheroElegido);
                ObjectInputStream ficheroEntrada = new ObjectInputStream(fichero) ;
       
                JFGestionFacturacionPacientesUI.listaPacientes = (ArrayList <Paciente>) ficheroEntrada.readObject(); 
                Paciente.setNumeroTotalPacientes(ficheroEntrada.readInt());
                PacientePrivado.setNumeroPacientesPrivados(ficheroEntrada.readInt());
                PacienteSeguroMedico.setNumeroPacientesSeguroMedico(ficheroEntrada.readInt());
                ficheroEntrada.close();
            }
        JFGestionFacturacionPacientesUI.jMIGuardar.setEnabled(false);
        JFGestionFacturacionPacientesUI.hayCambios=false;
        }catch (ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "Error: No se pudo acceder a la clase adecuada para revertir la Serialización al leer del fichero."+ ficheroElegido, "Error", JOptionPane.ERROR_MESSAGE);
            
        }catch (FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Error: El fichero " + ficheroElegido+ " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Error de Entrada/Salida: Falló la lectura del fichero. La aplicación sigue funcionando sin haber cargado los datos del archivo, para permitir crearlo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMIAbrirActionPerformed

    private void jMIGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGuardarActionPerformed
      try {
        
        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showSaveDialog(null);/// Abre un JFileChooser con un botón Guardar. Devuelve un entero para indicar si se acepta o se cancela

        // Si apretamos en aceptar ocurrirá esto
        if (status == JFileChooser.APPROVE_OPTION) {
            File ficheroElegido = fileChooser.getSelectedFile();

           try{
            FileOutputStream fichero = new FileOutputStream(ficheroElegido);
            ObjectOutputStream ficheroSalida;
            ficheroSalida= new ObjectOutputStream(fichero);
            ficheroSalida.writeObject(listaPacientes);
            ficheroSalida.writeInt(Paciente.getNumeroTotalPacientes());
            ficheroSalida.writeInt(PacientePrivado.getNumeroPacientesPrivados());
            ficheroSalida.writeInt(PacienteSeguroMedico.getNumeroPacientesSeguroMedico());
            ficheroSalida.close();

        }catch (FileNotFoundException fnfe){
             JOptionPane.showMessageDialog(null, "Error: El fichero no existe: "+ ficheroElegido, "Error", JOptionPane.ERROR_MESSAGE);
        }catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Error: Falló la escritura en el fichero "+ ficheroElegido, "Error", JOptionPane.ERROR_MESSAGE);
           
         }
        //Deshabilitar el menú de guardar e indicar uqe ha habido cambios
        JFGestionFacturacionPacientesUI.hayCambios = false ;
        // la opción está deshabilitada ahora
        JFGestionFacturacionPacientesUI.jMIGuardar.setEnabled(false);
                   
        // Si apretamos en cancelar o cerramos la ventana ocurrirá esto.
        }
        else if (status == JFileChooser.CANCEL_OPTION) {
           // nada que hacer. 
        }

      }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jMIGuardarActionPerformed

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
         if (JFGestionFacturacionPacientesUI.hayCambios){ //Si hay cambios, preguntamos pidiendo confirmación antes de salir.
            if (JOptionPane.showConfirmDialog(null, 
                    "Ha habido cambios que no se han guardado. ¿Desea salir sin guardar?",
                "Salir de la aplicación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                // Si respondemos que sí, salimos. 
            System.exit(0);
           } // Si respondemos que no, no hay que hacer nada, nos quedamos donde estábamos. 
        }else{ // si no hay cambios, salimos directamente sin preguntar.
            System.exit(0);
        }
    }//GEN-LAST:event_jMISalirActionPerformed

    private void jMIListarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListarPacientesActionPerformed
   
        // Declarar la ventana que vamos a abrir      
        ListadoPacientesUI dialogoListar ;
        // Construcción de ventana secundaria
        dialogoListar = new ListadoPacientesUI (this, true, JFGestionFacturacionPacientesUI.listaPacientes);        
        dialogoListar.pack();
        dialogoListar.setModal(true);

        // Mostrar la ventana
        dialogoListar.setVisible(true);
    }//GEN-LAST:event_jMIListarPacientesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // el mismo planteamiento que al seleccionar salir en el menú
        if (JFGestionFacturacionPacientesUI.hayCambios){
            if (JOptionPane.showConfirmDialog(null, 
                    "Ha habido cambios que no se han guardado. ¿Desea salir sin guardar?",
                "Salir de la aplicación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
           }
        }else{
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMIAltaPacientePrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAltaPacientePrivadoActionPerformed
                           // Declarar la ventana que vamos a abrir      
                            AltaPacientePrivadoUI dlgAltaPacientePrivado ;
                            // Construcción de ventana secundaria
                            dlgAltaPacientePrivado = new AltaPacientePrivadoUI(this, true);        
                            dlgAltaPacientePrivado.pack();
                            dlgAltaPacientePrivado.setModal(true);
                            // Hacemos visible el formulario
                            dlgAltaPacientePrivado.setVisible(true);
                            // A la vuelta del formulario y antes de elimiarlo, obtenemos el objeto Paciente creado
                            PacientePrivado miPacientePrivado = dlgAltaPacientePrivado.getPacientePrivado() ;
                            if (miPacientePrivado != null) {
                                boolean encontrado=false;
                                for(int posicion=0;posicion<JFGestionFacturacionPacientesUI.listaPacientes.size() &&!encontrado;posicion++){
                                    if (JFGestionFacturacionPacientesUI.listaPacientes.get(posicion).getNif().compareToIgnoreCase(miPacientePrivado.getNif())==0){
                                        encontrado=true;
                                    }
                                } 
                                if(!encontrado){
                                   JFGestionFacturacionPacientesUI.listaPacientes.add(miPacientePrivado);
                                   JFGestionFacturacionPacientesUI.hayCambios = true ;
                                   // la opción está habilitada ahora
                                   JFGestionFacturacionPacientesUI.jMIGuardar.setEnabled(true);
                                   
                                }else{
                                     JOptionPane.showMessageDialog(null, "Error: Ya existe un paciente con ese nif"+miPacientePrivado.getNif(), "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            // Liberar de la memoria el formulario
                            
                            dlgAltaPacientePrivado.dispose();
    }//GEN-LAST:event_jMIAltaPacientePrivadoActionPerformed

    private void jMIEnvioLiquidacionesFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEnvioLiquidacionesFacturacionActionPerformed
        // Declarar la ventana que vamos a abrir
        EnviarEmailUI dlgEnviarEmail;
        //Comprobamos la fecha
        Calendar calendario= Calendar.getInstance();
        int mesActual=calendario.get(Calendar.MONTH);
        int diaDelMes=calendario.get(Calendar.DAY_OF_MONTH);
        //Si es 13 de junio, lanzamos el envío de la remesa de notificaciones. 
        if(mesActual!=Calendar.JUNE || diaDelMes!=13){
           if (JOptionPane.showConfirmDialog(null,
               "No es 13 de Junio. No ha pasado un año desde el envío de la anterior remesa de liquidaciones de Facturación. \n"
                   + "¿Desea de todas formas realizar el envío",
               "Envío anual de  Liquidación de facturación a Pacientes. ",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

                    // Construcción de ventana secundaria  
                    dlgEnviarEmail = new  EnviarEmailUI(this, true);
                    dlgEnviarEmail.pack();
                    dlgEnviarEmail.setModal(true);
                    // Hacemos visible el formulario
                    dlgEnviarEmail.setVisible(true);
                    dlgEnviarEmail.dispose();
          }else{  
             JOptionPane.showMessageDialog(null, "Envío de liquidaciones CANCELADO por el usuario.", "Información", JOptionPane.INFORMATION_MESSAGE);  
         }
       } 
    }//GEN-LAST:event_jMIEnvioLiquidacionesFacturacionActionPerformed

     public static void buscar(String nifABuscar,final JFGestionFacturacionPacientesUI jframe) {
        
        boolean encontrado = false ;
        //String nif ;
        int contador = 0, tamano = 0;       
           
        Paciente pacienteABuscar = null;
        // Pasar a mayúsculas
        nifABuscar = nifABuscar.toUpperCase();
        
        // Si la lista no está vacía
        if (!JFGestionFacturacionPacientesUI.listaPacientes.isEmpty()){
                     
            // Recorrer la lista para buscar el nif
            contador = 0 ; 
            tamano = JFGestionFacturacionPacientesUI.listaPacientes.size();
            while (contador < tamano && !encontrado) {
                // Obtener el elemento en la posición contador, de la lista
                pacienteABuscar = JFGestionFacturacionPacientesUI.listaPacientes.get(contador);
                if (nifABuscar.equals(pacienteABuscar.getNif()) ) {
                    encontrado = true ;
                                        
                    // Declarar la ventana que vamos a abrir para mostrar     
                    MostrarPacientePrivadoUI jDialogMostrarPacientePrivado ;
                    // Construcción de ventana secundaria
                    jDialogMostrarPacientePrivado = new MostrarPacientePrivadoUI(jframe, true, (PacientePrivado) JFGestionFacturacionPacientesUI.listaPacientes.get(contador));
                    jDialogMostrarPacientePrivado.pack();
                    jDialogMostrarPacientePrivado.setModal(true);
                    jDialogMostrarPacientePrivado.setVisible(true);
                    
                    // A la vuelta del formulario y antes de actualizarlo o elimiarlo, obtenemos el objeto PacientePrivado creado
                    PacientePrivado pacientePrivadoDevuelto = jDialogMostrarPacientePrivado.getPacientePrivado();
                   
                    if ( pacientePrivadoDevuelto != null){
                        if(jDialogMostrarPacientePrivado.getEleccion().equals("Actualizar")) {
                       
                           //Elimino el actual, para sustituirlo por el objeto actualizado
                             JFGestionFacturacionPacientesUI.listaPacientes.remove(contador) ;

                           // Añadir el paciente a la lista
                             JFGestionFacturacionPacientesUI.listaPacientes.add(pacientePrivadoDevuelto);
                           //Noficiar que hay cambios
                             JFGestionFacturacionPacientesUI.hayCambios = true ;
                           // la opción está habilitada ahora
                             JFGestionFacturacionPacientesUI.jMIGuardar.setEnabled(true);
                    /*
                   * Restamos uno al número de pacientes privados para que la creación del objeto "actualizado", 
                   * no cuente como un objeto nuevo. 
                   */
                           PacientePrivado.setNumeroPacientesPrivados(PacientePrivado.getNumeroPacientesPrivados()-1);
                        }       
                    }else{
                         if(jDialogMostrarPacientePrivado.getEleccion().equals("Eliminar")) {
                                JFGestionFacturacionPacientesUI.listaPacientes.remove(contador) ;
                                PacientePrivado.setNumeroPacientesPrivados(PacientePrivado.getNumeroPacientesPrivados()-1);
                                Paciente.setNumeroTotalPacientes(Paciente.getNumeroTotalPacientes()-1);
                                //Noficiar que hay cambios
                                 JFGestionFacturacionPacientesUI.hayCambios = true ;
                                // la opción está habilitada ahora
                                JFGestionFacturacionPacientesUI.jMIGuardar.setEnabled(true);
                         }
                    }
                    jDialogMostrarPacientePrivado.dispose();
                    
                }
                // Incrementar el contador
                contador++ ;
            }
                    
        }
        
        // Si no se encontró el vehículo, lo avisamos
        if (!encontrado){
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningún paciente con ese NIF.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
    
    public static ArrayList<Paciente> getListaPacientes(){
        return JFGestionFacturacionPacientesUI.listaPacientes;
    }
    public static  void setListaPacientes(ArrayList<Paciente> listaPacientes){
        JFGestionFacturacionPacientesUI.listaPacientes=listaPacientes;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFGestionFacturacionPacientesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGestionFacturacionPacientesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGestionFacturacionPacientesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGestionFacturacionPacientesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGestionFacturacionPacientesUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBSalirAplicacion;
    private javax.swing.JLabel jLNIFABuscar;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenuItem jMIAbrir;
    private javax.swing.JMenuItem jMIAltaPacientePrivado;
    private javax.swing.JMenuItem jMIAltaPacienteSeguroMedico;
    private javax.swing.JMenu jMIAltaPacientes;
    private javax.swing.JMenuItem jMIEnvioLiquidacionesFacturacion;
    private static javax.swing.JMenuItem jMIGuardar;
    private javax.swing.JMenuItem jMIListarPacientes;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMPacientes;
    private javax.swing.JMenu jMUtilidades;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFNifABuscar;
    private javax.swing.JMenuBar jmbBarraMenus;
    // End of variables declaration//GEN-END:variables
}
