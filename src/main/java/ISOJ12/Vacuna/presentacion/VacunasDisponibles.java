package ISOJ12.Vacuna.presentacion;

import ISOJ12.Vacuna.dominio.controller.GestorRepartoVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.EntregaVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;

import java.util.List;

import javax.swing.DefaultListModel;

/**
 *
 * @author Daniel
 */
public class VacunasDisponibles extends javax.swing.JFrame {
    DefaultListModel modelo = new DefaultListModel();
    GestorRepartoVacunas gestor = new GestorRepartoVacunas();
    LoteVacunas lote = new LoteVacunas();
    String region=null;
    /**
     * Creates new form AltaVacunas
     */
    public VacunasDisponibles(String region_) {
        this.region=region_;
        initComponents();
        iniciarLista();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        atrasButton = new javax.swing.JButton();
        vaclabel = new javax.swing.JLabel();
        vacsp = new javax.swing.JScrollPane();
        listVacunas = new javax.swing.JList();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atrasButton.setText("Atrás");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        vaclabel.setText("Vacunas disponibles (id / Farmaceutica / Cantidad /  Grupo de Prioridad / Fecha de asignación):");

        vacsp.setViewportView(listVacunas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vacsp)
                        .addGap(18, 18, 18)
                        .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vaclabel)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(vaclabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atrasButton)
                    .addComponent(vacsp, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        PantallaGestionSistemaRegionalSalud pantalla= new PantallaGestionSistemaRegionalSalud(this.region);
        pantalla.mostrarGestionRegional();
        this.dispose();
    }//GEN-LAST:event_atrasButtonActionPerformed
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
            java.util.logging.Logger.getLogger(VacunasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VacunasDisponibles("").setVisible(true);
        });
    }
    
    private void iniciarLista(){
        listVacunas.setModel(modelo);
        EntregaVacunas entvac= null;
        List<EntregaVacunas> listaent = gestor.vacunasEnRegion(this.region);
        for(int i = 0; i < listaent.size();i++){
            entvac = listaent.get(i);
            modelo.addElement(entvac.lote.id+" / "+ entvac.lote.farmaceutica + " / " + entvac.cantidad + " / " + entvac.grupoPrioridad + " / " + entvac.fecha);
        }
        
    }
    
    public static void mostrarVD(String region1){
        new VacunasDisponibles(region1).setVisible(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JList listVacunas;
    private javax.swing.JLabel vaclabel;
    private javax.swing.JScrollPane vacsp;
    // End of variables declaration//GEN-END:variables
}
