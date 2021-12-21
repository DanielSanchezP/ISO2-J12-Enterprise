/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.presentacion;

import ISOJ12.Vacuna.dominio.controller.GestorEstadisticas;

/**
 *
 * @author Daniel
 */
public class PantallaGestionSistemaRegionalSalud extends javax.swing.JFrame {
    GestorEstadisticas gestor = new GestorEstadisticas();
    String region="";
	
    /**
     * Creates new form PantallaGestionSistemaRegionalSalud
     */
    public PantallaGestionSistemaRegionalSalud(String region_) {
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

        botonVacunasDisp = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        textoVacunaTotal = new javax.swing.JTextField();
        textoPrimeraDosis = new javax.swing.JTextField();
        textoSegundaDosis = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        buttonestvacunados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVacunasDisp.setText("Vacunas disponibles");
        botonVacunasDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVacunasDispActionPerformed(evt);
            }
        });

        botonRegistro.setText("Registrar Vacunación");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        textoVacunaTotal.setEditable(false);

        textoPrimeraDosis.setEditable(false);

        textoSegundaDosis.setEditable(false);
        textoSegundaDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSegundaDosisActionPerformed(evt);
            }
        });

        label1.setText("Total de Vacunas inoculadas:");

        label2.setText("Porcentaje de Primera Dosis:");

        label3.setText("Porcentaje de Segunda Dosis:");

        buttonestvacunados.setText("Consultar Pacientes Vacunados");
        buttonestvacunados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonestvacunadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botonVacunasDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2)
                    .addComponent(label1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textoSegundaDosis, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textoPrimeraDosis, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoVacunaTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(buttonestvacunados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVacunasDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoVacunaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPrimeraDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSegundaDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(buttonestvacunados)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //No modificar
    private void botonVacunasDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVacunasDispActionPerformed
        VacunasDisponibles.mostrarVD(this.region);
        this.dispose();
    }//GEN-LAST:event_botonVacunasDispActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        RegistrarVacunacion regv = new RegistrarVacunacion();
        regv.mostrarRV(this.region);
        this.dispose();
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void buttonestvacunadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonestvacunadosActionPerformed
        
        PantallaConsultaVacunados est = new PantallaConsultaVacunados();
        est.mostrarVentanaEstadisticas(this.region);
        
        this.dispose();
    }//GEN-LAST:event_buttonestvacunadosActionPerformed

    private void textoSegundaDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSegundaDosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSegundaDosisActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaGestionSistemaRegionalSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaGestionSistemaRegionalSalud("").setVisible(true);
        });
    }
    
    public void mostrarGestionRegional(){
        this.textoVacunaTotal.setText(Long.toString(gestor.consultarTotalVacunasEnRegion(this.region)));
        this.textoPrimeraDosis.setText(Double.toString(gestor.consultarVacunadosDeNVacuna(this.region,1)));
        this.textoSegundaDosis.setText(Double.toString(gestor.consultarVacunadosDeNVacuna(this.region,2)));
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton botonVacunasDisp;
    private javax.swing.JButton buttonestvacunados;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField textoPrimeraDosis;
    private javax.swing.JTextField textoSegundaDosis;
    private javax.swing.JTextField textoVacunaTotal;
    // End of variables declaration//GEN-END:variables
}
