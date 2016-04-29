
package ohha.hypoteesitesti.gui;

public class NormaaliTestinValinta extends javax.swing.JFrame {

    public NormaaliTestinValinta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton2 = new javax.swing.JRadioButton();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        odotusarvoVarianssiTuntematon = new javax.swing.JButton();
        odotusarvoVarianssiTunnettu = new javax.swing.JButton();
        varianssi = new javax.swing.JButton();
        alkuun = new javax.swing.JButton();

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Valitse testattava parametri");

        odotusarvoVarianssiTuntematon.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        odotusarvoVarianssiTuntematon.setText("Odotusarvo (varianssi tuntematon)");
        odotusarvoVarianssiTuntematon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odotusarvoVarianssiTuntematonActionPerformed(evt);
            }
        });

        odotusarvoVarianssiTunnettu.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        odotusarvoVarianssiTunnettu.setText("Odotusarvo (varianssi tunnettu)");
        odotusarvoVarianssiTunnettu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odotusarvoVarianssiTunnettuMouseClicked(evt);
            }
        });
        odotusarvoVarianssiTunnettu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odotusarvoVarianssiTunnettuActionPerformed(evt);
            }
        });

        varianssi.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        varianssi.setText("Varianssi");
        varianssi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varianssiActionPerformed(evt);
            }
        });

        alkuun.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        alkuun.setText("Takaisin");
        alkuun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alkuunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(odotusarvoVarianssiTuntematon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odotusarvoVarianssiTunnettu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varianssi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alkuun, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(odotusarvoVarianssiTuntematon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(odotusarvoVarianssiTunnettu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(varianssi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(alkuun)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odotusarvoVarianssiTuntematonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odotusarvoVarianssiTuntematonActionPerformed
        new NormaalinSyottoVarianssiTuntematon().setVisible(true);
    }//GEN-LAST:event_odotusarvoVarianssiTuntematonActionPerformed

    private void odotusarvoVarianssiTunnettuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odotusarvoVarianssiTunnettuActionPerformed
        new NormaalinSyottoVarianssiTunnettu().setVisible(true);
    }//GEN-LAST:event_odotusarvoVarianssiTunnettuActionPerformed

    private void odotusarvoVarianssiTunnettuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odotusarvoVarianssiTunnettuMouseClicked
        
    }//GEN-LAST:event_odotusarvoVarianssiTunnettuMouseClicked

    private void varianssiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varianssiActionPerformed
        new NormaalinSyottoVarianssi().setVisible(true);
    }//GEN-LAST:event_varianssiActionPerformed

    private void alkuunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alkuunActionPerformed
        setDefaultCloseOperation(NormaaliTestinValinta.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_alkuunActionPerformed

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
            java.util.logging.Logger.getLogger(NormaaliTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormaaliTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormaaliTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormaaliTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormaaliTestinValinta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alkuun;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton odotusarvoVarianssiTunnettu;
    private javax.swing.JButton odotusarvoVarianssiTuntematon;
    private javax.swing.JButton varianssi;
    // End of variables declaration//GEN-END:variables
}
