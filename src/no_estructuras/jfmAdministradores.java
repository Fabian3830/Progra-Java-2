/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_estructuras;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class jfmAdministradores extends javax.swing.JFrame {

    ArrayList<Administrador> administradores = new ArrayList<>();
    String criterio_eliminar_administrador = "";
    int modificador = -1;
    TableRowSorter filtro_eliminar;
    TableRowSorter filtro_editar;
    int indice_modificar;

    public jfmAdministradores() {
        leer_administradores();
        initComponents();
        tabla_cargar_eliminar();
        tabla_cargar_editar();
        //<editor-fold defaultstate="collapsed" desc="manejo de tablas ">
        tabla_eliminar.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tabla_eliminar.setRowSelectionAllowed(true);
                    int i = tabla_eliminar.getSelectedRow();

                    criterio_eliminar_administrador = (tabla_eliminar.getValueAt(i, 1).toString());
                    System.out.println("criterio eliminar" + criterio_eliminar_administrador);
                } catch (Exception err) {
                    System.out.println("ERROR");
                }
            }

        });

        tabla_editar.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tabla_editar.setRowSelectionAllowed(true);

                    int i = tabla_editar.getSelectedRow();
                    modificador = i;

                    String criterio_modificar = (tabla_editar.getValueAt(i, 2).toString());
                    for (int j = 0; j < administradores.size(); j++) {

                        if (administradores.get(j).getCedula().equals(criterio_modificar)) {
                            indice_modificar = j;
                            break;
                        }
                    }

                    System.out.println("criterio eliminar " + criterio_modificar);

                } catch (Exception err) {
                    System.out.println("ERROR" + err);
                }
            }

        });
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="buscador">
        txt_busqueda_eliminar.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(final KeyEvent e) {
                String f = txt_busqueda_eliminar.getText();
                txt_busqueda_eliminar.setText(f);
                repaint();
                filtro_x();
            }

        });

        txt_buscar_mod.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(final KeyEvent e) {
                String r = txt_buscar_mod.getText();
                txt_buscar_mod.setText(r);
                repaint();
                filtro_modo();
            }

        });

