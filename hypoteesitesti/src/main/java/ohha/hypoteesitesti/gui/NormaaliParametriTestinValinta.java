
package ohha.hypoteesitesti.gui;

public class NormaaliParametriTestinValinta extends javax.swing.JFrame {

    public NormaaliParametriTestinValinta() {
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

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Valitse testattava parametri");

        odotusarvoVarianssiTuntematon.setText("Odotusarvo (varianssi tuntematon)");
        odotusarvoVarianssiTuntematon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odotusarvoVarianssiTuntematonActionPerformed(evt);
            }
        });

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

        varianssi.setText("Varianssi");
        varianssi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varianssiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(odotusarvoVarianssiTuntematon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odotusarvoVarianssiTunnettu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(varianssi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
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
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odotusarvoVarianssiTuntematonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odotusarvoVarianssiTuntematonActionPerformed
        new NormaalinAineistonSyottoVarianssiTuntematon().setVisible(true);
    }//GEN-LAST:event_odotusarvoVarianssiTuntematonActionPerformed

    private void odotusarvoVarianssiTunnettuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odotusarvoVarianssiTunnettuActionPerformed
        new NormaalinAineistonSyottoVarianssiTunnettu().setVisible(true);
    }//GEN-LAST:event_odotusarvoVarianssiTunnettuActionPerformed

    private void odotusarvoVarianssiTunnettuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odotusarvoVarianssiTunnettuMouseClicked
        
    }//GEN-LAST:event_odotusarvoVarianssiTunnettuMouseClicked

    private void varianssiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varianssiActionPerformed
        new NormaalinAineistonSyottoVarianssi().setVisible(true);
    }//GEN-LAST:event_varianssiActionPerformed

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
            java.util.logging.Logger.getLogger(NormaaliParametriTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormaaliParametriTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormaaliParametriTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormaaliParametriTestinValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new NormaaliParametriTestinValinta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
