/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package refaccionariajpsql;

import java.sql.*;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erika Rubi
 */
public class RefaccionariaForm extends javax.swing.JFrame {

    Conexion con = new Conexion();
    java.sql.Statement st = null;
    static int tipo;

    ResultSet resultado = null;
    Connection conex = null;
    private String auxidVehiculo;
    private String auxidCategoria;
    private String auxidPersona;
    private String auxidProveedor;
    private String auxidRefaccion;
    private String auxidEmpleado;
    private String auxidVenta;
    private String auxidDetalleVenta;
    private String auxidCompra;
    private String auxidDetalleCompra;
    private String auxidDetalleventa;
    private ResultSet rs;
    private String qry;
    private String opCbxPerProv;
    private String opCBPerEmp;
    private String opCBCat;
    private String opCBVeh;
    private String opCbxProveCompra;
    private String opCbxRefaDC;
    private String opCbxIdDC;
    private String opCBEmpVent;
    private String CBempleado;
    private String opCBEstado;
    //private String opVentaDV;
    //private String opRefaccionDV;
    private String part1;
    private String fechaCompra;

    public RefaccionariaForm(int tipo) {
        initComponents();
        this.setTitle("Refaccionaria");
        conex = con.Conecta();
        switch (tipo) {
            case 1:
                //JOptionPane.showMessageDialog(null, "Usuario 1");
                //jTabbedPane1.setEnabledAt(1, false);
                
                break;

            case 2:
                jTabbedPane1.setEnabledAt(0, false);
                jTabbedPane1.setEnabledAt(1, false);
                jTabbedPane1.setEnabledAt(2, false);
                jTabbedPane1.setEnabledAt(3, false);
                jTabbedPane1.setEnabledAt(4, false);
                jTabbedPane1.setEnabledAt(5, false);
                jTabbedPane1.setEnabledAt(6, false);
                jTabbedPane1.setEnabledAt(7, false);
                jTabbedPane1.setEnabledAt(9, false);
                jTabbedPane1.setEnabledAt(11, false);
                break;

            case 3:
                //JOptionPane.showMessageDialog(null, "Usuario 3");
                jTabbedPane1.setEnabledAt(0, false);
                jTabbedPane1.setEnabledAt(1, false);
                jTabbedPane1.setEnabledAt(5, false);
                jTabbedPane1.setEnabledAt(8, false);
                jTabbedPane1.setEnabledAt(9, false);
                jTabbedPane1.setEnabledAt(10, false);
                jTabbedPane1.setEnabledAt(11, false);
                
                break;
        }

        recarga();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();
        btnAgreVeh = new javax.swing.JButton();
        btnModVeh = new javax.swing.JButton();
        btnElimVeh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCategoria = new javax.swing.JTable();
        btnAgreCat = new javax.swing.JButton();
        btnModCat = new javax.swing.JButton();
        btnElimCat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombrePersona = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAgrePersona = new javax.swing.JButton();
        btnModPersona = new javax.swing.JButton();
        btnElimPersona = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        cbxEmplePersona = new javax.swing.JComboBox<>();
        cbxRol = new javax.swing.JComboBox<>();
        jDateEmpleado = new com.toedter.calendar.JDateChooser();
        btnAgregaEmpleado = new javax.swing.JButton();
        btnEliminaEmpleado = new javax.swing.JButton();
        btnModiEmpleado = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cbxProvPersona = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtGiro = new javax.swing.JTextField();
        txtGerente = new javax.swing.JTextField();
        btnAgreProveedor = new javax.swing.JButton();
        btnModiProveedor = new javax.swing.JButton();
        btnElimProveedor = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablaRefaccion = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        cbVehiculo = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        nomRefaccion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDescRefa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        btnagregarefaccion = new javax.swing.JButton();
        btneliminarefaccion = new javax.swing.JButton();
        btnmodificarefaccion = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbxProveCompra = new javax.swing.JComboBox<>();
        jdcCompra = new com.toedter.calendar.JDateChooser();
        btnAgregaCompra = new javax.swing.JButton();
        btnModCompra = new javax.swing.JButton();
        btnElimCompra = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnAgegaDetalleCompra = new javax.swing.JButton();
        btnModificaDC = new javax.swing.JButton();
        btnEliminaDC = new javax.swing.JButton();
        cbxRefaDC = new javax.swing.JComboBox<>();
        cbxIdCompraDC = new javax.swing.JComboBox<>();
        txtCantDC = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaDetalleCompra = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbEmpleado = new javax.swing.JComboBox<>();
        btnAgregaVenta = new javax.swing.JButton();
        btnModificaVenta = new javax.swing.JButton();
        btnEliminaVenta = new javax.swing.JButton();
        CBestadoventa = new javax.swing.JComboBox<>();
        jDateVenta = new com.toedter.calendar.JDateChooser();
        jScrollPane9 = new javax.swing.JScrollPane();
        Tablaventa = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        CBrefacciondtv = new javax.swing.JComboBox<>();
        CBventadtv = new javax.swing.JComboBox<>();
        txtCantidaddtv = new javax.swing.JTextField();
        txtDescuentodtv = new javax.swing.JTextField();
        btnAgregaDV = new javax.swing.JButton();
        btnModificaDV = new javax.swing.JButton();
        btnEliminaDV = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        Tabladetalleventa = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        consulta1 = new javax.swing.JTable();
        consultaEmpleado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaConsulta2 = new javax.swing.JTable();
        cBcategorias = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        condicion = new javax.swing.JComboBox<>();
        cantidadStock = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTabbedPane1PropertyChange(evt);
            }
        });

        jButton3.setText("Cerrar Sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cerrar Sesión", jPanel12);

        jLabel1.setText("Número de Serie");

        jLabel2.setText("Año");

        jLabel3.setText("Marca");

        jLabel4.setText("Descripción");

        jLabel5.setText("Modelo");

        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVehiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVehiculo);

        btnAgreVeh.setText("Agregar");
        btnAgreVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreVehActionPerformed(evt);
            }
        });

        btnModVeh.setText("Modificar");
        btnModVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVehActionPerformed(evt);
            }
        });

        btnElimVeh.setText("Eliminar");
        btnElimVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimVehActionPerformed(evt);
            }
        });

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane2.setViewportView(txtDesc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnModVeh, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(btnAgreVeh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnElimVeh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAgreVeh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModVeh)
                        .addGap(11, 11, 11)
                        .addComponent(btnElimVeh))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehículo", jPanel1);

        jLabel6.setText("Nombre categoria");

        tablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCategoria);

        btnAgreCat.setText("Agregar");
        btnAgreCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreCatActionPerformed(evt);
            }
        });

        btnModCat.setText("Modificar");
        btnModCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCatActionPerformed(evt);
            }
        });

        btnElimCat.setText("Eliminar");
        btnElimCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModCat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgreCat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnElimCat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnAgreCat)
                        .addGap(11, 11, 11)
                        .addComponent(btnModCat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnElimCat)))
                .addContainerGap(307, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Categoría", jPanel2);

        jLabel7.setText("RFC");

        jLabel8.setText("Nombre");

        jLabel9.setText("Correo");

        jLabel10.setText("Teléfono");

        jLabel11.setText("Dirección");

        jLabel12.setText("CP");

        jLabel13.setText("Estado");

        btnAgrePersona.setText("Agregar");
        btnAgrePersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrePersonaActionPerformed(evt);
            }
        });

        btnModPersona.setText("Modificar");
        btnModPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPersonaActionPerformed(evt);
            }
        });

        btnElimPersona.setText("Eliminar");
        btnElimPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimPersonaActionPerformed(evt);
            }
        });

        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tablaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaPersona);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElimPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgrePersona))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElimPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("Persona", jPanel3);

        jLabel14.setText("Persona");

        jLabel15.setText("Rol");

        jLabel16.setText("Fecha de inicio");

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaEmpleado);

        cbxEmplePersona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEmplePersonaItemStateChanged(evt);
            }
        });

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Cajero", "Almacenista", "Gerente" }));
        cbxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolActionPerformed(evt);
            }
        });

        btnAgregaEmpleado.setText("Agregar");
        btnAgregaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaEmpleadoActionPerformed(evt);
            }
        });

        btnEliminaEmpleado.setText("Eliminar");
        btnEliminaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaEmpleadoActionPerformed(evt);
            }
        });

        btnModiEmpleado.setText("Modificar");
        btnModiEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxRol, javax.swing.GroupLayout.Alignment.LEADING, 0, 221, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxEmplePersona, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jDateEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModiEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(btnEliminaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(btnAgregaEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxEmplePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModiEmpleado))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(btnEliminaEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel4);

        jLabel17.setText("Persona");

        cbxProvPersona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProvPersonaItemStateChanged(evt);
            }
        });
        cbxProvPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxProvPersonaMouseClicked(evt);
            }
        });
        cbxProvPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProvPersonaActionPerformed(evt);
            }
        });

        jLabel18.setText("Empresa");

        jLabel19.setText("Giro");

        jLabel20.setText("Gerente");

        btnAgreProveedor.setText("Agregar");
        btnAgreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreProveedorActionPerformed(evt);
            }
        });

        btnModiProveedor.setText("Modificar");
        btnModiProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiProveedorActionPerformed(evt);
            }
        });

        btnElimProveedor.setText("Eliminar");
        btnElimProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimProveedorActionPerformed(evt);
            }
        });

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaProveedor);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txtGiro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(txtGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbxProvPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgreProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModiProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(btnElimProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxProvPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnAgreProveedor)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnModiProveedor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElimProveedor))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedor", jPanel5);

        jLabel41.setText("Categoría");
        jLabel41.setToolTipText("");

        tablaRefaccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaRefaccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRefaccionMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tablaRefaccion);

        jLabel42.setText("Vehículo");

        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });
        cbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCategoriaMouseClicked(evt);
            }
        });

        cbVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbVehiculoItemStateChanged(evt);
            }
        });
        cbVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbVehiculoMouseClicked(evt);
            }
        });

        jLabel43.setText("Nombre");

        nomRefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomRefaccionActionPerformed(evt);
            }
        });

        jLabel21.setText("Descripción");

        jLabel22.setText("Precio de compra");

        btnagregarefaccion.setText("Agregar");
        btnagregarefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarefaccionActionPerformed(evt);
            }
        });

        btneliminarefaccion.setText("Eliminar");
        btneliminarefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarefaccionActionPerformed(evt);
            }
        });

        btnmodificarefaccion.setText("Modificar");
        btnmodificarefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarefaccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel41)
                            .addComponent(nomRefaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbVehiculo, 0, 190, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescRefa)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmodificarefaccion)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btneliminarefaccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnagregarefaccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescRefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregarefaccion))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomRefaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(btneliminarefaccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmodificarefaccion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Refacción", jPanel13);

        jLabel23.setText("Proveedor");

        jLabel24.setText("Fecha");

        cbxProveCompra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProveCompraItemStateChanged(evt);
            }
        });
        cbxProveCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxProveCompraMouseClicked(evt);
            }
        });
        cbxProveCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveCompraActionPerformed(evt);
            }
        });

        jdcCompra.setDateFormatString("dd/MM/yyyy");

        btnAgregaCompra.setText("Agregar");
        btnAgregaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaCompraActionPerformed(evt);
            }
        });

        btnModCompra.setText("Modificar");
        btnModCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCompraActionPerformed(evt);
            }
        });

        btnElimCompra.setText("Eliminar");
        btnElimCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimCompraActionPerformed(evt);
            }
        });

        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCompraMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablaCompra);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(cbxProveCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jdcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnAgregaCompra)
                                .addGap(18, 18, 18)
                                .addComponent(btnModCompra)
                                .addGap(18, 18, 18)
                                .addComponent(btnElimCompra)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregaCompra)
                        .addComponent(btnModCompra)
                        .addComponent(btnElimCompra))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxProveCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Compra", jPanel8);

        jLabel25.setText("Refacción");

        jLabel26.setText("idCompra");

        jLabel27.setText("Cantidad");

        btnAgegaDetalleCompra.setText("Agregar");
        btnAgegaDetalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgegaDetalleCompraActionPerformed(evt);
            }
        });

        btnModificaDC.setText("Modificar");
        btnModificaDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaDCActionPerformed(evt);
            }
        });

        btnEliminaDC.setText("Eliminar");
        btnEliminaDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaDCActionPerformed(evt);
            }
        });

        cbxRefaDC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRefaDCItemStateChanged(evt);
            }
        });

        cbxIdCompraDC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxIdCompraDCItemStateChanged(evt);
            }
        });

        tablaDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaDetalleCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDetalleCompraMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablaDetalleCompra);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxIdCompraDC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxRefaDC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtCantDC, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnAgegaDetalleCompra)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificaDC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminaDC, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxRefaDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgegaDetalleCompra)
                    .addComponent(btnModificaDC)
                    .addComponent(btnEliminaDC)
                    .addComponent(cbxIdCompraDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DetalleCompra", jPanel9);

        jLabel28.setText("Empleado");

        jLabel29.setText("Fecha");

        jLabel30.setText("Estado de venta");

        cbEmpleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEmpleadoItemStateChanged(evt);
            }
        });

        btnAgregaVenta.setText("Agregar");
        btnAgregaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaVentaActionPerformed(evt);
            }
        });

        btnModificaVenta.setText("Modificar");
        btnModificaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaVentaActionPerformed(evt);
            }
        });

        btnEliminaVenta.setText("Eliminar");
        btnEliminaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaVentaActionPerformed(evt);
            }
        });

        CBestadoventa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finalizada", "En espera", "Cancelada" }));
        CBestadoventa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBestadoventaItemStateChanged(evt);
            }
        });

        Tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tablaventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaventaMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(Tablaventa);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jDateVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(CBestadoventa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregaVenta)
                        .addGap(11, 11, 11)
                        .addComponent(btnModificaVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminaVenta))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBestadoventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Venta", jPanel6);

        jLabel31.setText("Refacción");

        jLabel32.setText("Venta");

        jLabel33.setText("Cantidad");

        jLabel34.setText("Descuento");

        CBrefacciondtv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBrefacciondtvItemStateChanged(evt);
            }
        });

        CBventadtv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBventadtvItemStateChanged(evt);
            }
        });
        CBventadtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBventadtvActionPerformed(evt);
            }
        });

        btnAgregaDV.setText("Agregar");
        btnAgregaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaDVActionPerformed(evt);
            }
        });

        btnModificaDV.setText("Modificar");
        btnModificaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaDVActionPerformed(evt);
            }
        });

        btnEliminaDV.setText("Eliminar");
        btnEliminaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaDVActionPerformed(evt);
            }
        });

        Tabladetalleventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabladetalleventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabladetalleventaMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Tabladetalleventa);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(147, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(CBventadtv, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel31))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBrefacciondtv, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(txtCantidaddtv, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(txtDescuentodtv, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificaDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregaDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminaDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(93, 93, 93))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBrefacciondtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBventadtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidaddtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescuentodtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregaDV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificaDV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminaDV)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DetalledeVenta", jPanel7);

        consulta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(consulta1);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel35.setText("Empleado");

        jLabel36.setText("Mostrar el total de las ventas realizadas de cada empleados y cuantas ventas realizó");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(consultaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1)))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(consultaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Total ventas", jPanel10);

        tablaConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(tablaConsulta2);

        cBcategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        condicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", ">", "<=", ">=", "=" }));

        jLabel37.setText("cantidad");

        jLabel38.setText("condición");

        jLabel39.setText("Categoría");

        jLabel40.setText("Mostrar el stock de las refacciones de la categoría indicada y cuando se cumpla la condición");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(50, 50, 50)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(condicion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(cantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(184, 184, 184))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(condicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualizar stock", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarefaccionActionPerformed
        // TODO add your handling code here:
        llenarTablaRefaccion();
        modificaRefaccion();
    }//GEN-LAST:event_btnmodificarefaccionActionPerformed

    private void btneliminarefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarefaccionActionPerformed
        // TODO add your handling code here:
        llenarTablaRefaccion();
        eliminaRefaccion();
    }//GEN-LAST:event_btneliminarefaccionActionPerformed

    private void btnagregarefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarefaccionActionPerformed
        // TODO add your handling code here:
        llenarTablaRefaccion();
        insertaRefaccion();
    }//GEN-LAST:event_btnagregarefaccionActionPerformed

    private void nomRefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomRefaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomRefaccionActionPerformed

    private void cbVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbVehiculoItemStateChanged
        // TODO add your handling code here:
        opCBVeh = String.valueOf(cbVehiculo.getSelectedItem());

    }//GEN-LAST:event_cbVehiculoItemStateChanged

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        // TODO add your handling code here:
        opCBCat = String.valueOf(cbCategoria.getSelectedItem());
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void tablaRefaccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRefaccionMouseClicked
        // TODO add your handling code here:
        int seleccion = tablaRefaccion.rowAtPoint(evt.getPoint());
        cbVehiculo.setSelectedItem(String.valueOf(tablaRefaccion.getValueAt(seleccion, 1)));
        cbCategoria.setSelectedItem(String.valueOf(tablaRefaccion.getValueAt(seleccion, 2)));
        nomRefaccion.setText(String.valueOf(tablaRefaccion.getValueAt(seleccion, 3)));
        txtDescRefa.setText(String.valueOf(tablaRefaccion.getValueAt(seleccion, 4)));
        txtPrecioCompra.setText(String.valueOf(tablaRefaccion.getValueAt(seleccion, 5)));

        auxidRefaccion = tablaRefaccion.getValueAt(tablaRefaccion.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tablaRefaccionMouseClicked

    private void tablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedorMouseClicked
        int seleccion = tablaProveedor.rowAtPoint(evt.getPoint());

        cbxProvPersona.setSelectedItem(String.valueOf(tablaProveedor.getValueAt(seleccion, 1)));
        txtEmpresa.setText(String.valueOf(tablaProveedor.getValueAt(seleccion, 2)));
        txtGerente.setText(String.valueOf(tablaProveedor.getValueAt(seleccion, 3)));
        txtGiro.setText(String.valueOf(tablaProveedor.getValueAt(seleccion, 4)));

        //auxiliar para obtener el id del Proveedor en la posicion 0 de la columna de la tabla Proveedor
        auxidProveedor = tablaProveedor.getValueAt(tablaProveedor.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tablaProveedorMouseClicked

    private void btnElimProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimProveedorActionPerformed
        llenarTablaProveedor();
        eliminaProveedor();
    }//GEN-LAST:event_btnElimProveedorActionPerformed

    private void btnModiProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiProveedorActionPerformed
        llenarTablaProveedor();
        modificaProveedor();
    }//GEN-LAST:event_btnModiProveedorActionPerformed

    private void btnAgreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreProveedorActionPerformed
        llenarTablaProveedor();
        insertarProveedor();
    }//GEN-LAST:event_btnAgreProveedorActionPerformed

    private void cbxProvPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProvPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProvPersonaActionPerformed

    private void cbxProvPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxProvPersonaMouseClicked

    }//GEN-LAST:event_cbxProvPersonaMouseClicked

    private void cbxProvPersonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProvPersonaItemStateChanged
        opCbxPerProv = String.valueOf(cbxProvPersona.getSelectedItem());
    }//GEN-LAST:event_cbxProvPersonaItemStateChanged

    private void cbxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRolActionPerformed

    private void tablaPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonaMouseClicked
        int seleccion = tablaPersona.rowAtPoint(evt.getPoint());

        txtRFC.setText(String.valueOf(tablaPersona.getValueAt(seleccion, 1)));
        txtNombrePersona.setText(String.valueOf(tablaPersona.getValueAt(seleccion, 2)));
        txtCorreo.setText(String.valueOf(tablaPersona.getValueAt(seleccion, 3)));
        txtTelefono.setText(String.valueOf(tablaPersona.getValueAt(seleccion, 4)));
        txtDireccion.setText(String.valueOf(tablaPersona.getValueAt(seleccion, 5)));
        txtCP.setText(String.valueOf(tablaPersona.getValueAt(seleccion, 6)));
        txtEstado.setText(String.valueOf(tablaPersona.getValueAt(seleccion, 7)));

        //auxiliar para obtener el id de la Persona en la posicion 0 de la columna de la tabla Persona
        auxidPersona = tablaPersona.getValueAt(tablaPersona.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tablaPersonaMouseClicked

    private void btnElimPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimPersonaActionPerformed
        llenarTablaPersona();
        eliminarPersona();
    }//GEN-LAST:event_btnElimPersonaActionPerformed

    private void btnModPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPersonaActionPerformed
        llenarTablaPersona();
        modificarPersona();
    }//GEN-LAST:event_btnModPersonaActionPerformed

    private void btnAgrePersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrePersonaActionPerformed
        llenarTablaPersona();
        insertarPersona();
    }//GEN-LAST:event_btnAgrePersonaActionPerformed

    private void btnElimCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimCatActionPerformed
        llenarTablaCategoria();
        eliminarCategoria();
    }//GEN-LAST:event_btnElimCatActionPerformed

    private void btnModCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCatActionPerformed
        llenarTablaCategoria();
        modificarCategoria();
    }//GEN-LAST:event_btnModCatActionPerformed

    private void btnAgreCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreCatActionPerformed
        llenarTablaCategoria();
        insertarCategoria();
    }//GEN-LAST:event_btnAgreCatActionPerformed

    private void tablaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCategoriaMouseClicked
        int seleccion = tablaCategoria.rowAtPoint(evt.getPoint());
        txtCategoria.setText(String.valueOf(tablaCategoria.getValueAt(seleccion, 1)));

        //auxiliar para obtener el id del Categoria en la posicion 0 de la columna de la tabla Categoria
        auxidCategoria = tablaCategoria.getValueAt(tablaCategoria.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tablaCategoriaMouseClicked

    private void btnElimVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimVehActionPerformed
        llenarTablaVehiculo();
        eliminarVehiculo();
    }//GEN-LAST:event_btnElimVehActionPerformed

    private void btnModVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVehActionPerformed
        llenarTablaVehiculo();
        modificarVehiculo();
    }//GEN-LAST:event_btnModVehActionPerformed

    private void btnAgreVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreVehActionPerformed
        llenarTablaVehiculo();
        insertarVehiculo();
    }//GEN-LAST:event_btnAgreVehActionPerformed

    private void tablaVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVehiculoMouseClicked
        int seleccion = tablaVehiculo.rowAtPoint(evt.getPoint());
        txtNumSerie.setText(String.valueOf(tablaVehiculo.getValueAt(seleccion, 1)));
        txtMarca.setText(String.valueOf(tablaVehiculo.getValueAt(seleccion, 2)));
        txtModelo.setText(String.valueOf(tablaVehiculo.getValueAt(seleccion, 3)));
        txtAnio.setText(String.valueOf(tablaVehiculo.getValueAt(seleccion, 4)));
        txtDesc.setText(String.valueOf(tablaVehiculo.getValueAt(seleccion, 5)));

        //auxiliar para obtener el id del Vehiculo en la posicion 0 de la columna de la tabla Vehiculo
        auxidVehiculo = tablaVehiculo.getValueAt(tablaVehiculo.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tablaVehiculoMouseClicked

    private void cbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCategoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaMouseClicked

    private void cbVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbVehiculoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVehiculoMouseClicked

    private void btnAgregaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaCompraActionPerformed
        llenarTablaCompra();
        agregaCompra();
        recarga();
    }//GEN-LAST:event_btnAgregaCompraActionPerformed

    private void tablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCompraMouseClicked

        //auxiliar para obtener el id de la compra en la posicion 0 de la columna de la tabla Compra
        int seleccion = tablaCompra.rowAtPoint(evt.getPoint());
        cbxProveCompra.setSelectedItem(String.valueOf(tablaCompra.getValueAt(seleccion, 1)));
        auxidCompra = tablaCompra.getValueAt(tablaCompra.getSelectedRow(), 0).toString();

        //System.out.print(seleccion);
        String fechaCompra = String.valueOf(tablaCompra.getValueAt(tablaCompra.getSelectedRow(), 2));
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        try {
            java.util.Date fecha;
            fecha = (java.util.Date) s.parse(fechaCompra);
            jdcCompra.setDate(fecha);

        } catch (ParseException e) {

        }
    }//GEN-LAST:event_tablaCompraMouseClicked

    private void cbxProveCompraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProveCompraItemStateChanged
        opCbxProveCompra = String.valueOf(cbxProveCompra.getSelectedItem());
    }//GEN-LAST:event_cbxProveCompraItemStateChanged

    private void btnModCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCompraActionPerformed
        llenarTablaCompra();
        modificaCompra();
        recarga();
    }//GEN-LAST:event_btnModCompraActionPerformed

    private void cbxProveCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProveCompraActionPerformed

    private void cbxProveCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxProveCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProveCompraMouseClicked

    private void btnElimCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimCompraActionPerformed
        llenarTablaCompra();
        eliminaCompra();
        recarga();
    }//GEN-LAST:event_btnElimCompraActionPerformed

    private void cbxRefaDCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRefaDCItemStateChanged
        opCbxRefaDC = String.valueOf(cbxRefaDC.getSelectedItem());
    }//GEN-LAST:event_cbxRefaDCItemStateChanged

    private void cbxIdCompraDCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxIdCompraDCItemStateChanged
        opCbxIdDC = String.valueOf(cbxIdCompraDC.getSelectedItem());
    }//GEN-LAST:event_cbxIdCompraDCItemStateChanged

    private void btnAgegaDetalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgegaDetalleCompraActionPerformed
        llenarTablaDetalleCompra();
        insertaDetalleCompra();
        recarga();
    }//GEN-LAST:event_btnAgegaDetalleCompraActionPerformed

    private void btnModificaDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaDCActionPerformed
        llenarTablaDetalleCompra();
        modificarDetalleCompra();
        recarga();
    }//GEN-LAST:event_btnModificaDCActionPerformed

    private void tablaDetalleCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetalleCompraMouseClicked
        int seleccion = tablaDetalleCompra.rowAtPoint(evt.getPoint());
        cbxRefaDC.setSelectedItem(String.valueOf(tablaDetalleCompra.getValueAt(seleccion, 1)));
        cbxIdCompraDC.setSelectedItem(String.valueOf(tablaDetalleCompra.getValueAt(seleccion, 2)));
        txtCantDC.setText(String.valueOf(tablaDetalleCompra.getValueAt(seleccion, 3)));

        //auxiliar para obtener el id del Vehiculo en la posicion 0 de la columna de la tabla Vehiculo
        auxidDetalleCompra = tablaDetalleCompra.getValueAt(tablaDetalleCompra.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tablaDetalleCompraMouseClicked

    private void btnEliminaDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaDCActionPerformed
        llenarTablaDetalleCompra();
        eliminarDetalleCompra();
        recarga();
    }//GEN-LAST:event_btnEliminaDCActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        //actualizaCombos();
        try {
            int num = jTabbedPane1.getSelectedIndex();
            if (num != 0) {
                actualizaCombos();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        actualizaCombos();
    }//GEN-LAST:event_formWindowOpened

    private void jTabbedPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1PropertyChange

    private void tablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoMouseClicked
        int seleccion = tablaEmpleado.rowAtPoint(evt.getPoint());

        auxidEmpleado = tablaEmpleado.getValueAt(tablaEmpleado.getSelectedRow(), 0).toString();
        cbxEmplePersona.setSelectedItem(String.valueOf(tablaEmpleado.getValueAt(seleccion, 1)));
        cbxRol.setSelectedItem(String.valueOf(tablaEmpleado.getValueAt(seleccion, 4)));

        String fechaInicioJD = String.valueOf(tablaEmpleado.getValueAt(tablaEmpleado.getSelectedRow(), 2));
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        try {
            java.util.Date fecha;
            fecha = (java.util.Date) s.parse(fechaInicioJD);
            jDateEmpleado.setDate(fecha);

        } catch (ParseException e) {

        }
    }//GEN-LAST:event_tablaEmpleadoMouseClicked

    private void cbxEmplePersonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEmplePersonaItemStateChanged
        opCBPerEmp = String.valueOf(cbxEmplePersona.getSelectedItem());
    }//GEN-LAST:event_cbxEmplePersonaItemStateChanged

    private void btnAgregaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaEmpleadoActionPerformed
        insertarEmpleado();
        llenarTablaEmpleado();
    }//GEN-LAST:event_btnAgregaEmpleadoActionPerformed

    private void btnModiEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiEmpleadoActionPerformed
        modificarEmpleado();
        llenarTablaEmpleado();
    }//GEN-LAST:event_btnModiEmpleadoActionPerformed

    private void btnEliminaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaEmpleadoActionPerformed
        eliminarEmpleado();
        llenarTablaEmpleado();
    }//GEN-LAST:event_btnEliminaEmpleadoActionPerformed

    private void cbEmpleadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEmpleadoItemStateChanged
        opCBEmpVent = String.valueOf(cbEmpleado.getSelectedItem());
    }//GEN-LAST:event_cbEmpleadoItemStateChanged

    private void TablaventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaventaMouseClicked
        int seleccion = Tablaventa.rowAtPoint(evt.getPoint());

        auxidVenta = Tablaventa.getValueAt(Tablaventa.getSelectedRow(), 0).toString();
        cbEmpleado.setSelectedItem(String.valueOf(Tablaventa.getValueAt(seleccion, 1)));
        CBestadoventa.setSelectedItem(String.valueOf(Tablaventa.getValueAt(seleccion, 2)));

        String fechaventa = String.valueOf(Tablaventa.getValueAt(Tablaventa.getSelectedRow(), 3));
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        try {
            java.util.Date fecha;
            fecha = (java.util.Date) s.parse(fechaventa);
            jDateVenta.setDate(fecha);

        } catch (ParseException e) {

        }
    }//GEN-LAST:event_TablaventaMouseClicked

    private void CBestadoventaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBestadoventaItemStateChanged
        opCBEstado = String.valueOf(CBestadoventa.getSelectedItem());
    }//GEN-LAST:event_CBestadoventaItemStateChanged

    private void btnAgregaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaVentaActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = dateFormat.format(jDateVenta.getDate());
        try {

            String scb1 = opCBEmpVent;
            String scb2 = opCBEstado;
            String[] parts = scb1.split("-");
            String part33 = parts[0];
            System.out.print("Conexion realizada");
            st = conex.createStatement();
            String sql = "INSERT INTO AdminRefa.Venta(idempleado,estadoventa,fecha,total)"
                    + "VALUES('" + part33 + "', '" + scb2 + "', '" + str + "', '" + 0 + "')";

            //ResultSet result = st.executeQuery(sql);
            st.execute(sql);
            st.close();
            llenarTablaVenta();
            limpiaTxtsVenta();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnAgregaVentaActionPerformed

    private void btnModificaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaVentaActionPerformed
        try {
            java.util.Date date = new java.util.Date();

            String fechaVenta;
            SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd");
            fechaVenta = f.format(jDateVenta.getDate());

            String scb1 = opCBEmpVent;
            String scb2 = opCBEstado;
            String[] parts = scb1.split("-");
            String part3 = parts[0];
            System.out.print("Conexion realizada");
            String sql3 = "UPDATE AdminRefa.Venta SET  idEmpleado = '" + part3 + "', estadoVenta = '" + scb2 + "',fecha='" + fechaVenta + "' WHERE idVenta = '" + auxidVenta + "'";
            st = conex.createStatement();
            st.execute(sql3);
            st.close();
            llenarTablaVenta();
            limpiaTxtsVenta();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    }//GEN-LAST:event_btnModificaVentaActionPerformed

    private void btnEliminaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaVentaActionPerformed
        try {
            String sql3 = "DELETE FROM AdminRefa.Venta WHERE idVenta = '" + auxidVenta + "'";
            st = conex.createStatement();
            st.execute(sql3);
            st.close();
            llenarTablaVenta();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnEliminaVentaActionPerformed

    private void TabladetalleventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabladetalleventaMouseClicked
        int seleccion = Tabladetalleventa.rowAtPoint(evt.getPoint());
        CBrefacciondtv.setSelectedItem(String.valueOf(Tabladetalleventa.getValueAt(seleccion, 1)));
        CBventadtv.setSelectedItem(String.valueOf(Tabladetalleventa.getValueAt(seleccion, 2)));
        txtCantidaddtv.setText(String.valueOf(Tabladetalleventa.getValueAt(seleccion, 3)));
        txtDescuentodtv.setText(String.valueOf(Tabladetalleventa.getValueAt(seleccion, 4)));
        auxidDetalleventa = Tabladetalleventa.getValueAt(Tabladetalleventa.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_TabladetalleventaMouseClicked

    private void CBventadtvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBventadtvItemStateChanged
        //opVentaDV = String.valueOf(CBventadtv.getSelectedItem());
    }//GEN-LAST:event_CBventadtvItemStateChanged

    private void btnAgregaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaDVActionPerformed
        //agregaDetalleVenta();
        //llenarTablaDetalleVenta();
        try {
            String scb1 = CBrefacciondtv.getSelectedItem().toString();
            String[] parts = scb1.split("-");
            String part2 = parts[0];
            String val = CBventadtv.getSelectedItem().toString();
            System.out.print("Conexion realizada");
            st = conex.createStatement();
            String sql = "INSERT INTO AdminRefa.DetalleVenta(idfrefaccion,idfventa,cantidad,descuento,subtotal)"
                    + "VALUES('" + part2 + "', '" + val + "', '" + txtCantidaddtv.getText() + "', '" + txtDescuentodtv.getText() + "','" + 0 + "')";

            //ResultSet result = st.executeQuery(sql);
            st.execute(sql);
            st.close();
            llenarTablaDetalleVenta();
            llenarTablaVenta();
            llenarTablaRefaccion();

        } catch (Exception e) {
            String ex = e.getMessage();
            JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible");
        }
    }//GEN-LAST:event_btnAgregaDVActionPerformed

    private void CBrefacciondtvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBrefacciondtvItemStateChanged
        //opRefaccionDV = CBrefacciondtv.getSelectedItem().toString();
    }//GEN-LAST:event_CBrefacciondtvItemStateChanged

    private void btnEliminaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaDVActionPerformed
        eliminaDetalleVenta();
        llenarTablaDetalleVenta();
    }//GEN-LAST:event_btnEliminaDVActionPerformed

    private void btnModificaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaDVActionPerformed
        modificaDetalleVenta();
        llenarTablaDetalleVenta();
    }//GEN-LAST:event_btnModificaDVActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            llenarTablaConsulta1();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBventadtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBventadtvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBventadtvActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            llenarTablaConsulta2();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RefaccionariaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RefaccionariaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RefaccionariaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RefaccionariaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RefaccionariaForm(tipo).setVisible(true);
            }
        });
    }

    public void actualizaCombos() {
        personasProveedor();
        categoriaRefaccion();
        categoriaConsulta();
        vehiculoRefaccion();
        proveedorCompra();
        refaccionDetalleCompra();
        compraDetalleCompra();
        personaEmpleado();
        EmpleadosVenta();
        refaccionDTV();
        ventaDTV();
        empleadoTotales();
    }

    public void recarga() {

        llenarTablaVehiculo();
        llenarTablaCategoria();
        llenarTablaPersona();
        llenarTablaProveedor();
        llenarTablaRefaccion();
        llenarTablaCompra();
        llenarTablaDetalleCompra();
        llenarTablaEmpleado();
        llenarTablaVenta();

        llenarTablaDetalleVenta();
        actualizaCombos();
    }

    /*Metodos*/
    //VEHICULO
    public void insertarVehiculo() {
        try {
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            String sql = "INSERT INTO AdminRefa.Vehiculo(numSerie,nombreMarca,nombreModelo,anio,descTecnica)"
                    + "VALUES('" + txtNumSerie.getText() + "', '" + txtMarca.getText() + "', '" + txtModelo.getText() + "', '" + txtAnio.getText() + "', '" + txtDesc.getText() + "')";

            //ResultSet result = st.executeQuery(sql);
            st.execute(sql);
            st.close();
            llenarTablaVehiculo();
            limpiaTxtsVehiculo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "truena vehiculo", "truena vehiculo", 0);
        }
    }

    public void modificarVehiculo() {
        try {
            String sql2 = "UPDATE AdminRefa.Vehiculo SET numSerie = '" + txtNumSerie.getText() + "', nombreMarca = '" + txtMarca.getText() + "', nombreModelo = '" + txtModelo.getText() + "', anio = '"
                    + txtAnio.getText() + "', descTecnica = '" + txtDesc.getText() + "' WHERE idVehiculo = '" + auxidVehiculo + "'";
            st = conex.createStatement();
            st.execute(sql2);
            st.close();
            llenarTablaVehiculo();
            limpiaTxtsVehiculo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena mod vehi", 0);
        }
    }

    public void eliminarVehiculo() {
        try {
            String sql3 = "DELETE FROM AdminRefa.Vehiculo WHERE idVehiculo = '" + auxidVehiculo + "'";
            st = conex.createStatement();
            st.execute(sql3);
            st.close();
            llenarTablaVehiculo();
            limpiaTxtsVehiculo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena eliminar vehi", 0);
        }
    }

    public void limpiaTxtsVehiculo() {
        txtNumSerie.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtAnio.setText("");
        txtDesc.setText("");

    }

    public void llenarTablaVehiculo() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            //System.out.print("llenado de tabla");
            model.addColumn("idVehiculo");
            model.addColumn("numSerie");
            model.addColumn("nombreMarca");
            model.addColumn("nombreModelo");
            model.addColumn("anio");
            model.addColumn("descTecnica");

            String[] datos = new String[6];

            st = conex.createStatement();
            String sql = "SELECT * FROM AdminRefa.Vehiculo";
            resultado = st.executeQuery(sql);
            while (resultado.next()) {

                datos[0] = resultado.getString("idVehiculo");
                datos[1] = resultado.getString("numSerie");
                datos[2] = resultado.getString("nombreMarca");
                datos[3] = resultado.getString("nombreModelo");
                datos[4] = resultado.getString("anio");
                datos[5] = resultado.getString("descTecnica");

                model.addRow(datos);
            }

            st.close();
            tablaVehiculo.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    //CATEGORIA
    public void insertarCategoria() {
        try {
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            String sql = "INSERT INTO AdminRefa.Categoria(nombreCategoria)"
                    + "VALUES('" + txtCategoria.getText() + "')";

            //ResultSet result = st.executeQuery(sql);
            st.execute(sql);
            st.close();
            llenarTablaCategoria();
            limpiaTxtsCategoria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena insertar categ", 0);
        }
    }

    public void modificarCategoria() {
        try {
            String sql2 = "UPDATE AdminRefa.Categoria SET nombreCategoria = '" + txtCategoria.getText() + "' WHERE idCategoria = '" + auxidCategoria + "'";
            st = conex.createStatement();
            st.execute(sql2);
            st.close();
            llenarTablaCategoria();
            limpiaTxtsCategoria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena modificar categ", 0);
        }
    }

    public void eliminarCategoria() {
        try {
            String sql4 = "DELETE FROM AdminRefa.Categoria WHERE idCategoria = '" + auxidCategoria + "'";
            st = conex.createStatement();
            st.execute(sql4);
            st.close();
            llenarTablaCategoria();
            limpiaTxtsCategoria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena eliminar categ", 0);
        }
    }

    public void llenarTablaCategoria() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            //System.out.print("llenado de tabla categoria");
            model.addColumn("idCategoria");
            model.addColumn("nombreCategoria");

            String[] datos = new String[2];

            st = conex.createStatement();
            String sql = "SELECT * FROM AdminRefa.Categoria";
            resultado = st.executeQuery(sql);
            while (resultado.next()) {

                datos[0] = resultado.getString("idCategoria");
                datos[1] = resultado.getString("nombreCategoria");

                model.addRow(datos);
            }
            st.close();
            tablaCategoria.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    public void limpiaTxtsCategoria() {
        txtCategoria.setText("");
    }

    //PERSONA
    public void insertarPersona() {
        try {
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            String sql = "INSERT INTO AdminRefa.Persona(rfc,nombrePersona,correo,telefono,direccion,cp,estado)"
                    + "VALUES('" + txtRFC.getText() + "', '" + txtNombrePersona.getText() + "', '" + txtCorreo.getText() + "', '" + txtTelefono.getText() + "', '" + txtDireccion.getText() + "', '" + txtCP.getText() + "', '" + txtEstado.getText() + "')";

            //ResultSet result = st.executeQuery(sql);
            st.execute(sql);
            st.close();
            llenarTablaPersona();
            limpiaTxtsPersona();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena insertar persona", 0);
        }
    }

    public void modificarPersona() {
        try {
            String sql2 = "UPDATE AdminRefa.Persona SET rfc = '" + txtRFC.getText() + "', nombrePersona = '" + txtNombrePersona.getText() + "', correo = '" + txtCorreo.getText() + "', telefono = '" + txtTelefono.getText() + "', direccion = '" + txtDireccion.getText() + "', cp = '" + txtCP.getText() + "', estado = '" + txtEstado.getText() + "'   WHERE idPersona = '" + auxidPersona + "'";
            st = conex.createStatement();
            st.execute(sql2);
            st.close();
            llenarTablaPersona();
            limpiaTxtsPersona();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena modificar persona", 0);
        }
    }

    public void eliminarPersona() {
        try {
            String sql5 = "DELETE FROM AdminRefa.Persona WHERE idPersona = '" + auxidPersona + "'";
            st = conex.createStatement();
            st.execute(sql5);
            st.close();
            llenarTablaPersona();
            limpiaTxtsPersona();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena eliminar persona", 0);
        }
    }

    public void llenarTablaPersona() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            //System.out.print("llenado de tabla Persona");
            model.addColumn("idPersona");
            model.addColumn("rfc");
            model.addColumn("nombrePersona");
            model.addColumn("correo");
            model.addColumn("telefono");
            model.addColumn("direccion");
            model.addColumn("cp");
            model.addColumn("estado");

            String[] datos = new String[8];

            st = conex.createStatement();
            String sql = "SELECT * FROM AdminRefa.Persona";
            resultado = st.executeQuery(sql);
            while (resultado.next()) {

                datos[0] = resultado.getString("idPersona");
                datos[1] = resultado.getString("rfc");
                datos[2] = resultado.getString("nombrePersona");
                datos[3] = resultado.getString("correo");
                datos[4] = resultado.getString("telefono");
                datos[5] = resultado.getString("direccion");
                datos[6] = resultado.getString("cp");
                datos[7] = resultado.getString("estado");

                model.addRow(datos);
            }
            st.close();
            tablaPersona.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    public void limpiaTxtsPersona() {
        txtRFC.setText("");
        txtNombrePersona.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCP.setText("");
        txtEstado.setText("");
    }

    //PROVEEDOR
    public void personasProveedor() {
        cbxProvPersona.removeAllItems();
        try {
            cbxProvPersona.addItem("Escoge una persona");
            qry = "SELECT idPersona,nombrePersona FROM AdminRefa.Persona";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbxProvPersona.addItem(rs.getString(1) + "-" + rs.getString(2));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void insertarProveedor() {
        try {
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            //idPerProv = cbxProvPersona.getSelectedItem().toString();
            String string = opCbxPerProv;
            String[] parts = string.split("-");
            String part1 = parts[0];
            String sql = "INSERT INTO AdminRefa.Proveedor(idPersona,empresa,gerente,giro)" + "VALUES('" + part1 + "', '" + txtEmpresa.getText() + "', '" + txtGerente.getText() + "', '" + txtGiro.getText() + "')";

            st.execute(sql);
            st.close();
            llenarTablaProveedor();
            limpiaTxtsProveedor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena insertar proveedor", 0);
        }
    }

    public void modificaProveedor() {
        String string = opCbxPerProv;
        String[] parts = string.split("-");
        String part1 = parts[0];
        try {
            String sql2 = "UPDATE AdminRefa.Proveedor SET idPersona = '" + part1 + "', empresa = '" + txtEmpresa.getText() + "', gerente = '" + txtGerente.getText() + "', giro = '" + txtGiro.getText() + "' WHERE idProveedor = '" + auxidProveedor + "'";
            st = conex.createStatement();
            st.execute(sql2);
            st.close();
            llenarTablaProveedor();
            limpiaTxtsProveedor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena modificar proveedor", 0);
        }
    }

    public void eliminaProveedor() {
        try {
            String sql6 = "DELETE FROM AdminRefa.Proveedor WHERE idProveedor = '" + auxidProveedor + "'";
            st = conex.createStatement();
            st.execute(sql6);
            st.close();
            llenarTablaProveedor();
            limpiaTxtsProveedor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena eliminar proveedor", 0);
        }
    }

    public void llenarTablaProveedor() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            //System.out.print("llenado de tabla Proveedor");
            model.addColumn("idProveedor");
            model.addColumn("idPersona");
            model.addColumn("Empresa");
            model.addColumn("Gerente");
            model.addColumn("Giro");

            String[] datos = new String[5];

            st = conex.createStatement();
            //String sql = "SELECT * FROM AdminRefa.Proveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona = AdminRefa.Persona.idPersona";
            String sql = "SELECT idProveedor,empresa,gerente,giro,CONCAT(AdminRefa.Persona.idPersona, '-', AdminRefa.Persona.nombrePersona) datos FROM AdminRefa.Proveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona = AdminRefa.Persona.idPersona";

            resultado = st.executeQuery(sql);
            while (resultado.next()) {

                datos[0] = resultado.getString("idProveedor");
                datos[1] = resultado.getString("datos");
                datos[2] = resultado.getString("empresa");
                datos[3] = resultado.getString("gerente");
                datos[4] = resultado.getString("giro");

                model.addRow(datos);
            }
            st.close();
            tablaProveedor.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    public void limpiaTxtsProveedor() {
        cbxProvPersona.setSelectedItem("Escoge una persona");
        txtEmpresa.setText("");
        txtGerente.setText("");
        txtGiro.setText("");
    }

    //REFACCIÓN
    public void insertaRefaccion() {
        try {
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            //idPerProv = cbxProvPersona.getSelectedItem().toString();
            String string = opCBCat;
            String string2 = opCBVeh;
            String[] parts = string.split("-");
            String[] parts2 = string2.split("-");
            String part1 = parts[0];
            String part2 = parts2[0];
            String sql = "INSERT INTO AdminRefa.refaccion(idCategoria,idVehiculo,nombre,descripcion,preciocompra,precioventa,stock)" + "VALUES('" + part1 + "', '" + part2 + "', '" + nomRefaccion.getText() + "', '" + txtDescRefa.getText() + "', '" + txtPrecioCompra.getText() + "', '" + 0 + "', '" + 0 + "')";
            st.execute(sql);
            st.close();
            llenarTablaRefaccion();
            limpiaTxtsRefaccion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena insert refaccion", 0);
        }
    }

    public void eliminaRefaccion() {
        try {
            String sql6 = "DELETE FROM AdminRefa.refaccion WHERE idrefaccion = '" + auxidRefaccion + "'";
            st = conex.createStatement();
            st.execute(sql6);
            st.close();
            llenarTablaRefaccion();
            limpiaTxtsRefaccion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena eliminar refac", 0);
        }
    }

    public void modificaRefaccion() {
        try {
            String string = opCBCat;
            String string2 = opCBVeh;
            String[] parts = string.split("-");
            String[] parts2 = string2.split("-");
            String part1 = parts[0];
            String part2 = parts2[0];
            String sql2 = "UPDATE AdminRefa.Refaccion SET idCategoria = '" + part1 + "', idVehiculo = '" + part2 + "', nombre = '" + nomRefaccion.getText() + "', descripcion = '" + txtDescRefa.getText() + "', precioCompra = '" + txtPrecioCompra.getText() + "' WHERE idRefaccion = '" + auxidRefaccion + "'";
            st = conex.createStatement();
            st.execute(sql2);
            st.close();
            llenarTablaRefaccion();
            limpiaTxtsRefaccion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "truena modificar refaccion", 0);
        }
    }

    public void categoriaRefaccion() {
        cbCategoria.removeAllItems();
        try {
            cbCategoria.addItem("Escoge una Categoría");
            qry = "SELECT idCategoria,nombreCategoria FROM AdminRefa.Categoria";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbCategoria.addItem(rs.getString(1) + "-" + rs.getString(2));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void categoriaConsulta() {
        cBcategorias.removeAllItems();
        try {
            cBcategorias.addItem("Escoge una Categoría");
            qry = "SELECT nombreCategoria FROM AdminRefa.Categoria";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cBcategorias.addItem(rs.getString(1));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void vehiculoRefaccion() {
        cbVehiculo.removeAllItems();
        try {
            cbVehiculo.addItem("Escoge un Vehículo");
            qry = "SELECT idVehiculo,numSerie,nombreModelo,anio FROM AdminRefa.Vehiculo";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbVehiculo.addItem(rs.getString(1) + "-" + rs.getString(2) + "-" + rs.getString(3) + "-" + rs.getString(4));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void llenarTablaRefaccion() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            model.addColumn("idRefaccion");

            model.addColumn("idVehiculo");
            model.addColumn("idCategoria");
            model.addColumn("Nombre");
            model.addColumn("Descripción");
            model.addColumn("PrecioCompra");
            model.addColumn("PrecioVenta");
            model.addColumn("Stock");

            String[] datos = new String[100];
            String[] datos2 = new String[100];
            st = conex.createStatement();
            String sql = "SELECT idRefaccion,CONCAT(AdminRefa.Vehiculo.idVehiculo,'-',AdminRefa.Vehiculo.numSerie,'-',AdminRefa.Vehiculo.nombreModelo,'-',AdminRefa.Vehiculo.anio)datos,CONCAT(AdminRefa.Categoria.idCategoria,'-',AdminRefa.Categoria.nombreCategoria)datos2,nombre,descripcion,precioCompra,precioVenta,stock FROM AdminRefa.Refaccion INNER JOIN AdminRefa.Vehiculo ON AdminRefa.Refaccion.idVehiculo = AdminRefa.Vehiculo.idVehiculo INNER JOIN AdminRefa.Categoria ON AdminRefa.Refaccion.idCategoria = AdminRefa.Categoria.idCategoria";
            resultado = st.executeQuery(sql);

            while (resultado.next()) {
                datos[0] = resultado.getString("idRefaccion");

                datos[1] = resultado.getString("datos");

                datos[2] = resultado.getString("datos2");

                datos[3] = resultado.getString("nombre");
                datos[4] = resultado.getString("descripcion");
                datos[5] = resultado.getString("precioCompra");
                datos[6] = resultado.getString("precioVenta");
                datos[7] = resultado.getString("stock");

                model.addRow(datos);

            }
            st.close();

            tablaRefaccion.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    public void limpiaTxtsRefaccion() {
        cbCategoria.setSelectedItem(null);
        cbVehiculo.setSelectedItem(null);
        txtDescRefa.setText("");
        txtPrecioCompra.setText("");
        nomRefaccion.setText("");
    }

    //EMPLEADO
    public void personaEmpleado() {
        cbxEmplePersona.removeAllItems();
        try {
            cbxEmplePersona.addItem("Escoge una persona");
            qry = "SELECT idPersona,nombrePersona FROM AdminRefa.Persona";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbxEmplePersona.addItem(rs.getString(1) + "-" + rs.getString(2));
                consultaEmpleado.addItem(rs.getString(1) + "-" + rs.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    public void empleadoTotales() {
        consultaEmpleado.removeAllItems();
        try {
            consultaEmpleado.addItem("Escoge una persona");
            qry = "SELECT nombrePersona FROM AdminRefa.Persona";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                consultaEmpleado.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    public void insertarEmpleado() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = dateFormat.format(jDateEmpleado.getDate());

        try {
            String string = opCBPerEmp;
            String[] parts = string.split("-");
            String val = cbxRol.getSelectedItem().toString();
            String part1 = parts[0];
            String sql8 = "INSERT INTO adminrefa.empleado(idPersona,fechaInicio,antiguedad,rol) VALUES('" + part1 + "','" + str + "','" + 0 + "','" + val + "') ";
            st = conex.createStatement();
            st.execute(sql8);
            st.close();

            llenarTablaEmpleado();
            limpiaTxtsEmpleado();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminarEmpleado() {
        try {
            String sql5 = "DELETE FROM AdminRefa.Empleado WHERE idEmpleado = '" + auxidEmpleado + "'";
            st = conex.createStatement();
            st.execute(sql5);
            st.close();
            llenarTablaEmpleado();
            limpiaTxtsEmpleado();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void modificarEmpleado() {
        String string = opCBPerEmp;
        String val = cbxRol.getSelectedItem().toString();
        String[] parts = string.split("-");
        String part1 = parts[0];
        try {
            String sql2 = "UPDATE AdminRefa.Empleado SET idPersona = '" + part1 + "', Rol = '" + val + "' WHERE idEmpleado = '" + auxidEmpleado + "'";
            st = conex.createStatement();
            st.execute(sql2);
            st.close();
            llenarTablaEmpleado();
            limpiaTxtsEmpleado();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void llenarTablaEmpleado() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            model.addColumn("idEmpleado");
            model.addColumn("idPersona");
            model.addColumn("Fecha-alta");
            model.addColumn("Antigüedad(años)");
            model.addColumn("rol");
            String[] datos = new String[8];
            String sql = "SELECT idEmpleado,CONCAT(adminrefa.persona.idPersona,'-',nombrepersona)datos,fechaInicio,antiguedad,rol FROM adminrefa.empleado INNER JOIN adminrefa.persona ON adminrefa.empleado.idPersona = adminrefa.persona.idPersona";
            st = conex.createStatement();
            resultado = st.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString("idEmpleado");
                datos[1] = resultado.getString("datos");
                datos[2] = resultado.getString("fechaInicio");
                datos[3] = resultado.getString("Antiguedad");
                datos[4] = resultado.getString("rol");

                model.addRow(datos);
            }
            st.close();
            tablaEmpleado.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void limpiaTxtsEmpleado() {
        cbxEmplePersona.setSelectedItem(null);
        cbxRol.setSelectedItem(null);
        jDateEmpleado.setCalendar(null);
    }

    //COMPRA
    public void agregaCompra() {
        try {
            java.util.Date date = new java.util.Date();

            String fechaCompra;
            SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd");

            fechaCompra = f.format(jdcCompra.getDate());
            //JOptionPane.showMessageDialog(null, fechaCompra);
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            //idPerProv = cbxProvPersona.getSelectedItem().toString();
            String string = opCbxProveCompra;
            String[] parts = string.split("-");
            String part1 = parts[0];
            String sql = "INSERT INTO AdminRefa.Compra(idProveedor,fecha,total)" + "VALUES('" + part1 + "', '" + fechaCompra + "', '0')";

            st.execute(sql);
            st.close();
            llenarTablaCompra();
            limpiaTxtsCompra();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void proveedorCompra() {
        cbxProveCompra.removeAllItems();
        try {
            cbxProveCompra.addItem("Escoge un Proveedor");
            // qry = "SELECT idProveedor,empresa,gerente FROM AdminRefa.Proveedor";

            //qry = "SELECT AdminRefa.Proveedor.idProveedor,AdminRefa.Proveedor.empresa,AdminRefa.Persona.nombrePersona FROM AdminRefa.Compra INNER JOIN AdminRefa.Proveedor ON AdminRefa.Compra.idProveedor = AdminRefa.Proveedor.idProveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona= AdminRefa.Persona.idPersona";
            qry = "SELECT AdminRefa.Proveedor.idProveedor,AdminRefa.Proveedor.empresa,AdminRefa.Persona.nombrePersona FROM AdminRefa.Proveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona = AdminRefa.Persona.idPersona";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbxProveCompra.addItem(rs.getString(1) + "-" + rs.getString(2) + "-" + rs.getString(3));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void modificaCompra() {
        try {
            java.util.Date date = new java.util.Date();

            String fechaCompra;
            SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd");

            fechaCompra = f.format(jdcCompra.getDate());
            //JOptionPane.showMessageDialog(null, fechaCompra);
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            //idPerProv = cbxProvPersona.getSelectedItem().toString();
            String string = opCbxProveCompra;
            String[] parts = string.split("-");
            String part1 = parts[0];
            String sql = "UPDATE AdminRefa.Compra SET idProveedor = '" + part1 + "',fecha = '" + fechaCompra + "' WHERE idCompra = '" + auxidCompra + "'";

            st.execute(sql);
            st.close();
            llenarTablaCompra();
            limpiaTxtsCompra();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminaCompra() {
        try {
            String sql = "DELETE FROM AdminRefa.Compra WHERE idCompra = '" + auxidCompra + "'";
            st = conex.createStatement();
            st.execute(sql);
            st.close();
            llenarTablaCompra();
            limpiaTxtsCompra();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void llenarTablaCompra() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            //System.out.print("llenado de tabla Compra");
            model.addColumn("idCompra");
            model.addColumn("idProveedor");
            model.addColumn("fechaCompra");
            model.addColumn("total");

            String[] datos = new String[4];

            st = conex.createStatement();
            //String sql = "SELECT * FROM AdminRefa.Proveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona = AdminRefa.Persona.idPersona";
            String sql = "SELECT idCompra,CONCAT(AdminRefa.Proveedor.idProveedor, '-',AdminRefa.Proveedor.empresa,'-',AdminRefa.Persona.nombrePersona)datos,fecha,total FROM AdminRefa.Compra INNER JOIN AdminRefa.Proveedor ON AdminRefa.Compra.idProveedor = AdminRefa.Proveedor.idProveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona= AdminRefa.Persona.idPersona";
            //String sql = "SELECT * FROM AdminRefa.Compra";

            resultado = st.executeQuery(sql);
            while (resultado.next()) {

                datos[0] = resultado.getString("idCompra");
                datos[1] = resultado.getString("datos");
                datos[2] = resultado.getString("fecha");
                datos[3] = resultado.getString("total");

                model.addRow(datos);
            }
            st.close();
            tablaCompra.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    public void limpiaTxtsCompra() {
        cbxProveCompra.setSelectedItem(null);
        jdcCompra.setCalendar(null);
    }

    //DETALLE COMPRA 
    public void refaccionDetalleCompra() {
        cbxRefaDC.removeAllItems();
        try {
            cbxRefaDC.addItem("Escoge una refacción");
            // qry = "SELECT idProveedor,empresa,gerente FROM AdminRefa.Proveedor";
            qry = "SELECT idRefaccion,nombre FROM AdminRefa.Refaccion";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbxRefaDC.addItem(rs.getString(1) + "-" + rs.getString(2));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void compraDetalleCompra() {
        cbxIdCompraDC.removeAllItems();
        try {
            cbxIdCompraDC.addItem("Compra");
            // qry = "SELECT idProveedor,empresa,gerente FROM AdminRefa.Proveedor";
            qry = "SELECT idCompra FROM AdminRefa.Compra";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbxIdCompraDC.addItem(rs.getString(1));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void insertaDetalleCompra() {
        try {

            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            //idPerProv = cbxProvPersona.getSelectedItem().toString();
            String string = opCbxRefaDC;
            String compraS = opCbxIdDC;
            String[] parts = string.split("-");
            String part1 = parts[0];
            String sql = "INSERT INTO AdminRefa.DetalleCompra(idRefaccion,idCompra,cantidad,subtotal)" + "VALUES('" + part1 + "','" + compraS + "','" + txtCantDC.getText() + "', '0')";

            st.execute(sql);
            st.close();
            llenarTablaDetalleCompra();
            limpiaTxtsDetalleCompra();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void modificarDetalleCompra() {
        try {
            //System.out.print("Conexion realizada");
            st = conex.createStatement();
            //idPerProv = cbxProvPersona.getSelectedItem().toString();
            String string = opCbxRefaDC;
            String compraS = opCbxIdDC;
            int auxSubtotal = 0;
            String[] parts = string.split("-");
            String part1 = parts[0];
            String sqlSubtotal = "((SELECT precioCompra FROM AdminRefa.Refaccion WHERE idRefaccion = " + part1 + ")*" + Integer.parseInt(txtCantDC.getText()) + ")";
            String sql = "UPDATE AdminRefa.DetalleCompra SET idRefaccion = '" + part1 + "',idCompra = '" + compraS + "', cantidad = " + Integer.parseInt(txtCantDC.getText()) + ", subtotal=" + sqlSubtotal + " WHERE idDetalleCompra = '" + auxidDetalleCompra + "'";

            st.execute(sql);
            st.close();
            llenarTablaDetalleCompra();
            limpiaTxtsDetalleCompra();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminarDetalleCompra() {
        try {
            String sql = "DELETE FROM AdminRefa.DetalleCompra WHERE idDetalleCompra = '" + auxidDetalleCompra + "'";
            st = conex.createStatement();
            st.execute(sql);
            st.close();
            llenarTablaDetalleCompra();
            limpiaTxtsDetalleCompra();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void llenarTablaDetalleCompra() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            //System.out.print("llenado de tabla DetalleCompra");
            model.addColumn("idDetalleCompra");
            model.addColumn("idRefacción");
            model.addColumn("idCompra");
            model.addColumn("cantidad");
            model.addColumn("subtotal");

            String[] datos = new String[5];

            st = conex.createStatement();
            //String sql = "SELECT * FROM AdminRefa.Proveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona = AdminRefa.Persona.idPersona";
            String sql = "SELECT idDetalleCompra,CONCAT(AdminRefa.Refaccion.idRefaccion, '-',AdminRefa.Refaccion.nombre)datos,idCompra,cantidad,subtotal FROM AdminRefa.DetalleCompra INNER JOIN AdminRefa.Refaccion ON AdminRefa.DetalleCompra.idRefaccion = AdminRefa.Refaccion.idRefaccion ";
            //String sql = "SELECT * FROM AdminRefa.Compra";

            resultado = st.executeQuery(sql);
            while (resultado.next()) {

                datos[0] = resultado.getString("idDetalleCompra");
                datos[1] = resultado.getString("datos");
                datos[2] = resultado.getString("idCompra");
                datos[3] = resultado.getString("cantidad");
                datos[4] = resultado.getString("subtotal");

                model.addRow(datos);
            }
            st.close();
            tablaDetalleCompra.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos");
        }
    }

    public void limpiaTxtsDetalleCompra() {
        cbxRefaDC.setSelectedItem(null);
        cbxIdCompraDC.setSelectedItem(null);
        txtCantDC.setText("");
    }

    //VENTA
    public void EmpleadosVenta() {
        cbEmpleado.removeAllItems();
        try {
            cbEmpleado.addItem("Elige un vendedor");
            qry = "SELECT idEmpleado,nombrePersona FROM AdminRefa.Empleado INNER JOIN adminrefa.persona ON AdminRefa.Empleado.idpersona = AdminRefa.Persona.idpersona";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                cbEmpleado.addItem(rs.getString(1) + "-" + rs.getString(2));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    public void llenarTablaVenta() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            System.out.print("llenado de tabla Proveedor");
            model.addColumn("idVenta");
            model.addColumn("Empleado");
            model.addColumn("Estado de venta");
            model.addColumn("Fecha");
            model.addColumn("Total");

            String[] datos = new String[5];

            st = conex.createStatement();
            //String sql = "SELECT * FROM AdminRefa.Proveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona = AdminRefa.Persona.idPersona";
            String sql = "SELECT idVenta,CONCAT(adminrefa.venta.idempleado,'-',nombrepersona)datos,estadoventa,fecha,total FROM adminrefa.venta INNER JOIN adminrefa.empleado ON adminrefa.venta.idempleado = adminrefa.empleado.idempleado INNER JOIN adminrefa.persona ON adminrefa.persona.idpersona = adminrefa.empleado.idpersona";

            resultado = st.executeQuery(sql);
            while (resultado.next()) {

                datos[0] = resultado.getString("idVenta");
                datos[1] = resultado.getString("datos");
                datos[2] = resultado.getString("estadoventa");
                datos[3] = resultado.getString("Fecha");
                datos[4] = resultado.getString("total");

                model.addRow(datos);
            }
            st.close();
            Tablaventa.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void llenarTablaConsulta1() {
        DefaultTableModel model = new DefaultTableModel();
        String empl = consultaEmpleado.getSelectedItem().toString();
        try {
            model.addColumn("Nombre");
            model.addColumn("Total Vendido");
            model.addColumn("Ventas Realizadas");
            String sql = "SELECT nombrepersona, SUM(total) as totVentas, COUNT(*) as cont  FROM adminrefa.persona INNER JOIN adminrefa.empleado ON adminrefa.persona.idpersona = adminrefa.empleado.idpersona INNER JOIN adminrefa.venta ON adminrefa.empleado.idempleado = adminrefa.venta.idempleado WHERE adminrefa.persona.nombrepersona = '" + empl + "' GROUP BY nombrepersona";

            resultado = st.executeQuery(sql);
            String[] datos = new String[3];
            while (resultado.next()) {
                datos[0] = resultado.getString("nombrePersona");
                datos[1] = resultado.getString("totVentas");
                datos[2] = resultado.getString("cont");
                model.addRow(datos);
            }
            consulta1.setModel(model);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void llenarTablaConsulta2() {
        DefaultTableModel model = new DefaultTableModel();
        String cats = cBcategorias.getSelectedItem().toString();
        String conds = condicion.getSelectedItem().toString();
        try {
            model.addColumn("Refaccion");
            model.addColumn("Stock");
            String sql = "SELECT nombre,stock FROM adminrefa.refaccion WHERE adminrefa.refaccion .idCategoria IN(SELECT idCategoria FROM adminrefa.Categoria WHERE nombrecategoria = '" + cats + "') AND adminrefa.refaccion.stock > 50";
            resultado = st.executeQuery(sql);
            String[] datos = new String[2];
            while (resultado.next()) {
                datos[0] = resultado.getString("nombre");
                datos[1] = resultado.getString("Stock");

                model.addRow(datos);
            }
            tablaConsulta2.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void limpiaTxtsVenta() {
        cbEmpleado.setSelectedItem(null);
        CBestadoventa.setSelectedItem(null);
        jDateVenta.setCalendar(null);
    }

    //DETALLE VENTA 
    public void refaccionDTV() {
        CBrefacciondtv.removeAllItems();
        try {
            CBrefacciondtv.addItem("Agrega una Refacción");
            qry = "SELECT idrefaccion,nombre FROM AdminRefa.refaccion";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                CBrefacciondtv.addItem(rs.getString(1) + "-" + rs.getString(2));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void ventaDTV() {
        CBventadtv.removeAllItems();
        try {
            CBventadtv.addItem("Agrega una venta");
            qry = "SELECT idventa FROM AdminRefa.venta";
            st = conex.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                CBventadtv.addItem(rs.getString(1));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void agregaDetalleVenta() {
        /*try{
            String scb1 = CBrefacciondtv.getSelectedItem().toString();
            String[] parts = scb1.split("-");
            String part2= parts[0];
            String val = CBventadtv.getSelectedItem().toString();
             System.out.print("Conexion realizada");
            st = conex.createStatement();
            String sql = "INSERT INTO AdminRefa.DetalleVenta(idFRefaccion,idFVenta,cantidad,descuento,subtotal)"
                    + "VALUES('" + part2 + "', '" + val + "', '" + txtCantidaddtv.getText() + "', '" + txtDescuentodtv.getText() + "','"+ 0 +"')";

            //ResultSet result = st.executeQuery(sql);
            st.execute(sql);
            st.close();
            llenarTablaDetalleVenta();
            llenarTablaVenta();
            limpiaTxtsDetalleVenta();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }*/
    }

    public void modificaDetalleVenta() {
        try {
            String scb1 = CBrefacciondtv.getSelectedItem().toString();
            String[] parts = scb1.split("-");
            String part2 = parts[0];
            String val = CBventadtv.getSelectedItem().toString();
            System.out.print("Conexion realizada");
            String aux = "(SELECT precioVenta FROM adminrefa.refaccion WHERE idRefaccion = '" + part2 + "')";

            String sql3 = "UPDATE AdminRefa.detalleventa SET idfrefaccion = '" + part2 + "', idfventa = '" + val + "', cantidad='" + txtCantidaddtv.getText() + "', descuento='" + txtDescuentodtv.getText() + "', subtotal='" + 24000 + "' WHERE iddetalleventa =  '" + auxidDetalleventa + "'";

            st = conex.createStatement();
            st.execute(aux);

            st.close();
            llenarTablaDetalleVenta();
            llenarTablaVenta();
            limpiaTxtsDetalleVenta();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminaDetalleVenta() {
        try {
            String sql3 = "DELETE FROM AdminRefa.detalleventa WHERE iddetalleventa = '" + auxidDetalleventa + "'";
            st = conex.createStatement();
            st.execute(sql3);
            st.close();
            llenarTablaDetalleVenta();
            llenarTablaVenta();
            limpiaTxtsDetalleVenta();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void llenarTablaDetalleVenta() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            System.out.print("llenado de tabla Proveedor");
            model.addColumn("#Numero");
            model.addColumn("idRefaccion");
            model.addColumn("idVenta");
            model.addColumn("Cantidad");
            model.addColumn("Descuento");
            model.addColumn("Subtotal");

            String[] datos = new String[6];
            String[] datos2 = new String[5];
            st = conex.createStatement();
            //String sql = "SELECT * FROM AdminRefa.Proveedor INNER JOIN AdminRefa.Persona ON AdminRefa.Proveedor.idPersona = AdminRefa.Persona.idPersona";
            String sql = "SELECT iddetalleventa,CONCAT(idfRefaccion,'-',nombre)datos,idfVenta,Cantidad,descuento,subtotal FROM adminrefa.detalleventa INNER JOIN adminrefa.refaccion ON adminrefa.refaccion.idrefaccion = idfrefaccion";

            resultado = st.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString("iddetalleventa");
                datos[1] = resultado.getString("datos");
                datos[2] = resultado.getString("idfventa");
                datos[3] = resultado.getString("cantidad");
                datos[4] = resultado.getString("descuento");
                datos[5] = resultado.getString("subtotal");

                model.addRow(datos);
            }
            st.close();
            Tabladetalleventa.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void limpiaTxtsDetalleVenta() {
        CBventadtv.setSelectedItem(null);
        CBrefacciondtv.setSelectedItem(null);
        txtCantidaddtv.setText("");
        txtDescuentodtv.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBestadoventa;
    private javax.swing.JComboBox<String> CBrefacciondtv;
    private javax.swing.JComboBox<String> CBventadtv;
    private javax.swing.JTable Tabladetalleventa;
    private javax.swing.JTable Tablaventa;
    private javax.swing.JButton btnAgegaDetalleCompra;
    private javax.swing.JButton btnAgreCat;
    private javax.swing.JButton btnAgrePersona;
    private javax.swing.JButton btnAgreProveedor;
    private javax.swing.JButton btnAgreVeh;
    private javax.swing.JButton btnAgregaCompra;
    private javax.swing.JButton btnAgregaDV;
    private javax.swing.JButton btnAgregaEmpleado;
    private javax.swing.JButton btnAgregaVenta;
    private javax.swing.JButton btnElimCat;
    private javax.swing.JButton btnElimCompra;
    private javax.swing.JButton btnElimPersona;
    private javax.swing.JButton btnElimProveedor;
    private javax.swing.JButton btnElimVeh;
    private javax.swing.JButton btnEliminaDC;
    private javax.swing.JButton btnEliminaDV;
    private javax.swing.JButton btnEliminaEmpleado;
    private javax.swing.JButton btnEliminaVenta;
    private javax.swing.JButton btnModCat;
    private javax.swing.JButton btnModCompra;
    private javax.swing.JButton btnModPersona;
    private javax.swing.JButton btnModVeh;
    private javax.swing.JButton btnModiEmpleado;
    private javax.swing.JButton btnModiProveedor;
    private javax.swing.JButton btnModificaDC;
    private javax.swing.JButton btnModificaDV;
    private javax.swing.JButton btnModificaVenta;
    private javax.swing.JButton btnagregarefaccion;
    private javax.swing.JButton btneliminarefaccion;
    private javax.swing.JButton btnmodificarefaccion;
    private javax.swing.JComboBox<String> cBcategorias;
    private javax.swing.JTextField cantidadStock;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbEmpleado;
    private javax.swing.JComboBox<String> cbVehiculo;
    private javax.swing.JComboBox<String> cbxEmplePersona;
    private javax.swing.JComboBox<String> cbxIdCompraDC;
    private javax.swing.JComboBox<String> cbxProvPersona;
    private javax.swing.JComboBox<String> cbxProveCompra;
    private javax.swing.JComboBox<String> cbxRefaDC;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JComboBox<String> condicion;
    private javax.swing.JTable consulta1;
    private javax.swing.JComboBox<String> consultaEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateEmpleado;
    private com.toedter.calendar.JDateChooser jDateVenta;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private com.toedter.calendar.JDateChooser jdcCompra;
    private javax.swing.JTextField nomRefaccion;
    private javax.swing.JTable tablaCategoria;
    private javax.swing.JTable tablaCompra;
    private javax.swing.JTable tablaConsulta2;
    private javax.swing.JTable tablaDetalleCompra;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTable tablaPersona;
    private javax.swing.JTable tablaProveedor;
    private javax.swing.JTable tablaRefaccion;
    private javax.swing.JTable tablaVehiculo;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCantDC;
    private javax.swing.JTextField txtCantidaddtv;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtDescRefa;
    private javax.swing.JTextField txtDescuentodtv;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtGerente;
    private javax.swing.JTextField txtGiro;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombrePersona;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
