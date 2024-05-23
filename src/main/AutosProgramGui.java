
package main;

import javax.swing.JOptionPane;
import modell.Auto;

public class AutosProgramGui extends javax.swing.JFrame {
    Auto [] autok;
    int index;
    public AutosProgramGui() {
        autok = new Auto[5];
        autok[0] = new Auto();
        index = 0;
        initComponents();
        informaciok();
        
    }

    private void informaciok() {
        String potkerekSzam =  String.valueOf(autok[index].getPotkerek());
        String beinditva = autok[index].isBeinditva() ? "Be" : "Nincs";
        String uzemanyag = autok[index].isUzemanyag() ? "Van" : "Nincs";
        String defekt = autok[index].isDefekt() ? "Van" : "Nincs";
        beinditL.setText(beinditva);
        potkerekekL.setText(potkerekSzam);
        uzemanyagL.setText(uzemanyag);
        defektL.setText(defekt);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uzemanyag = new javax.swing.ButtonGroup();
        megyDefekt = new javax.swing.JPanel();
        beindit = new javax.swing.JButton();
        kerekcsere = new javax.swing.JButton();
        leallit = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        tankolas = new javax.swing.JButton();
        esely = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uzemanyagL = new javax.swing.JLabel();
        beinditL = new javax.swing.JLabel();
        potkerekekL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        defektL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtPotkerek = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnFelvitel = new javax.swing.JButton();
        chbUzemanyag = new javax.swing.JCheckBox();
        chbBeinditva = new javax.swing.JCheckBox();
        cmbAutok = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        megyDefekt.setBorder(javax.swing.BorderFactory.createTitledBorder("Funkciók"));

        beindit.setText("Beindít");
        beindit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beinditActionPerformed(evt);
            }
        });

        kerekcsere.setText("Kerékcsere");
        kerekcsere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kerekcsereActionPerformed(evt);
            }
        });

        leallit.setText("Leállít");
        leallit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leallitActionPerformed(evt);
            }
        });

        jButton6.setText("Megy");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tankolas.setText("Tankolás");
        tankolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tankolasActionPerformed(evt);
            }
        });

        esely.setText("Esély defektre");

        javax.swing.GroupLayout megyDefektLayout = new javax.swing.GroupLayout(megyDefekt);
        megyDefekt.setLayout(megyDefektLayout);
        megyDefektLayout.setHorizontalGroup(
            megyDefektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(megyDefektLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(megyDefektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beindit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leallit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tankolas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kerekcsere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(esely))
                .addContainerGap())
        );
        megyDefektLayout.setVerticalGroup(
            megyDefektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(megyDefektLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esely, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(beindit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leallit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tankolas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kerekcsere)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Információk"));

        jLabel1.setText("Beinditva:");

        jLabel3.setText("Pótkerék:");

        jLabel2.setText("Üzemanyag:");

        uzemanyagL.setText("1");

        beinditL.setText("1");

        potkerekekL.setText("1");

        jLabel6.setText("Defekt");

        defektL.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(potkerekekL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uzemanyagL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defektL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(beinditL)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(beinditL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uzemanyagL)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(potkerekekL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(defektL))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Új autó"));

        jLabel4.setText("Pótkerék");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(txtPotkerek, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPotkerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        btnFelvitel.setText("Felvitel");
        btnFelvitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFelvitelActionPerformed(evt);
            }
        });

        chbUzemanyag.setText("Üzemanyag");

        chbBeinditva.setText("Beindítva");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbUzemanyag)
                            .addComponent(chbBeinditva)
                            .addComponent(btnFelvitel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbUzemanyag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbBeinditva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFelvitel)
                .addContainerGap())
        );

        cmbAutok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alap autó" }));
        cmbAutok.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAutokItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(megyDefekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbAutok, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbAutok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(megyDefekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beinditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beinditActionPerformed
        autok[index].setBeinditva(true);
        informaciok();

    }//GEN-LAST:event_beinditActionPerformed

    private void leallitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leallitActionPerformed
        autok[index].setBeinditva(false);
        informaciok();
    }//GEN-LAST:event_leallitActionPerformed

    private void tankolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tankolasActionPerformed
        if(autok[index].isBeinditva()){
            JOptionPane.showMessageDialog(rootPane, "A kocsi be van indítva!");
        }else if(autok[index].isUzemanyag()){
            JOptionPane.showMessageDialog(rootPane, "Tele a tank");
        }else{
            autok[index].tankol();
        }
        informaciok();
    }//GEN-LAST:event_tankolasActionPerformed

    private void kerekcsereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kerekcsereActionPerformed
        if(autok[index].getPotkerek() == 0){
            JOptionPane.showMessageDialog(rootPane, "Nincs pótkerék");
        }else{
            autok[index].kerekCsere();
        }  
        informaciok();
    }//GEN-LAST:event_kerekcsereActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(autok[index].isDefekt()){
            JOptionPane.showMessageDialog(rootPane, "Defektes a kerék");
        } else if(!autok[index].isUzemanyag()){
               JOptionPane.showMessageDialog(rootPane, "Nincs üzemanyag");
        }else if(!autok[index].isBeinditva()){
                JOptionPane.showMessageDialog(rootPane, "Nincs beindítva");
        }else{
            autok[index].megyEselyDefektre(Double.parseDouble(esely.getText()));
            informaciok();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnFelvitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFelvitelActionPerformed
    int potkerek = Integer.parseInt(txtPotkerek.getText());
    boolean uzemanyag = chbUzemanyag.isSelected();
    boolean beinditva = chbBeinditva.isSelected();
    autok[cmbAutok.getItemCount()] = new Auto(uzemanyag, beinditva, potkerek);
    informaciok();
    cmbAutok.addItem("Auto "+cmbAutok.getItemCount());
    }//GEN-LAST:event_btnFelvitelActionPerformed

    private void cmbAutokItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAutokItemStateChanged
    index = cmbAutok.getSelectedIndex();
    informaciok();
    }//GEN-LAST:event_cmbAutokItemStateChanged

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
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutosProgramGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beindit;
    private javax.swing.JLabel beinditL;
    private javax.swing.JButton btnFelvitel;
    private javax.swing.JCheckBox chbBeinditva;
    private javax.swing.JCheckBox chbUzemanyag;
    private javax.swing.JComboBox<String> cmbAutok;
    private javax.swing.JLabel defektL;
    private javax.swing.JTextField esely;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton kerekcsere;
    private javax.swing.JButton leallit;
    private javax.swing.JPanel megyDefekt;
    private javax.swing.JLabel potkerekekL;
    private javax.swing.JButton tankolas;
    private javax.swing.JTextField txtPotkerek;
    private javax.swing.ButtonGroup uzemanyag;
    private javax.swing.JLabel uzemanyagL;
    // End of variables declaration//GEN-END:variables
}
