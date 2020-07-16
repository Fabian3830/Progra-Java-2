package no_estructuras;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class jfmSalas extends javax.swing.JFrame implements Materiales {

    static ArrayList<SalaDeEstudio> salas = new ArrayList<>();
    int indice;
    int indice_an;
    String criterio;
    boolean cliente_encontrado = false;
    boolean horario_encontrado = false;
    int prestar_cliente;

    TableRowSorter filtro;

    String horario_presta;
    int gg = -1;
    String sala_que_reserva;

    public jfmSalas() {

        initComponents();
        cargar_tabla_MAE();
        cargar_combo();

        Thread hilo = new Thread() {

            @Override
            public void run() {

                while (true) {
                    if (horario_encontrado && cliente_encontrado) {
                        btn_reservar.setEnabled(true);
                    } else {
                        btn_reservar.setEnabled(false);
                    }
                }
            }

        };
        hilo.start();
    }

    public void cargar_tabla_MAE() {

        String matriz[][] = new String[salas.size() + 1][2];

        for (int i = 0; i < salas.size(); i++) {
            matriz[i][0] = salas.get(i).getSala_ID();
            matriz[i][1] = "" + salas.get(i).getTamanoSala();

        }

       tabla_MAE.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID", "tamaño (gente)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filtro = new TableRowSorter(tabla_MAE.getModel());
        tabla_MAE.setRowSorter(filtro);
    }

    public void cargar_combo() {
        
        cmb_salas.removeAllItems();
        //seleccione una sala
        cmb_salas.addItem("seleccione una sala");
        for (int i = 0; i < salas.size(); i++) {

            cmb_salas.addItem(salas.get(i).getSala_ID());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        cmb_salas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_horario = new javax.swing.JLabel();
        btn_reservar = new javax.swing.JButton();
        btn_elegir_sala = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_fija = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_mostrar_descripcion = new javax.swing.JTextArea();
        txt_cedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_buscar_cliente1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lb_cedula = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_nombre1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        txt_tamaño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_agregar_sala = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        btn_elimina_sala = new javax.swing.JButton();
        btn_modifica_sala = new javax.swing.JButton();
        btn_guarda_sala = new javax.swing.JButton();
        btn_actualiza_tabla = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_MAE = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        btn_Demo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        cmb_salas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione una sala", " " }));
        cmb_salas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_salasKeyPressed(evt);
            }
        });

        jLabel3.setText("Selecciona una sala");

        jLabel4.setText("Ingresa cédula");

        lb_horario.setText("horario");

        btn_reservar.setText("Reservar");
        btn_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarActionPerformed(evt);
            }
        });

        btn_elegir_sala.setText("elegir");
        btn_elegir_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegir_salaActionPerformed(evt);
            }
        });

        tabla_fija.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"YAAAA", null},
                {"10:00 am", null},
                {"12:00 pm  ", null},
                {"13:00 pm", null},
                {"14:00 pm ", null},
                {"15:00 pm ", null},
                {"16:00 pm  ", null},
                {"17:00 pm  ", null}
            },
            new String [] {
                "horarios", "disponiblidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_fija.setEnabled(false);
        tabla_fija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_fijaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_fija);

        txt_mostrar_descripcion.setColumns(20);
        txt_mostrar_descripcion.setRows(5);
        jScrollPane4.setViewportView(txt_mostrar_descripcion);

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyPressed(evt);
            }
        });

        jLabel7.setText("Ingresa el número de cédula:");

        btn_buscar_cliente1.setText("Añadir");
        btn_buscar_cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_cliente1ActionPerformed(evt);
            }
        });

        jLabel9.setText("cedula");

        lb_cedula.setText("cedula");

        lb_nombre.setText("Nombre");

        lb_nombre1.setText("Nombre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_salas, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_elegir_sala))
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_nombre1)
                                            .addComponent(jLabel9)
                                            .addComponent(lb_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_nombre)
                                            .addComponent(lb_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_reservar))))
                                .addGap(21, 21, 21)
                                .addComponent(btn_buscar_cliente1)))))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_salas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_elegir_sala))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar_cliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cedula)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre)
                            .addComponent(lb_nombre1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_horario)
                            .addComponent(btn_reservar))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("prestar sala", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID ");

        jLabel2.setText("Tamaño(Personas)");

        btn_agregar_sala.setText("Agregar");
        btn_agregar_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_salaActionPerformed(evt);
            }
        });

        jLabel8.setText("descaripcionde sala y sus materiales");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane2.setViewportView(txt_descripcion);

        jToolBar1.setRollover(true);

        btn_elimina_sala.setText("eliminar");
        btn_elimina_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimina_salaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_elimina_sala);

        btn_modifica_sala.setText("modificar");
        btn_modifica_sala.setFocusable(false);
        btn_modifica_sala.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modifica_sala.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modifica_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifica_salaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_modifica_sala);

        btn_guarda_sala.setText("guardar");
        btn_guarda_sala.setEnabled(false);
        btn_guarda_sala.setFocusable(false);
        btn_guarda_sala.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guarda_sala.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guarda_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guarda_salaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guarda_sala);

        btn_actualiza_tabla.setText("actualizar tabla");
        btn_actualiza_tabla.setFocusable(false);
        btn_actualiza_tabla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_actualiza_tabla.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_actualiza_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualiza_tablaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_actualiza_tabla);

        tabla_MAE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "tamaño (gente)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_MAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_MAEMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_MAE);

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, 0)
                                .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 124, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(txt_buscar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btn_agregar_sala)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_agregar_sala)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("añadir/modificar/eliminar sala", jPanel2);

        btn_Demo.setText("DEMO");
        btn_Demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DemoActionPerformed(evt);
            }
        });

        jButton1.setText("actualizar tablas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Demo)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Demo)
                    .addComponent(jButton1))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_salaActionPerformed

        agregar();


    }//GEN-LAST:event_btn_agregar_salaActionPerformed

    private void btn_guarda_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guarda_salaActionPerformed

        guardar();
        btn_guarda_sala.setEnabled(false);

        btn_modifica_sala.setEnabled(true);
        btn_elimina_sala.setEnabled(true);
        btn_agregar_sala.setEnabled(true);
        btn_actualiza_tabla.setEnabled(true);
        btn_Demo.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guarda_salaActionPerformed

    private void btn_actualiza_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualiza_tablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualiza_tablaActionPerformed

    private void btn_modifica_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifica_salaActionPerformed

        btn_guarda_sala.setEnabled(true);

        btn_modifica_sala.setEnabled(false);
        btn_elimina_sala.setEnabled(false);
        btn_agregar_sala.setEnabled(false);
        btn_actualiza_tabla.setEnabled(false);
        btn_Demo.setEnabled(false);
        modificar();

    }//GEN-LAST:event_btn_modifica_salaActionPerformed

    private void tabla_MAEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_MAEMouseClicked

        try {

            int i = tabla_MAE.getSelectedRow();

            criterio = "" + tabla_MAE.getValueAt(i, 0);
            System.out.println("criterio eliminar " + criterio);
        } catch (Exception err) {
            System.out.println("ERROR " + err);
        }

    }//GEN-LAST:event_tabla_MAEMouseClicked

    private void btn_elimina_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimina_salaActionPerformed

        eliminar();
    }//GEN-LAST:event_btn_elimina_salaActionPerformed

    private void btn_DemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DemoActionPerformed

        SalaDeEstudio n = new SalaDeEstudio("A", 2, "xxxx", horario());
        SalaDeEstudio n2 = new SalaDeEstudio("B", 2, "xxxx", horario());
        SalaDeEstudio n3 = new SalaDeEstudio("C", 2, "xxxx", horario());
        SalaDeEstudio n4 = new SalaDeEstudio("D", 2, "xxxx", horario());
        salas.add(n);
        salas.add(n2);
        salas.add(n3);
        salas.add(n4);
        No_estructuras.escribir_salas();

        cargar_tabla_MAE();
        cargar_combo();
    }//GEN-LAST:event_btn_DemoActionPerformed

    private void txt_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cliente_anadir();
        }

    }//GEN-LAST:event_txt_cedulaKeyPressed

    private void btn_buscar_cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_cliente1ActionPerformed

        cliente_anadir();
    }//GEN-LAST:event_btn_buscar_cliente1ActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased

        repaint();
        filtro.setRowFilter(RowFilter.regexFilter(txt_buscar.getText()));

    }//GEN-LAST:event_txt_buscarKeyReleased

    public Date horario_elegido() {

        Date[] horrio = horario_x();
        if ("10:00 am".equals(horario_presta)) {
            return horrio[0];
        } else if ("12:00 pm".equals(horario_presta)) {
            return horrio[1];
        } else if ("13:00 pm".equals(horario_presta)) {
            return horrio[2];
        } else if ("14:00 pm".equals(horario_presta)) {
            return horrio[3];
        } else if ("15:00 pm".equals(horario_presta)) {
            return horrio[4];
        } else if ("16:00 pm".equals(horario_presta)) {
            return horrio[5];
        } else if ("17:00 pm".equals(horario_presta)) {
            return horrio[6];
        } else {
            return null;
        }

    }

    private void tabla_fijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_fijaMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                Date now = new Date();
                int g = tabla_fija.getSelectedRow();

                horario_presta = "" + (tabla_fija.getValueAt(g, 0));
                String condicion = "" + (tabla_fija.getValueAt(g, 1));

                if (horario_presta.equals("YAAAA")) {

                    if (condicion.equals("true")) {

                        lb_horario.setText(horario_presta);

                        horario_encontrado = true;
                    } else {
                        horario_encontrado = false;
                        JOptionPane.showMessageDialog(null, "ese horario no esta disponible");
                    }

                }
                System.out.println(now.toString() + " antes de " + horario_elegido().toString());
                System.out.println("" + now.before(horario_elegido()));
                if (horario_elegido() != null && now.before(horario_elegido())) {

                    if (condicion.equals("true")) {

                        lb_horario.setText(horario_presta);

                        horario_encontrado = true;
                    } else {
                        horario_encontrado = false;
                        JOptionPane.showMessageDialog(null, "ese horario no esta disponible");
                    }
                } else {
                    horario_encontrado = false;
                    JOptionPane.showMessageDialog(null, "ese horario no esta disponible");
                }

            } catch (NullPointerException | HeadlessException e) {
            }

        }
        System.out.println("CORRIOOOOOOOOO");
    }//GEN-LAST:event_tabla_fijaMouseClicked

    private void btn_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarActionPerformed

        int sala_I = -1;
        for (int j = 0; j < salas.size(); j++) {

            if (salas.get(j).getSala_ID().equals(sala_que_reserva)) {
                sala_I = j;
                System.out.println("ENCONTRADO");
                break;
            }
        }

        Date ya_mismo = new Date();
        Date ya_devolucion = new Date();
        Calendar calendario_p = Calendar.getInstance();
        Calendar calendario_D = Calendar.getInstance();
        calendario_p.setTime(ya_mismo);
        calendario_D.setTime(ya_mismo);

        Cliente client_e = jfmClientes.clientes.get(indice_an);
        if (horario_presta.equals("YAAAA")) {

            System.out.println("YAAAAAAA");
            calendario_p.add(Calendar.MINUTE, 1);

            salas.get(sala_I).getHorarios()[0].setCliente(client_e);
            salas.get(sala_I).getHorarios()[0].setHora_Reserva(ya_mismo);
            salas.get(sala_I).getHorarios()[0].setHora_devuelta(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[0].setDisponible(false);

        } else if ("10:00 am".equals(horario_presta)) {
            calendario_p.set(Calendar.HOUR_OF_DAY, 10);
            calendario_p.set(Calendar.MINUTE, 00);

            calendario_D.set(Calendar.HOUR_OF_DAY, 10);
            calendario_D.set(Calendar.MINUTE, 59);

            salas.get(sala_I).getHorarios()[1].setCliente(client_e);
            salas.get(sala_I).getHorarios()[1].setHora_Reserva(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[1].setHora_devuelta(calendario_D.getTime());
            salas.get(sala_I).getHorarios()[1].setDisponible(false);

        } else if ("12:00 pm".equals(horario_presta)) {

            calendario_p.set(Calendar.HOUR_OF_DAY, 12);
            calendario_p.set(Calendar.MINUTE, 00);

            calendario_D.set(Calendar.HOUR_OF_DAY, 12);
            calendario_D.set(Calendar.MINUTE, 59);

            salas.get(sala_I).getHorarios()[2].setCliente(client_e);
            salas.get(sala_I).getHorarios()[2].setHora_Reserva(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[2].setHora_devuelta(calendario_D.getTime());
            salas.get(sala_I).getHorarios()[2].setDisponible(false);
        } else if ("13:00 pm".equals(horario_presta)) {

            calendario_p.set(Calendar.HOUR_OF_DAY, 13);
            calendario_p.set(Calendar.MINUTE, 00);

            calendario_D.set(Calendar.HOUR_OF_DAY, 13);
            calendario_D.set(Calendar.MINUTE, 59);

            salas.get(sala_I).getHorarios()[3].setCliente(client_e);
            salas.get(sala_I).getHorarios()[3].setHora_Reserva(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[3].setHora_devuelta(calendario_D.getTime());
            salas.get(sala_I).getHorarios()[3].setDisponible(false);
        } else if ("14:00 pm".equals(horario_presta)) {

            calendario_p.set(Calendar.HOUR_OF_DAY, 14);
            calendario_p.set(Calendar.MINUTE, 00);

            calendario_D.set(Calendar.HOUR_OF_DAY, 14);
            calendario_D.set(Calendar.MINUTE, 59);

            salas.get(sala_I).getHorarios()[4].setCliente(client_e);
            salas.get(sala_I).getHorarios()[4].setHora_Reserva(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[4].setHora_devuelta(calendario_D.getTime());
            salas.get(sala_I).getHorarios()[4].setDisponible(false);
        } else if ("15:00 pm".equals(horario_presta)) {

            calendario_p.set(Calendar.HOUR_OF_DAY, 15);
            calendario_p.set(Calendar.MINUTE, 00);

            calendario_D.set(Calendar.HOUR_OF_DAY, 15);
            calendario_D.set(Calendar.MINUTE, 59);

            salas.get(sala_I).getHorarios()[5].setCliente(client_e);
            salas.get(sala_I).getHorarios()[5].setHora_Reserva(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[5].setHora_devuelta(calendario_D.getTime());
            salas.get(sala_I).getHorarios()[5].setDisponible(false);
        } else if ("16:00 pm".equals(horario_presta)) {

            calendario_p.set(Calendar.HOUR_OF_DAY, 16);
            calendario_p.set(Calendar.MINUTE, 00);

            calendario_D.set(Calendar.HOUR_OF_DAY, 16);
            calendario_D.set(Calendar.MINUTE, 59);
            salas.get(sala_I).getHorarios()[6].setCliente(client_e);
            salas.get(sala_I).getHorarios()[6].setHora_Reserva(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[6].setHora_devuelta(calendario_D.getTime());
            salas.get(sala_I).getHorarios()[6].setDisponible(false);

        } else if ("17:00 pm".equals(horario_presta)) {

            calendario_p.set(Calendar.HOUR_OF_DAY, 17);
            calendario_p.set(Calendar.MINUTE, 00);

            calendario_D.set(Calendar.HOUR_OF_DAY, 17);
            calendario_D.set(Calendar.MINUTE, 59);

            salas.get(sala_I).getHorarios()[7].setCliente(client_e);
            salas.get(sala_I).getHorarios()[7].setHora_Reserva(calendario_p.getTime());
            salas.get(sala_I).getHorarios()[7].setHora_devuelta(calendario_D.getTime());
            salas.get(sala_I).getHorarios()[7].setDisponible(false);
        }

        No_estructuras.escribir_salas();

        cargar_tabla_fija();
        cargar_combo();

        txt_cedula.setText("");
        lb_nombre.setText("");
        lb_cedula.setText("");
        lb_horario.setText("");
    }//GEN-LAST:event_btn_reservarActionPerformed

    private void btn_elegir_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegir_salaActionPerformed

        cargar_tabla_fija();
    }//GEN-LAST:event_btn_elegir_salaActionPerformed

    private void cmb_salasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_salasKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            cargar_tabla_fija();
        }
    }//GEN-LAST:event_cmb_salasKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargar_tabla_fija();
        cargar_combo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargar_tabla_fija() {
        if (!cmb_salas.getSelectedItem().equals("seleccione una sala")) {
            tabla_fija.setEnabled(true);
            gg = -1;
            sala_que_reserva = cmb_salas.getSelectedItem() + "";
            for (int j = 0; j < salas.size(); j++) {

                if (salas.get(j).getSala_ID().equals(sala_que_reserva)) {
                    gg = j;
                    System.out.println("ENCONTRADO");
                    break;
                }
            }
            if (gg != -1) {

                tabla_fija.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {"YAAAA", salas.get(gg).getHorarios()[0].isDisponible()},
                            {"10:00 am", salas.get(gg).getHorarios()[1].isDisponible()},
                            {"12:00 pm", salas.get(gg).getHorarios()[2].isDisponible()},
                            {"13:00 pm", salas.get(gg).getHorarios()[3].isDisponible()},
                            {"14:00 pm", salas.get(gg).getHorarios()[4].isDisponible()},
                            {"15:00 pm", salas.get(gg).getHorarios()[5].isDisponible()},
                            {"16:00 pm", salas.get(gg).getHorarios()[6].isDisponible()},
                            {"17:00 pm", salas.get(gg).getHorarios()[7].isDisponible()}
                        },
                        new String[]{
                            "horarios", "disponiblidad"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });

                txt_mostrar_descripcion.setText(salas.get(gg).getDescripcion_de_sala());
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("ñeeeeee se cumpliooooooooooooooooooooooooooooo");
        }

    }

    public Date[] horario_x() {

        Date s[] = new Date[7];
        Date hora_reserva = new Date();
        Date hora_devuelta = new Date();
        DateFormat formatoHora = new SimpleDateFormat("HH:mm");
        Calendar calendario_p = Calendar.getInstance();

        calendario_p.set(Calendar.HOUR_OF_DAY, 10);
        calendario_p.set(Calendar.MINUTE, 00);

        s[0] = calendario_p.getTime();

        calendario_p.set(Calendar.HOUR_OF_DAY, 12);
        calendario_p.set(Calendar.MINUTE, 00);

        s[1] = calendario_p.getTime();

        calendario_p.set(Calendar.HOUR_OF_DAY, 13);
        calendario_p.set(Calendar.MINUTE, 00);

        s[2] = calendario_p.getTime();

        calendario_p.set(Calendar.HOUR_OF_DAY, 14);
        calendario_p.set(Calendar.MINUTE, 00);

        s[3] = calendario_p.getTime();

        calendario_p.set(Calendar.HOUR_OF_DAY, 15);
        calendario_p.set(Calendar.MINUTE, 00);

        s[4] = calendario_p.getTime();

        calendario_p.set(Calendar.HOUR_OF_DAY, 16);
        calendario_p.set(Calendar.MINUTE, 00);

        s[5] = calendario_p.getTime();

        calendario_p.set(Calendar.HOUR_OF_DAY, 17);
        calendario_p.set(Calendar.MINUTE, 00);

        s[6] = calendario_p.getTime();
        return s;
    }

    public void cliente_anadir() {
        boolean encontrado = false;
        indice_an = -1;

        String cedula_unica = txt_cedula.getText();
        if (!"".equals(cedula_unica)) {

            for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                if (jfmClientes.clientes.get(i).getCedula().equals(cedula_unica)) {
                    indice_an = i;
                    encontrado = true;
                }
            }

            if (indice_an != -1 && encontrado) {

                if (jfmClientes.clientes.get(indice_an).isMoroso() == false) {
                    Cliente quien_le_presto = jfmClientes.clientes.get(indice_an);

                    cliente_encontrado = true;

                    prestar_cliente = indice;

                    txt_cedula.setText("");
                    lb_cedula.setText(quien_le_presto.getCedula());

                    lb_nombre.setText(quien_le_presto.getNombre());

                } else {
                    JOptionPane.showMessageDialog(null, "el cliente esta moroso, no se le prestra nada");
                    lb_cedula.setText("");

                    lb_nombre.setText("");

                    cliente_encontrado = false;
                }

            } else {
                JOptionPane.showMessageDialog(null, "la cedula digitada no coincide con ninguna del registro ");

                lb_cedula.setText("");

                lb_nombre.setText("");
                cliente_encontrado = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "no has llenado el espacio ");
            lb_cedula.setText("");

            lb_nombre.setText("");
            cliente_encontrado = false;
        }
    }

    @Override
    public void agregar() {
        SalaDeEstudio nuevo = null;
        try {
            nuevo = new SalaDeEstudio(txt_id.getText(), Integer.parseInt(txt_tamaño.getText()), txt_descripcion.getText(), horario());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("" + numberFormatException);
        }
        if (txt_id.getText().equals("") || txt_tamaño.getText().equals("") || txt_descripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "llene todos los espaios vacios, intente de nuevo");
        } else {

            if (!comprobar(txt_id.getText())) {

                salas.add(nuevo);
                No_estructuras.escribir_salas();
                JOptionPane.showMessageDialog(null, "la sala se añadió con exito");
                cargar_tabla_MAE();
                cargar_combo();
                txt_id.setText("");
                txt_descripcion.setText("");
                txt_tamaño.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "esa id ya existe en el sistema");
            }

        }

    }

    @Override
    public void modificar() {

        if (criterio.equals("")) {

            JOptionPane.showMessageDialog(null, "seleccione un elemento primero de la tabla, intente de nuevo");

        } else {
            tabla_MAE.setEnabled(false);
            for (int j = 0; j < salas.size(); j++) {

                if (salas.get(j).getSala_ID().equals(criterio)) {
                    indice = j;
                    break;
                }
            }
            txt_tamaño.setText("" +  salas.get(indice).getTamanoSala());
            txt_id.setText("" +  salas.get(indice).getSala_ID());
            txt_descripcion.setText("" +  salas.get(indice).getDescripcion_de_sala());

        }
    }

    @Override
    public void guardar() {
        try {

            if (!(txt_descripcion.getText().equals("") || txt_tamaño.getText().equals("") || txt_id.getText().equals(""))) {

                salas.get(indice).setSala_ID(txt_id.getText());
                salas.get(indice).setTamanoSala(Integer.parseInt(txt_tamaño.getText()));
                salas.get(indice).setDescripcion_de_sala(txt_descripcion.getText());

                txt_id.setText("");
                txt_descripcion.setText("");
                txt_tamaño.setText("");

               
                No_estructuras.escribir_salas();
                tabla_MAE.setEnabled(true);
                cargar_tabla_MAE();
                cargar_combo();

            }
        } catch (NumberFormatException e) {
        }

    }

    @Override
    public void eliminar() {
        txt_buscar.setText("");
//<editor-fold defaultstate="collapsed" desc="si el usuario ya eligio algo de la tabla de eliminar entonces pase a la siguiente condicion ">
        if (criterio.equals("")) {

            JOptionPane.showMessageDialog(null, "seleccione un elemento primero de la tabla, intente de nuevo");

        } else {

            //<editor-fold defaultstate="collapsed" desc="aqui si lo anterior se cumple, se elimina un usuario admin">
            int s = JOptionPane.showConfirmDialog(null, " ¿Esta seguro?, los datos se perderan por siempre");
            if (s == 0) {

                for (int i = 0; i < salas.size(); i++) {

                    if (salas.get(i).getSala_ID().equals(criterio)) {
                        salas.remove(i);
                    }

                }
                No_estructuras.escribir_salas();
                cargar_tabla_MAE();
                cargar_combo();
            }
            //</editor-fold>

        }
        //</editor-fold>
    }

    public boolean comprobar(String sala_id) {

        for (int i = 0; i < salas.size(); i++) {

            if (salas.get(i).getSala_ID().equals(sala_id)) {
                return true;
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
            java.util.logging.Logger.getLogger(jfmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmSalas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Demo;
    private javax.swing.JButton btn_actualiza_tabla;
    private javax.swing.JButton btn_agregar_sala;
    private javax.swing.JButton btn_buscar_cliente1;
    private javax.swing.JButton btn_elegir_sala;
    private javax.swing.JButton btn_elimina_sala;
    private javax.swing.JButton btn_guarda_sala;
    private javax.swing.JButton btn_modifica_sala;
    private javax.swing.JButton btn_reservar;
    private javax.swing.JComboBox<String> cmb_salas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_horario;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_nombre1;
    private javax.swing.JTable tabla_MAE;
    private javax.swing.JTable tabla_fija;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_mostrar_descripcion;
    private javax.swing.JTextField txt_tamaño;
    // End of variables declaration//GEN-END:variables

    public ReservaSala[] horario() {

        ReservaSala s[] = new ReservaSala[8];
        for (int i = 0; i < 8; i++) {
            s[i] = new ReservaSala();
            s[i].setDisponible(true);
        }
        return s;
    }

}
