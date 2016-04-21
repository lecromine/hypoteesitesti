
package ohha.hypoteesitesti.gui;

public class JakaumanValinta extends javax.swing.JFrame {

    public JakaumanValinta() {
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
        binomiJakaumaNappi = new javax.swing.JButton();
        normaaliJakaumaNappi = new javax.swing.JButton();
        eksponenttiJakaumaNappi = new javax.swing.JButton();
        poissonJakaumaNappi = new javax.swing.JButton();
        testi = new javax.swing.JButton();

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Valitse jakauma");

        binomiJakaumaNappi.setText("Binomijakauma");
        binomiJakaumaNappi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                binomiJakaumaNappiMouseClicked(evt);
            }
        });
        binomiJakaumaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binomiJakaumaNappiActionPerformed(evt);
            }
        });

        normaaliJakaumaNappi.setText("Normaalijakauma");
        normaaliJakaumaNappi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                normaaliJakaumaNappiMouseClicked(evt);
            }
        });
        normaaliJakaumaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normaaliJakaumaNappiActionPerformed(evt);
            }
        });

        eksponenttiJakaumaNappi.setText("Eksponenttijakauma");
        eksponenttiJakaumaNappi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eksponenttiJakaumaNappiMouseClicked(evt);
            }
        });
        eksponenttiJakaumaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksponenttiJakaumaNappiActionPerformed(evt);
            }
        });

        poissonJakaumaNappi.setText("Poissonjakauma");
        poissonJakaumaNappi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poissonJakaumaNappiMouseClicked(evt);
            }
        });
        poissonJakaumaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poissonJakaumaNappiActionPerformed(evt);
            }
        });

        testi.setText("testinappi");
        testi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testiMouseClicked(evt);
            }
        });
        testi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(eksponenttiJakaumaNappi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(normaaliJakaumaNappi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(binomiJakaumaNappi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(poissonJakaumaNappi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(binomiJakaumaNappi)
                .addGap(18, 18, 18)
                .addComponent(normaaliJakaumaNappi)
                .addGap(18, 18, 18)
                .addComponent(eksponenttiJakaumaNappi)
                .addGap(18, 18, 18)
                .addComponent(poissonJakaumaNappi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(testi)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binomiJakaumaNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binomiJakaumaNappiActionPerformed
        new BinomiAineistonSyotto().setVisible(true);
    }//GEN-LAST:event_binomiJakaumaNappiActionPerformed

    private void normaaliJakaumaNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normaaliJakaumaNappiActionPerformed
        new NormaalinAineistonSyotto().setVisible(true);
    }//GEN-LAST:event_normaaliJakaumaNappiActionPerformed

    private void eksponenttiJakaumaNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksponenttiJakaumaNappiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eksponenttiJakaumaNappiActionPerformed

    private void poissonJakaumaNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poissonJakaumaNappiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poissonJakaumaNappiActionPerformed

    private void binomiJakaumaNappiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binomiJakaumaNappiMouseClicked
        
    }//GEN-LAST:event_binomiJakaumaNappiMouseClicked

    private void normaaliJakaumaNappiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normaaliJakaumaNappiMouseClicked
        
    }//GEN-LAST:event_normaaliJakaumaNappiMouseClicked

    private void eksponenttiJakaumaNappiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eksponenttiJakaumaNappiMouseClicked
       
    }//GEN-LAST:event_eksponenttiJakaumaNappiMouseClicked

    private void poissonJakaumaNappiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poissonJakaumaNappiMouseClicked
       

    }//GEN-LAST:event_poissonJakaumaNappiMouseClicked

    private void testiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_testiMouseClicked

    private void testiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testiActionPerformed
        new Vikailmoitus().setVisible(true);
    }//GEN-LAST:event_testiActionPerformed

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
            java.util.logging.Logger.getLogger(JakaumanValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JakaumanValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JakaumanValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JakaumanValinta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JakaumanValinta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binomiJakaumaNappi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton eksponenttiJakaumaNappi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton normaaliJakaumaNappi;
    private javax.swing.JButton poissonJakaumaNappi;
    private javax.swing.JButton testi;
    // End of variables declaration//GEN-END:variables
}
