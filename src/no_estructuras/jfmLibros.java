package no_estructuras;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

public class jfmLibros extends javax.swing.JFrame {

    static ArrayList<Libro> libros = new ArrayList<>();
   
    TableRowSorter filtro_buscar;
    TableRowSorter filtro_ME;

    int indice_modificar = -1;
    String criterio_eliminar = "";

    ///////////////ME significa modificar e eliminar
    public jfmLibros() {
        initComponents();
        cargar_tabla_buscar();
        cargar_tabla_Mod_Elim();
        
    }

    public int inteador(String d) {
        return Integer.parseInt(d);
    }

    public void cargar_tabla_Mod_Elim() {
        String matriz[][] = new String[jfmLibros.libros.size() + 1][2];
        for (int i = 0; i < jfmLibros.libros.size(); i++) {
            matriz[i][0] = jfmLibros.libros.get(i).getTitulo();
            matriz[i][1] = jfmLibros.libros.get(i).getCodigoUnidad();
        }

        tabla_editar_eliminar.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "nombre ", "codigo de unidad"
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

        filtro_ME = new TableRowSorter(tabla_busqueda.getModel());
        tabla_editar_eliminar.setRowSorter(filtro_ME);

    }

    public void cargar_tabla_buscar() {
        String matriz[][] = new String[jfmLibros.libros.size() + 1][5];
        for (int i = 0; i < jfmLibros.libros.size(); i++) {
            matriz[i][0] = jfmLibros.libros.get(i).getTitulo();
            matriz[i][1] = jfmLibros.libros.get(i).getAutor();
            matriz[i][2] = jfmLibros.libros.get(i).getGenero();
            matriz[i][3] = jfmLibros.libros.get(i).getClasificacionDEWEY();
            matriz[i][4] = jfmLibros.libros.get(i).getCodigoUnidad();

        }

        tabla_busqueda.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "titulo", "autor", "genero", "Dewey", "codigo Unidad"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        filtro_buscar = new TableRowSorter(tabla_busqueda.getModel());
        tabla_busqueda.setRowSorter(filtro_buscar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_crear_Autor = new javax.swing.JTextField();
        txt_crear_Editorial = new javax.swing.JTextField();
        cmb_Genero = new javax.swing.JComboBox<>();
        txt_crear_ISBN = new javax.swing.JTextField();
        txt_crear_DEWEY = new javax.swing.JTextField();
        txt_crear_Unidad = new javax.swing.JTextField();
        cmb_Estado = new javax.swing.JComboBox<>();
        txt_crear_Titulo = new javax.swing.JTextField();
        dd = new javax.swing.JTextField();
        mm = new javax.swing.JTextField();
        yy = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cargar_memoria_prueba = new javax.swing.JButton();
        actualizar_tabla = new javax.swing.JButton();
        btn_Registrar_libro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_buscar_basico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_busqueda = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtTituloAvanzada = new javax.swing.JTextField();
        txtAutorAvanzada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEditorialAvanzada = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbBuscaG = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtFechaAvanzada = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnBuscarAvanzado = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn_editar_libro = new javax.swing.JButton();
        btn_guardar_libro = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txt_buscar_ME = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_editar_eliminar = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        yy2 = new javax.swing.JTextField();
        txt_ME_Autor = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_ME_Editorial = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_ME_ISBN = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt_ME_DEWEY = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_ME_Unidad = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_ME_titulo = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        dd2 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        mm2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmb_ME_Estado = new javax.swing.JComboBox<>();
        cmb_ME_Genero = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Título");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Autor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Editorial");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Género");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de publicación");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ISBN");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Clasificación DEWEY");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Código de Unidad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Estado");

        cmb_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un género", "Policial", "Romántico", "Aventura", "Terror", "Ficción/Realidad", "Ciencia Ficción", "Investigación", "Biográfica", "Infantil", "Autoayuda", "Erótica", "Hogar", "Enciclopédia", "Política", "Economía", "Sociedad", "Deportes", "Viajes/Cultura", "Varios", "Historia", "Comedia", " " }));

        cmb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Aceptable", "Regular", "Deteriorado" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("dd");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("mm");

        jLabel20.setText("yyyy");

        jLabel21.setText("ejemplo** 2/3/2019");

        cargar_memoria_prueba.setText("DEMO");
        cargar_memoria_prueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_memoria_pruebaActionPerformed(evt);
            }
        });

        actualizar_tabla.setText("Actualizar tablas");
        actualizar_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_crear_Editorial, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txt_crear_Unidad)
                            .addComponent(txt_crear_DEWEY)
                            .addComponent(cmb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_crear_Titulo)
                            .addComponent(txt_crear_Autor)
                            .addComponent(txt_crear_ISBN))
                        .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yy, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(actualizar_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargar_memoria_prueba)
                        .addGap(35, 35, 35))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_crear_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cargar_memoria_prueba)
                        .addComponent(actualizar_tabla)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_crear_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_crear_Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_crear_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_crear_DEWEY, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_crear_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btn_Registrar_libro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Registrar_libro.setText("Registrar");
        btn_Registrar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Registrar_libroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(btn_Registrar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Registrar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar Libros", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText(" búsqueda por palabra relacionada");

        txt_buscar_basico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscar_basicoKeyReleased(evt);
            }
        });

        tabla_busqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "titulo", "autor", "genero", "Dewey", "CU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_busqueda);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar_basico, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_buscar_basico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jLabel11.getAccessibleContext().setAccessibleName("Escriba una palabra relacionada\na la búsqueda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Búsqueda Básica", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Título");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Autor");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Editorial");

        cmbBuscaG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un género", "Policial", "Romántico", "Aventura", "Terror", "Ficción/Realidad", "Ciencia Ficción", "Investigación", "Biográfica", "Infantil", "Autoayuda", "Erótica", "Hogar", "Enciclopédia", "Política", "Economía", "Sociedad", "Deportes", "Viajes/Cultura", "Varios" }));
        cmbBuscaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscaGActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Género");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Fecha de publicación");

        btnBuscarAvanzado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarAvanzado.setText("Buscar");
        btnBuscarAvanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAvanzadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTituloAvanzada, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(txtAutorAvanzada)
                            .addComponent(txtFechaAvanzada)
                            .addComponent(txtEditorialAvanzada)
                            .addComponent(cmbBuscaG, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnBuscarAvanzado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 87, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTituloAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(txtAutorAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbBuscaG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEditorialAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtFechaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnBuscarAvanzado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Búsqueda Avanzada", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Búsqueda", jPanel2);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        btn_editar_libro.setText("editar");
        btn_editar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_libroActionPerformed(evt);
            }
        });

        btn_guardar_libro.setText("guardar");
        btn_guardar_libro.setEnabled(false);
        btn_guardar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_libroActionPerformed(evt);
            }
        });

        jLabel25.setText("direccion de vivienda");

        txt_buscar_ME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscar_MEKeyReleased(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        tabla_editar_eliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "nombre ", "codigo de unidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_editar_eliminar.setToolTipText("");
        tabla_editar_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_editar_eliminarMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_editar_eliminar);

        btn_eliminar.setText("eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("dd");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("mm");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Título");

        jLabel33.setText("yyyy");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Autor");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Editorial");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Género");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Fecha de publicación");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("ISBN");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Clasificación DEWEY");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Código de Unidad");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel22.setText("buscar");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Estado");

        cmb_ME_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Aceptable", "Regular", "Deteriorado" }));

        cmb_ME_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un género", "Policial", "Romántico", "Aventura", "Terror", "Ficción/Realidad", "Ciencia Ficción", "Investigación", "Biográfica", "Infantil", "Autoayuda", "Erótica", "Hogar", "Enciclopédia", "Política", "Economía", "Sociedad", "Deportes", "Viajes/Cultura", "Varios", "Historia", "Comedia", " " }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_ME_Unidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ME_DEWEY, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ME_ISBN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dd2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mm2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yy2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel25)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ME_Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_ME_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ME_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btn_editar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_guardar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_eliminar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(txt_buscar_ME)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ME_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(25, 25, 25)
                        .addComponent(cmb_ME_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txt_ME_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_editar_libro)
                    .addComponent(btn_guardar_libro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ME_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txt_buscar_ME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_ME_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txt_ME_Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel28)
                            .addComponent(dd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(mm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(yy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(txt_ME_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txt_ME_DEWEY, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(txt_ME_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cmb_ME_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("modificar eliminar libros", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Registrar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Registrar_libroActionPerformed
        Calendar cal = Calendar.getInstance();
        int ano_actual = cal.get(Calendar.YEAR);

        int dia = inteador(dd.getText().replace(" ", ""));
        int mes = inteador(mm.getText().replace(" ", ""));
        int ano = inteador(yy.getText().replace(" ", ""));

        String estado = cmb_Estado.getSelectedItem().toString();
        String genero = cmb_Genero.getSelectedItem().toString();
        String fecha = dia + "/" + mes + "/" + ano;
        Libro libroNuevo = new Libro(txt_crear_DEWEY.getText(), null, null, null, true, txt_crear_Titulo.getText(),
                txt_crear_Editorial.getText(), txt_crear_ISBN.getText(),
                txt_crear_Autor.getText(), fecha, genero,
                estado, txt_crear_Unidad.getText());
        System.out.println("fecha" + fecha + " " + fecha.length());
        if (!codigo_unidad_existente(libroNuevo.getCodigoUnidad())) {

            if (txt_crear_DEWEY.getText().equals("") || txt_crear_Titulo.getText().equals("")
                    || txt_crear_Editorial.getText().equals("") || txt_crear_ISBN.getText().equals("")
                    || txt_crear_Autor.getText().equals("") || genero.equals("Seleccione un género")
                    || txt_crear_Unidad.getText().equals("")
                    || fecha.length() > 10 || fecha.length() < 6 || dia > 32 || dia < 0 || mes >= 13
                    || mes <= 0 || ano > ano_actual) {

                JOptionPane.showMessageDialog(null, "mal digitado");

            } else {

                jfmLibros.libros.add(libroNuevo);

                No_estructuras.escribir_Libros();
                txt_crear_DEWEY.setText("");
                txt_crear_Titulo.setText("");
                txt_crear_Editorial.setText("");
                txt_crear_ISBN.setText("");
                txt_crear_Autor.setText("");
                txt_crear_Unidad.setText("");
                yy.setText("");
                dd.setText("");
                mm.setText("");

                cmb_Genero.setSelectedIndex(0);
                cmb_Estado.setSelectedIndex(0);

                cargar_tabla_buscar();
                cargar_tabla_Mod_Elim();
                JOptionPane.showMessageDialog(null, "libro guardado exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ese codigo de unidad ya existe porfavor cambielo");
        }
    }//GEN-LAST:event_btn_Registrar_libroActionPerformed

    public boolean codigo_unidad_existente(String cod_unidad) {

        for (int i = 0; i < jfmLibros.libros.size(); i++) {
            if (jfmLibros.libros.get(i).getCodigoUnidad().equals(cod_unidad)) {
                return true;
            }
        }

        return false;
    }

    private void btnBuscarAvanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAvanzadoActionPerformed
        MostrarJTable tabla = new MostrarJTable();
        String genero = cmbBuscaG.getSelectedItem().toString();
        ArrayList<Libro> libroB = new ArrayList();
        for (int i = 0; i < jfmLibros.libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(txtTituloAvanzada.getText()) && libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && genero.equalsIgnoreCase("Seleccione un género")
                    || libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && txtTituloAvanzada.getText().equals("") && genero.equalsIgnoreCase("Seleccione un género")
                    || libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && txtFechaAvanzada.getText().equals("") && txtTituloAvanzada.getText().equals("") && genero.equalsIgnoreCase("Seleccione un género")
                    || libros.get(i).getTitulo().equalsIgnoreCase(txtTituloAvanzada.getText()) && libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && genero.equalsIgnoreCase("Selecciona un género") && txtFechaAvanzada.getText().equals("")
                    || libros.get(i).getTitulo().equalsIgnoreCase(txtTituloAvanzada.getText()) && libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && genero.equalsIgnoreCase("Selecciona un género") && txtEditorialAvanzada.getText().equals("")
                    || libros.get(i).getTitulo().equalsIgnoreCase(txtTituloAvanzada.getText()) && libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && txtEditorialAvanzada.getText().equals("") && txtFechaAvanzada.getText().equals("") && genero.equalsIgnoreCase("Seleccione un género")
                    || libros.get(i).getTitulo().equalsIgnoreCase(txtTituloAvanzada.getText()) && libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && txtFechaAvanzada.getText().equals("") && genero.equalsIgnoreCase("Seleccione un género") && txtAutorAvanzada.getText().equals("")
                    || libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && genero.equalsIgnoreCase("Seleccione un género") && txtAutorAvanzada.getText().equals("") && txtEditorialAvanzada.getText().equals("")
                    || libros.get(i).getTitulo().equalsIgnoreCase(txtTituloAvanzada.getText()) && libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && genero.equalsIgnoreCase("Seleccione un género") && txtAutorAvanzada.getText().equals("")
                    || libros.get(i).getTitulo().equalsIgnoreCase(txtTituloAvanzada.getText()) && libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && libros.get(i).getGenero().equalsIgnoreCase(genero) && txtFechaAvanzada.getText().equals("")
                    || libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getGenero().equalsIgnoreCase(genero) && txtEditorialAvanzada.getText().equals("") && txtFechaAvanzada.getText().equals("")
                    || libros.get(i).getAutor().equalsIgnoreCase(txtAutorAvanzada.getText()) && libros.get(i).getGenero().equalsIgnoreCase(genero) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && txtEditorialAvanzada.getText().equals("")
                    || libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && libros.get(i).getGenero().equalsIgnoreCase(genero) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && txtAutorAvanzada.getText().equals("")
                    || libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && libros.get(i).getFechaPublicacion().equalsIgnoreCase(txtFechaAvanzada.getText()) && genero.equalsIgnoreCase("Seleccione un género") && txtAutorAvanzada.getText().equals("") && txtTituloAvanzada.getText().equals("")
                    || libros.get(i).getEditorial().equalsIgnoreCase(txtEditorialAvanzada.getText()) && libros.get(i).getGenero().equalsIgnoreCase(genero) && txtFechaAvanzada.getText().equals("") && txtAutorAvanzada.getText().equals("") && txtTituloAvanzada.getText().equals("")) {
                libroB.add(libros.get(i));
            }
        }
        if (libroB.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se logró encontrar alguna coincidencia");
        } else{
            tabla.setVisible(true);
            tabla.mostrar(libroB);
        }
    }//GEN-LAST:event_btnBuscarAvanzadoActionPerformed

    private void btn_editar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_libroActionPerformed
        try {
            if (indice_modificar != -1) {

                String genero = jfmLibros.libros.get(indice_modificar).getGenero();
                String estado = jfmLibros.libros.get(indice_modificar).getEstadoMaterial();

                txt_ME_Autor.setText("" + jfmLibros.libros.get(indice_modificar).getAutor());
                txt_ME_ISBN.setText("" + jfmLibros.libros.get(indice_modificar).getCodigoISBN());
                txt_ME_Editorial.setText("" + jfmLibros.libros.get(indice_modificar).getEditorial());
                txt_ME_titulo.setText("" + jfmLibros.libros.get(indice_modificar).getTitulo());
                txt_ME_Unidad.setText("" + jfmLibros.libros.get(indice_modificar).getCodigoUnidad());
                txt_ME_DEWEY.setText("" + jfmLibros.libros.get(indice_modificar).getClasificacionDEWEY());

                //<editor-fold defaultstate="collapsed" desc="aqui puse l afecha a modificar">
                String s[] = jfmLibros.libros.get(indice_modificar).getFechaPublicacion().split("/");
                dd2.setText(s[0]);
                mm2.setText(s[1]);
                yy2.setText(s[2]);

                //</editor-fold>
                for (int i = 0; i < 4; i++) {
                    if (cmb_ME_Estado.getItemAt(i).equals(estado)) {

                        cmb_ME_Estado.setSelectedIndex(i);
                        break;
                    }
                }

                for (int i = 0; i < 22; i++) {
                    if (cmb_ME_Genero.getItemAt(i).toString().equals(genero)) {
                        cmb_ME_Genero.setSelectedIndex(i);
                        break;
                    }
                }
                btn_editar_libro.setEnabled(false);
                btn_guardar_libro.setEnabled(true);
                btn_eliminar.setEnabled(false);
                txt_buscar_ME.setEnabled(false);
                tabla_editar_eliminar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "primero elija un usuario de la tabla");
            }

        } catch (HeadlessException headlessException) {
            System.out.println("ERROR " + headlessException);
        }

    }//GEN-LAST:event_btn_editar_libroActionPerformed

    private void btn_guardar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_libroActionPerformed
        try {
            if (indice_modificar != -1) {

                Calendar cal = Calendar.getInstance();
                int ano_actual = cal.get(Calendar.YEAR);

                int dia = inteador(dd2.getText().replace(" ", ""));
                int mes = inteador(mm2.getText().replace(" ", ""));
                int ano = inteador(yy2.getText().replace(" ", ""));

                String estado = cmb_Estado.getSelectedItem().toString();
                String genero = cmb_ME_Genero.getSelectedItem().toString();
                String fecha = dia + "/" + mes + "/" + ano;

                if (!(txt_ME_DEWEY.getText().equals("") || txt_ME_titulo.getText().equals("")
                        || txt_ME_Editorial.getText().equals("") || txt_ME_ISBN.getText().equals("")
                        || txt_ME_Autor.getText().equals("") || genero.equals("Seleccione un género")
                        || txt_ME_Unidad.getText().equals("")
                        || fecha.length() > 10 || fecha.length() < 6 || dia > 32 || dia < 0 || mes >= 13
                        || mes <= 0 || ano > ano_actual)) {

                    jfmLibros.libros.get(indice_modificar).setAutor(txt_ME_Autor.getText());
                    jfmLibros.libros.get(indice_modificar).setCodigoISBN(txt_ME_ISBN.getText());
                    jfmLibros.libros.get(indice_modificar).setFechaPublicacion(fecha);
                    jfmLibros.libros.get(indice_modificar).setGenero(genero);
                    jfmLibros.libros.get(indice_modificar).setClasificacionDEWEY(txt_ME_DEWEY.getText());
                    jfmLibros.libros.get(indice_modificar).setEditorial(txt_ME_Editorial.getText());
                    jfmLibros.libros.get(indice_modificar).setEstadoMaterial(estado);
                    jfmLibros.libros.get(indice_modificar).setTitulo(txt_ME_titulo.getText());

                    txt_ME_DEWEY.setText("");
                    txt_ME_titulo.setText("");
                    txt_ME_Editorial.setText("");
                    txt_ME_ISBN.setText("");
                    txt_ME_Autor.setText("");
                    txt_ME_Unidad.setText("");
                    yy2.setText("");
                    dd2.setText("");
                    mm2.setText("");

                    cmb_ME_Genero.setSelectedIndex(0);
                    cmb_ME_Estado.setSelectedIndex(0);

                    btn_guardar_libro.setEnabled(false);
                    btn_editar_libro.setEnabled(true);
                    btn_eliminar.setEnabled(true);

                    txt_buscar_ME.setEnabled(true);

                    cargar_tabla_buscar();
                    cargar_tabla_Mod_Elim();
                    No_estructuras.escribir_Libros();
                    indice_modificar = -1;
                } else {
                    JOptionPane.showMessageDialog(null, "todos los espacios deben estar completados correctamente");
                }

            } else {
                JOptionPane.showMessageDialog(null, "elige primero un elemento de la tabla");
            }

        } catch (HeadlessException e) {
            System.out.println("" + e);
        }

    }//GEN-LAST:event_btn_guardar_libroActionPerformed

    private void txt_buscar_MEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_MEKeyReleased

        String r = txt_buscar_ME.getText();
        txt_buscar_ME.setText(r);
        repaint();
        filtro_ME.setRowFilter(javax.swing.RowFilter.regexFilter(txt_buscar_ME.getText()));


    }//GEN-LAST:event_txt_buscar_MEKeyReleased

    private void tabla_editar_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_editar_eliminarMouseClicked
        try {
            tabla_editar_eliminar.setRowSelectionAllowed(true);

            int i = tabla_editar_eliminar.getSelectedRow();
            indice_modificar = i;

            criterio_eliminar = tabla_editar_eliminar.getValueAt(i, 1).toString();
            System.out.println("criterio eliminar " + criterio_eliminar);

        } catch (Exception err) {
            System.out.println("ERROR" + err);
        }
    }//GEN-LAST:event_tabla_editar_eliminarMouseClicked

    private void txt_buscar_basicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_basicoKeyReleased
        //rowfilter
        String f = txt_buscar_basico.getText();
        txt_buscar_basico.setText(f);
        repaint();
        filtro_buscar.setRowFilter(javax.swing.RowFilter.regexFilter(txt_buscar_basico.getText()));
    }//GEN-LAST:event_txt_buscar_basicoKeyReleased

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        if (indice_modificar == -1) {

        } else {

            for (int i = 0; i < jfmLibros.libros.size(); i++) {
                if (criterio_eliminar.equals(jfmLibros.libros.get(i).getCodigoUnidad())) {
                    jfmLibros.libros.remove(i);
                }
            }

            cargar_tabla_buscar();
            cargar_tabla_Mod_Elim();
            No_estructuras.escribir_Libros();
            indice_modificar = -1;
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void cargar_memoria_pruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar_memoria_pruebaActionPerformed

        String estado = cmb_Estado.getSelectedItem().toString();

        Libro libroNuevo = new Libro("242", null, null, null, true, "java for dummies",
                "kojima productios ", "244332",
                "kojima", "12/1/2018", "Policial",
                estado, "001");

        Libro libroNuevo1 = new Libro("112", null, null, null, true, "pocajontas",
                "Dysney ", "244332",
                "walter", "12/1/2018", "Aventura",
                estado, "002");

        Libro libroNuevo2 = new Libro("233", null, null, null, true, "Chicago a LA",
                "LA libros", "244332",
                "Eddie rock", "12/1/2018", "Policial",
                estado, "003");

        libros.add(libroNuevo);
        libros.add(libroNuevo1);
        libros.add(libroNuevo2);

        cargar_tabla_buscar();
        cargar_tabla_Mod_Elim();
        No_estructuras.escribir_Libros();
    }//GEN-LAST:event_cargar_memoria_pruebaActionPerformed

    private void actualizar_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_tablaActionPerformed

        cargar_tabla_buscar();
        cargar_tabla_Mod_Elim();
    }//GEN-LAST:event_actualizar_tablaActionPerformed

    private void cmbBuscaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscaGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBuscaGActionPerformed

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
            java.util.logging.Logger.getLogger(jfmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            new jfmLibros().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_tabla;
    private javax.swing.JButton btnBuscarAvanzado;
    private javax.swing.JButton btn_Registrar_libro;
    private javax.swing.JButton btn_editar_libro;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar_libro;
    private javax.swing.JButton cargar_memoria_prueba;
    private javax.swing.JComboBox<String> cmbBuscaG;
    private javax.swing.JComboBox<String> cmb_Estado;
    private javax.swing.JComboBox<String> cmb_Genero;
    private javax.swing.JComboBox<String> cmb_ME_Estado;
    private javax.swing.JComboBox<String> cmb_ME_Genero;
    private javax.swing.JTextField dd;
    private javax.swing.JTextField dd2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField mm;
    private javax.swing.JTextField mm2;
    private javax.swing.JTable tabla_busqueda;
    private javax.swing.JTable tabla_editar_eliminar;
    private javax.swing.JTextField txtAutorAvanzada;
    private javax.swing.JTextField txtEditorialAvanzada;
    private javax.swing.JTextField txtFechaAvanzada;
    private javax.swing.JTextField txtTituloAvanzada;
    private javax.swing.JTextField txt_ME_Autor;
    private javax.swing.JTextField txt_ME_DEWEY;
    private javax.swing.JTextField txt_ME_Editorial;
    private javax.swing.JTextField txt_ME_ISBN;
    private javax.swing.JTextField txt_ME_Unidad;
    private javax.swing.JTextField txt_ME_titulo;
    private javax.swing.JTextField txt_buscar_ME;
    private javax.swing.JTextField txt_buscar_basico;
    private javax.swing.JTextField txt_crear_Autor;
    private javax.swing.JTextField txt_crear_DEWEY;
    private javax.swing.JTextField txt_crear_Editorial;
    private javax.swing.JTextField txt_crear_ISBN;
    private javax.swing.JTextField txt_crear_Titulo;
    private javax.swing.JTextField txt_crear_Unidad;
    private javax.swing.JTextField yy;
    private javax.swing.JTextField yy2;
    // End of variables declaration//GEN-END:variables
}
