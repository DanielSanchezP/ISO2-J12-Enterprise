/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.presentacion;

import ISOJ12.Vacuna.dominio.controller.GestorEstadisticas;
import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;

import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
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
    GestorEstadisticas gestor = new GestorEstadisticas();
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

        botonAltaLote = new javax.swing.JButton();
        botonCalculo = new javax.swing.JButton();
        comboBoxListaSitios = new javax.swing.JComboBox<>();
        totalvacunadosText = new javax.swing.JTextField();
        porcentajevacunadosText = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        lotelist = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAltaLote.setLabel("Alta de Lote");
        botonAltaLote.setName("botonAltaLote"); // NOI18N
        botonAltaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaLoteActionPerformed(evt);
            }
        });

        botonCalculo.setText("Repartir");
        botonCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRepartirActionPerformed(evt);
            }
        });

        comboBoxListaSitios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Asturias", "Galicia", "Cantabria", "Pais Vasco", " " }));
        comboBoxListaSitios.setToolTipText("");
        comboBoxListaSitios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxListaSitiosActionPerformed(evt);
            }
        });

        totalvacunadosText.setEditable(false);
        totalvacunadosText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalvacunadosTextActionPerformed(evt);
            }
        });

        porcentajevacunadosText.setEditable(false);

        label1.setText("Total de Vacunados:");

        label2.setText("Porcentaje de Vacunados:");

        label3.setText("IDLote/Marca/Vacunas:");

        scrollPane1.setViewportView(lotelist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAltaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(botonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(comboBoxListaSitios, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label3)
                    .addComponent(label2)
                    .addComponent(label1)
                    .addComponent(totalvacunadosText)
                    .addComponent(porcentajevacunadosText)
                    .addComponent(scrollPane1))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAltaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(comboBoxListaSitios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalvacunadosText)
                .addGap(14, 14, 14)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(porcentajevacunadosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        comboBoxListaSitios.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //No modificar
    
    
    private void botonAltaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaLoteActionPerformed
        AltaLote.mostrarAL();
        this.dispose();
    }//GEN-LAST:event_botonAltaLoteActionPerformed

    private void comboBoxListaSitiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxListaSitiosActionPerformed
        try {
            if (comboBoxListaSitios.getSelectedItem().toString().equals("Nacional")){
                long total = gestor.consultarTotalVacunados(comboBoxListaSitios.getSelectedItem().toString());
                totalvacunadosText.setText(Long.toString(total));
                double porcentaje = Math.round(gestor.consultarPorcentajeVacunadosSobreRecibidas()*100.0)/100.0;
                porcentajevacunadosText.setText(Double.toString(porcentaje));
            }
            else{
                long totalregion = gestor.consultarTotalVacunadosPorRegion(comboBoxListaSitios.getSelectedItem().toString());
                totalvacunadosText.setText(Long.toString(totalregion));
                double porcentajeregion = gestor.consultarPorcentajeVacunadosSobreRecibidasEnRegion(comboBoxListaSitios.getSelectedItem().toString());
                porcentajevacunadosText.setText(Double.toString(porcentajeregion));
            }
        } catch (SQLException ex) {
                Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_comboBoxListaSitiosActionPerformed

    private void botonRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRepartirActionPerformed
        Repartir rep = new Repartir();
        rep.mostrar();
        this.dispose();
    }//GEN-LAST:event_botonRepartirActionPerformed

    private void totalvacunadosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalvacunadosTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalvacunadosTextActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaGestionSistemaSaludNacional().setVisible(true);
        });
    }
    public void inicializarLista(){
                lotelist.setModel(modelo);
                LoteVacunasDAO lote = new LoteVacunasDAO();
                LoteVacunas lotevac= new LoteVacunas();
       
        try {
            
            List<LoteVacunas> listalote = lote.seleccionarlotes();
            for(int i = 0; i < listalote.size();i++){
                lotevac = listalote.get(i);
                modelo.addElement(lotevac.id+" / "+ lotevac.farmaceutica + " / " + lotevac.cantidad);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(Level.SEVERE, null, ex);
        }
		
    }
    
    
    public void mostrarGestionNacional() throws SQLException{

        inicializarLista();      
        long total = gestor.consultarTotalVacunados(comboBoxListaSitios.getSelectedItem().toString());
        totalvacunadosText.setText(Long.toString(total));
        double porcentaje = Math.round(gestor.consultarPorcentajeVacunadosSobreRecibidas()*100.0)/100.0;
        porcentajevacunadosText.setText(Double.toString(porcentaje));
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAltaLote;
    private javax.swing.JButton botonCalculo;
    public javax.swing.JComboBox<String> comboBoxListaSitios;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    public javax.swing.JList<String> lotelist;
    public javax.swing.JTextField porcentajevacunadosText;
    private javax.swing.JScrollPane scrollPane1;
    public javax.swing.JTextField totalvacunadosText;
    // End of variables declaration//GEN-END:variables
}
