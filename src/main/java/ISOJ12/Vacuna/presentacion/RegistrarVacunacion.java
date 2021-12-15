/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.presentacion;

import ISOJ12.Vacuna.dominio.controller.GestorVacunacion;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class RegistrarVacunacion extends javax.swing.JFrame {
    GestorVacunacion gestor = new GestorVacunacion();
    String region=null;
    //Esto es para probar solo

    /**
     * Creates new form RegistrarVacunacion
     */
    public RegistrarVacunacion(String region_) {
        this.region=region_;
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

        label1 = new javax.swing.JLabel();
        nombrePacienteText = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        tipovacunatext = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        fechaText = new javax.swing.JFormattedTextField();
        label4 = new javax.swing.JLabel();
        apellidopacientetext = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        atrásButton = new javax.swing.JButton();
        label5 = new javax.swing.JLabel();
        dosisSlider = new javax.swing.JSlider();
        label6 = new javax.swing.JLabel();
        dnitext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Nombre del Paciente:");

        nombrePacienteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePacienteTextActionPerformed(evt);
            }
        });

        label2.setText("Tipo de Vacuna:");

        label3.setText("Fecha:");

        fechaText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        fechaText.setToolTipText("");

        label4.setText("Apellidos del Paciente:");

        apellidopacientetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidopacientetextActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        atrásButton.setText("Atrás");
        atrásButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrásButtonActionPerformed(evt);
            }
        });

        label5.setText("Nº de dosis a recibir:");

        dosisSlider.setMajorTickSpacing(1);
        dosisSlider.setMaximum(10);
        dosisSlider.setMinimum(1);
        dosisSlider.setPaintLabels(true);
        dosisSlider.setPaintTicks(true);

        label6.setText("dni del Paciente:");

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
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4)
                            .addComponent(label3)
                            .addComponent(label2)
                            .addComponent(label1)
                            .addComponent(label6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombrePacienteText, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(tipovacunatext)
                            .addComponent(fechaText)
                            .addComponent(apellidopacientetext)
                            .addComponent(dnitext))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label5)
                        .addGap(52, 52, 52))
                    .addComponent(dosisSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6)
                    .addComponent(dnitext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(nombrePacienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(apellidopacientetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipovacunatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dosisSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atrásButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
            
            SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
            String dni = dnitext.getText();
            String nombre = nombrePacienteText.getText();
            String apellidos = apellidopacientetext.getText();
            String nombrevacuna = tipovacunatext.getText();
            int numeroDosis = dosisSlider.getValue();
            Date fecha;
            
        try {
            fecha = formatter.parse(fechaText.getText());
           
            gestor.registrarVacunacion(fecha, nombre, apellidos, dni, nombrevacuna, numeroDosis, this.region);
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarVacunacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void nombrePacienteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePacienteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePacienteTextActionPerformed

    private void atrásButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrásButtonActionPerformed
        PantallaGestionSistemaRegionalSalud pantalla=new PantallaGestionSistemaRegionalSalud(region);
        pantalla.mostrarGestionRegional();
        this.dispose();
    }//GEN-LAST:event_atrásButtonActionPerformed

    private void apellidopacientetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidopacientetextActionPerformed
        
    }//GEN-LAST:event_apellidopacientetextActionPerformed
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
            new RegistrarVacunacion("").setVisible(true);
        });
    }
    
    public static void mostrarRV(String region_){
        new RegistrarVacunacion(region_).setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidopacientetext;
    private javax.swing.JButton atrásButton;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField dnitext;
    private javax.swing.JSlider dosisSlider;
    private javax.swing.JFormattedTextField fechaText;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JTextField nombrePacienteText;
    private javax.swing.JTextField tipovacunatext;
    // End of variables declaration//GEN-END:variables
}
