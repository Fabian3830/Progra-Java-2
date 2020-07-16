package no_estructuras;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class jfmActividades extends javax.swing.JFrame implements Materiales {

    static ArrayList<Actividad> actividades = new ArrayList<>();
    int indice;
    String criterio;
    boolean cliente_encontrado = false;
    boolean actividad_encontrada = false;

    int asistir_cliente;
    int actividad;

    TableRowSorter filtro;

    String horario_presta;
    String actividad_elegida;

    public jfmActividades() {

        initComponents();
        cargar_tabla_MAE();
        cargar_combo();

        Thread hilo = new Thread() {

            @Override
            public void run() {

                while (true) {
                    if (actividad_encontrada && cliente_encontrado) {
                        btn_anadir_cupo.setEnabled(true);
                    } else {
                        btn_anadir_cupo.setEnabled(false);
                    }
                }
            }

        };
        hilo.start();
    }

    public void cargar_tabla_MAE() {

        String matriz[][] = new String[actividades.size() + 1][3];

        for (int i = 0; i < actividades.size(); i++) {
            matriz[i][0] = actividades.get(i).getId();
            matriz[i][1] = "" + actividades.get(i).getCupos();
            matriz[i][2] = new SimpleDateFormat("dd/MM/yyyy").format(actividades.get(i).getFecha());
        }

        tabla_MAE.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "cupos", "fecha"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        filtro = new TableRowSorter(tabla_MAE.getModel());
        tabla_MAE.setRowSorter(filtro);
    }

    public void cargar_combo() {

        cmb_actividades.removeAllItems();
        //seleccione una sala
        cmb_actividades.addItem("seleccione una actividad");
        for (int i = 0; i < actividades.size(); i++) {

            cmb_actividades.addItem(actividades.get(i).getId());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        cmb_actividades = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_actividad = new javax.swing.JLabel();
        btn_anadir_cupo = new javax.swing.JButton();
        btn_elegir_actividad = new javax.swing.JButton();
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
        jLabel11 = new javax.swing.JLabel();
        lb_cantidad_esp_libre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        txt_cupos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_agregar_actividad = new javax.swing.JButton();
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
        jLabel6 = new javax.swing.JLabel();
        txt_nombre_actividad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_dias_crear = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DEMO = new javax.swing.JButton();

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

        cmb_actividades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione una actividad" }));
        cmb_actividades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_actividadesKeyPressed(evt);
            }
        });

        jLabel3.setText("Selecciona una actividad");

        jLabel4.setText("Ingresa cédula");

        lb_actividad.setText("actividad");

        btn_anadir_cupo.setText("Reservar");
        btn_anadir_cupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anadir_cupoActionPerformed(evt);
            }
        });

        btn_elegir_actividad.setText("elegir");
        btn_elegir_actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegir_actividadActionPerformed(evt);
            }
        });

        tabla_fija.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null}
            },
            new String [] {
                "Cedula", "nombre"
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

        jLabel11.setText("espacios disponibles");

        lb_cantidad_esp_libre.setText(" ");

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
                        .addComponent(cmb_actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_elegir_actividad))
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_nombre1)
                                            .addComponent(jLabel9)
                                            .addComponent(lb_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_nombre)
                                            .addComponent(lb_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_anadir_cupo))))
                                .addGap(21, 21, 21)
                                .addComponent(btn_buscar_cliente1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_cantidad_esp_libre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_actividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_elegir_actividad))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar_cliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cedula)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre)
                            .addComponent(lb_nombre1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_actividad)
                            .addComponent(btn_anadir_cupo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(lb_cantidad_esp_libre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("prestar sala", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID ");

        jLabel2.setText("cupos");

        btn_agregar_actividad.setText("Agregar");
        btn_agregar_actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_actividadActionPerformed(evt);
            }
        });

        jLabel8.setText("descripción de de la actividad");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane2.setViewportView(txt_descripcion);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
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
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "cupos", "fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jLabel6.setText("nombre");

        jLabel10.setText("en cuantos dias se hara?");

        jButton1.setText("actualizar tablas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DEMO.setText("DEMO");
        DEMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cupos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 115, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txt_buscar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btn_agregar_actividad))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(7, 7, 7)
                                .addComponent(txt_dias_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45)
                .addComponent(DEMO)
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_nombre_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_cupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_dias_crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btn_agregar_actividad)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(DEMO))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("añadir/modificar/eliminar sala", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jTabbedPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_actividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_actividadActionPerformed

        agregar();


    }//GEN-LAST:event_btn_agregar_actividadActionPerformed

    private void btn_guarda_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guarda_salaActionPerformed

        guardar();
        btn_guarda_sala.setEnabled(false);

        btn_modifica_sala.setEnabled(true);
        btn_elimina_sala.setEnabled(true);
        btn_agregar_actividad.setEnabled(true);
        btn_actualiza_tabla.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guarda_salaActionPerformed

    private void btn_actualiza_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualiza_tablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualiza_tablaActionPerformed

    private void btn_modifica_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifica_salaActionPerformed

        btn_guarda_sala.setEnabled(true);

        btn_modifica_sala.setEnabled(false);
        btn_elimina_sala.setEnabled(false);
        btn_agregar_actividad.setEnabled(false);
        btn_actualiza_tabla.setEnabled(false);
        modificar();

    }//GEN-LAST:event_btn_modifica_salaActionPerformed

    private void tabla_MAEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_MAEMouseClicked
        if (evt.getClickCount() == 2) {

            try {

                int i = tabla_MAE.getSelectedRow();

                criterio = "" + tabla_MAE.getValueAt(i, 0);
                System.out.println("criterio eliminar " + criterio);
            } catch (Exception err) {
                System.out.println("ERROR " + err);
            }
        }
    }//GEN-LAST:event_tabla_MAEMouseClicked

    private void btn_elimina_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimina_salaActionPerformed

        eliminar();
    }//GEN-LAST:event_btn_elimina_salaActionPerformed

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


    private void btn_anadir_cupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anadir_cupoActionPerformed

        int actividad_I = -1;

        for (int j = 0; j < actividades.size(); j++) {

            if (actividades.get(j).getId().equals(actividad_elegida)) {
                actividad_I = j;
                break;
            }
        }

        int s = actividades.get(actividad_I).getCantidad_asistencia();
        System.out.println(s + ">" + actividades.get(actividad_I).getCupos());
        if ((s) >= actividades.get(actividad_I).getCupos()) {
            actividad_I = -1;
            JOptionPane.showMessageDialog(null, "no hay cupos");
        }

        if (actividad_I != -1) {
            jfmClientes.clientes.get(asistir_cliente).setId_actividad(actividad_elegida);
            jfmClientes.clientes.get(asistir_cliente).setAsisten_a_algo(true);

            actividades.get(actividad_I).setCantidad_asistencia(s += 1);

            System.out.println("" + actividades.get(actividad_I).getCantidad_asistencia());
            //////FALTA CODIGO AQUI
            No_estructuras.escribir_actividades();
            No_estructuras.escribir_clientes();

            limpiar();

            txt_cedula.setText("");
            lb_nombre.setText("nombre");
            lb_cedula.setText("cedula");
            lb_actividad.setText("actividad");
            txt_mostrar_descripcion.setText("");
            lb_cantidad_esp_libre.setText("");
            actividad_encontrada = false;
            cliente_encontrado = false;

            JOptionPane.showMessageDialog(null, "asistencia confirmada ");
        }
    }//GEN-LAST:event_btn_anadir_cupoActionPerformed

    private void btn_elegir_actividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegir_actividadActionPerformed

        cargar_tabla_fija();
    }//GEN-LAST:event_btn_elegir_actividadActionPerformed

    private void cmb_actividadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_actividadesKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            cargar_tabla_fija();
        }
    }//GEN-LAST:event_cmb_actividadesKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargar_tabla_MAE();
        cargar_tabla_fija();
        cargar_combo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DEMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEMOActionPerformed
        Date ya_mismo = new Date();
        Calendar calendario_p = Calendar.getInstance();
        calendario_p.setTime(ya_mismo);
        calendario_p.add(Calendar.MINUTE, 1);

        Actividad nuevo = new Actividad("bingo", calendario_p.getTime(), "1", "fdsdf", 2, 0);
        Actividad nuevo1 = new Actividad("ajedrez", calendario_p.getTime(), "2", "fdsdf", 2, 0);
        Actividad nuevo2 = new Actividad("concierto", calendario_p.getTime(), "3", "fdsdf", 2, 0);
        Actividad nuevo3 = new Actividad("torneo de scrable", calendario_p.getTime(), "4", "fdsdf", 2, 0);

        actividades.add(nuevo);
        actividades.add(nuevo1);
        actividades.add(nuevo2);
        actividades.add(nuevo3);

        No_estructuras.escribir_actividades();

        cargar_tabla_MAE();
        cargar_combo();

    }//GEN-LAST:event_DEMOActionPerformed

    private void limpiar() {
        tabla_fija.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"", null}
                },
                new String[]{
                    "Cedula", "nombre"
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
    }

    public void cargar_tabla_fija() {
        try {
            if (!cmb_actividades.getSelectedItem().equals("seleccione una actividad")) {

                int gg = -1;

                actividad_elegida = cmb_actividades.getSelectedItem() + "";
                ArrayList<Cliente> clientes_x = new ArrayList<>();

                //gg guarda el indice de la actividad
                for (int i = 0; i < actividades.size(); i++) {
                    if (actividades.get(i).getId().equals(actividad_elegida)) {

                        gg = i;
                        break;
                    }
                }

                for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                    //si el cliente i tiene una actividad siga
                    if (jfmClientes.clientes.get(i).isAsisten_a_algo()) {
                        //si el cliente i va a la actividad seleccionada siga
                        if (jfmClientes.clientes.get(i).getId_actividad().equals(actividad_elegida)) {
                            System.out.println("ENCUENTRA UN CLIENTE");
                            //añada el cliente a clientes x
                            clientes_x.add(jfmClientes.clientes.get(i));
                        }
                    }

                }
                //si encontro la actividad
                if (gg != -1) {

                    actividad_encontrada = true;

                    String matriz[][] = new String[clientes_x.size() + 1][2];
                    for (int i = 0; i < clientes_x.size(); i++) {
                        matriz[i][1] = clientes_x.get(i).getNombre();
                        matriz[i][0] = clientes_x.get(i).getCedula();
                    }

                    tabla_fija.setModel(new javax.swing.table.DefaultTableModel(
                            matriz,
                            new String[]{
                                "Cedula", "nombre"
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
                    txt_mostrar_descripcion.setText(actividades.get(gg).getDescripcion());
                    lb_actividad.setText(actividades.get(gg).getNombre());
                    int calculo = actividades.get(gg).getCupos() - actividades.get(gg).getCantidad_asistencia();
                    lb_cantidad_esp_libre.setText(calculo + "");
                } else {
                    actividad_encontrada = false;
                    System.out.println("error");
                }
            } else {
                actividad_encontrada = false;
            }
        } catch (Exception e) {
            System.out.println("ñeee " + e);
            actividad_encontrada = false;
        }

    }

    public void cliente_anadir() {
        boolean encontrado = false;
        int indice_an = -1;

        String cedula_unica = txt_cedula.getText();
        if (!"".equals(cedula_unica)) {

            for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                if (jfmClientes.clientes.get(i).getCedula().equals(cedula_unica)) {
                    indice_an = i;
                    encontrado = true;
                }
            }

            if (indice_an != -1 && encontrado) {

                if (jfmClientes.clientes.get(indice_an).asisten_a_algo == false) {

                    if (jfmClientes.clientes.get(indice_an).isMoroso() == false) {
                        Cliente quien_le_presto = jfmClientes.clientes.get(indice_an);

                        cliente_encontrado = true;

                        asistir_cliente = indice_an;

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

                    JOptionPane.showMessageDialog(null, "el cliente ya va a ir a una actividad");
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
        Actividad nuevo = null;

        try {
            Date ya_mismo = new Date();
            Calendar calendario_p = Calendar.getInstance();
            calendario_p.setTime(ya_mismo);
            calendario_p.add(Calendar.MINUTE, Integer.parseInt(txt_dias_crear.getText().replace(" ", "")));

            nuevo = new Actividad(txt_nombre_actividad.getText(), calendario_p.getTime(), txt_id.getText(), txt_descripcion.getText(), Integer.parseInt(txt_cupos.getText().replace(" ", "")), 0);

        } catch (NumberFormatException numberFormatException) {
            System.out.println("" + numberFormatException);
        }

        if (txt_id.getText().equals("") || txt_cupos.getText().equals("") || txt_nombre_actividad.getText().equals("") || txt_descripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "llene todos los espaios vacios, intente de nuevo");
        } else {

            if (!comprobar(txt_id.getText())) {

                actividades.add(nuevo);
                No_estructuras.escribir_actividades();
                JOptionPane.showMessageDialog(null, "la actividad se planeó con exito");

                cargar_tabla_MAE();
                cargar_combo();
                txt_id.setText("");
                txt_nombre_actividad.setText("");
                txt_descripcion.setText("");
                txt_cupos.setText("");
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
            for (int j = 0; j < actividades.size(); j++) {

                if (actividades.get(j).getId().equals(criterio)) {
                    indice = j;
                    break;
                }
            }
            txt_cupos.setText("" + actividades.get(indice).getCupos());
            txt_id.setText("" + actividades.get(indice).getId());
            txt_descripcion.setText("" + actividades.get(indice).getDescripcion());

        }
    }

    @Override
    public void guardar() {
        try {

            if (!(txt_descripcion.getText().equals("") || txt_cupos.getText().equals("") || txt_id.getText().equals(""))) {

                actividades.get(indice).setId(txt_id.getText());
                actividades.get(indice).setCupos(Integer.parseInt(txt_cupos.getText()));
                actividades.get(indice).setDescripcion(txt_descripcion.getText());

                txt_id.setText("");
                txt_descripcion.setText("");
                txt_cupos.setText("");

                No_estructuras.escribir_actividades();
                tabla_MAE.setEnabled(true);
                cargar_tabla_MAE();
                cargar_combo();

            }
        } catch (NumberFormatException e) {
        }

    }

    @Override
    public void eliminar() {
        try {
            txt_buscar.setText("");
//<editor-fold defaultstate="collapsed" desc="si el usuario ya eligio algo de la tabla de eliminar entonces pase a la siguiente condicion ">
            if (criterio.equals("")) {

                JOptionPane.showMessageDialog(null, "seleccione un elemento primero de la tabla, intente de nuevo");

            } else {
                boolean asistiran = false;
                for (int i = 0; i < actividades.size(); i++) {
                    if (actividades.get(i).getId().equals(criterio)) {

                        if (actividades.get(i).getCantidad_asistencia() != 0) {
                            asistiran = true;
                        }
                    }

                }
                if (asistiran == false) {

                    //<editor-fold defaultstate="collapsed" desc="aqui si lo anterior se cumple, se elimina un usuario admin">
                    int s = JOptionPane.showConfirmDialog(null, " ¿Esta seguro?, los datos se perderan por siempre");
                    if (s == 0) {

                        for (int i = 0; i < actividades.size(); i++) {

                            if (actividades.get(i).getId().equals(criterio)) {
                                actividades.remove(i);
                            }

                        }
                        No_estructuras.escribir_actividades();
                        cargar_tabla_MAE();
                        cargar_combo();
                    }
                    //</editor-fold>
                } else {
                    JOptionPane.showMessageDialog(null, "no se puede eliminar porque a ese evento van a ir personas");
                }
            }
            //</editor-fold>

        } catch (NullPointerException | HeadlessException headlessException) {

        }

    }

    public boolean comprobar(String actividad_id) {

        for (int i = 0; i < actividades.size(); i++) {

            if (actividades.get(i).getId().equals(actividad_id)) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new jfmActividades().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEMO;
    private javax.swing.JButton btn_actualiza_tabla;
    private javax.swing.JButton btn_agregar_actividad;
    private javax.swing.JButton btn_anadir_cupo;
    private javax.swing.JButton btn_buscar_cliente1;
    private javax.swing.JButton btn_elegir_actividad;
    private javax.swing.JButton btn_elimina_sala;
    private javax.swing.JButton btn_guarda_sala;
    private javax.swing.JButton btn_modifica_sala;
    private javax.swing.JComboBox<String> cmb_actividades;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_actividad;
    private javax.swing.JLabel lb_cantidad_esp_libre;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_nombre1;
    private javax.swing.JTable tabla_MAE;
    private javax.swing.JTable tabla_fija;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cupos;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_dias_crear;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_mostrar_descripcion;
    private javax.swing.JTextField txt_nombre_actividad;
    // End of variables declaration//GEN-END:variables

}
