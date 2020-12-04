package VistasPA;

import controladoresCU.GestionPedido;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmPrincipalUsuario extends javax.swing.JFrame {

    GestionPedido controlVista;
    FrmPrincipalUsuario desktop = this;

    public FrmPrincipalUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getControlVista().setForm(desktop);
        this.llenaJComboBoxRubro(jComboBoxRubro);
        this.llenaJComboBoxCategoria(jComboBoxCategoria);
        this.getTxtMontoTotal().setText("0.0");
        this.getTxtID1().setText("0.0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        txtCorreo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtMontoTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComercio = new javax.swing.JTable();
        txtBuscarComercio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxRubro = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarro = new javax.swing.JTable();
        btnAgregarAPedido = new javax.swing.JButton();
        jNombreComercio = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtRuta2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnHacerPedido = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        btnQuitarProducto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnBuscarComercio = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jComboBoxMinuto = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JLabel();
        rbtnPorNombre = new javax.swing.JRadioButton();
        rbtnPorCategoriaRubro = new javax.swing.JRadioButton();
        rbtnSoloCategoria = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        rbtnSoloRubro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EAT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DELIVERY");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        txtID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtID.setText("ID:");
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 20, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setText("Nombre:");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 50, -1));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Mis pedidos");
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 160, 40));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCorreo.setText("email:");
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 40, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 40, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 20, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMontoTotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtMontoTotal.setForeground(new java.awt.Color(153, 204, 0));
        txtMontoTotal.setText("$ xxxxx");
        txtMontoTotal.setBorder(null);
        txtMontoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoTotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 510, 100, 30));

        jTableComercio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comercio", "ID", "Calificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableComercio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComercioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableComercioMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableComercio);
        if (jTableComercio.getColumnModel().getColumnCount() > 0) {
            jTableComercio.getColumnModel().getColumn(0).setResizable(false);
            jTableComercio.getColumnModel().getColumn(1).setResizable(false);
            jTableComercio.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 180));

        txtBuscarComercio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtBuscarComercio.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtBuscarComercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, -1));

        jLabel2.setText("______________________________");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, -1));

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, -1));

        jComboBoxRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rubro", "Item 2", "Item 3", "Item 4" }));
        jComboBoxRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRubroActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 110, -1));

        jPanel3.setBackground(new java.awt.Color(153, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 10, 660));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Mi Pedido");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jTableCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Producto", "Descripcion", "Precio", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableCarro);
        if (jTableCarro.getColumnModel().getColumnCount() > 0) {
            jTableCarro.getColumnModel().getColumn(0).setResizable(false);
            jTableCarro.getColumnModel().getColumn(1).setResizable(false);
            jTableCarro.getColumnModel().getColumn(2).setResizable(false);
            jTableCarro.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 450, 110));

        btnAgregarAPedido.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarAPedido.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarAPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAPedido.setText("Agregar a Pedido");
        btnAgregarAPedido.setBorderPainted(false);
        btnAgregarAPedido.setContentAreaFilled(false);
        btnAgregarAPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAPedidoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarAPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 160, 60));

        jNombreComercio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jNombreComercio.setText("Comercio");
        jPanel2.add(jNombreComercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 204, 0));
        txtDescripcion.setText("Descripcion (Opcional)");
        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 410, 20));

        txtRuta2.setBackground(new java.awt.Color(255, 255, 255));
        txtRuta2.setForeground(new java.awt.Color(153, 204, 0));
        txtRuta2.setText("_________________________________________________________________________");
        jPanel2.add(txtRuta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 430, -1));

        jPanel4.setBackground(new java.awt.Color(153, 204, 0));

        btnHacerPedido.setBackground(new java.awt.Color(255, 255, 255));
        btnHacerPedido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHacerPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnHacerPedido.setText("Hacer Pedido");
        btnHacerPedido.setContentAreaFilled(false);
        btnHacerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHacerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnHacerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, 210, 80));

        jPanel5.setBackground(new java.awt.Color(153, 204, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 160, 60));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Agregar a Pedido");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 160, 60));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Agregar a Pedido");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 160, 60));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Agregar a Pedido");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 160, 60));

        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 204, 0));
        jTextField7.setText("*cantidad máxima 5 productos");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 360, 20));

        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 204, 0));
        jTextField8.setText("Monto Total");
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 480, 100, 30));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Agregar a Pedido");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 160, 60));

        btnQuitarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitarProducto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnQuitarProducto.setForeground(new java.awt.Color(153, 204, 0));
        btnQuitarProducto.setText("Quitar Producto");
        btnQuitarProducto.setContentAreaFilled(false);
        btnQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuitarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 150, 30));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Producto", "Descripcion", "Precio", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProducto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableProducto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jTableProducto);
        if (jTableProducto.getColumnModel().getColumnCount() > 0) {
            jTableProducto.getColumnModel().getColumn(0).setResizable(false);
            jTableProducto.getColumnModel().getColumn(1).setResizable(false);
            jTableProducto.getColumnModel().getColumn(2).setResizable(false);
            jTableProducto.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 450, 190));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Producto", "Descripcion", "Precio", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 450, 190));

        btnBuscarComercio.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarComercio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscarComercio.setForeground(new java.awt.Color(153, 204, 0));
        btnBuscarComercio.setText("Buscar");
        btnBuscarComercio.setContentAreaFilled(false);
        btnBuscarComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComercioActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarComercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel8.setText("Rubro");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 60, 20));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setText("Seleccione un filtro:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 20));

        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel2.add(jComboBoxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 50, -1));

        jComboBoxMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));
        jComboBoxMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMinutoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 50, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel13.setText("Categoria");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 60, 20));

        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 204, 0));
        jTextField9.setText("Ingrese la hora deseada de recepción (hh:mm)");
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 400, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Calificacion:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 80, -1));

        txtID1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtID1.setText("Calificacion");
        jPanel2.add(txtID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 80, -1));

        buttonGroupFiltro.add(rbtnPorNombre);
        rbtnPorNombre.setText("Nombre");
        jPanel2.add(rbtnPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        buttonGroupFiltro.add(rbtnPorCategoriaRubro);
        rbtnPorCategoriaRubro.setText("Categoria y Rubro");
        rbtnPorCategoriaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPorCategoriaRubroActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnPorCategoriaRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        buttonGroupFiltro.add(rbtnSoloCategoria);
        rbtnSoloCategoria.setText("Categoria");
        jPanel2.add(rbtnSoloCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel15.setText("Nombre Comercio");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 20));

        buttonGroupFiltro.add(rbtnSoloRubro);
        rbtnSoloRubro.setText("Rubro");
        jPanel2.add(rbtnSoloRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoTotalActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoActionPerformed
        this.getControlVista().quitarProducto();
    }//GEN-LAST:event_btnQuitarProductoActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.getControlVista().verPedido();
    }//GEN-LAST:event_jButton12ActionPerformed


    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed

    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRubroActionPerformed

    }//GEN-LAST:event_jComboBoxRubroActionPerformed

    private void btnBuscarComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComercioActionPerformed
        this.getControlVista().buscar();
    }//GEN-LAST:event_btnBuscarComercioActionPerformed

    private void jTableComercioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComercioMouseClicked
        this.getControlVista().interactuarSeleccionComercio();
        this.getControlVista().calcularCalificacionTxt();
        this.getControlVista().cargarNombreComercio();
    }//GEN-LAST:event_jTableComercioMouseClicked

    private void btnAgregarAPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAPedidoActionPerformed
        this.getControlVista().agregarAlCarro();
    }//GEN-LAST:event_btnAgregarAPedidoActionPerformed

    private void btnHacerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerPedidoActionPerformed
        this.getControlVista().hacerPedido();
    }//GEN-LAST:event_btnHacerPedidoActionPerformed

    private void jTableComercioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComercioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableComercioMouseEntered

    private void jComboBoxMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMinutoActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void rbtnPorCategoriaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPorCategoriaRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnPorCategoriaRubroActionPerformed

    public void limpiarTablaComercio() {
        this.getControlVista().limpiarTablaComercio();
    }

    public void limpiarTablaCarro() {
        this.getControlVista().limpiarTablaCarro();
    }

    public void cargarComercio() {
        this.getControlVista().cargarComercio();
    }

    public JComboBox<String> getjComboBoxCategoria() {
        return jComboBoxCategoria;
    }

    public JTextField getTxtBuscarComercio() {
        return txtBuscarComercio;
    }

    public ButtonGroup getButtonGroupFiltro() {
        return buttonGroupFiltro;
    }

    public void setButtonGroupFiltro(ButtonGroup buttonGroupFiltro) {
        this.buttonGroupFiltro = buttonGroupFiltro;
    }

    public JRadioButton getRbtnPorCategoriaRubro() {
        return rbtnPorCategoriaRubro;
    }

    public void setRbtnPorCategoriaRubro(JRadioButton rbtnPorCategoriaRubro) {
        this.rbtnPorCategoriaRubro = rbtnPorCategoriaRubro;
    }

    public JRadioButton getRbtnPorNombre() {
        return rbtnPorNombre;
    }

    public void setRbtnPorNombre(JRadioButton rbtnPorNombre) {
        this.rbtnPorNombre = rbtnPorNombre;
    }

    public JRadioButton getRbtnSoloCategoria() {
        return rbtnSoloCategoria;
    }

    public void setRbtnSoloCategoria(JRadioButton rbtnSoloCategoria) {
        this.rbtnSoloCategoria = rbtnSoloCategoria;
    }

    public void setTxtBuscarComercio(JTextField txtBuscarComercio) {
        this.txtBuscarComercio = txtBuscarComercio;
    }

    public JTable getjTableComercio() {
        return jTableComercio;
    }

    public JTable getjTableCarro() {
        return jTableCarro;
    }

    public void setjTableCarro(JTable jTableCarro) {
        this.jTableCarro = jTableCarro;
    }


    public void setjTableComercio(JTable jTableComercio) {
        this.jTableComercio = jTableComercio;
    }

    public void setjComboBoxCategoria(JComboBox<String> jComboBoxCategoria) {
        this.jComboBoxCategoria = jComboBoxCategoria;
    }

    public JComboBox<String> getjComboBoxRubro() {
        return jComboBoxRubro;
    }

    public JLabel getTxtID1() {
        return txtID1;
    }

    public void setTxtID1(JLabel txtID1) {
        this.txtID1 = txtID1;
    }

    public JLabel getJNombreComercio() {
        return jNombreComercio;
    }

    public void setjComboBoxRubro(JComboBox<String> jComboBoxRubro) {
        this.jComboBoxRubro = jComboBoxRubro;
    }

    public GestionPedido getControlVista() {
        if (controlVista == null) {
            synchronized (GestionPedido.class) {
                controlVista = new GestionPedido();
            }
        }
        return controlVista;
    }

    public void setControlVista(GestionPedido controlVista) {
        this.controlVista = controlVista;
    }

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        this.getControlVista().llenaJComboBoxCategoria(jComboBoxCategoria);
    }

    public void llenaJComboBoxRubro(JComboBox jComboBoxRubro) {
        this.getControlVista().llenaJComboBoxRubro(jComboBoxRubro);
    }

    public FrmPrincipalUsuario getDesktop() {
        return desktop;
    }

    public void setDesktop(FrmPrincipalUsuario desktop) {
        this.desktop = desktop;
    }

    public JButton getjButton10() {
        return btnQuitarProducto;
    }

    public void setjButton10(JButton jButton10) {
        this.btnQuitarProducto = jButton10;
    }

    public JButton getjButton11() {
        return jButton11;
    }

    public void setjButton11(JButton jButton11) {
        this.jButton11 = jButton11;
    }

    public JButton getjButton12() {
        return jButton12;
    }

    public void setjButton12(JButton jButton12) {
        this.jButton12 = jButton12;
    }

    public JButton getjButton2() {
        return btnHacerPedido;
    }

    public void setjButton2(JButton jButton2) {
        this.btnHacerPedido = jButton2;
    }



    public JButton getjButton5() {
        return btnAgregarAPedido;
    }

    public void setjButton5(JButton jButton5) {
        this.btnAgregarAPedido = jButton5;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public void setjButton9(JButton jButton9) {
        this.jButton9 = jButton9;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBoxCategoria;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBoxCategoria = jComboBox1;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBoxRubro;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBoxRubro = jComboBox2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jNombreComercio;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jNombreComercio = jLabel7;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JTable getjTable1() {
        return jTableComercio;
    }

    public void setjTable1(JTable jTable1) {
        this.jTableComercio = jTable1;
    }

    public JTable getjTable2() {
        return jTableCarro;
    }

    public void setjTable2(JTable jTable2) {
        this.jTableCarro = jTable2;
    }

    public JTable getjTable3() {
        return jTable3;
    }

    public void setjTable3(JTable jTable3) {
        this.jTable3 = jTable3;
    }

    public JTable getjTableProducto() {
        return jTableProducto;
    }

    public void setjTableProducto(JTable jTableProducto) {
        this.jTableProducto = jTableProducto;
    }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextField txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JComboBox<String> getjComboBoxHora() {
        return jComboBoxHora;
    }

    public void setjComboBoxHora(JComboBox<String> jComboBoxHora) {
        this.jComboBoxHora = jComboBoxHora;
    }

    public JComboBox<String> getjComboBoxMinuto() {
        return jComboBoxMinuto;
    }

    public void setjComboBoxMinuto(JComboBox<String> jComboBoxMinuto) {
        this.jComboBoxMinuto = jComboBoxMinuto;
    }

    public JTextField getTxtMontoTotal() {
        return txtMontoTotal;
    }

    public void setTxtMontoTotal(JTextField txtMontoTotal) {
        this.txtMontoTotal = txtMontoTotal;
    }

    public JTextField getjTextField7() {
        return jTextField7;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jTextField7 = jTextField7;
    }

    public JTextField getjTextField8() {
        return jTextField8;
    }

    public void setjTextField8(JTextField jTextField8) {
        this.jTextField8 = jTextField8;
    }

    public JLabel getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JLabel txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JLabel getTxtID() {
        return txtID;
    }

    public void setTxtID(JLabel txtID) {
        this.txtID = txtID;
    }

    public JLabel getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JLabel txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JLabel getTxtRuta2() {
        return txtRuta2;
    }

    public void setTxtRuta2(JLabel txtRuta2) {
        this.txtRuta2 = txtRuta2;
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
            java.util.logging.Logger.getLogger(FrmPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAPedido;
    private javax.swing.JButton btnBuscarComercio;
    private javax.swing.JButton btnHacerPedido;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.ButtonGroup buttonGroupFiltro;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JComboBox<String> jComboBoxMinuto;
    private javax.swing.JComboBox<String> jComboBoxRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jNombreComercio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableCarro;
    private javax.swing.JTable jTableComercio;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton rbtnPorCategoriaRubro;
    private javax.swing.JRadioButton rbtnPorNombre;
    private javax.swing.JRadioButton rbtnSoloCategoria;
    private javax.swing.JRadioButton rbtnSoloRubro;
    private javax.swing.JTextField txtBuscarComercio;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtID1;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtRuta2;
    // End of variables declaration//GEN-END:variables

}
