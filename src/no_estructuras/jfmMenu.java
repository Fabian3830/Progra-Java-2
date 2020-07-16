/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no_estructuras;

import Imagenes.GUI;

/**
 *
 * @author User
 */
public class jfmMenu extends javax.swing.JFrame {

    public jfmMenu(String nombre) {
        initComponents();
        lb_user.setText("usuario: " + nombre);
    }

    
    jfmAdministradores admi = new jfmAdministradores();
    jfmMaterial material = new jfmMaterial();
    jfmMaterialApoyo MA = new jfmMaterialApoyo();
    jfmClientes usuarios = new jfmClientes();
    jfmActividades ACTI = new jfmActividades();
    jfmSalas sala = new jfmSalas();

    jfmPrestarRevista prestar_revista = new jfmPrestarRevista();
    jfmLibros libro = new jfmLibros();
    jfmRevista revista_a = new jfmRevista();
    jfmPeriodico periodico = new jfmPeriodico();
    jfmPrestarPeriodico prestar_periodico = new jfmPrestarPeriodico();
    jfmPrestarLibro prestar_libro_o = new jfmPrestarLibro();

    public jfmMenu() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lb_user = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        shortcut_admin = new javax.swing.JMenuItem();
        shorcut_sala = new javax.swing.JMenuItem();
        chorcut_clientes = new javax.swing.JMenuItem();
        shorcut_MA = new javax.swing.JMenuItem();
        chorcut_actividad = new javax.swing.JMenuItem();
        shortcut_materiales = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        shorcut_libros = new javax.swing.JMenuItem();
        prestar_libros = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        shorcut_revistas = new javax.swing.JMenuItem();
        prestar_revis = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        shorcut_periodico = new javax.swing.JMenuItem();
        shorcut_prestar_periodico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        shorcut_easter_egg = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36))); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10003.png"))); // NOI18N
        jButton1.setText("Administradores");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book-open-shape_icon-icons.com_70792.png"))); // NOI18N
        jButton2.setText("    Material");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHideActionText(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/67836.png"))); // NOI18N
        jButton3.setText("  Actividades");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PixelKit_Shape-193-copy_37747.png"))); // NOI18N
        jButton4.setText("Material de Apoyo");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10003.png"))); // NOI18N
        jButton5.setText("Clientes");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lb_user.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_user.setText("Administrador :");

        jButton6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/67836.png"))); // NOI18N
        jButton6.setText("  Salas de Estudio");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lb_user, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jMenu1.setText("modulos");

        shortcut_admin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        shortcut_admin.setText("administradores");
        shortcut_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortcut_adminActionPerformed(evt);
            }
        });
        jMenu1.add(shortcut_admin);

        shorcut_sala.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        shorcut_sala.setText("salas de estudio");
        shorcut_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shorcut_salaActionPerformed(evt);
            }
        });
        jMenu1.add(shorcut_sala);

        chorcut_clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        chorcut_clientes.setText("clientes");
        chorcut_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chorcut_clientesActionPerformed(evt);
            }
        });
        jMenu1.add(chorcut_clientes);

        shorcut_MA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        shorcut_MA.setText("materiales de apoyo");
        shorcut_MA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shorcut_MAActionPerformed(evt);
            }
        });
        jMenu1.add(shorcut_MA);

        chorcut_actividad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        chorcut_actividad.setText("actividades");
        chorcut_actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chorcut_actividadActionPerformed(evt);
            }
        });
        jMenu1.add(chorcut_actividad);

        shortcut_materiales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        shortcut_materiales.setText("materiales");
        shortcut_materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortcut_materialesActionPerformed(evt);
            }
        });
        jMenu1.add(shortcut_materiales);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("texto");

        jMenu4.setText("libros");

        shorcut_libros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        shorcut_libros.setText("libros");
        shorcut_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shorcut_librosActionPerformed(evt);
            }
        });
        jMenu4.add(shorcut_libros);

        prestar_libros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        prestar_libros.setText("prestar libros");
        prestar_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestar_librosActionPerformed(evt);
            }
        });
        jMenu4.add(prestar_libros);

        jMenu5.add(jMenu4);

        jMenu6.setText("revistas periodicos");

        shorcut_revistas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        shorcut_revistas.setText("revistas");
        shorcut_revistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shorcut_revistasActionPerformed(evt);
            }
        });
        jMenu6.add(shorcut_revistas);

        prestar_revis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        prestar_revis.setText("prestar revistas");
        prestar_revis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestar_revisActionPerformed(evt);
            }
        });
        jMenu6.add(prestar_revis);

        jMenu5.add(jMenu6);

        jMenu7.setText("periodicos");

        shorcut_periodico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        shorcut_periodico.setText("periodicos");
        shorcut_periodico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shorcut_periodicoActionPerformed(evt);
            }
        });
        jMenu7.add(shorcut_periodico);

        shorcut_prestar_periodico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        shorcut_prestar_periodico.setText("prestar periodicos");
        shorcut_prestar_periodico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shorcut_prestar_periodicoActionPerformed(evt);
            }
        });
        jMenu7.add(shorcut_prestar_periodico);

        jMenu5.add(jMenu7);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("mas");

        jMenu3.setText("extras");

        jMenu8.setText("easter egg");

        shorcut_easter_egg.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        shorcut_easter_egg.setText("lpf");
        shorcut_easter_egg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shorcut_easter_eggActionPerformed(evt);
            }
        });
        jMenu8.add(shorcut_easter_egg);

        jMenu3.add(jMenu8);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        admi.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        material.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ACTI.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        usuarios.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        MA.setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        sala.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void shortcut_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortcut_adminActionPerformed
        admi.setVisible(true);

    }//GEN-LAST:event_shortcut_adminActionPerformed

    private void shorcut_easter_eggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shorcut_easter_eggActionPerformed
      lee.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_shorcut_easter_eggActionPerformed

    private void shorcut_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shorcut_salaActionPerformed
        sala.setVisible(true);
        
    }//GEN-LAST:event_shorcut_salaActionPerformed

    private void chorcut_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chorcut_clientesActionPerformed
        usuarios.setVisible(true);
        
    }//GEN-LAST:event_chorcut_clientesActionPerformed

    private void shorcut_MAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shorcut_MAActionPerformed
        MA.setVisible(true);

    }//GEN-LAST:event_shorcut_MAActionPerformed

    private void chorcut_actividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chorcut_actividadActionPerformed

        ACTI.setVisible(true);

    }//GEN-LAST:event_chorcut_actividadActionPerformed

    private void shortcut_materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortcut_materialesActionPerformed
        material.setVisible(true);
        
    }//GEN-LAST:event_shortcut_materialesActionPerformed

    private void shorcut_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shorcut_librosActionPerformed

        libro.setVisible(true);

    }//GEN-LAST:event_shorcut_librosActionPerformed

    private void prestar_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestar_librosActionPerformed

        prestar_libro_o.setVisible(true);
    }//GEN-LAST:event_prestar_librosActionPerformed

    private void shorcut_revistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shorcut_revistasActionPerformed

        revista_a.setVisible(true);

    }//GEN-LAST:event_shorcut_revistasActionPerformed

    private void prestar_revisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestar_revisActionPerformed
        prestar_revista.setVisible(true);
        
    }//GEN-LAST:event_prestar_revisActionPerformed

    private void shorcut_periodicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shorcut_periodicoActionPerformed
        periodico.setVisible(true);
        
    }//GEN-LAST:event_shorcut_periodicoActionPerformed

    private void shorcut_prestar_periodicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shorcut_prestar_periodicoActionPerformed
        prestar_periodico.setVisible(true);
        
    }//GEN-LAST:event_shorcut_prestar_periodicoActionPerformed

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
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem chorcut_actividad;
    private javax.swing.JMenuItem chorcut_clientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_user;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenuItem prestar_libros;
    private javax.swing.JMenuItem prestar_revis;
    private javax.swing.JMenuItem shorcut_MA;
    private javax.swing.JMenuItem shorcut_easter_egg;
    private javax.swing.JMenuItem shorcut_libros;
    private javax.swing.JMenuItem shorcut_periodico;
    private javax.swing.JMenuItem shorcut_prestar_periodico;
    private javax.swing.JMenuItem shorcut_revistas;
    private javax.swing.JMenuItem shorcut_sala;
    private javax.swing.JMenuItem shortcut_admin;
    private javax.swing.JMenuItem shortcut_materiales;
    // End of variables declaration//GEN-END:variables

    GUI lee=new GUI();

}
