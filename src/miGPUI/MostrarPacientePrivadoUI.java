package miGPUI;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Profesor
 */
public class MostrarPacientePrivadoUI extends javax.swing.JDialog {
    
    private PacientePrivado pacientePrivadoaDevolver = null;
    private String eleccion="";
   
    // Para devolver al JFrame principal el objeto PacientePrivado
    public PacientePrivado getPacientePrivado() {
        return (pacientePrivadoaDevolver) ;    
    }
    
    public String getEleccion(){
        return eleccion;
    }
    

    /** Creates new form  
     Este constructor está modificado para que reciba un tercer parámetro que es el objeto PacientePrivado a mostar. 
     */
    public MostrarPacientePrivadoUI(java.awt.Frame parent, boolean modal, PacientePrivado elPacientePrivado) {
        super(parent, modal);
        initComponents();
                       
        // Cargamos los datos que se pasan al constructor
        
        jTFNif.setText(elPacientePrivado.getNif());
        jTFAnnioPrimeraConsulta.setText(String.valueOf(elPacientePrivado.getAnnioPrimeraConsulta()));
        jTFEmailNotificacion.setText(elPacientePrivado.getEmailNotificaciones());
        jTFNombrePaciente.setText(elPacientePrivado.getNombrePaciente());
        jTFNumeroVisitas.setText(String.valueOf(elPacientePrivado.getNumeroDeVisitas()));
        jCBTipoDePago.setSelectedItem(elPacientePrivado.getTipoDePago().toString());
        jTFNumeroTratamientosPorFacturar.setText(String.valueOf(elPacientePrivado.getNumeroTratamientosPorFacturar()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLNif = new javax.swing.JLabel();
        jLNombrePaciente = new javax.swing.JLabel();
        jLNumeroVisitas = new javax.swing.JLabel();
        jLTipoDePago = new javax.swing.JLabel();
        jTFNif = new javax.swing.JTextField();
        jTFNombrePaciente = new javax.swing.JTextField();
        jTFNumeroVisitas = new javax.swing.JTextField();
        jLAnnioPrimeraConsulta = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jTFAnnioPrimeraConsulta = new javax.swing.JTextField();
        jLEmailNotificacion = new javax.swing.JLabel();
        jTFEmailNotificacion = new javax.swing.JTextField();
        jBEliminar = new javax.swing.JButton();
        jCBTipoDePago = new javax.swing.JComboBox();
        jLNumeroTratamientosPorFacturar = new javax.swing.JLabel();
        jTFNumeroTratamientosPorFacturar = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mostrar / Actualizar / Eliminar un  Paciente privado. ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Paciente Privado"));

        jLNif.setText("NIF:");

        jLNombrePaciente.setText("Nombre del Paciente:");

        jLNumeroVisitas.setText("NumeroVisitas:");

        jLTipoDePago.setText("Tipo de Pago:");

        jTFNif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNifActionPerformed(evt);
            }
        });

        jTFNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombrePacienteActionPerformed(evt);
            }
        });

        jTFNumeroVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroVisitasActionPerformed(evt);
            }
        });

        jLAnnioPrimeraConsulta.setText("Año de Primera Consulta:");
        jLAnnioPrimeraConsulta.setToolTipText("");

        jBActualizar.setMnemonic('A');
        jBActualizar.setText("Actualizar");
        jBActualizar.setToolTipText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBCancelar.setMnemonic('C');
        jBCancelar.setText("Cancelar");
        jBCancelar.setToolTipText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jTFAnnioPrimeraConsulta.setText("2013");

        jLEmailNotificacion.setText("email Notificación:");

        jTFEmailNotificacion.setName("JTextFieldEmail"); // NOI18N
        jTFEmailNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailNotificacionActionPerformed(evt);
            }
        });

        jBEliminar.setMnemonic('E');
        jBEliminar.setText("Eliminar");
        jBEliminar.setToolTipText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jCBTipoDePago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metalico", "Tarjeta" }));
        jCBTipoDePago.setToolTipText("Tipo de Pago");

        jLNumeroTratamientosPorFacturar.setText("Número de Tratamientos por facturar:");

        jTFNumeroTratamientosPorFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroTratamientosPorFacturarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBActualizar)
                        .addGap(137, 137, 137)
                        .addComponent(jBEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLAnnioPrimeraConsulta)
                                    .addComponent(jLNif, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFNif, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFAnnioPrimeraConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNumeroTratamientosPorFacturar)
                                    .addComponent(jLNumeroVisitas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNumeroTratamientosPorFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(jTFNumeroVisitas))))
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLTipoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLNombrePaciente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLEmailNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombrePaciente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCBTipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(104, Short.MAX_VALUE))
                            .addComponent(jTFEmailNotificacion)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNif)
                    .addComponent(jTFNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmailNotificacion)
                    .addComponent(jTFEmailNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNombrePaciente)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLAnnioPrimeraConsulta)
                        .addComponent(jTFNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFAnnioPrimeraConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNumeroVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTipoDePago)
                    .addComponent(jCBTipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumeroVisitas))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumeroTratamientosPorFacturar)
                    .addComponent(jTFNumeroTratamientosPorFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizar)
                    .addComponent(jBCancelar)
                    .addComponent(jBEliminar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLNif, jLNombrePaciente, jLNumeroVisitas, jLTipoDePago, jTFNif, jTFNombrePaciente, jTFNumeroVisitas});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNumeroTratamientosPorFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroTratamientosPorFacturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroTratamientosPorFacturarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (JOptionPane.showConfirmDialog(null,
            "Se va a proceder al borrado del paciente con NIF  " +jTFNif.getText()+". ¿Desea continuar, y eliminarlo?",
            "Borrado de un Paciente", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        this.setVisible(false);
        this.eleccion="Eliminar";
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTFEmailNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailNotificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailNotificacionActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // Ocultar el formulario
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed

        try{
            PacientePrivado.TipoDePago tipoDePago;
            if(jCBTipoDePago.getSelectedIndex()==0){
                tipoDePago=PacientePrivado.TipoDePago.Metalico;
            }else{ // solo hay dos opciones en la lista desplegable, así que si no es Metalico, tiene que ser Tarjeta
                tipoDePago=PacientePrivado.TipoDePago.Tarjeta;
            }
            pacientePrivadoaDevolver = new PacientePrivado(
                jTFNif.getText(),
                Integer.parseInt(jTFAnnioPrimeraConsulta.getText()),
                jTFNombrePaciente.getText(),
                Integer.parseInt(jTFNumeroTratamientosPorFacturar.getText()),
                jTFEmailNotificacion.getText(),
                Integer.parseInt(jTFNumeroVisitas.getText()),
                tipoDePago);

            this.eleccion="Actualizar";
            // Ocultar el formulario
            this.setVisible(false);

        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Error: Alguno de los campos numéricos \n"
                    + "(Año de primera consulta, Número tratamientos por facturar o Número de visitas)"
                    + " \n no contiene un número entero válido. \n", "Error", JOptionPane.ERROR_MESSAGE);
        }catch (IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null,iae.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTFNumeroVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroVisitasActionPerformed

    private void jTFNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombrePacienteActionPerformed

    private void jTFNifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNifActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JComboBox jCBTipoDePago;
    private javax.swing.JLabel jLAnnioPrimeraConsulta;
    private javax.swing.JLabel jLEmailNotificacion;
    private javax.swing.JLabel jLNif;
    private javax.swing.JLabel jLNombrePaciente;
    private javax.swing.JLabel jLNumeroTratamientosPorFacturar;
    private javax.swing.JLabel jLNumeroVisitas;
    private javax.swing.JLabel jLTipoDePago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFAnnioPrimeraConsulta;
    private javax.swing.JTextField jTFEmailNotificacion;
    private javax.swing.JTextField jTFNif;
    private javax.swing.JTextField jTFNombrePaciente;
    private javax.swing.JTextField jTFNumeroTratamientosPorFacturar;
    private javax.swing.JTextField jTFNumeroVisitas;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
