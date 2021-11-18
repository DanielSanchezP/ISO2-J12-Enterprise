/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.presentacion;

import ISOJ12.Vacuna.dominio.entitymodel.Paciente;
import ISOJ12.Vacuna.dominio.entitymodel.Vacunacion;
import ISOJ12.Vacuna.persistencia.VacunacionDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class RegistrarVacunacion extends javax.swing.JFrame {
    VacunacionDAO vacunacion = new VacunacionDAO();
    //Esto es para probar solo

    /**
     * Creates new form RegistrarVacunacion
     */
    public RegistrarVacunacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //No modificar
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        nombrePacienteText = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        tipovacunatext = new javax.swing.JTextField();
        fechaLabel = new javax.swing.JLabel();
        fechaText = new javax.swing.JFormattedTextField();
        apellidosLabel = new javax.swing.JLabel();
        apellidopacientetext = new javax.swing.JTextField();
        registrarButton = new javax.swing.JButton();
        atrásButton = new javax.swing.JButton();
        numerodosisLabel = new javax.swing.JLabel();
        dosisSlider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreLabel.setText("Nombre del Paciente:");

        nombrePacienteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePacienteTextActionPerformed(evt);
            }
        });

        tipoLabel.setText("Tipo de Vacuna:");

        fechaLabel.setText("Fecha:");

        fechaText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));

        apellidosLabel.setText("Apellidos del Paciente:");

        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        atrásButton.setText("Atrás");
        atrásButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrásButtonActionPerformed(evt);
            }
        });

        numerodosisLabel.setText("Nº de dosis a recibir:");

        dosisSlider.setMajorTickSpacing(1);
        dosisSlider.setMaximum(10);
        dosisSlider.setMinimum(1);
        dosisSlider.setPaintLabels(true);
        dosisSlider.setPaintTicks(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrásButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellidosLabel)
                            .addComponent(fechaLabel)
                            .addComponent(tipoLabel)
                            .addComponent(nombreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombrePacienteText, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(tipovacunatext)
                            .addComponent(fechaText)
                            .addComponent(apellidopacientetext))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(numerodosisLabel)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dosisSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombrePacienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidosLabel)
                    .addComponent(apellidopacientetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoLabel)
                            .addComponent(tipovacunatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numerodosisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dosisSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(atrásButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        Vacunacion vac= new Vacunacion();
        Paciente pac=new Paciente();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        pac.dni = "23535645";
        pac.nombre = nombrePacienteText.getText();
        pac.apellidos = apellidopacientetext.getText();
        vac.paciente=pac;
        vac.nombrevacuna = tipovacunatext.getText();
        try {
            vac.fecha = formatter.parse(fechaText.getText());
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarVacunacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        vac.numeroDosis = dosisSlider.getValue();
        
        
        
        vacunacion.insertarVacunacion(vac);
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void nombrePacienteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePacienteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePacienteTextActionPerformed

    private void atrásButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrásButtonActionPerformed
        PantallaGestionSistemaRegionalSalud pantalla=new PantallaGestionSistemaRegionalSalud();
        pantalla.mostrarGestionRegional();
        this.dispose();
    }//GEN-LAST:event_atrásButtonActionPerformed
    //No modificar
    
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarVacunacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarVacunacion().setVisible(true);
        });
    }
    
    public static void mostrarRV(){
        new RegistrarVacunacion().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidopacientetext;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JButton atrásButton;
    private javax.swing.JSlider dosisSlider;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JFormattedTextField fechaText;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombrePacienteText;
    private javax.swing.JLabel numerodosisLabel;
    private javax.swing.JButton registrarButton;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JTextField tipovacunatext;
    // End of variables declaration//GEN-END:variables
}
