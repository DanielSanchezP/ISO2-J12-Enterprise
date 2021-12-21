package ISOJ12.Vacuna.presentacion;

import ISOJ12.Vacuna.dominio.controller.GestorRepartoVacunas;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Repartir extends javax.swing.JFrame {
    GestorRepartoVacunas gestor = new GestorRepartoVacunas();
    /**
     * Creates new form repartir
     */
    public Repartir() {
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

        label1 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        repartirButton = new javax.swing.JButton();
        labelgalicia = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        label18 = new javax.swing.JLabel();
        label19 = new javax.swing.JLabel();
        atrasbutton = new javax.swing.JButton();
        textgalicia = new javax.swing.JTextField();
        textasturias = new javax.swing.JTextField();
        textlarioja = new javax.swing.JTextField();
        textpaisvasco = new javax.swing.JTextField();
        textcantabria = new javax.swing.JTextField();
        textnavarra = new javax.swing.JTextField();
        textaragon = new javax.swing.JTextField();
        textcatalunia = new javax.swing.JTextField();
        textcastillayleon = new javax.swing.JTextField();
        textextremadura = new javax.swing.JTextField();
        textcomunidadvalenciana = new javax.swing.JTextField();
        textmadrid = new javax.swing.JTextField();
        textcastillalamancha = new javax.swing.JTextField();
        textmurcia = new javax.swing.JTextField();
        textandalucia = new javax.swing.JTextField();
        textislasbaleares = new javax.swing.JTextField();
        textislascanarias = new javax.swing.JTextField();
        textceuta = new javax.swing.JTextField();
        textmelilla = new javax.swing.JTextField();
        labeledad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("ID del lote:");

        repartirButton.setText("Repartir");
        repartirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repartirButtonActionPerformed(evt);
            }
        });

        labelgalicia.setText("Galicia:");

        label2.setText("Asturias:");

        label3.setText("La Rioja:");

        label4.setText("Pais Vasco:");

        label5.setText("Cantabria:");

        label6.setText("Navarra:");

        label7.setText("Aragón:");

        label8.setText("Cataluña:");

        label9.setText("Castilla y León:");

        label10.setText("Madrid:");

        label11.setText("Castilla-La Mancha:");

        label12.setText("Comunidad Valenciana:");

        label13.setText("Andalucía:");

        jLabel15.setText("Murcia:");

        label15.setText("Islas Baleares:");

        label16.setText("Islas Canarias:");

        label17.setText("Ceuta:");

        label18.setText("Melilla:");

        label19.setText("Extremadura:");

        atrasbutton.setText("Atrás");
        atrasbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasbuttonActionPerformed(evt);
            }
        });

        labeledad.setText("50% para mayores de 65 años, 30% para gente de entre 15-64 años y 20% para niños de entre 0-14 años");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label9)
                                    .addComponent(label8)
                                    .addComponent(label7)
                                    .addComponent(label6)
                                    .addComponent(label5)
                                    .addComponent(label4)
                                    .addComponent(label3)
                                    .addComponent(label2)
                                    .addComponent(labelgalicia)
                                    .addComponent(label19)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(atrasbutton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textasturias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(textlarioja, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textpaisvasco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textcantabria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textnavarra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textaragon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textcatalunia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textcastillayleon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textextremadura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textgalicia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label11)
                            .addComponent(label10)
                            .addComponent(label12)
                            .addComponent(label13)
                            .addComponent(jLabel15)
                            .addComponent(label15)
                            .addComponent(label16)
                            .addComponent(label17)
                            .addComponent(label18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textcomunidadvalenciana)
                            .addComponent(textmadrid)
                            .addComponent(textcastillalamancha)
                            .addComponent(textmurcia)
                            .addComponent(textandalucia)
                            .addComponent(textislasbaleares)
                            .addComponent(textislascanarias)
                            .addComponent(textceuta)
                            .addComponent(textmelilla, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(repartirButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labeledad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repartirButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labeledad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelgalicia)
                    .addComponent(label10)
                    .addComponent(textgalicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textmadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(label11)
                    .addComponent(textasturias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textcastillalamancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(label12)
                    .addComponent(textlarioja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textcomunidadvalenciana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(jLabel15)
                    .addComponent(textpaisvasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textmurcia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5)
                    .addComponent(label13)
                    .addComponent(textcantabria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textandalucia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6)
                    .addComponent(label15)
                    .addComponent(textnavarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textislasbaleares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label7)
                    .addComponent(label16)
                    .addComponent(textaragon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textislascanarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8)
                    .addComponent(label17)
                    .addComponent(textcatalunia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textceuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label9)
                    .addComponent(label18)
                    .addComponent(textcastillayleon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textmelilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label19)
                    .addComponent(textextremadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(atrasbutton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void repartirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repartirButtonActionPerformed
        LoteVacunasDAO lotedao = new LoteVacunasDAO();
        String id = textid.getText();
        System.out.println("Id: "+id);
        String[][] reparto = gestor.calcularEntregasRegion(id);
        textgalicia.setText(reparto[0][1]);
        textasturias.setText(reparto[1][1]);
        textlarioja.setText(reparto[2][1]);
        textpaisvasco.setText(reparto[3][1]);
        textcantabria.setText(reparto[4][1]);
        textnavarra.setText(reparto[5][1]);
        textaragon.setText(reparto[6][1]);
        textcatalunia.setText(reparto[7][1]);
        textcastillayleon.setText(reparto[8][1]);
        textmadrid.setText(reparto[9][1]);
        textcastillalamancha.setText(reparto[10][1]);
        textcomunidadvalenciana.setText(reparto[11][1]);
        textmurcia.setText(reparto[12][1]);
        textandalucia.setText(reparto[13][1]);
        textislasbaleares.setText(reparto[14][1]);
        textislascanarias.setText(reparto[15][1]);
        textceuta.setText(reparto[16][1]);
        textmelilla.setText(reparto[17][1]);
        textextremadura.setText(reparto[18][1]);
        lotedao.borrarlote(id);
    }//GEN-LAST:event_repartirButtonActionPerformed

    private void atrasbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasbuttonActionPerformed
        PantallaGestionSistemaSaludNacional pantalla = new PantallaGestionSistemaSaludNacional();
        try {
            pantalla.mostrarGestionNacional();
        } catch (SQLException ex) {
            Logger.getLogger(Repartir.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_atrasbuttonActionPerformed
    
    public static void mostrar(){
        new Repartir().setVisible(true);
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
            java.util.logging.Logger.getLogger(Repartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Repartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Repartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Repartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Repartir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasbutton;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel labeledad;
    private javax.swing.JLabel labelgalicia;
    private javax.swing.JButton repartirButton;
    private javax.swing.JTextField textandalucia;
    private javax.swing.JTextField textaragon;
    private javax.swing.JTextField textasturias;
    private javax.swing.JTextField textcantabria;
    private javax.swing.JTextField textcastillalamancha;
    private javax.swing.JTextField textcastillayleon;
    private javax.swing.JTextField textcatalunia;
    private javax.swing.JTextField textceuta;
    private javax.swing.JTextField textcomunidadvalenciana;
    private javax.swing.JTextField textextremadura;
    private javax.swing.JTextField textgalicia;
    private javax.swing.JTextField textid;
    private javax.swing.JTextField textislasbaleares;
    private javax.swing.JTextField textislascanarias;
    private javax.swing.JTextField textlarioja;
    private javax.swing.JTextField textmadrid;
    private javax.swing.JTextField textmelilla;
    private javax.swing.JTextField textmurcia;
    private javax.swing.JTextField textnavarra;
    private javax.swing.JTextField textpaisvasco;
    // End of variables declaration//GEN-END:variables
}