//</editor-fold>
    }

    public void filtro_modo() {
        filtro_editar.setRowFilter(RowFilter.regexFilter(txt_buscar_mod.getText(), 1, 0, 2, 3, 4));

    }

    //<editor-fold defaultstate="collapsed" desc="admins memoria">
    public void leer_administradores() {
        try {
            FileInputStream archivo = new FileInputStream("admin.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                administradores = (ArrayList<Administrador>) leedor.readObject();
                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    public void escribir_Administradores() {

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
//</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        primer_panel = new javax.swing.JPanel();
        poner_roj = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_new_user = new javax.swing.JTextField();
        txt_new_contrasena = new javax.swing.JTextField();
        txt_new_direccion = new javax.swing.JTextField();
        txt_new_telefono = new javax.swing.JTextField();
        txt_new_nombre = new javax.swing.JTextField();
        txt_new_cedula = new javax.swing.JTextField();
        crear_administrador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_eliminar = new javax.swing.JTable();
        btn_Eliminar_administrador = new javax.swing.JButton();
        txt_busqueda_eliminar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        poner_roj1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_elim_user = new javax.swing.JTextField();
        txt_elim_contrasena = new javax.swing.JTextField();
        txt_elim_telefono = new javax.swing.JTextField();
        txt_elim_nombre = new javax.swing.JTextField();
        txt_elim_cedula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_elim_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_editar = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_elim_direccion = new javax.swing.JTextArea();
        txt_buscar_mod = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(763, 458));
        jPanel1.setMinimumSize(new java.awt.Dimension(763, 458));
        jPanel1.setPreferredSize(new java.awt.Dimension(763, 458));

        primer_panel.setBackground(new java.awt.Color(255, 255, 255));

        poner_roj.setText("usuario");

        jLabel2.setText("contraseña");

        jLabel3.setText("cedula");

        jLabel4.setText("nombre completo");

        jLabel5.setText("# telefono");

        jLabel6.setText("direccion de vivienda");

        crear_administrador.setText("crear administrador");
        crear_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_administradorActionPerformed(evt);
            }
        });

        jLabel1.setText("Email");

        javax.swing.GroupLayout primer_panelLayout = new javax.swing.GroupLayout(primer_panel);
        primer_panel.setLayout(primer_panelLayout);
        primer_panelLayout.setHorizontalGroup(
            primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, primer_panelLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(primer_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_new_telefono))
                    .addGroup(primer_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email))
                    .addGroup(primer_panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_new_nombre))
                    .addGroup(primer_panelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_new_cedula))
                    .addGroup(primer_panelLayout.createSequentialGroup()
                        .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(primer_panelLayout.createSequentialGroup()
                                .addComponent(poner_roj, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(crear_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(primer_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_new_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(primer_panelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6))
                                    .addComponent(txt_new_direccion, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(337, 337, 337))
        );
        primer_panelLayout.setVerticalGroup(
            primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primer_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poner_roj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_new_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_new_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_new_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_new_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_new_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crear_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("crear administradores", primer_panel);

        tabla_eliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nombre", "usuario", "cedula"
            }
        ));
        jScrollPane2.setViewportView(tabla_eliminar);

        btn_Eliminar_administrador.setText("eliminar administrador");
        btn_Eliminar_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_administradorActionPerformed(evt);
            }
        });

        txt_busqueda_eliminar.setEnabled(false);

        jLabel13.setText("*Busqueda por nombre/username/cedula*");

        jLabel15.setText("buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btn_Eliminar_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busqueda_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_busqueda_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btn_Eliminar_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("eliminar administradores", jPanel2);

        poner_roj1.setText("usuario");

        jLabel7.setText("contraseña");

        jLabel8.setText("cedula");

        jLabel9.setText("nombre completo");

        jLabel10.setText("# telefono");

        jLabel11.setText("direccion de vivienda");

        jLabel12.setText("Email");

        tabla_editar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "user name", "nombre", "cedula", "telefono", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_editar);

        editar.setText("editar");
        editar.setEnabled(false);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        guardar.setText("guardar");
        guardar.setEnabled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        txt_elim_direccion.setColumns(20);
        txt_elim_direccion.setRows(5);
        jScrollPane3.setViewportView(txt_elim_direccion);

        jLabel14.setText("buscador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_buscar_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(poner_roj1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_elim_user, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_elim_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_elim_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_elim_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_elim_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(editar)
                                        .addGap(53, 53, 53)
                                        .addComponent(guardar))
                                    .addComponent(txt_elim_email, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11))
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poner_roj1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_elim_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_elim_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_elim_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_elim_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_elim_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_elim_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editar)
                            .addComponent(guardar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_buscar_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("modificar admistradores", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void crear_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_administradorActionPerformed

        //lleno el nuevo admin con la informacion digitada
        Administrador nuevo = new Administrador(txt_new_user.getText(), txt_new_contrasena.getText(), txt_new_nombre.getText(), txt_new_cedula.getText(), txt_email.getText(), txt_new_telefono.getText(), txt_new_direccion.getText());

        //<editor-fold defaultstate="collapsed" desc="si todos los datos no se han llenado correctamente entonces avise al usuario,si no, añada el usuario">
        if (nuevo.anadirAdministrador()) {

            JOptionPane.showMessageDialog(null, "llene todos los espacios");

        } else {

            //<editor-fold defaultstate="collapsed" desc="si ese usuario ya existe entonces no guarde y avise al usuario, si no, guarde el usuario exitosamente">
            if (verificar_admin(nuevo.getNombre_cuenta())) {
                poner_roj.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "ese nombre de usuario ya existe");

            } else {
                administradores.add(nuevo);
                escribir_Administradores();
                tabla_cargar_eliminar();
                tabla_cargar_editar();
                JOptionPane.showMessageDialog(null, "el usuario se añadió con exito");
                txt_email.setText("");
                txt_new_cedula.setText("");
                txt_new_contrasena.setText("");
                txt_new_nombre.setText("");
                txt_new_user.setText("");
                txt_new_direccion.setText("");
                txt_new_telefono.setText("");
            }

            //</editor-fold>
        }
        //</editor-fold>

    }//GEN-LAST:event_crear_administradorActionPerformed

    public boolean verificar_admin(String userName) {

        if (administradores == null) {

            return false;

        } else {

            for (int i = 0; i < administradores.size(); i++) {

                if (administradores.get(i).getNombre_cuenta().equals(userName)) {
                    return true;
                }

            }

        }
        return false;

    }


    private void btn_Eliminar_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_administradorActionPerformed

        //<editor-fold defaultstate="collapsed" desc="si el usuario ya eligio algo de la tabla de eliminar entonces pase a la siguiente condicion ">
        if (criterio_eliminar_administrador.equals("") || criterio_eliminar_administrador == null) {

            JOptionPane.showMessageDialog(null, "seleccione un elemento primero de la tabla, intente de nuevo");

        } else {

            //<editor-fold defaultstate="collapsed" desc="aqui si lo anterior se cumple, se elimina un usuario admin">
            int s = JOptionPane.showConfirmDialog(null, " ¿Esta seguro?, los datos se perderan por siempre");
            if (s == 0) {
                // copio la cola usuarios pero sin el elemento que quiero eliminar
                for (int i = 0; i < administradores.size(); i++) {

                    if (criterio_eliminar_administrador.equals(administradores.get(i).getNombre_cuenta())) {
                        administradores.remove(i);
                    }
                }

                //actualizo la cola de nuevo
                escribir_Administradores();
                tabla_cargar_eliminar();
                tabla_cargar_editar();
            }
            //</editor-fold>

        }
        //</editor-fold>
    }//GEN-LAST:event_btn_Eliminar_administradorActionPerformed

    public void tabla_cargar_eliminar() {
        actualizar_tabla_eliminar();

        txt_busqueda_eliminar.setEnabled(true);

    }

    public void tabla_cargar_editar() {
        actualizar_tabla_edit();

        guardar.setEnabled(false);
        editar.setEnabled(true);
    }

    public void actualizar_tabla_edit() {
        String matriz2[][] = new String[administradores.size() + 1][5];

        for (int i = 0; i < administradores.size(); i++) {

            matriz2[i][0] = administradores.get(i).getNombre_cuenta();
            matriz2[i][1] = administradores.get(i).getNombre();
            matriz2[i][2] = administradores.get(i).getCedula();
            matriz2[i][3] = administradores.get(i).getTelefono();
            matriz2[i][4] = administradores.get(i).getEmail();
        }

        tabla_editar.setModel(new javax.swing.table.DefaultTableModel(
                matriz2,
                new String[]{
                    "user name", "nombre", "cedula", "telefono", "email"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        filtro_editar = new TableRowSorter(tabla_editar.getModel());
        tabla_editar.setRowSorter(filtro_editar);
        editar.setEnabled(true);

    }

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {

            if (!(txt_elim_user.getText().equals("") || txt_elim_cedula.getText().equals("") || txt_elim_email.getText().equals("") || txt_elim_telefono.getText().equals("") || txt_elim_direccion.getText().equals(""))) {

                administradores.get(indice_modificar).setCedula(txt_elim_cedula.getText());
                administradores.get(indice_modificar).setDireccion(txt_elim_direccion.getText());
                administradores.get(indice_modificar).setNombre(txt_elim_nombre.getText());
                administradores.get(indice_modificar).setEmail(txt_elim_email.getText());
                administradores.get(indice_modificar).setTelefono(txt_elim_telefono.getText());
                administradores.get(indice_modificar).setContrasena_cuenta(txt_elim_contrasena.getText());
                administradores.get(indice_modificar).setNombre_cuenta(txt_elim_user.getText());

                txt_elim_cedula.setText("");
                txt_elim_nombre.setText("");
                txt_elim_direccion.setText("");
                txt_elim_email.setText("");
                txt_elim_telefono.setText("");
                txt_elim_user.setText("");
                txt_elim_contrasena.setText("");

                guardar.setEnabled(false);
                editar.setEnabled(true);

                escribir_Administradores();

                modificador = -1;
                tabla_cargar_eliminar();
                tabla_cargar_editar();

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            if (modificador != -1) {

                editar.setEnabled(false);
                txt_elim_cedula.setText("" + administradores.get(indice_modificar).getCedula());
                txt_elim_nombre.setText("" + administradores.get(indice_modificar).getNombre());
                txt_elim_direccion.setText("" + administradores.get(indice_modificar).getDireccion());
                txt_elim_email.setText("" + administradores.get(indice_modificar).getEmail());
                txt_elim_telefono.setText("" + administradores.get(indice_modificar).getTelefono());
                txt_elim_user.setText("" + administradores.get(indice_modificar).getNombre_cuenta());
                txt_elim_contrasena.setText("" + administradores.get(indice_modificar).getContrasena_cuenta());

                guardar.setEnabled(true);

                limpia_tabla_edit();

                editar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "primero elija un usuario de la tabla");
            }

        } catch (HeadlessException headlessException) {
            System.out.println("ERROR " + headlessException);
        }

    }//GEN-LAST:event_editarActionPerformed

    public void filtro_x() {
        filtro_eliminar.setRowFilter(RowFilter.regexFilter(txt_busqueda_eliminar.getText(), 1, 0, 2));

    }

    public void limpia_tabla_edit() {

        tabla_editar.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null},
                    {null, null, null, null, null}
                },
                new String[]{
                    "user name", "nombre", "cedula", "telefono", "email"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        filtro_editar = new TableRowSorter(tabla_editar.getModel());
        tabla_editar.setRowSorter(filtro_editar);
    }

    public void actualizar_tabla_eliminar() {

        String matriz[][] = new String[administradores.size() + 1][3];

        for (int i = 0; i < administradores.size(); i++) {

            matriz[i][0] = administradores.get(i).getNombre();
            matriz[i][1] = administradores.get(i).getNombre_cuenta();
            matriz[i][2] = administradores.get(i).getCedula();
        }

        System.out.println("" + Arrays.deepToString(matriz));
        tabla_eliminar.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "nombre", "usuario", "telefono"
                }
        ));

        filtro_eliminar = new TableRowSorter(tabla_eliminar.getModel());
        tabla_eliminar.setRowSorter(filtro_eliminar);
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
            java.util.logging.Logger.getLogger(jfmAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmAdministradores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar_administrador;
    private javax.swing.JButton crear_administrador;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel poner_roj;
    private javax.swing.JLabel poner_roj1;
    private javax.swing.JPanel primer_panel;
    private javax.swing.JTable tabla_editar;
    private javax.swing.JTable tabla_eliminar;
    private javax.swing.JTextField txt_buscar_mod;
    private javax.swing.JTextField txt_busqueda_eliminar;
    private javax.swing.JTextField txt_elim_cedula;
    private javax.swing.JTextField txt_elim_contrasena;
    private javax.swing.JTextArea txt_elim_direccion;
    private javax.swing.JTextField txt_elim_email;
    private javax.swing.JTextField txt_elim_nombre;
    private javax.swing.JTextField txt_elim_telefono;
    private javax.swing.JTextField txt_elim_user;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_new_cedula;
    private javax.swing.JTextField txt_new_contrasena;
    private javax.swing.JTextField txt_new_direccion;
    private javax.swing.JTextField txt_new_nombre;
    private javax.swing.JTextField txt_new_telefono;
    private javax.swing.JTextField txt_new_user;
    // End of variables declaration//GEN-END:variables
}
