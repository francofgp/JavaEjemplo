package VistasPA;

import Interfaz.ControladorPA.ControladorVentanaAdminPrincipal;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmVentanaAdmin extends javax.swing.JFrame {

    FrmVentanaAdmin desktop = this;
    ControladorVentanaAdminPrincipal controlVista;

    public FrmVentanaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getControlVista().setForm(desktop);
        cargarRubro();
        cargarCategoria();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevaCategoria = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        btnAceptar4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRubro = new javax.swing.JTable();
        btnAceptar5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        btnModificarCategoria = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnDarDeBaja = new javax.swing.JButton();
        btnDarDeBajaCategoria = new javax.swing.JButton();
        btnDarDeAlta = new javax.swing.JButton();
        btnDarDeAltaCategoria = new javax.swing.JButton();
        txtBuscarRubro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnMostrarTodos = new javax.swing.JButton();
        btnMostrarTodosCategoria = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        txtBuscarCategoria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolverLogin = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1274, 767));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaCategoria.setBackground(new java.awt.Color(153, 204, 0));
        btnNuevaCategoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnNuevaCategoria.setForeground(new java.awt.Color(153, 204, 0));
        btnNuevaCategoria.setText("Nuevo");
        btnNuevaCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnNuevaCategoria.setContentAreaFilled(false);
        btnNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 110, 30));

        btnAceptar1.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAceptar1.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptar1.setText("Nuevo");
        btnAceptar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptar1.setContentAreaFilled(false);
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 110, 30));

        btnEliminarCategoria.setBackground(new java.awt.Color(153, 204, 0));
        btnEliminarCategoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarCategoria.setForeground(new java.awt.Color(153, 204, 0));
        btnEliminarCategoria.setText("Eliminar");
        btnEliminarCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnEliminarCategoria.setContentAreaFilled(false);
        btnEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 110, 30));

        btnAceptar4.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAceptar4.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptar4.setText("Modificar");
        btnAceptar4.setToolTipText("");
        btnAceptar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptar4.setContentAreaFilled(false);
        btnAceptar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 110, 30));

        jTableRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "ID", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRubroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRubro);
        if (jTableRubro.getColumnModel().getColumnCount() > 0) {
            jTableRubro.getColumnModel().getColumn(0).setResizable(false);
            jTableRubro.getColumnModel().getColumn(1).setResizable(false);
            jTableRubro.getColumnModel().getColumn(2).setResizable(false);
            jTableRubro.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 570, 230));

        btnAceptar5.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAceptar5.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptar5.setText("Eliminar ");
        btnAceptar5.setToolTipText("");
        btnAceptar5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptar5.setContentAreaFilled(false);
        btnAceptar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 110, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elemento Seleccionado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Categoría");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "ID", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableCategoria);
        if (jTableCategoria.getColumnModel().getColumnCount() > 0) {
            jTableCategoria.getColumnModel().getColumn(0).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(1).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(2).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 570, 230));

        btnModificarCategoria.setBackground(new java.awt.Color(153, 204, 0));
        btnModificarCategoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnModificarCategoria.setForeground(new java.awt.Color(153, 204, 0));
        btnModificarCategoria.setText("Modificar ");
        btnModificarCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnModificarCategoria.setContentAreaFilled(false);
        btnModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 110, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Rubro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        btnDarDeBaja.setBackground(new java.awt.Color(153, 204, 0));
        btnDarDeBaja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDarDeBaja.setForeground(new java.awt.Color(153, 204, 0));
        btnDarDeBaja.setText("Dar de baja");
        btnDarDeBaja.setToolTipText("");
        btnDarDeBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnDarDeBaja.setContentAreaFilled(false);
        btnDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeBajaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDarDeBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 110, 30));

        btnDarDeBajaCategoria.setBackground(new java.awt.Color(153, 204, 0));
        btnDarDeBajaCategoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDarDeBajaCategoria.setForeground(new java.awt.Color(153, 204, 0));
        btnDarDeBajaCategoria.setText("Dar de baja");
        btnDarDeBajaCategoria.setToolTipText("");
        btnDarDeBajaCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnDarDeBajaCategoria.setContentAreaFilled(false);
        btnDarDeBajaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeBajaCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDarDeBajaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 110, 30));

        btnDarDeAlta.setBackground(new java.awt.Color(153, 204, 0));
        btnDarDeAlta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDarDeAlta.setForeground(new java.awt.Color(153, 204, 0));
        btnDarDeAlta.setText("Dar de alta");
        btnDarDeAlta.setToolTipText("");
        btnDarDeAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnDarDeAlta.setContentAreaFilled(false);
        btnDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeAltaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDarDeAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 110, 30));

        btnDarDeAltaCategoria.setBackground(new java.awt.Color(153, 204, 0));
        btnDarDeAltaCategoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDarDeAltaCategoria.setForeground(new java.awt.Color(153, 204, 0));
        btnDarDeAltaCategoria.setText("Dar de alta");
        btnDarDeAltaCategoria.setToolTipText("");
        btnDarDeAltaCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnDarDeAltaCategoria.setContentAreaFilled(false);
        btnDarDeAltaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeAltaCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDarDeAltaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 350, 110, 30));

        txtBuscarRubro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtBuscarRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 290, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setText("Buscar por nombre de rubro");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 210, 20));

        btnBuscar.setBackground(new java.awt.Color(153, 204, 0));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(153, 204, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 110, 30));

        btnMostrarTodos.setBackground(new java.awt.Color(153, 204, 0));
        btnMostrarTodos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMostrarTodos.setForeground(new java.awt.Color(153, 204, 0));
        btnMostrarTodos.setText("Mostrar Todos");
        btnMostrarTodos.setToolTipText("");
        btnMostrarTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnMostrarTodos.setContentAreaFilled(false);
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 110, 30));

        btnMostrarTodosCategoria.setBackground(new java.awt.Color(153, 204, 0));
        btnMostrarTodosCategoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMostrarTodosCategoria.setForeground(new java.awt.Color(153, 204, 0));
        btnMostrarTodosCategoria.setText("Mostrar Todas");
        btnMostrarTodosCategoria.setToolTipText("");
        btnMostrarTodosCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnMostrarTodosCategoria.setContentAreaFilled(false);
        btnMostrarTodosCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarTodosCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 70, 110, 30));

        btnBuscar1.setBackground(new java.awt.Color(153, 204, 0));
        btnBuscar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(153, 204, 0));
        btnBuscar1.setText("Buscar");
        btnBuscar1.setToolTipText("");
        btnBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnBuscar1.setContentAreaFilled(false);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 110, 30));

        txtBuscarCategoria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtBuscarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 290, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel13.setText("Buscar por nombre de la categoria");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1270, 510));

        jPanel3.setBackground(new java.awt.Color(153, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EAT");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DELIVERY");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

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
        jPanel3.add(btnVolverLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 160, 30));

        btnGenerarReporte.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarReporte.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btnGenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarReporte.setText("Generar Reporte Rubro");
        btnGenerarReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnGenerarReporte.setContentAreaFilled(false);
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        jPanel3.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 160, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public ControladorVentanaAdminPrincipal getControlVista() {
        if (controlVista == null) {
            synchronized (ControladorVentanaAdminPrincipal.class) {
                controlVista = new ControladorVentanaAdminPrincipal();

            }
        }
        return controlVista;
    }

    public void setControlVista(ControladorVentanaAdminPrincipal controlVista) {
        this.controlVista = controlVista;
    }

    public JButton getBtnAceptar1() {
        return btnAceptar1;
    }

    public void setBtnAceptar1(JButton btnAceptar1) {
        this.btnAceptar1 = btnAceptar1;
    }

    public JButton getBtnAceptar4() {
        return btnAceptar4;
    }

    public void setBtnAceptar4(JButton btnAceptar4) {
        this.btnAceptar4 = btnAceptar4;
    }

    public JButton getBtnAceptar5() {
        return btnAceptar5;
    }

    public void setBtnAceptar5(JButton btnAceptar5) {
        this.btnAceptar5 = btnAceptar5;
    }

    public JButton getBtnEliminarCategoria() {
        return btnEliminarCategoria;
    }

    public void setBtnEliminarCategoria(JButton btnEliminarCategoria) {
        this.btnEliminarCategoria = btnEliminarCategoria;
    }

    public JButton getBtnModificarCategoria() {
        return btnModificarCategoria;
    }

    public void setBtnModificarCategoria(JButton btnModificarCategoria) {
        this.btnModificarCategoria = btnModificarCategoria;
    }

    public JButton getBtnNuevaCategoria() {
        return btnNuevaCategoria;
    }

    public void setBtnNuevaCategoria(JButton btnNuevaCategoria) {
        this.btnNuevaCategoria = btnNuevaCategoria;
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

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getTxtBuscarRubro() {
        return txtBuscarRubro;
    }

    public JTextField getTxtBuscarCategoria() {
        return txtBuscarCategoria;
    }

    public void setTxtBuscarCategoria(JTextField txtBuscarCategoria) {
        this.txtBuscarCategoria = txtBuscarCategoria;
    }

    public void setTxtBuscarRubro(JTextField txtBuscarRubro) {
        this.txtBuscarRubro = txtBuscarRubro;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getjTableCategoria() {
        return jTableCategoria;
    }

    public void setjTableCategoria(JTable jTableCategoria) {
        this.jTableCategoria = jTableCategoria;
    }

    public JTable getjTableRubro() {
        return jTableRubro;
    }

    public void setjTableRubro(JTable jTableRubro) {
        this.jTableRubro = jTableRubro;
    }

    void cargarRubro() {
        this.getControlVista().cargarRubro();

    }

    void cargarCategoria() {
        this.getControlVista().cargarCategoria();

    }

    void limpiarTablaRubro() {
        this.getControlVista().limpiarTablaRubro();

    }

    void limpiarTablaCategoria() {
        this.getControlVista().limpiarTablaCategoria();
        /*
        while(jTableCategoria.getRowCount()!=0){
             ((DefaultTableModel)jTableCategoria.getModel()).removeRow(0);
        }
         */
    }

    public void conseguirRubro() {
        this.getControlVista().conseguirRubro();
    }

    public void conseguirCategoria() {
        this.getControlVista().conseguirCategoria();
    }


    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed
        this.getControlVista().nuevoCategoria();
    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        this.getControlVista().nuevo();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        this.getControlVista().eliminarCategoria();

    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnAceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar4ActionPerformed
        this.getControlVista().modificar();
    }//GEN-LAST:event_btnAceptar4ActionPerformed

    private void btnAceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar5ActionPerformed
        this.getControlVista().eliminar();
    }//GEN-LAST:event_btnAceptar5ActionPerformed

    private void jTableRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRubroMouseClicked

    }//GEN-LAST:event_jTableRubroMouseClicked

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        this.getControlVista().modificarCategoria();
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        this.setVisible(false);
        new Frmlogin().setVisible(true);
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private void btnDarDeBajaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaCategoriaActionPerformed
        this.getControlVista().darDeBajaCategoria();
    }//GEN-LAST:event_btnDarDeBajaCategoriaActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        this.getControlVista().reporteRubro();


// TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeAltaActionPerformed
        this.getControlVista().darDeAlta();
    }//GEN-LAST:event_btnDarDeAltaActionPerformed

    private void btnDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaActionPerformed
        this.getControlVista().darDeBaja();
    }//GEN-LAST:event_btnDarDeBajaActionPerformed

    private void btnDarDeAltaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeAltaCategoriaActionPerformed
        this.getControlVista().darDeAltaCategoria();
    }//GEN-LAST:event_btnDarDeAltaCategoriaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.getControlVista().buscarRubro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        this.getControlVista().mostrarTodosLosRubros();
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnMostrarTodosCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosCategoriaActionPerformed
        this.getControlVista().mostrarTodasLasCategorias();
    }//GEN-LAST:event_btnMostrarTodosCategoriaActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        this.getControlVista().buscarCategoria();
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentanaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnAceptar4;
    private javax.swing.JButton btnAceptar5;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnDarDeAlta;
    private javax.swing.JButton btnDarDeAltaCategoria;
    private javax.swing.JButton btnDarDeBaja;
    private javax.swing.JButton btnDarDeBajaCategoria;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnMostrarTodosCategoria;
    private javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCategoria;
    private javax.swing.JTable jTableRubro;
    private javax.swing.JTextField txtBuscarCategoria;
    private javax.swing.JTextField txtBuscarRubro;
    // End of variables declaration//GEN-END:variables

}
