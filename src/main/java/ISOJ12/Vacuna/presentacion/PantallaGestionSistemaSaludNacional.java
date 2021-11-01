/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.presentacion;

import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.Vacunacion;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import ISOJ12.Vacuna.persistencia.VacunacionDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Daniel
 */
public class PantallaGestionSistemaSaludNacional extends javax.swing.JFrame {
    DefaultListModel modelo = new DefaultListModel();
	
    /**
     * Creates new form PantallaGestionSistemaSaludNacional
     */
    public PantallaGestionSistemaSaludNacional() {
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

        BotonAltaLote = new javax.swing.JButton();
        BotonCalculo = new javax.swing.JButton();
        ComboBoxListaSitios = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lotelist = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAltaLote.setLabel("Alta de Lote");
        BotonAltaLote.setName("BotonAltaLote"); // NOI18N
        BotonAltaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaLoteActionPerformed(evt);
            }
        });

        BotonCalculo.setText("Repartir");
        BotonCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalculoActionPerformed(evt);
            }
        });

        ComboBoxListaSitios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Asturias", "Galicia", "Cantabria", "Pais Vasco", " " }));
        ComboBoxListaSitios.setToolTipText("");
        ComboBoxListaSitios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxListaSitiosActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        jLabel1.setText("Total de Vacunados:");

        jLabel2.setText("Porcentaje de Vacunados:");

        jLabel3.setText("IDLote/Marca/Vacunas:");

        jScrollPane2.setViewportView(lotelist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAltaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(BotonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(ComboBoxListaSitios, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jScrollPane2))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAltaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ComboBoxListaSitios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ComboBoxListaSitios.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //No modificar
    
    
    private void BotonAltaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaLoteActionPerformed
        AltaLote.mostrarAL();
        this.dispose();
    }//GEN-LAST:event_BotonAltaLoteActionPerformed

    private void ComboBoxListaSitiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxListaSitiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxListaSitiosActionPerformed

    private void BotonCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCalculoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaGestionSistemaSaludNacional().setVisible(true);
            }
        });
    }
    
    public void inicializarLista(){
        
        LoteVacunasDAO lote = new LoteVacunasDAO();
        LoteVacunas lotevac= new LoteVacunas();
       
        try {
            lotelist.setModel(modelo);
            List<LoteVacunas> listalote = lote.seleccionarlotes();
      
            for(int i = 0; i < listalote.size();i++){
                lotevac = listalote.get(i);
                System.out.println(lotevac.id);
                System.out.println(lotevac.tipo.farmaceutica);
                System.out.println(lotevac.cantidad);
                String id = lotevac.id;
                String cant = String.valueOf(lotevac.cantidad);
                modelo.addElement(id+" / "+lotevac.tipo.farmaceutica+" / "+cant);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void mostrarGestionNacional(){
        inicializarLista();
        new PantallaGestionSistemaSaludNacional().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAltaLote;
    private javax.swing.JButton BotonCalculo;
    private javax.swing.JComboBox<String> ComboBoxListaSitios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList<String> lotelist;
    // End of variables declaration//GEN-END:variables
}
