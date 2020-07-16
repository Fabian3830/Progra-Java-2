package no_estructuras;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class jfmIniciarSesion extends javax.swing.JFrame {

    ArrayList<Administrador> administradores=new ArrayList<>();
    
    public jfmIniciarSesion() {
       leer();
        System.out.println(""+administradores.toString());
        initComponents();
    }

    //NO BORRAR!!!!!!!!
    public void desechable() {
        Administrador p = new Administrador("lol", "123", "pedro", "123", "", "1232", "");
        Administrador q = new Administrador("lal", "123", "juan", "12312", "", "12312", "");
        Administrador r = new Administrador("lel", "123", "juez", "1231", "", "12321", "");

        administradores.add(r);
        administradores.add(q);
        administradores.add(p);

        try {
            FileOutputStream archivo = new FileOutputStream("admin.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(administradores);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
        }

    }

    public void leer() {

        //esto lee 
        try {
            FileInputStream archivo = new FileInputStream("admin.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                administradores = (ArrayList<Administrador>) leedor.readObject();
                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbuser = new javax.swing.JLabel();
        lbcontrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        BtnEntrar = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar Sesión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 36))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        lbuser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbuser.setText("Usuario");

        lbcontrasena.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbcontrasena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcontrasena.setText("Contraseña");

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtnEntrar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(BtnEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pass)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lbuser))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lbcontrasena)))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbuser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lbcontrasena)
                .addGap(31, 31, 31)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEntrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="convertir la contraseña en String">
        String contrasena;
        char[] d = pass.getPassword();
        //este lo convierte en estring
        contrasena = String.valueOf(d);
        //aqui lo imprime
        System.out.println("" + contrasena);
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="SI el string de usuario y la contraseña son diferentes a null ENTONCES INICIE SESION, si no, avise al usuario de llenar todos los espacios ">
        if (txtUsuario.getText() != null && contrasena != null) {

            //<editor-fold defaultstate="collapsed" desc="SI usuario existe entonces inicie sesion, si no, avise al usuario ">
            if (comprobar(txtUsuario.getText(), contrasena)) {

                System.out.println("EXITO");
                //mandar al admin a opciones
                jfmMenu sw = new jfmMenu(txtUsuario.getText());
                sw.setVisible(true);
                setVisible(false);
                sw.setLocationRelativeTo(null);
                txtUsuario.setText("");
                pass.setText("");
            } else {
                lbuser.setForeground(Color.red);
                lbcontrasena.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "usuario o contraseña mal digitados, intente otra vez");

            }

//</editor-fold>
        } else {
            JOptionPane.showMessageDialog(null, "rellene todos los espacios");
        }
//</editor-fold>

    }//GEN-LAST:event_BtnEntrarActionPerformed

     public boolean comprobar(String userN, String contrasena) {
        
        if (administradores==null) {
            return false;
        } else {
                       for (int i = 0; i <administradores.size(); i++) {
                
                if (administradores.get(i).getNombre_cuenta().equals(userN) && administradores.get(i).getContrasena_cuenta().equals(contrasena)) {
                return true;
                }
            }
            
        }
        
        return false;
        
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
            java.util.logging.Logger.getLogger(jfmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmIniciarSesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbcontrasena;
    private javax.swing.JLabel lbuser;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
