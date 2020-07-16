package no_estructuras;

public class jfmMaterial extends javax.swing.JFrame {

    public jfmMaterial() {
        initComponents();
    }

    jfmPrestarRevista prestar_revista = new jfmPrestarRevista();
    jfmLibros libro = new jfmLibros();
    jfmRevista revista_a = new jfmRevista();
    jfmPeriodico periodico = new jfmPeriodico();
    jfmPrestarPeriodico prestar_periodico = new jfmPrestarPeriodico();
    jfmPrestarLibro prestar_libro_o=new jfmPrestarLibro();
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        libro_as = new javax.swing.JButton();
        revistaa_ss = new javax.swing.JButton();
        periodicos_ss = new javax.swing.JButton();
        prestar_libro = new javax.swing.JButton();
        prestar_revistar = new javax.swing.JButton();
        prestar_periodico_as = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        libro_as.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        libro_as.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/68195.png"))); // NOI18N
        libro_as.setText("  Libros");
        libro_as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libro_asActionPerformed(evt);
            }
        });

        revistaa_ss.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        revistaa_ss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1162337.png"))); // NOI18N
        revistaa_ss.setText("  Revistas");
        revistaa_ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revistaa_ssActionPerformed(evt);
            }
        });

        periodicos_ss.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        periodicos_ss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/news.png"))); // NOI18N
        periodicos_ss.setText("  Periodicos");
        periodicos_ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodicos_ssActionPerformed(evt);
            }
        });

        prestar_libro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        prestar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/68195.png"))); // NOI18N
        prestar_libro.setText("Prestar Libro");
        prestar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestar_libroActionPerformed(evt);
            }
        });

        prestar_revistar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        prestar_revistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1162337.png"))); // NOI18N
        prestar_revistar.setText("Prestar Revista");
        prestar_revistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestar_revistarActionPerformed(evt);
            }
        });

        prestar_periodico_as.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prestar_periodico_as.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/news.png"))); // NOI18N
        prestar_periodico_as.setText("Prestar Periodico");
        prestar_periodico_as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestar_periodico_asActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(libro_as, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(revistaa_ss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prestar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prestar_revistar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(periodicos_ss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prestar_periodico_as)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prestar_libro)
                    .addComponent(libro_as))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revistaa_ss, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prestar_revistar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodicos_ss)
                    .addComponent(prestar_periodico_as))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingresar Material Nuevo", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void libro_asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libro_asActionPerformed

        libro.setVisible(true);
    }//GEN-LAST:event_libro_asActionPerformed

    private void revistaa_ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revistaa_ssActionPerformed
      
        revista_a.setVisible(true);
    }//GEN-LAST:event_revistaa_ssActionPerformed

    private void prestar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestar_libroActionPerformed

        prestar_libro_o.setVisible(true);
        
    }//GEN-LAST:event_prestar_libroActionPerformed

    private void prestar_revistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestar_revistarActionPerformed
        prestar_revista.setVisible(true);
    }//GEN-LAST:event_prestar_revistarActionPerformed

    private void periodicos_ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodicos_ssActionPerformed
        periodico.setVisible(true);
    }//GEN-LAST:event_periodicos_ssActionPerformed

    private void prestar_periodico_asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestar_periodico_asActionPerformed
        prestar_periodico.setVisible(true);
    }//GEN-LAST:event_prestar_periodico_asActionPerformed

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
            java.util.logging.Logger.getLogger(jfmMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmMaterial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton libro_as;
    private javax.swing.JButton periodicos_ss;
    private javax.swing.JButton prestar_libro;
    private javax.swing.JButton prestar_periodico_as;
    private javax.swing.JButton prestar_revistar;
    private javax.swing.JButton revistaa_ss;
    // End of variables declaration//GEN-END:variables
}
