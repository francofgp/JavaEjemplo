package VistasPA;

import Interfaz.ControladorPA.ControladorVistaPrincipalComercio;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FrmPrincipalComercio extends javax.swing.JFrame {

    ControladorVistaPrincipalComercio controlVista;
    FrmPrincipalComercio desktop = this;
    FrmProducto frmProducto;

    public FrmPrincipalComercio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getControlVista();
        this.getControlVista().setForm(desktop);
    }

    public JTable getjTablePedidos() {
        return jTablePedidos;
    }

    public void setjTablePedidos(JTable jTablePedidos) {
        this.jTablePedidos = jTablePedidos;
    }

    public JTable getjTableProductos() {
        return jTableProductos;
    }

    public void setjTableProductos(JTable jTableProductos) {
        this.jTableProductos = jTableProductos;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JLabel getTxtID1() {
        return txtID1;
    }

    public void setTxtID1(JLabel txtID1) {
        this.txtID1 = txtID1;
    }

    public JTable getjTableProductoPedidos() {
        return jTableProductoPedidos;
    }

    public void setjTableProductoPedidos(JTable jTableProductoPedidos) {
        this.jTableProductoPedidos = jTableProductoPedidos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        btnVolverLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductoPedidos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnDarDeBaja = new javax.swing.JButton();
        btnDarDeBaja1 = new javax.swing.JButton();
        dataFecha = new com.toedter.calendar.JDateChooser();
        btnBuscarPorFecha = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JButton();

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

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 20, -1));

        txtID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtID.setText("Comercio:");
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 130, -1));

        btnVolverLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverLogin.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btnVolverLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverLogin.setText("Volver al Login");
        btnVolverLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnVolverLogin.setContentAreaFilled(false);
        btnVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 120, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 40, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setText("Comercio:");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Comercio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setText("Comercio:");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Calificacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 90, -1));

        txtID1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtID1.setText("Calificacion");
        jPanel1.add(txtID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 130, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Total", "Calificacion", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);
        if (jTablePedidos.getColumnModel().getColumnCount() > 0) {
            jTablePedidos.getColumnModel().getColumn(0).setResizable(false);
            jTablePedidos.getColumnModel().getColumn(1).setResizable(false);
            jTablePedidos.getColumnModel().getColumn(2).setResizable(false);
            jTablePedidos.getColumnModel().getColumn(3).setResizable(false);
            jTablePedidos.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 460, 160));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Productos de los pedidos");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 20));

        btnNuevo.setBackground(new java.awt.Color(153, 204, 0));
        btnNuevo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(153, 204, 0));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 100, 30));

        jTableProductoPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Categoria", "Precio", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProductoPedidos);
        if (jTableProductoPedidos.getColumnModel().getColumnCount() > 0) {
            jTableProductoPedidos.getColumnModel().getColumn(0).setResizable(false);
            jTableProductoPedidos.getColumnModel().getColumn(1).setResizable(false);
            jTableProductoPedidos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductoPedidos.getColumnModel().getColumn(3).setResizable(false);
            jTableProductoPedidos.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 460, 130));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Productos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 70, 20));

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Categoria", "Precio", "ID", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setResizable(false);
            jTableProductos.getColumnModel().getColumn(1).setResizable(false);
            jTableProductos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductos.getColumnModel().getColumn(3).setResizable(false);
            jTableProductos.getColumnModel().getColumn(4).setResizable(false);
            jTableProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 500, 340));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Pedidos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 20));

        btnModificar.setBackground(new java.awt.Color(153, 204, 0));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(153, 204, 0));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 100, 30));

        btnEliminar.setBackground(new java.awt.Color(153, 204, 0));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(153, 204, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 100, 30));

        btnDarDeBaja.setBackground(new java.awt.Color(153, 204, 0));
        btnDarDeBaja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDarDeBaja.setForeground(new java.awt.Color(153, 204, 0));
        btnDarDeBaja.setText("Dar de baja");
        btnDarDeBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnDarDeBaja.setContentAreaFilled(false);
        btnDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeBajaActionPerformed(evt);
            }
        });
        jPanel2.add(btnDarDeBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 100, 30));

        btnDarDeBaja1.setBackground(new java.awt.Color(153, 204, 0));
        btnDarDeBaja1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDarDeBaja1.setForeground(new java.awt.Color(153, 204, 0));
        btnDarDeBaja1.setText("Dar de alta");
        btnDarDeBaja1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnDarDeBaja1.setContentAreaFilled(false);
        btnDarDeBaja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeBaja1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDarDeBaja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 100, 30));
        jPanel2.add(dataFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, 30));

        btnBuscarPorFecha.setBackground(new java.awt.Color(153, 204, 0));
        btnBuscarPorFecha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBuscarPorFecha.setForeground(new java.awt.Color(153, 204, 0));
        btnBuscarPorFecha.setText("Buscar");
        btnBuscarPorFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnBuscarPorFecha.setContentAreaFilled(false);
        btnBuscarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorFechaActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarPorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 110, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setText("Buscar pedidos por fecha");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 210, 20));

        btnMostrarTodos.setBackground(new java.awt.Color(153, 204, 0));
        btnMostrarTodos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMostrarTodos.setForeground(new java.awt.Color(153, 204, 0));
        btnMostrarTodos.setText("Mostrar Todos");
        btnMostrarTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnMostrarTodos.setContentAreaFilled(false);
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.getControlVista().nuevoProducto();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        this.getControlVista().cargarProductosPedido();
    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.getControlVista().modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.getControlVista().eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaActionPerformed
        this.getControlVista().darDeBaja();
    }//GEN-LAST:event_btnDarDeBajaActionPerformed

    private void btnDarDeBaja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBaja1ActionPerformed
        this.getControlVista().darDeAlta();
    }//GEN-LAST:event_btnDarDeBaja1ActionPerformed

    private void btnBuscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorFechaActionPerformed
        this.getControlVista().buscar();
    }//GEN-LAST:event_btnBuscarPorFechaActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        this.getControlVista().cargarPedido();
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
    this.getControlVista().cerrarse();
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalComercio().setVisible(true);

            }
        });
    }

    public ControladorVistaPrincipalComercio getControlVista() {
        if (controlVista == null) {
            synchronized (ControladorVistaPrincipalComercio.class) {
                controlVista = new ControladorVistaPrincipalComercio();

            }
        }
        return controlVista;
    }

    public void setControlVista(ControladorVistaPrincipalComercio controlVista) {
        this.controlVista = controlVista;
    }



    public JDateChooser getDataFecha() {
        return dataFecha;
    }

    public void setDataFecha(JDateChooser dataFecha) {
        this.dataFecha = dataFecha;
    }
    



    public JButton getjButton5() {
        return btnVolverLogin;
    }

    public void setjButton5(JButton jButton5) {
        this.btnVolverLogin = jButton5;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return txtID;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.txtID = jLabel5;
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

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public FrmPrincipalComercio getDesktop() {
        return desktop;
    }

    public void setDesktop(FrmPrincipalComercio desktop) {
        this.desktop = desktop;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JLabel txtEmail) {
        this.txtEmail = txtEmail;
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorFecha;
    private javax.swing.JButton btnDarDeBaja;
    private javax.swing.JButton btnDarDeBaja1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolverLogin;
    private com.toedter.calendar.JDateChooser dataFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JTable jTableProductoPedidos;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtID1;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables



}
