package no_estructuras;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

public class jfmLibrosCLIENTE extends javax.swing.JFrame {

    static ArrayList<Libro> libros = new ArrayList<>();
    TableRowSorter filtro_buscar;
    TableRowSorter filtro_ME;

    int indice_modificar = -1;
    String criterio_eliminar = "";

    ///////////////ME significa modificar e eliminar
    public jfmLibrosCLIENTE() {
        initComponents();
        recibir();
        cargar_tabla_buscar();
    }

    public void recibir() {
        try {
            Socket s = new Socket("192.168.100.11", 5000);
            ObjectInputStream entra = new ObjectInputStream(s.getInputStream());
            libros = (ArrayList<Libro>) entra.readObject();
            s.close();

        } catch (IOException ex) {
            Logger.getLogger(jfmLibrosCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public int inteador(String d) {
        return Integer.parseInt(d);
    }

    public void cargar_tabla_buscar() {
        String matriz[][] = new String[jfmLibrosCLIENTE.libros.size() + 1][5];
        for (int i = 0; i < jfmLibrosCLIENTE.libros.size(); i++) {
            matriz[i][0] = jfmLibrosCLIENTE.libros.get(i).getTitulo();
            matriz[i][1] = jfmLibrosCLIENTE.libros.get(i).getAutor();
            matriz[i][2] = jfmLibrosCLIENTE.libros.get(i).getGenero();
            matriz[i][3] = jfmLibrosCLIENTE.libros.get(i).getClasificacionDEWEY();
            matriz[i][4] = jfmLibrosCLIENTE.libros.get(i).getCodigoUnidad();

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
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_buscar_basico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_busqueda = new javax.swing.JTable();
        btnActu = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );

        jLabel11.getAccessibleContext().setAccessibleName("Escriba una palabra relacionada\na la búsqueda");

        btnActu.setText("Actualizar");
        btnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnActu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActu)
                .addGap(0, 14, Short.MAX_VALUE))
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
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAvanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAvanzadoActionPerformed
        recibir();
        MostrarJTableCLIENTE tabla = new MostrarJTableCLIENTE();
        String genero = cmbBuscaG.getSelectedItem().toString();
        ArrayList<Libro> libroB = new ArrayList();
        for (int i = 0; i < jfmLibrosCLIENTE.libros.size(); i++) {
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
        } else {
            tabla.setVisible(true);
            tabla.mostrar(libroB);
        }
    }//GEN-LAST:event_btnBuscarAvanzadoActionPerformed

    private void cmbBuscaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscaGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBuscaGActionPerformed

    private void txt_buscar_basicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_basicoKeyReleased
        //rowfilter
        String f = txt_buscar_basico.getText();
        txt_buscar_basico.setText(f);
        repaint();
        filtro_buscar.setRowFilter(javax.swing.RowFilter.regexFilter(txt_buscar_basico.getText()));
    }//GEN-LAST:event_txt_buscar_basicoKeyReleased

    private void btnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuActionPerformed
        recibir();
        cargar_tabla_buscar();
    }//GEN-LAST:event_btnActuActionPerformed

    public boolean codigo_unidad_existente(String cod_unidad) {

        for (int i = 0; i < jfmLibrosCLIENTE.libros.size(); i++) {
            if (jfmLibrosCLIENTE.libros.get(i).getCodigoUnidad().equals(cod_unidad)) {
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
            java.util.logging.Logger.getLogger(jfmLibrosCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmLibrosCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmLibrosCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmLibrosCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new jfmLibrosCLIENTE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActu;
    private javax.swing.JButton btnBuscarAvanzado;
    private javax.swing.JComboBox<String> cmbBuscaG;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tabla_busqueda;
    private javax.swing.JTextField txtAutorAvanzada;
    private javax.swing.JTextField txtEditorialAvanzada;
    private javax.swing.JTextField txtFechaAvanzada;
    private javax.swing.JTextField txtTituloAvanzada;
    private javax.swing.JTextField txt_buscar_basico;
    // End of variables declaration//GEN-END:variables
}
