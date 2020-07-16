/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_estructuras;


import com.sun.media.sound.ModelOscillator;
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
import java.util.Calendar;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;




/**
 *
 * @author Rebeca
 */
public class jfmRevista extends javax.swing.JFrame {
    static ArrayList<Revista> revistaLista = new ArrayList<Revista>();
    

    private TableRowSorter trsfiltro;
    private TableRowSorter trsfiltro2;
    
      boolean seguir=false;
     

//    int i =0;
    int p = 0;
    
    
    //Esto es para modificar y eliminar datos
    String titulo = "";
    String autor = "";
    String codigoISBN = "";
    String codigoUnidad = "";

    String editorial = "";
    String fecha = "";
    String genero = "";
    String descripcion = "";
    String estado = "";

    
    public jfmRevista() {

//        No_estructuras.escribirRevistaMemoria();
        No_estructuras.cargarColaRevistaMemoria();
        initComponents();
        mostrarJTable();
        mostrarJTableModficar();
        System.out.println("s"+revistaLista.toString());
        

        
        
         
        
        //codigo para eliminar OBLIGATORIO
        jTable2.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();
            
            
            public void mouseClicked(MouseEvent e){
                int z = jTable2.getSelectedRow();
                titulo=(jTable2.getValueAt(z, 0).toString());
                autor=(jTable2.getValueAt(z, 1).toString());
                codigoUnidad=(jTable2.getValueAt(z, 2).toString());
//                codigoUnidad=(jTable1.getValueAt(z, 3).toString());
                editorial=(jTable2.getValueAt(z, 3).toString());
                fecha=(jTable2.getValueAt(z, 5).toString());
//                descripcion=(jTable1.getValueAt(z, 3).toString());
                estado=(jTable2.getValueAt(z, 6).toString());
                
            }
                    
});
    }
    

    



    public void filtroBuscar() {
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtBuscarRevista.getText(), 1, 0, 2));
        
    }
    public void filtroModificar() {
        trsfiltro2.setRowFilter(RowFilter.regexFilter(txtBuscarModificar.getText(), 1, 0, 2));

    }
    

    

    

        


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCodigoUnidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        cbxGenro = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtEstadoMaterial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoISBN = new javax.swing.JTextField();
        btnCofirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtBuscarRevista = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtModTitulo = new javax.swing.JTextField();
        txtModAutor = new javax.swing.JTextField();
        txtModCodISBN = new javax.swing.JTextField();
        txtModCodigoUni = new javax.swing.JTextField();
        txtModEditorial = new javax.swing.JTextField();
        txtModFecha = new javax.swing.JTextField();
        txtModDescripcion = new javax.swing.JTextField();
        txtModEstado = new javax.swing.JTextField();
        cbxModGenero = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txtBuscarModificar = new javax.swing.JTextField();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Titulo de revista");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Codigo Unidad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Autor");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Editorial");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Genero");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fecha publicacion");

        txtAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEditorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCodigoUnidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Descripcion");

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbxGenro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxGenro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informativas", "Especializadas", "Entretenimiento", "Cientificas", "Otros", " " }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Estado Material");

        txtEstadoMaterial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Codigo ISSN");

        txtCodigoISBN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigoISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoISBNActionPerformed(evt);
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
                        .addComponent(jLabel3)
                        .addGap(106, 106, 106)
                        .addComponent(txtAutor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbxGenro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodigoISBN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodigoUnidad)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtFecha)
                                        .addGap(1, 1, 1))
                                    .addComponent(txtDescripcion)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)
                                .addComponent(txtTitulo))
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30)
                                .addComponent(txtEstadoMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodigoISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxGenro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEstadoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        btnCofirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCofirmar.setText("Confirmar");
        btnCofirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCofirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(btnCofirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCofirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingresar Revista", jPanel1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Buscar Revista por Titulo/Autor/CodigoISSN");

        txtBuscarRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarRevistaActionPerformed(evt);
            }
        });
        txtBuscarRevista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarRevistaKeyTyped(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Codigo ISSN", "Editorial", "Genero", "Fecha Publicacion", "Estado Material"
            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(193, 193, 193))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar Revista", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Datos"));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Titulo Revista");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Autor");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Codigo ISSN ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Codigo Unidad");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Editorial");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Genero");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Fecha Publicidad");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Descripcion");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Estado Material");

        txtModTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModCodISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModCodigoUni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModEditorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxModGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxModGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informativas", "Especializadas", "Entretenimiento", "Cientificas", "Otros" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(12, 12, 12)
                        .addComponent(txtModEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(txtModCodISBN))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtModTitulo)
                                .addComponent(txtModAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtModCodigoUni, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtModEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxModGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModFecha)
                            .addComponent(txtModDescripcion))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(txtModTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(txtModAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxModGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(txtModCodISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19)
                            .addComponent(txtModCodigoUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtModEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtModDescripcion))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setText("Terminar modificacion");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Codigo ISSN", "Editorial", "Genero", "Fecha Publicacion", "Estado Material"
            }
        ));
        jTable2.setRowHeight(30);
        jScrollPane1.setViewportView(jTable2);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Buscar Revista por Titulo/Autor/CodigoISBN");

        txtBuscarModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarModificarActionPerformed(evt);
            }
        });
        txtBuscarModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarModificarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(121, 121, 121))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtBuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Modificar Revista", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void btnCofirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCofirmarActionPerformed
        try {
       Revista revista = new Revista(txtDescripcion.getText(), null, null, null, true,txtTitulo.getText(), txtEditorial.getText(), txtCodigoISBN.getText(), txtAutor.getText(), txtFecha.getText(), cbxGenro.getSelectedItem().toString(), txtEditorial.getText(), txtCodigoUnidad.getText());
            if (!codigo_unidad_existente(revista.getCodigoUnidad())) {

                if (txtDescripcion.getText().equals("") || txtTitulo.getText().equals("") || txtEditorial.getText().equals("") || txtCodigoISBN.getText().equals("") || txtAutor.getText().equals("") || txtFecha.getText().equals("") || cbxGenro.getSelectedItem().toString().equals("")|| txtEditorial.getText().equals("") || txtCodigoUnidad.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Se debe completar todos los espacios");

                } else {

                     revistaLista.add(revista);

                    No_estructuras.escribirRevistaMemoria();
                    vaciar();

                    mostrarJTable();
                    mostrarJTableModficar();
                    revistaLista.get(p).setDisponibilidad(true);
                    JOptionPane.showMessageDialog(null, "revista guardado exitosamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ese codigo de unidad ya existe porfavor cambielo");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Se debe completar todos los espacios");}
    }//GEN-LAST:event_btnCofirmarActionPerformed

    public boolean codigo_unidad_existente(String cod_unidad) {

        for (int i = 0; i < jfmRevista.revistaLista.size(); i++) {
            if (jfmRevista.revistaLista.get(i).getCodigoUnidad().equals(cod_unidad)) {
                System.out.println("kk");
                return true;
            }
        }
        return false;
    }

    private void txtCodigoISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoISBNActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtModTitulo.setText(titulo);
        txtModAutor.setText(autor);
        txtModCodISBN.setText(codigoISBN);
        txtModCodigoUni.setText(codigoUnidad);
        txtModEditorial.setText(editorial);
        txtModFecha.setText(fecha);
        txtModDescripcion.setText(descripcion);
        txtModEstado.setText(estado);
        
        for (int i = 0; i < 5; i++) {
            if (cbxModGenero.getItemAt(i).toString().equals(genero)) {
                cbxModGenero.setSelectedIndex(i);
                break;
            }
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtBuscarRevistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRevistaKeyTyped
        //BUSQUEDA DE REVISTA
        txtBuscarRevista.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscarRevista.getText());
                txtBuscarRevista.setText(cadena);
                repaint();
                filtroBuscar();
            }
        });
        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtBuscarRevistaKeyTyped

    private void txtBuscarModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarModificarKeyTyped
        txtBuscarModificar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscarModificar.getText());
                txtBuscarModificar.setText(cadena);
                repaint();
                filtroModificar();
            }
        });
        trsfiltro2 = new TableRowSorter(jTable2.getModel());
        jTable2.setRowSorter(trsfiltro2);
    }//GEN-LAST:event_txtBuscarModificarKeyTyped

    private void txtBuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                String genero = cbxModGenero.getSelectedItem().toString();
        if (txtModDescripcion.getText().equals("")||txtModTitulo.getText().equals("")|| txtModEditorial.getText().equals("")||txtModCodISBN.getText().equals("")|| txtModAutor.getText().equals("")|| txtModFecha.getText().equals("")|| cbxModGenero.getSelectedItem().toString().equals("")|| txtModEditorial.getText().equals("")|| txtModCodigoUni.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Se debe completar todos los espacios");
        
        } else {
            for (int j = 0; j < revistaLista.size(); j++) {
                if (txtModCodISBN.getText().equals(revistaLista.get(j).getCodigoISBN())) {
                    revistaLista.get(j).setTitulo(txtModTitulo.getText());
                    revistaLista.get(j).setAutor(txtModAutor.getText());
                    revistaLista.get(j).setCodigoUnidad(txtModCodigoUni.getText());
                    revistaLista.get(j).setCodigoISBN(txtModCodISBN.getText());
                    revistaLista.get(j).setFechaPublicacion(txtModFecha.getText());
                    revistaLista.get(j).setEditorial(txtModEditorial.getText());
                    revistaLista.get(j).setEstadoMaterial(txtModEstado.getText());  
                    revistaLista.get(j).setDescripcion(txtModDescripcion.getText());
                    revistaLista.get(j).setGenero(genero);
                    JOptionPane.showMessageDialog(null, "Se modifico los datos correctamente");
                    break;
                } 

            }
            
            
            mostrarJTableModficar();
            mostrarJTable();
           No_estructuras.escribirRevistaMemoria();
            txtModTitulo.setText("");
            txtModAutor.setText("");
            txtModCodigoUni.setText("");
            txtModCodISBN.setText("");
            txtModFecha.setText("");
            txtModEditorial.setText("");
            txtModEstado.setText("");
            txtModDescripcion.setText("");

        }
        

 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarRevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarRevistaActionPerformed
        

    
    public void vaciar(){
        txtTitulo.setText("");
        txtCodigoUnidad.setText("");
        txtAutor.setText("");
        txtFecha.setText("");
        txtEditorial.setText("");
        txtEstadoMaterial.setText("");
        txtDescripcion.setText("");
        txtCodigoISBN.setText("");

        
    }
   


    
    public void mostrarJTable(){

        
        String matriz[][] = new String [revistaLista.size()][7]; 
    
        for(int p = 0; p<revistaLista.size();p++){

           Collections.sort(revistaLista, new OrdenarRevista()); 
          matriz[p][0]=revistaLista.get(p).getTitulo();
          matriz[p][1]=revistaLista.get(p).getAutor();
          matriz[p][2]=revistaLista.get(p).getCodigoUnidad();
          matriz[p][3]=revistaLista.get(p).getEditorial();
          matriz[p][4]=revistaLista.get(p).getGenero();
          matriz[p][5]=revistaLista.get(p).getFechaPublicacion();
          matriz[p][6]=revistaLista.get(p).getEstadoMaterial();
          
          
            
        }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Titulo", "Autor", "Codigo Unidad", "Editorial", "Genero", "Fecha Publicacion", "Estado Material"
            }
                    
                    
        ));

    }
    
    public void mostrarJTableModficar(){
        String matriz[][] = new String [revistaLista.size()][7]; 
        for(int p = 0; p<revistaLista.size();p++){
          matriz[p][0]=revistaLista.get(p).getTitulo();
          matriz[p][1]=revistaLista.get(p).getAutor();
          matriz[p][2]=revistaLista.get(p).getCodigoUnidad();
          matriz[p][3]=revistaLista.get(p).getEditorial();
          matriz[p][4]=revistaLista.get(p).getGenero();
          matriz[p][5]=revistaLista.get(p).getFechaPublicacion();
          matriz[p][6]=revistaLista.get(p).getEstadoMaterial();
            
        }

            
            jTable2.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Titulo", "Autor", "Codigo Unidad", "Editorial", "Genero", "Fecha Publicacion", "Estado Material"
            }
        ));
    }
    

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCofirmar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxGenro;
    private javax.swing.JComboBox<String> cbxModGenero;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscarModificar;
    private javax.swing.JTextField txtBuscarRevista;
    private javax.swing.JTextField txtCodigoISBN;
    private javax.swing.JTextField txtCodigoUnidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEstadoMaterial;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtModAutor;
    private javax.swing.JTextField txtModCodISBN;
    private javax.swing.JTextField txtModCodigoUni;
    private javax.swing.JTextField txtModDescripcion;
    private javax.swing.JTextField txtModEditorial;
    private javax.swing.JTextField txtModEstado;
    private javax.swing.JTextField txtModFecha;
    private javax.swing.JTextField txtModTitulo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
