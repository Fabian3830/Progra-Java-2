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

public class jfmMaterialApoyo extends javax.swing.JFrame implements Materiales {

    static ArrayList<MaterialApoyo> materiales = new ArrayList<>();
    String criterio_eliminar_material = "";
    TableRowSorter filtro_eliminar;
    TableRowSorter filtro_editar;
    TableRowSorter filtro_devolver;
    int indice_modificar;
    int modificador = -1;
    boolean cliente_encontrado = false;
    boolean material_encontrado = false;

    String criterio_devolver = "";
    int prestar_material;
    int prestar_cliente;

    public jfmMaterialApoyo() {
        //escribir_usuarios();

        initComponents();
        cargar_tabla_MAE();
        cargar_tabla();
        Thread s = new Thread() {
            @Override
            public void run() {

                while (true) {
                    System.out.print("");
                    if (material_encontrado && cliente_encontrado) {
                        btn_hace_prestamo.setEnabled(true);
                    } else {
                        btn_hace_prestamo.setEnabled(false);
                    }

                }

            }
        };
        s.start();

    }

    public void cargar_tabla() {

        ArrayList<Cliente> aux_para_llenar = new ArrayList<>();
        for (int i = 0; i < jfmClientes.clientes.size(); i++) {

            if (jfmClientes.clientes.get(i).getMaterial_prestar() != null) {
                aux_para_llenar.add(jfmClientes.clientes.get(i));
            }

        }
        if (aux_para_llenar.size() > 0) {

            Date now = new Date();
            String matriz[][] = new String[aux_para_llenar.size() + 1][5];
            for (int i = 0; i < aux_para_llenar.size(); i++) {

                matriz[i][0] = aux_para_llenar.get(i).getCedula();
                matriz[i][1] = aux_para_llenar.get(i).getMaterial_prestar().getNombre();
                matriz[i][2] = new SimpleDateFormat("dd/MM/yyyy").format(aux_para_llenar.get(i).getMaterial_prestar().getFechaEntrega());
                Date devolucion = aux_para_llenar.get(i).getMaterial_prestar().getFechaDevolucion();
                matriz[i][3] = new SimpleDateFormat("dd/MM/yyyy").format(devolucion);

                if (now.before(devolucion)) {

                    matriz[i][4] = "si";
                } else {
                    matriz[i][4] = "no";
                }

            }

            tabla_devolucion.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "cedula", "material", "dia prestado", "fecha devolucion", "devolucion a tiempo"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            filtro_devolver = new TableRowSorter(tabla_devolucion.getModel());
            tabla_devolucion.setRowSorter(filtro_devolver);

        } else {

            System.out.println("NO HAY QUE MOSTRAR");
            tabla_devolucion.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{
                        {null, null, null, null, null}
                    },
                    new String[]{
                        "cedula", "material", "dia prestado", "fecha devolucion", "devolucion a tiempo"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            filtro_devolver = new TableRowSorter(tabla_devolucion.getModel());
            tabla_devolucion.setRowSorter(filtro_devolver);

        }
    }

    //aqui ESCRIBE la pila de usuarios
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_MAE = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        txt_buscar_mod = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_crear_material = new javax.swing.JButton();
        Actualiza_tabla_ver = new javax.swing.JButton();
        btn_materiales_demo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_devolucion = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        btn_devolver = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_nombre_material = new javax.swing.JLabel();
        txt_CU = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        lb_Cod_material = new javax.swing.JLabel();
        lb_dewey1 = new javax.swing.JLabel();
        lb_titulo1 = new javax.swing.JLabel();
        lb_marca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_autor1 = new javax.swing.JLabel();
        lb_CU1 = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_telefono1 = new javax.swing.JLabel();
        lb_email1 = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        lb_nombre1 = new javax.swing.JLabel();
        btn_buscar_cliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_buscar_material = new javax.swing.JButton();
        lb_cedula = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_direccion = new javax.swing.JTextArea();
        btn_hace_prestamo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_cant_dias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lb_descripcion = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "material de apoyo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(763, 458));
        jPanel1.setMinimumSize(new java.awt.Dimension(763, 458));
        jPanel1.setPreferredSize(new java.awt.Dimension(763, 458));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabla_MAE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "nombre ", "codigo", "marca ", "disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane4.setViewportView(tabla_MAE);

        jLabel14.setText("Codigo");

        jLabel15.setText("nombre ");

        jLabel16.setText("marca");

        jLabel17.setText("descripción");

        txt_buscar_mod.setEnabled(false);
        txt_buscar_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscar_modKeyReleased(evt);
            }
        });

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane2.setViewportView(txt_descripcion);

        jToolBar1.setRollover(true);

        btn_eliminar.setText("eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_eliminar);

        btn_editar.setText("editar");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_editar);

        btn_guardar.setText("guardar");
        btn_guardar.setEnabled(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guardar);

        btn_crear_material.setText("añadir material");
        btn_crear_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_materialActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_crear_material);

        Actualiza_tabla_ver.setText("actualizar tabla");
        Actualiza_tabla_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualiza_tabla_verActionPerformed(evt);
            }
        });

        btn_materiales_demo.setText("DEMO");
        btn_materiales_demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materiales_demoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_buscar_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Actualiza_tabla_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_materiales_demo))))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Actualiza_tabla_ver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_materiales_demo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("añadir eliminar editar ", jPanel3);

        tabla_devolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "cedula", "material", "dia prestado", "fecha devolucion", "devolucion a tiempo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_devolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_devolucionMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabla_devolucion);

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        btn_devolver.setText("devolver");
        btn_devolver.setEnabled(false);
        btn_devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolverActionPerformed(evt);
            }
        });

        btn_actualizar.setText("actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_devolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_devolver)
                    .addComponent(btn_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("devolver material", jPanel4);

        lb_nombre_material.setText("nombre");

        txt_CU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CUKeyPressed(evt);
            }
        });

        jLabel8.setText("Código del material:");

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyPressed(evt);
            }
        });

        btn_limpiar.setText("limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        lb_Cod_material.setText("CU");

        lb_dewey1.setText("marca");

        lb_titulo1.setText("nombre");

        lb_marca.setText("marca");

        jLabel1.setText("Ingresa el número de cédula:");

        lb_autor1.setText("descripcion");

        lb_CU1.setText("CU");

        lb_nombre.setText("Nombre");

        lb_telefono1.setText("Teléfono");

        lb_email1.setText("e-mail");

        lb_telefono.setText("Teléfono");

        lb_nombre1.setText("Nombre");

        btn_buscar_cliente.setText("Añadir");
        btn_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_clienteActionPerformed(evt);
            }
        });

        jLabel2.setText("direccion");

        lb_email.setText("e-mail");

        jLabel3.setText("cedula");

        btn_buscar_material.setText("Añadir");
        btn_buscar_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_materialActionPerformed(evt);
            }
        });

        lb_cedula.setText("cedula");

        txt_direccion.setEditable(false);
        txt_direccion.setColumns(20);
        txt_direccion.setRows(5);
        txt_direccion.setText("DIRECCION");
        jScrollPane3.setViewportView(txt_direccion);

        btn_hace_prestamo.setText("Realizar Prestamo");
        btn_hace_prestamo.setEnabled(false);
        btn_hace_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hace_prestamoActionPerformed(evt);
            }
        });

        jLabel4.setText("cantidad de dias");

        txt_cant_dias.setText(" ");

        jLabel5.setText("*5 dias maximo*");

        jScrollPane6.setMaximumSize(new java.awt.Dimension(100, 100));

        lb_descripcion.setColumns(20);
        lb_descripcion.setRows(5);
        lb_descripcion.setMaximumSize(new java.awt.Dimension(100, 100));
        lb_descripcion.setMinimumSize(new java.awt.Dimension(100, 100));
        lb_descripcion.setPreferredSize(new java.awt.Dimension(100, 100));
        jScrollPane6.setViewportView(lb_descripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_limpiar)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lb_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar_cliente)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 75, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txt_CU, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_buscar_material)))
                                        .addGap(110, 110, 110))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_dewey1)
                                            .addComponent(lb_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_CU1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_nombre_material, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_marca)
                                            .addComponent(lb_Cod_material, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lb_autor1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nombre1)
                                    .addComponent(lb_telefono1)
                                    .addComponent(lb_email1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_telefono)
                                    .addComponent(lb_email)
                                    .addComponent(lb_nombre))
                                .addGap(11, 11, 11)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cant_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btn_hace_prestamo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_limpiar)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar_cliente))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cedula)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lb_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_telefono)
                                .addGap(18, 18, 18)
                                .addComponent(lb_email))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lb_nombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_telefono1)
                                .addGap(18, 18, 18)
                                .addComponent(lb_email1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar_material))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_dewey1)
                            .addComponent(lb_marca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_titulo1)
                            .addComponent(lb_nombre_material))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Cod_material)
                            .addComponent(lb_CU1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lb_autor1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_cant_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_hace_prestamo)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("prestar material", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btn_crear_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_materialActionPerformed
        agregar();

    }//GEN-LAST:event_btn_crear_materialActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        btn_eliminar.setEnabled(false);
        btn_crear_material.setEnabled(false);
        Actualiza_tabla_ver.setEnabled(false);
        btn_actualizar.setEnabled(false);
        btn_materiales_demo.setEnabled(false);
        btn_buscar_cliente.setEnabled(false);
        btn_buscar_material.setEnabled(false);
        modificar();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardar();

        btn_buscar_material.setEnabled(true);
        btn_buscar_cliente.setEnabled(true);
        btn_materiales_demo.setEnabled(true);
        btn_actualizar.setEnabled(true);
        Actualiza_tabla_ver.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_crear_material.setEnabled(true);

    }//GEN-LAST:event_btn_guardarActionPerformed

    public void cargar_tabla_MAE() {
        btn_editar.setEnabled(true);
        actualizar_tabla_MAE();

        filtro_editar = new TableRowSorter(tabla_MAE.getModel());
        tabla_MAE.setRowSorter(filtro_editar);
        txt_buscar_mod.setEnabled(true);
    }


    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        eliminar();

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_buscar_modKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_modKeyReleased

        repaint();
        filtro_editar.setRowFilter(RowFilter.regexFilter(txt_buscar_mod.getText()));
    }//GEN-LAST:event_txt_buscar_modKeyReleased

    private void tabla_MAEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_MAEMouseClicked
        try {

            int i = tabla_MAE.getSelectedRow();
            modificador = i;

            criterio_eliminar_material = "" + tabla_MAE.getValueAt(i, 1);

            String criterio_modificar = criterio_eliminar_material;
            for (int j = 0; j < materiales.size(); j++) {

                if (materiales.get(j).getCodigo().equals(criterio_modificar)) {
                    indice_modificar = j;
                    break;
                }
            }

            System.out.println("criterio eliminar " + criterio_modificar);

        } catch (Exception err) {
            System.out.println("ERROR " + err);
        }

    }//GEN-LAST:event_tabla_MAEMouseClicked

    private void btn_materiales_demoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materiales_demoActionPerformed
        MaterialApoyo nuevo = new MaterialApoyo("mac", "apple", "01", "blanca 10GB memoria", true);
        MaterialApoyo nuevo1 = new MaterialApoyo("portatil", "intel", "02", "16RAM un tera de memoria", true);
        MaterialApoyo nuevo2 = new MaterialApoyo("Regla ingeniero", "ABACO", "03", "200 cm", true);
        MaterialApoyo nuevo3 = new MaterialApoyo("telescopio pequeño", "NASA", "04", "es de color azul y va con estuche", true);

        materiales.add(nuevo);
        materiales.add(nuevo1);
        materiales.add(nuevo2);
        materiales.add(nuevo3);

        cargar_tabla_MAE();
        No_estructuras.escribir_material();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_materiales_demoActionPerformed

    private void Actualiza_tabla_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualiza_tabla_verActionPerformed

        cargar_tabla_MAE();
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualiza_tabla_verActionPerformed

    public void limpiar() {
        lb_descripcion.setText("");
        lb_marca.setText("");
        lb_nombre_material.setText("");
        lb_Cod_material.setText("");

        txt_cedula.setText("");
        lb_cedula.setText("");
        lb_email.setText("");
        lb_telefono.setText("");
        txt_direccion.setText("");
        lb_nombre.setText("");

        cliente_encontrado = false;
        material_encontrado = false;
    }

    private void txt_CUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CUKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            material_anadir();
        }
    }//GEN-LAST:event_txt_CUKeyPressed

    private void txt_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cliente_anadir();
        }
    }//GEN-LAST:event_txt_cedulaKeyPressed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_clienteActionPerformed

        cliente_anadir();
    }//GEN-LAST:event_btn_buscar_clienteActionPerformed

    private void btn_buscar_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_materialActionPerformed

        material_anadir();
    }//GEN-LAST:event_btn_buscar_materialActionPerformed

    private void btn_hace_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hace_prestamoActionPerformed

        try {

            int dias = 0;
            try {
                dias = Integer.parseInt(txt_cant_dias.getText().replace(" ", ""));
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null, "no digitaste un numero");
            }
            if (dias > 0 && dias < 6) {

                Date ya_mismo = new Date();
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(ya_mismo);

                calendario.add(Calendar.MINUTE, dias);

                materiales.get(prestar_material).setDisponibilidad(false);
                materiales.get(prestar_material).setFechaDevolucion(calendario.getTime());
                materiales.get(prestar_material).setFechaEntrega(ya_mismo);
                materiales.get(prestar_material).setCedula(jfmClientes.clientes.get(prestar_cliente).getCedula());
                jfmClientes.clientes.get(prestar_cliente).setMaterial_prestar(materiales.get(prestar_material));

                //<editor-fold defaultstate="collapsed" desc="SAVE...">
                No_estructuras.escribir_material();

                No_estructuras.escribir_clientes();
                //</editor-fold>

                limpiar();
                cargar_tabla();
                btn_devolver.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Prestamo exitoso ");
            } else {
                JOptionPane.showMessageDialog(null, "dias no encajan en el rango de 1 a 5 ");
            }
        } catch (HeadlessException headlessException) {
        }
    }//GEN-LAST:event_btn_hace_prestamoActionPerformed

    private void tabla_devolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_devolucionMouseClicked

        tabla_devolucion.setRowSelectionAllowed(true);

        int i = tabla_devolucion.getSelectedRow();
        if (tabla_devolucion.getValueAt(i, 0) != null) {

            criterio_devolver = tabla_devolucion.getValueAt(i, 0).toString();
            System.out.println("criterio devolver" + criterio_devolver);
            btn_devolver.setEnabled(true);
        } else {
            System.out.println("niaaaaaa");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_devolucionMouseClicked

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased

        repaint();
        filtro_devolver.setRowFilter(RowFilter.regexFilter(txt_buscar.getText()));

    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolverActionPerformed

        int d = -1;
        MaterialApoyo encontrado = null;

        for (int i = 0; i < jfmClientes.clientes.size(); i++) {
            if (jfmClientes.clientes.get(i).getCedula().equals(criterio_devolver)) {
                System.out.println("paso 1 HECHO");
                d = i;
                encontrado = jfmClientes.clientes.get(i).getMaterial_prestar();
                criterio_devolver = "";
                break;
            }
        }

        if (d != -1 && encontrado != null) {

            for (int i = 0; i < materiales.size(); i++) {
                if (encontrado.getCodigo().equals(materiales.get(i).getCodigo())) {
                    System.out.println("paso 2 HECHO");
                    materiales.get(i).setDisponibilidad(true);
                    break;
                }
            }

            jfmClientes.clientes.get(d).setMaterial_prestar(null);

            //<editor-fold defaultstate="collapsed" desc="SAVE...">
            No_estructuras.escribir_material();

            No_estructuras.escribir_clientes();

            //</editor-fold>
            cargar_tabla();
        } else {
            JOptionPane.showMessageDialog(null, "error no encontro algo pasa");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_devolverActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        cargar_tabla();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    public void material_anadir() {

        boolean encontrado = false;
        int indice = -1;

        String codigo_U = txt_CU.getText();
        if (!"".equals(codigo_U)) {

            for (int i = 0; i < materiales.size(); i++) {
                if (materiales.get(i).getCodigo().equals(codigo_U)) {
                    indice = i;
                    encontrado = true;
                }
            }
            if (indice != -1 && encontrado) {

                if (materiales.get(indice).isDisponibilidad()) {
                    MaterialApoyo a_prestar = materiales.get(indice);
                    prestar_material = indice;
                    material_encontrado = true;

                    txt_CU.setText("");
                    lb_descripcion.setText(a_prestar.getDescripcion());
                    lb_marca.setText(a_prestar.getMarca());
                    lb_Cod_material.setText(a_prestar.getCodigo());
                    lb_nombre_material.setText(a_prestar.getNombre());

                } else {
                    JOptionPane.showMessageDialog(null, "el libro no esta disponible");

                    lb_descripcion.setText("");
                    lb_marca.setText("");
                    lb_nombre_material.setText("");
                    material_encontrado = false;

                }

            } else {
                JOptionPane.showMessageDialog(null, "CU digitado no existe ");
                lb_descripcion.setText("");
                lb_marca.setText("");
                lb_nombre_material.setText("");
                material_encontrado = false;

            }
        } else {
            JOptionPane.showMessageDialog(null, "no has llenado el espacio ");
            lb_descripcion.setText("");
            lb_marca.setText("");
            lb_nombre_material.setText("");
            material_encontrado = false;

        }
    }

    public void cliente_anadir() {
        boolean encontrado = false;
        int indice = -1;

        String cedula_unica = txt_cedula.getText();
        if (!"".equals(cedula_unica)) {

            for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                if (jfmClientes.clientes.get(i).getCedula().equals(cedula_unica)) {
                    indice = i;
                    encontrado = true;
                }
            }

            if (indice != -1 && encontrado) {

                if (jfmClientes.clientes.get(indice).getLibroPrestado() == null) {

                    if (jfmClientes.clientes.get(indice).isMoroso() == false) {
                        Cliente quien_le_presto = jfmClientes.clientes.get(indice);

                        cliente_encontrado = true;

                        prestar_cliente = indice;

                        txt_cedula.setText("");
                        lb_cedula.setText(quien_le_presto.getCedula());
                        lb_email.setText(quien_le_presto.getEmail());
                        lb_telefono.setText(quien_le_presto.getEmail());
                        txt_direccion.setText(quien_le_presto.getDireccion());
                        lb_nombre.setText(quien_le_presto.getNombre());

                    } else {
                        JOptionPane.showMessageDialog(null, "el cliente esta moroso, no se le prestran libros");
                        lb_cedula.setText("");
                        lb_email.setText("");
                        lb_telefono.setText("");
                        txt_direccion.setText("");
                        lb_nombre.setText("");

                        cliente_encontrado = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "el cliente ya tiene un libro, no se le prestran mas libros");
                    lb_cedula.setText("");
                    lb_email.setText("");
                    lb_telefono.setText("");
                    txt_direccion.setText("");
                    lb_nombre.setText("");

                    cliente_encontrado = false;

                }

            } else {
                JOptionPane.showMessageDialog(null, "la cedula digitada no coincide con ninguna del registro ");

                lb_cedula.setText("");
                lb_email.setText("");
                lb_telefono.setText("");
                txt_direccion.setText("");
                lb_nombre.setText("");
                cliente_encontrado = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "no has llenado el espacio ");
            lb_cedula.setText("");
            lb_email.setText("");
            lb_telefono.setText("");
            txt_direccion.setText("");
            lb_nombre.setText("");
            cliente_encontrado = false;
        }
    }

    public boolean comprobar(String codigo) {

        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getCodigo().equals(codigo)) {
                return true;
            }
        }

        return false;

    }

    @Override
    public void agregar() {

        MaterialApoyo nuevo = new MaterialApoyo(txt_nombre.getText(), txt_marca.getText(), txt_codigo.getText(), txt_descripcion.getText(), true);

        if (txt_nombre.getText().equals("") || txt_codigo.getText().equals("") || txt_marca.getText().equals("") || txt_descripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "llene todos los espaios vacios, intente de nuevo");
        } else {

            if (!comprobar(txt_codigo.getText())) {
                materiales.add(nuevo);
                No_estructuras.escribir_material();
                JOptionPane.showMessageDialog(null, "el material se añadió con exito");
                txt_nombre.setText("");
                txt_codigo.setText("");
                txt_marca.setText("");
                txt_descripcion.setText("");
                cargar_tabla_MAE();
            } else {
                JOptionPane.showMessageDialog(null, "esa cedula ya existe en el sistema");
            }

        }

    }

    @Override
    public void modificar() {

        try {
            if (modificador != -1) {

                btn_editar.setEnabled(false);
                txt_codigo.setText("" + materiales.get(indice_modificar).getCodigo());
                txt_nombre.setText("" + materiales.get(indice_modificar).getNombre());
                txt_descripcion.setText("" + materiales.get(indice_modificar).getDescripcion());
                txt_marca.setText("" + materiales.get(indice_modificar).getMarca());

                btn_guardar.setEnabled(true);
                tabla_MAE.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "primero elija un usuario de la tabla");
            }

        } catch (HeadlessException headlessException) {
            System.out.println("ERROR " + headlessException);
        }
    }

    @Override
    public void guardar() {

        try {

            if (!(txt_nombre.getText().equals("") || txt_codigo.getText().equals("") || txt_marca.getText().equals("") || txt_descripcion.getText().equals(""))) {

                materiales.get(indice_modificar).setCodigo(txt_codigo.getText());
                materiales.get(indice_modificar).setDescripcion(txt_descripcion.getText());
                materiales.get(indice_modificar).setNombre(txt_nombre.getText());
                materiales.get(indice_modificar).setMarca(txt_marca.getText());

                txt_codigo.setText("");
                txt_nombre.setText("");
                txt_descripcion.setText("");
                txt_marca.setText("");

                btn_guardar.setEnabled(false);
                btn_editar.setEnabled(true);

                No_estructuras.escribir_material();

                tabla_MAE.setEnabled(true);
                cargar_tabla_MAE();
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    @Override
    public void eliminar() {

        if (criterio_eliminar_material.equals("") || criterio_eliminar_material == null) {

            JOptionPane.showMessageDialog(null, "seleccione un elemento primero de la tabla, intente de nuevo");

        } else {

            int s = JOptionPane.showConfirmDialog(null, " ¿Esta seguro?, los datos se perderan por siempre");
            if (s == 0) {

                for (int i = 0; i < materiales.size(); i++) {
                    if (materiales.get(i).getCodigo().equals(criterio_eliminar_material)) {
                        materiales.remove(i);
                    }
                }
                No_estructuras.escribir_material();
                cargar_tabla_MAE();
            }

        }

    }

//<editor-fold defaultstate="collapsed" desc="Actualiza tablas">
    public void actualizar_tabla_MAE() {

        try {

            String[][] matriz = new String[materiales.size() + 1][4];

            for (int i = 0; i < materiales.size(); i++) {
                matriz[i][0] = materiales.get(i).getNombre();
                matriz[i][1] = materiales.get(i).getCodigo();
                matriz[i][2] = materiales.get(i).getMarca();
                if (materiales.get(i).isDisponibilidad()) {
                    matriz[i][3] = "si";
                } else {
                    matriz[i][3] = "no";
                }

            }

            if (matriz != null) {

                tabla_MAE.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "nombre ", "codigo", "marca", "disponibilidad"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
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
//</editor-fold>

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
            java.util.logging.Logger.getLogger(jfmMaterialApoyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmMaterialApoyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmMaterialApoyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmMaterialApoyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new jfmMaterialApoyo().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualiza_tabla_ver;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar_cliente;
    private javax.swing.JButton btn_buscar_material;
    private javax.swing.JButton btn_crear_material;
    private javax.swing.JButton btn_devolver;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_hace_prestamo;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_materiales_demo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_CU1;
    private javax.swing.JLabel lb_Cod_material;
    private javax.swing.JLabel lb_autor1;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JTextArea lb_descripcion;
    private javax.swing.JLabel lb_dewey1;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_email1;
    private javax.swing.JLabel lb_marca;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_nombre1;
    private javax.swing.JLabel lb_nombre_material;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JLabel lb_telefono1;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JTable tabla_MAE;
    private javax.swing.JTable tabla_devolucion;
    private javax.swing.JTextField txt_CU;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_buscar_mod;
    private javax.swing.JTextField txt_cant_dias;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextArea txt_direccion;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

}
