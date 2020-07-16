/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_estructuras;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class jfmClientes extends javax.swing.JFrame {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    String criterio_eliminar_usuario = "";
    TableRowSorter filtro_eliminar;
    TableRowSorter filtro_editar;
    int indice_modificar;
    int modificador = -1;

    public jfmClientes() {
        //escribir_usuarios();
        System.out.println("" + jfmClientes.clientes.toString());
        initComponents();
        cargar_tabla_ver();
        cargar_tabla_editar();
        cargar_tabla_eliminar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txt_new_direccion_usuario = new javax.swing.JTextField();
        txt_new_telefono = new javax.swing.JTextField();
        txt_new_nombre = new javax.swing.JTextField();
        txt_new_cedula = new javax.swing.JTextField();
        crear_cliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_ver_cliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_editar = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_mod_email = new javax.swing.JTextField();
        txt_mod_direccion = new javax.swing.JTextField();
        txt_mod_telefono = new javax.swing.JTextField();
        txt_mod_nombre = new javax.swing.JTextField();
        txt_mod_cedula = new javax.swing.JTextField();
        btn_editar_cliente = new javax.swing.JButton();
        btn_guardar_cliente = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        area_texto_direccion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        combo_si_no = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txt_buscar_mod = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_eliminar_cliente = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Actualiza_tabla_ver = new javax.swing.JButton();
        clientes_demo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(763, 458));
        jPanel1.setMinimumSize(new java.awt.Dimension(763, 458));
        jPanel1.setPreferredSize(new java.awt.Dimension(763, 458));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        crear_cliente.setText("crear cliente");
        crear_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_clienteActionPerformed(evt);
            }
        });

        jLabel9.setText("cedula");

        jLabel10.setText("nombre completo");

        jLabel11.setText("# telefono");

        jLabel12.setText("direccion de vivienda");

        jLabel13.setText("Email");

        tabla_ver_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nombre ", "cedula", "telefono", "email", "moroso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_ver_cliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_new_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_new_cedula))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_new_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_email)))
                    .addComponent(crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(txt_new_direccion_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_new_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_new_direccion_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_new_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_new_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("crear clientes", jPanel2);

        tabla_editar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nombre ", "cedula", "telefono", "email", "moroso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_editarMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_editar);

        jLabel14.setText("cedula");

        jLabel15.setText("nombre completo");

        jLabel16.setText("# telefono");

        jLabel17.setText("direccion de vivienda");

        jLabel18.setText("Email");

        btn_editar_cliente.setText("editar");
        btn_editar_cliente.setEnabled(false);
        btn_editar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_clienteActionPerformed(evt);
            }
        });

        btn_guardar_cliente.setText("guardar");
        btn_guardar_cliente.setEnabled(false);
        btn_guardar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_clienteActionPerformed(evt);
            }
        });

        area_texto_direccion.setColumns(20);
        area_texto_direccion.setRows(5);
        jScrollPane5.setViewportView(area_texto_direccion);

        jLabel8.setText("direccion de vivienda, cliente elegido");

        combo_si_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "no", "si", " " }));

        jLabel19.setText("moroso");

        txt_buscar_mod.setEnabled(false);
        txt_buscar_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscar_modKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 176, Short.MAX_VALUE)
                                        .addComponent(btn_editar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_buscar_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_mod_cedula))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_mod_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_mod_email, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(5, 5, 5)
                                        .addComponent(txt_mod_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combo_si_no, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(txt_mod_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(48, 48, 48)))
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btn_guardar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 37, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(txt_mod_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_mod_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addComponent(combo_si_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_mod_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_mod_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btn_editar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_buscar_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_mod_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("modificar clientes", jPanel3);

        tabla_eliminar_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nombre ", "cedula", "telefono", "email", "moroso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_eliminar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_eliminar_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_eliminar_cliente);

        txt_buscar.setEnabled(false);
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        btn_eliminar.setText("eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("buscar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("eliminar clientes", jPanel4);

        Actualiza_tabla_ver.setText("actualizar tablas");
        Actualiza_tabla_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualiza_tabla_verActionPerformed(evt);
            }
        });

        clientes_demo.setText("DEMO");
        clientes_demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientes_demoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Actualiza_tabla_ver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientes_demo)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualiza_tabla_ver)
                    .addComponent(clientes_demo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crear_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_clienteActionPerformed

        Cliente nuevo = new Cliente(null,false, null, null, txt_new_nombre.getText(), txt_new_cedula.getText(), txt_email.getText(), txt_new_telefono.getText(), txt_new_direccion_usuario.getText());

        if (txt_new_nombre.getText().equals("") || txt_new_cedula.getText().equals("") || txt_email.getText().equals("") || txt_new_telefono.getText().equals("") || txt_new_direccion_usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "llene todos los espaios vacios, intente de nuevo");
        } else {

            if (!comprobar(txt_new_cedula.getText())) {
                jfmClientes.clientes.add(nuevo);
                No_estructuras.escribir_clientes();
                JOptionPane.showMessageDialog(null, "el usuario se añadió con exito");
                txt_new_nombre.setText("");
                txt_new_cedula.setText("");
                txt_email.setText("");
                txt_new_telefono.setText("");
                txt_new_direccion_usuario.setText("");
                cargar_tabla_ver();
                cargar_tabla_editar();
            } else {
                JOptionPane.showMessageDialog(null, "esa cedula ya existe en el sistema");
            }

        }
    }//GEN-LAST:event_crear_clienteActionPerformed

    public boolean comprobar(String cedula) {

        if (jfmClientes.clientes == null) {
            return false;
        } else {

            for (int i = 0; i < jfmClientes.clientes.size(); i++) {

                if (jfmClientes.clientes.get(i).getCedula().equals(cedula)) {
                    return true;
                }

            }

        }

        return false;

    }

    public void cargar_tabla_ver() {
        try {

            String[][] matriz = new String[jfmClientes.clientes.size() + 1][5];

            for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                matriz[i][0] = jfmClientes.clientes.get(i).getNombre();
                matriz[i][1] = jfmClientes.clientes.get(i).getCedula();
                matriz[i][2] = jfmClientes.clientes.get(i).getTelefono();
                matriz[i][3] = jfmClientes.clientes.get(i).getEmail();
                if (jfmClientes.clientes.get(i).isMoroso()) {
                    matriz[i][4] = "si";
                } else {
                    matriz[i][4] = "no";
                }

            }

            if (matriz != null) {

                tabla_ver_cliente.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "nombre ", "cedula", "telefono", "email", "moroso"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }

    }

    private void btn_editar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_clienteActionPerformed
        try {
            if (modificador != -1) {

                btn_editar_cliente.setEnabled(false);
                txt_mod_cedula.setText("" + jfmClientes.clientes.get(indice_modificar).getCedula());
                txt_mod_nombre.setText("" + jfmClientes.clientes.get(indice_modificar).getNombre());
                txt_mod_direccion.setText("" + jfmClientes.clientes.get(indice_modificar).getDireccion());
                txt_mod_email.setText("" + jfmClientes.clientes.get(indice_modificar).getEmail());
                txt_mod_telefono.setText("" + jfmClientes.clientes.get(indice_modificar).getTelefono());
                if (true == jfmClientes.clientes.get(indice_modificar).isMoroso()) {

                    combo_si_no.setSelectedIndex(1);
                }
                if (false == jfmClientes.clientes.get(indice_modificar).isMoroso()) {

                    combo_si_no.setSelectedIndex(0);

                }

                btn_guardar_cliente.setEnabled(true);
                limpia_tabla_elimimar_usuarios();
            } else {
                JOptionPane.showMessageDialog(null, "primero elija un usuario de la tabla");
            }

        } catch (HeadlessException headlessException) {
            System.out.println("ERROR " + headlessException);
        }
    }//GEN-LAST:event_btn_editar_clienteActionPerformed

    private void btn_guardar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_clienteActionPerformed
        try {

            if (!(txt_mod_nombre.getText().equals("") || txt_mod_cedula.getText().equals("") || txt_mod_email.getText().equals("") || txt_mod_telefono.getText().equals("") || txt_mod_direccion.getText().equals(""))) {

                jfmClientes.clientes.get(indice_modificar).setCedula(txt_mod_cedula.getText());
                jfmClientes.clientes.get(indice_modificar).setDireccion(txt_mod_direccion.getText());
                jfmClientes.clientes.get(indice_modificar).setNombre(txt_mod_nombre.getText());
                jfmClientes.clientes.get(indice_modificar).setEmail(txt_mod_email.getText());
                jfmClientes.clientes.get(indice_modificar).setTelefono(txt_mod_telefono.getText());

                if (combo_si_no.getSelectedItem().equals("si")) {
                    jfmClientes.clientes.get(indice_modificar).setMoroso(true);
                }
                if (combo_si_no.getSelectedItem().equals("no")) {
                    jfmClientes.clientes.get(indice_modificar).setMoroso(false);
                }

                txt_mod_cedula.setText("");
                txt_mod_nombre.setText("");
                txt_mod_direccion.setText("");
                txt_mod_email.setText("");
                txt_mod_telefono.setText("");

                btn_guardar_cliente.setEnabled(false);
                btn_editar_cliente.setEnabled(true);

                No_estructuras.escribir_clientes();

                cargar_tabla_ver();
                cargar_tabla_editar();
                cargar_tabla_eliminar();

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }//GEN-LAST:event_btn_guardar_clienteActionPerformed

    public void cargar_tabla_editar() {
        btn_editar_cliente.setEnabled(true);
        actualizar_tabla_usuario_mod();

        filtro_editar = new TableRowSorter(tabla_editar.getModel());
        tabla_editar.setRowSorter(filtro_editar);
        txt_buscar_mod.setEnabled(true);
    }

    public void cargar_tabla_eliminar() {
        actualizar_tabla_eliminar();
        filtro_eliminar = new TableRowSorter(tabla_eliminar_cliente.getModel());
        tabla_eliminar_cliente.setRowSorter(filtro_eliminar);
        txt_buscar.setEnabled(true);
    }


    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        txt_buscar.setText("");
        //<editor-fold defaultstate="collapsed" desc="si el usuario ya eligio algo de la tabla de eliminar entonces pase a la siguiente condicion ">
        if (criterio_eliminar_usuario.equals("") || criterio_eliminar_usuario == null) {

            JOptionPane.showMessageDialog(null, "seleccione un elemento primero de la tabla, intente de nuevo");

        } else {

            //<editor-fold defaultstate="collapsed" desc="aqui si lo anterior se cumple, se elimina un usuario admin">
            int s = JOptionPane.showConfirmDialog(null, " ¿Esta seguro?, los datos se perderan por siempre");
            if (s == 0) {

                for (int i = 0; i < clientes.size(); i++) {

                    if (criterio_eliminar_usuario.equals(clientes.get(i).getCedula())) {
                        clientes.remove(i);
                    }

                }

                //actualizo la cola de nuevo
                cargar_tabla_ver();
                cargar_tabla_editar();
                cargar_tabla_eliminar();

            }
            //</editor-fold>

        }
        //</editor-fold>


    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        String f = txt_buscar.getText();
        txt_buscar.setText(f);
        repaint();
        filtro_eliminar.setRowFilter(RowFilter.regexFilter(txt_buscar.getText(), 1, 0, 2, 3, 4));

    }//GEN-LAST:event_txt_buscarKeyReleased

    private void txt_buscar_modKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_modKeyReleased
        String r = txt_buscar.getText();
        txt_buscar.setText(r);
        repaint();
        filtro_editar.setRowFilter(RowFilter.regexFilter(txt_buscar_mod.getText(), 1, 0, 2, 3));
    }//GEN-LAST:event_txt_buscar_modKeyReleased

    private void tabla_eliminar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_eliminar_clienteMouseClicked
        try {
            tabla_eliminar_cliente.setRowSelectionAllowed(true);

            int i = tabla_eliminar_cliente.getSelectedRow();

            criterio_eliminar_usuario = (tabla_eliminar_cliente.getValueAt(i, 1).toString());
            System.out.println("criterio eliminar " + criterio_eliminar_usuario);
        } catch (Exception err) {
            System.out.println("ERROR" + err);
        }
    }//GEN-LAST:event_tabla_eliminar_clienteMouseClicked

    private void tabla_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_editarMouseClicked

        try {
            tabla_editar.setRowSelectionAllowed(true);

            int i = tabla_editar.getSelectedRow();
            modificador = i;

            String criterio_modificar = (tabla_editar.getValueAt(i, 1).toString());
            for (int j = 0; j < clientes.size(); j++) {

                if (clientes.get(j).getCedula().equals(criterio_modificar)) {
                    indice_modificar = j;
                    break;
                }
            }

            System.out.println("criterio eliminar " + criterio_modificar);

        } catch (Exception err) {
            System.out.println("ERROR" + err);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_editarMouseClicked

    private void Actualiza_tabla_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualiza_tabla_verActionPerformed

        cargar_tabla_ver();
        cargar_tabla_editar();
        cargar_tabla_eliminar();
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiza_tabla_verActionPerformed

    private void clientes_demoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientes_demoActionPerformed

        Cliente nuevo = new Cliente(null,false, null, null, "Ramiro juan",
            "1", "asd.cp", "556540",
            "puntarenas");

        Cliente nuevo1 = new Cliente(null,false, null, null, "william",
            "2", "asd.cp", "510",
            "san jose");

        Cliente nuevo2 = new Cliente(null,false, null, null, "Ortencia",
            "3", "asd.cp", "99540",
            "cartago");

        Cliente nuevo3 = new Cliente(null,false, null, null, "Juana",
            "4", "asd.cp", "886540",
            "cartago");

        clientes.add(nuevo);
        clientes.add(nuevo1);
        clientes.add(nuevo2);
        clientes.add(nuevo3);
        No_estructuras.escribir_clientes();
        cargar_tabla_ver();
        cargar_tabla_editar();
        cargar_tabla_eliminar();
        // TODO add your handling code here:
    }//GEN-LAST:event_clientes_demoActionPerformed

    public void limpia_tabla_elimimar_usuarios() {

        try {
            tabla_editar.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                    },
                    new String[]{
                        "nombre ", "cedula", "telefono", "email", "moroso"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, true
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }

    }

    public void actualizar_tabla_eliminar() {
        try {

            String[][] matriz = new String[jfmClientes.clientes.size() + 1][5];

            for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                matriz[i][0] = jfmClientes.clientes.get(i).getNombre();
                matriz[i][1] = jfmClientes.clientes.get(i).getCedula();
                matriz[i][2] = jfmClientes.clientes.get(i).getTelefono();
                matriz[i][3] = jfmClientes.clientes.get(i).getEmail();
                if (jfmClientes.clientes.get(i).isMoroso()) {
                    matriz[i][4] = "si";
                } else {
                    matriz[i][4] = "no";
                }

            }

            tabla_eliminar_cliente.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "nombre ", "cedula", "telefono", "email", "moroso"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, true
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

        } catch (Exception e) {
        }

    }

    public void actualizar_tabla_usuario_mod() {

        try {

            String[][] matriz = new String[jfmClientes.clientes.size() + 1][5];

            for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                matriz[i][0] = jfmClientes.clientes.get(i).getNombre();
                matriz[i][1] = jfmClientes.clientes.get(i).getCedula();
                matriz[i][2] = jfmClientes.clientes.get(i).getTelefono();
                matriz[i][3] = jfmClientes.clientes.get(i).getEmail();
                if (jfmClientes.clientes.get(i).isMoroso()) {
                    matriz[i][4] = "si";
                } else {
                    matriz[i][4] = "no";
                }

            }

            if (matriz != null) {

                tabla_editar.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "nombre ", "cedula", "telefono", "email", "moroso"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
            }

        } catch (Exception e) {
            System.out.println("" + e);
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
            java.util.logging.Logger.getLogger(jfmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualiza_tabla_ver;
    private javax.swing.JTextArea area_texto_direccion;
    private javax.swing.JButton btn_editar_cliente;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar_cliente;
    private javax.swing.JButton clientes_demo;
    private javax.swing.JComboBox<String> combo_si_no;
    private javax.swing.JButton crear_cliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_editar;
    private javax.swing.JTable tabla_eliminar_cliente;
    private javax.swing.JTable tabla_ver_cliente;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_buscar_mod;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_mod_cedula;
    private javax.swing.JTextField txt_mod_direccion;
    private javax.swing.JTextField txt_mod_email;
    private javax.swing.JTextField txt_mod_nombre;
    private javax.swing.JTextField txt_mod_telefono;
    private javax.swing.JTextField txt_new_cedula;
    private javax.swing.JTextField txt_new_direccion_usuario;
    private javax.swing.JTextField txt_new_nombre;
    private javax.swing.JTextField txt_new_telefono;
    // End of variables declaration//GEN-END:variables
}
