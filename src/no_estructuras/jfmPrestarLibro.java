package no_estructuras;

import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class jfmPrestarLibro extends javax.swing.JFrame implements Runnable {

    boolean cliente_encontrado = false;
    boolean libro_encontrado = false;

    int prestar_libro;
    int prestar_cliente;

    String criterio_devolver = "";

    TableRowSorter filtro_devolver;

    public jfmPrestarLibro() {
        initComponents();

        Thread s = new Thread(this);
        s.start();
        
        cargar_tabla();
    }

    public void cargar_tabla() {

        ArrayList<Cliente> aux_para_llenar = new ArrayList<>();
        for (int i = 0; i < jfmClientes.clientes.size(); i++) {

            if (jfmClientes.clientes.get(i).getLibroPrestado() != null) {
                aux_para_llenar.add(jfmClientes.clientes.get(i));
            }

        }
        if (aux_para_llenar.size() > 0) {

            Date now = new Date();
            String matriz[][] = new String[aux_para_llenar.size() + 1][5];
            for (int i = 0; i < aux_para_llenar.size(); i++) {

                matriz[i][0] = aux_para_llenar.get(i).getCedula();
                matriz[i][1] = aux_para_llenar.get(i).getLibroPrestado().getTitulo();
                matriz[i][2] = new SimpleDateFormat("dd/MM/yyyy").format(aux_para_llenar.get(i).getLibroPrestado().getFechaEntrega());
                Date devolucion = aux_para_llenar.get(i).getLibroPrestado().getFechaDevolucion();
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
                        "cedula", "libro", "dia prestado", "fecha devolucion", "devolucion a tiempo"
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
                        "cedula", "libro", "dia prestado", "fecha devolucion", "devolucion a tiempo"
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_devolucion = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        btn_devolver = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_dewey = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_editorial = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_ISBN = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        btn_buscar_cliente = new javax.swing.JButton();
        lb_email = new javax.swing.JLabel();
        btn_buscar_libro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_direccion = new javax.swing.JTextArea();
        btn_hace_prestamo = new javax.swing.JButton();
        lb_titulo = new javax.swing.JLabel();
        lb_autor = new javax.swing.JLabel();
        txt_CU = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        lb_CU = new javax.swing.JLabel();
        lb_ISBN1 = new javax.swing.JLabel();
        lb_dewey1 = new javax.swing.JLabel();
        lb_titulo1 = new javax.swing.JLabel();
        lb_editorial1 = new javax.swing.JLabel();
        lb_autor1 = new javax.swing.JLabel();
        lb_CU1 = new javax.swing.JLabel();
        lb_telefono1 = new javax.swing.JLabel();
        lb_email1 = new javax.swing.JLabel();
        lb_nombre1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_cedula = new javax.swing.JLabel();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tabla_devolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "cedula", "libro", "dia prestado", "fecha devolucion", "devolucion a tiempo"
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
        jScrollPane2.setViewportView(tabla_devolucion);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_devolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_actualizar)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_devolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("devolucion de libro", jPanel2);

        lb_dewey.setText("Clasificación DEWEY");

        jLabel1.setText("Ingresa el número de cédula:");

        lb_editorial.setText("Editorial");

        lb_nombre.setText("Nombre");

        lb_ISBN.setText("ISBN");

        lb_telefono.setText("Teléfono");

        btn_buscar_cliente.setText("Añadir");
        btn_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_clienteActionPerformed(evt);
            }
        });

        lb_email.setText("e-mail");

        btn_buscar_libro.setText("Añadir");
        btn_buscar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_libroActionPerformed(evt);
            }
        });

        txt_direccion.setEditable(false);
        txt_direccion.setColumns(20);
        txt_direccion.setRows(5);
        txt_direccion.setText("DIRECCION");
        jScrollPane1.setViewportView(txt_direccion);

        btn_hace_prestamo.setText("Realizar Prestamo");
        btn_hace_prestamo.setEnabled(false);
        btn_hace_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hace_prestamoActionPerformed(evt);
            }
        });

        lb_titulo.setText("Título");

        lb_autor.setText("Autor");

        txt_CU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CUActionPerformed(evt);
            }
        });
        txt_CU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CUKeyPressed(evt);
            }
        });

        jLabel8.setText("Código de Unidad:");

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

        lb_CU.setText("CU");

        lb_ISBN1.setText("ISBN");

        lb_dewey1.setText("Clasificación DEWEY");

        lb_titulo1.setText("Título");

        lb_editorial1.setText("Editorial");

        lb_autor1.setText("Autor");

        lb_CU1.setText("CU");

        lb_telefono1.setText("Teléfono");

        lb_email1.setText("e-mail");

        lb_nombre1.setText("Nombre");

        jLabel2.setText("direccion");

        jLabel3.setText("cedula");

        lb_cedula.setText("cedula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_limpiar)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(lb_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_nombre1)
                                            .addComponent(lb_telefono1)
                                            .addComponent(lb_email1)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_telefono)
                                            .addComponent(lb_email)
                                            .addComponent(lb_nombre)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_hace_prestamo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_buscar_cliente)
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txt_CU, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_dewey1)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lb_CU1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_ISBN1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_autor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_titulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_editorial1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_dewey)
                                            .addComponent(lb_CU, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lb_titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_autor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_editorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_ISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(9, 9, 9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_buscar_libro)))))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_limpiar)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar_cliente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar_libro))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cedula)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_dewey1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_titulo1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_autor1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_editorial1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_ISBN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_CU1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_dewey)
                        .addGap(18, 18, 18)
                        .addComponent(lb_titulo)
                        .addGap(18, 18, 18)
                        .addComponent(lb_autor)
                        .addGap(18, 18, 18)
                        .addComponent(lb_editorial)
                        .addGap(18, 18, 18)
                        .addComponent(lb_ISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_CU))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_telefono)
                                .addGap(18, 18, 18)
                                .addComponent(lb_email))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_nombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_telefono1)
                                .addGap(18, 18, 18)
                                .addComponent(lb_email1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btn_hace_prestamo)
                .addGap(76, 76, 76))
        );

        jTabbedPane1.addTab("prestar libro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    public void limpiar() {

        lb_ISBN.setText("");
        lb_autor.setText("");
        lb_dewey.setText("");
        lb_editorial.setText("");
        lb_titulo.setText("");
        lb_CU.setText("");

        txt_cedula.setText("");
        lb_cedula.setText("");
        lb_email.setText("");
        lb_telefono.setText("");
        txt_direccion.setText("");
        lb_nombre.setText("");

        cliente_encontrado = false;
        libro_encontrado = false;
    }

    private void txt_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cliente_anadir();
        }
    }//GEN-LAST:event_txt_cedulaKeyPressed

    private void txt_CUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CUKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            libro_anadir();
        }
    }//GEN-LAST:event_txt_CUKeyPressed

    private void btn_hace_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hace_prestamoActionPerformed

        JOptionPane.showMessageDialog(null, "Prestamo exitoso ");

        Date ya_mismo = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(ya_mismo);
        //le sumo 4 minutos al codigo
        calendario.add(Calendar.MINUTE, 1);

        // declaro el libro que iba a prestar NO DISPONIBLE
        jfmLibros.libros.get(prestar_libro).setDisponibilidad(false);
        //declaro el tiempo de devolucion 1 minuto despues
        jfmLibros.libros.get(prestar_libro).setFechaDevolucion(calendario.getTime());
        jfmLibros.libros.get(prestar_libro).setFechaEntrega(ya_mismo);
        //PONGO QUIEN TIENE EL LIBRO EN sus cosas prestadas
        jfmLibros.libros.get(prestar_libro).setCedulaPersona(jfmClientes.clientes.get(prestar_cliente));
        //pongo el libro prestado en el CLIENTE QUE LO PIDE
        jfmClientes.clientes.get(prestar_cliente).setLibroPrestado(jfmLibros.libros.get(prestar_libro));

        System.out.println(jfmLibros.libros.get(prestar_libro).getTitulo()+" DISP" + jfmLibros.libros.get(prestar_libro).isDisponibilidad());

        //<editor-fold defaultstate="collapsed" desc="SAVE...">
        No_estructuras.escribir_clientes();
        No_estructuras.escribir_Libros();
        
        //</editor-fold>
        cargar_tabla();
        limpiar();
        btn_devolver.setEnabled(false);
    }//GEN-LAST:event_btn_hace_prestamoActionPerformed

    private void btn_buscar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_libroActionPerformed

        libro_anadir();
    }//GEN-LAST:event_btn_buscar_libroActionPerformed

    private void btn_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_clienteActionPerformed

        cliente_anadir();
    }//GEN-LAST:event_btn_buscar_clienteActionPerformed

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

        String f = txt_buscar.getText();
        txt_buscar.setText(f);
        repaint();
        filtro_devolver.setRowFilter(RowFilter.regexFilter(txt_buscar.getText()));

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolverActionPerformed

        int d = -1;
        MaterialPrestado encontrado = null;

        for (int i = 0; i < jfmClientes.clientes.size(); i++) {
            if (jfmClientes.clientes.get(i).getCedula().equals(criterio_devolver)) {
                d = i;
                encontrado = jfmClientes.clientes.get(i).getLibroPrestado();
                criterio_devolver = "";
                break;
            }
        }

        if (d != -1 && encontrado != null) {

            for (int i = 0; i < jfmLibros.libros.size(); i++) {
                if (encontrado.getCodigoUnidad().equals(jfmLibros.libros.get(i).getCodigoUnidad())) {

                    jfmLibros.libros.get(i).setDisponibilidad(true);
                    break;
                }
            }

            jfmClientes.clientes.get(d).setLibroPrestado(null);

            //<editor-fold defaultstate="collapsed" desc="SAVE...">
            No_estructuras.escribir_Libros();

            No_estructuras.escribir_clientes();
            cargar_tabla();
            //</editor-fold>
        } else {
            JOptionPane.showMessageDialog(null, "error no encontro algo pasa, o te tira null");
        }
    }//GEN-LAST:event_btn_devolverActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        cargar_tabla();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_CUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CUActionPerformed

    public void libro_anadir() {

        boolean encontrado = false;
        int indice = -1;

        String codigo_U = txt_CU.getText();
        if (!"".equals(codigo_U)) {

            for (int i = 0; i < jfmLibros.libros.size(); i++) {
                if (jfmLibros.libros.get(i).getCodigoUnidad().equals(codigo_U)) {
                    indice = i;
                    encontrado = true;
                }
            }
            if (indice != -1 && encontrado==true) {

                System.out.println(jfmLibros.libros.get(indice).getTitulo()+" CONDICION UNO " + jfmLibros.libros.get(indice).isDisponibilidad());
                if (jfmLibros.libros.get(indice).isDisponibilidad() == true) {
                    Libro a_prestar = jfmLibros.libros.get(indice);
                    prestar_libro = indice;
                    libro_encontrado = true;

                    txt_CU.setText("");
                    lb_ISBN.setText(a_prestar.getCodigoISBN());
                    lb_autor.setText(a_prestar.getAutor());
                    lb_dewey.setText(a_prestar.getClasificacionDEWEY());
                    lb_editorial.setText(a_prestar.getEditorial());
                    lb_titulo.setText(a_prestar.getTitulo());
                    lb_CU.setText(codigo_U);

                } else {
                    JOptionPane.showMessageDialog(null, "el libro no esta disponible");

                    lb_ISBN.setText("");
                    lb_autor.setText("");
                    lb_dewey.setText("");
                    lb_editorial.setText("");
                    lb_titulo.setText("");
                    lb_CU.setText("");
                    libro_encontrado = false;

                }

            } else {
                JOptionPane.showMessageDialog(null, "CU digitado no existe ");
                lb_ISBN.setText("");
                lb_autor.setText("");
                lb_dewey.setText("");
                lb_editorial.setText("");
                lb_titulo.setText("");
                lb_CU.setText("");
                libro_encontrado = false;

            }
        } else {
            JOptionPane.showMessageDialog(null, "no has llenado el espacio ");
            lb_ISBN.setText("");
            lb_autor.setText("");
            lb_dewey.setText("");
            lb_editorial.setText("");
            lb_titulo.setText("");
            lb_CU.setText("");
            libro_encontrado = false;

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
                        JOptionPane.showMessageDialog(null, "el cliente esta moroso,");
                        lb_cedula.setText("");
                        lb_email.setText("");
                        lb_telefono.setText("");
                        txt_direccion.setText("");
                        lb_nombre.setText("");

                        cliente_encontrado = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "el cliente ya tiene un material prestado");
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

    @Override
    public void run() {

        while (true) {
            System.out.print("");
            if (libro_encontrado && cliente_encontrado) {
                btn_hace_prestamo.setEnabled(true);
            } else {
                btn_hace_prestamo.setEnabled(false);
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
            java.util.logging.Logger.getLogger(jfmPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmPrestarLibro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar_cliente;
    private javax.swing.JButton btn_buscar_libro;
    private javax.swing.JButton btn_devolver;
    private javax.swing.JButton btn_hace_prestamo;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_CU;
    private javax.swing.JLabel lb_CU1;
    private javax.swing.JLabel lb_ISBN;
    private javax.swing.JLabel lb_ISBN1;
    private javax.swing.JLabel lb_autor;
    private javax.swing.JLabel lb_autor1;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_dewey;
    private javax.swing.JLabel lb_dewey1;
    private javax.swing.JLabel lb_editorial;
    private javax.swing.JLabel lb_editorial1;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_email1;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_nombre1;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JLabel lb_telefono1;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JTable tabla_devolucion;
    private javax.swing.JTextField txt_CU;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextArea txt_direccion;
    // End of variables declaration//GEN-END:variables

}
