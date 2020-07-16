/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    mou MMO = new mou();

    private ArrayList<JButton> botones;
    private int indice;

    ArrayList<String> nombres;
    ArrayList<String> direcciones;

    JButton boton = new JButton();

    public GUI() {
        this.nombres = new ArrayList<>();
        this.direcciones = new ArrayList<>();
        upLoadROM();
        initComponents();
        botones = new ArrayList<>();
        addMouseListener(MMO);
        indice = 0;
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();

        anadir.setText("añadir");
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        panel.setLayout(new java.awt.GridLayout(0, 3, 10, 10));
        jScrollPane1.setViewportView(panel);

        refresh.setText("refrescar");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(anadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                        .addComponent(refresh)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anadir)
                    .addComponent(refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed

        OPN d = new OPN();
        d.setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_anadirActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        for (int i = 0; i < botones.size(); i++) {

            if (botones.get(i).getText().equals("null")) {
                botones.remove(i);
            }

        }

        errores d = new errores();
        d.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_refreshActionPerformed

    public void actualizar() {

        while (indice < nombres.size() || indice < direcciones.size()) {
            boton = new JButton();
            boton.setText(nombres.get(indice));
            boton.setName("" + indice);
            boton.addMouseListener(MMO);
            panel.add(boton);
            botones.add(boton);
            indice++;
        }

        panel.updateUI();

    }

    public void upLoadROM() {

        String llegan = null;
        try {
            FileReader lector = new FileReader("ROMprod.txt");
            BufferedReader BR = new BufferedReader(lector);
            llegan = BR.readLine();

        } catch (IOException ex) {
        }
        if (llegan != null) {
        String[] partes;
        partes = llegan.split("♥");
        //System.out.println(llegan);

       

            for (int k = 0; k < partes.length - 1; k += 2) {
                nombres.add(partes[k]);
                direcciones.add(partes[k + 1]);
            }

        }

    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}

//////////////////////////////////////////
/////////////////////////////////////////////////
class mou implements MouseListener {

    String direccion = null;
    String llegan = null;
    String titulo = null;
    int BTnname = -1;
    int danado = -1;
    ArrayList<String> nombres;
    ArrayList<String> direcciones;

    public mou() {
        this.nombres = new ArrayList<>();
        this.direcciones = new ArrayList<>();
        upLoadROM();

    }

    ///////ESTE ES PARA CARGAR DIRECCIONES
    public void upLoadROM() {

        String llegan = null;
        try {
            FileReader lector = new FileReader("ROMprod.txt");
            BufferedReader BR = new BufferedReader(lector);
            llegan = BR.readLine();

        } catch (IOException ex) {
        }

        if (llegan!=null) {

            String[] partes;
            partes = llegan.split("♥");
            //System.out.println(llegan);

            if (llegan != null) {

                for (int k = 0; k < partes.length - 1; k += 2) {
                    nombres.add(partes[k]);
                    direcciones.add(partes[k + 1]);
                }

            }
        }
    }

    public void xd(int e) {

        if (e != -1) {

            if (e == -1) {
                JOptionPane.showMessageDialog(null, "error 404 not found");
            } else {

                ejecutar(direcciones.get(e));

            }
        }

    }

    public void ejecutar(String direccion) {

        BTnname = -1;

        ProcessBuilder p = new ProcessBuilder();

        File d = new File(direccion);

        p.command("cmd.exe", "/c", direccion);

        if (d.exists()) {

            try {
                p.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else {

            if (danado != -1) {
                JOptionPane.showMessageDialog(null,"porfavor presione refrescar");
                nombres.remove(danado);
                direcciones.remove(danado);
                guardarROM();
            }
        }

    }

    public void guardarROM() {

        try (
                FileWriter fichero = new FileWriter("ROMprod.txt");
                FileReader lector = new FileReader("ROMprod.txt");
                BufferedReader BR = new BufferedReader(lector);
                BufferedWriter bw = new BufferedWriter(new FileWriter("ROMprod.txt"))) {

            while (BR.readLine() != null) {
                bw.write(" ");
            }
            bw.close();

            for (int i = 0; (i < nombres.size()) || (i < direcciones.size()); i++) {
                System.out.println("hay nules");
                if (nombres.get(i) != null || direcciones.get(i) != null) {

                    fichero.write(nombres.get(i) + "♥" + direcciones.get(i) + "♥");

                }

            }

            fichero.close();

        } catch (IOException SD) {

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        try {

            BTnname = Integer.parseInt(e.getComponent().getName());
            danado = BTnname;
            if (BTnname != -1) {
                xd(BTnname);
            }
        } catch (NumberFormatException ex) {

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
