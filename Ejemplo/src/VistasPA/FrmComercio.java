package VistasPA;

import com.toedter.calendar.JDateChooser;
import controladoresCU.RegistroComercio;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmComercio extends javax.swing.JFrame {

    private RegistroComercio oper;
    private FrmComercio desktop = this;


    public FrmComercio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getControlVista().setForm(desktop);
        this.llenaJComboBoxRubro(jComboBoxRubro);
        this.llenaJComboBoxCategoria(jComboBoxCategoria);
        TextPrompt nom = new TextPrompt("Nombre del comerciante", txtNombre);
        TextPrompt apellido = new TextPrompt("Apellido", txtApellido);
        TextPrompt email = new TextPrompt("Email", txtEmail);
        TextPrompt direccion = new TextPrompt("Direccion", txtDireccion);
        TextPrompt cuit = new TextPrompt("Cuit", txtCuit);
        TextPrompt telefono = new TextPrompt("Telefono", txtTelefono);
        TextPrompt contrasena = new TextPrompt("Contraseña", txtPassword);
        TextPrompt nombreLocal = new TextPrompt("Nombre Local", txtNombreLocal);
        TextPrompt direccionLocal = new TextPrompt("Nombre Direccion", txtDireccionLocal);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jDatosComercio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCompleta = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNombreLocal = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxRubro = new javax.swing.JComboBox<>();
        txtDireccionLocal = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        dataFecha = new com.toedter.calendar.JDateChooser();
        jSeleccRubro = new javax.swing.JLabel();
        jSeleccCateg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("CREAR COMERCIO");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 210, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EAT");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 60, -1));

        jLabel10.setBackground(new java.awt.Color(153, 204, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DELIVERY");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 180, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("______________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtNombre.setBackground(new java.awt.Color(153, 204, 0));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("______________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtEmail.setBackground(new java.awt.Color(153, 204, 0));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("______________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        txtPassword.setBackground(new java.awt.Color(153, 204, 0));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 200, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("______________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 20));

        txtDireccion.setBackground(new java.awt.Color(153, 204, 0));
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("__________________________________");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 530, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("______________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(153, 204, 0));
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 20));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("__________________________________");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 530, -1));

        txtFecha.setBackground(new java.awt.Color(153, 204, 0));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Fecha de Nacimiento");
        txtFecha.setBorder(null);
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 200, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("______________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("______________________________");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 220, -1));

        txtApellido.setBackground(new java.awt.Color(153, 204, 0));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 200, 20));

        jDatosComercio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jDatosComercio.setForeground(new java.awt.Color(255, 255, 255));
        jDatosComercio.setText("Datos de tu Comercio");
        jPanel1.add(jDatosComercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(153, 204, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 204, 0));
        jButton2.setText("<");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton3.setContentAreaFilled(false);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 630));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 630));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("______________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtCuit.setBackground(new java.awt.Color(153, 204, 0));
        txtCuit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCuit.setForeground(new java.awt.Color(255, 255, 255));
        txtCuit.setToolTipText("");
        txtCuit.setBorder(null);
        txtCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuitActionPerformed(evt);
            }
        });
        jPanel1.add(txtCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("______________________________");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("______________________________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jCompleta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jCompleta.setForeground(new java.awt.Color(255, 255, 255));
        jCompleta.setText("Completá tus datos");
        jPanel1.add(jCompleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("______________________________");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 220, -1));

        txtNombreLocal.setBackground(new java.awt.Color(153, 204, 0));
        txtNombreLocal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombreLocal.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreLocal.setToolTipText("");
        txtNombreLocal.setBorder(null);
        jPanel1.add(txtNombreLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 180, 20));

        jComboBoxCategoria.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCategoria.setToolTipText("");
        jComboBoxCategoria.setBorder(null);
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 170, 30));

        jComboBoxRubro.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jComboBoxRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rubro", "Item 2", "Item 3", "Item 4" }));
        jComboBoxRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRubroActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 170, 30));

        txtDireccionLocal.setBackground(new java.awt.Color(153, 204, 0));
        txtDireccionLocal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccionLocal.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccionLocal.setToolTipText("");
        txtDireccionLocal.setBorder(null);
        jPanel1.add(txtDireccionLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 20));

        jButton6.setBackground(new java.awt.Color(153, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("X");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 30, 20));
        jPanel1.add(dataFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 170, -1));

        jSeleccRubro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSeleccRubro.setForeground(new java.awt.Color(255, 255, 255));
        jSeleccRubro.setText("Seleccione un rubro");
        jPanel1.add(jSeleccRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jSeleccCateg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSeleccCateg.setForeground(new java.awt.Color(255, 255, 255));
        jSeleccCateg.setText("Seleccione una categoria");
        jPanel1.add(jSeleccCateg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setOper(RegistroComercio oper) {
        this.oper = oper;
    }

    public RegistroComercio getOper() {
        return oper;
    }

    public RegistroComercio getControlVista() {
        if (oper == null) {
            synchronized (RegistroComercio.class) {
                oper = new RegistroComercio();

            }
        }
        return oper;
    }

    public void setControlVista(RegistroComercio oper) {
        this.oper = oper;

    }

    public FrmComercio getDesktop() {
        return desktop;
    }

    public void setDesktop(FrmComercio desktop) {
        this.desktop = desktop;
    }
    
    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JDateChooser getDataFecha() {
        return dataFecha;
    }

    public void setDataFecha(JDateChooser dataFecha) {
        this.dataFecha = dataFecha;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JComboBox<String> getjComboBoxCategoria() {
        return jComboBoxCategoria;
    }

    public void setjComboBoxCategoria(JComboBox<String> jComboBoxCategoria) {
        this.jComboBoxCategoria = jComboBoxCategoria;
    }

    public JComboBox<String> getjComboBoxRubro() {
        return jComboBoxRubro;
    }

    public void setjComboBoxRubro(JComboBox<String> jComboBoxRubro) {
        this.jComboBoxRubro = jComboBoxRubro;
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

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jCompleta;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jCompleta = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
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

    public JLabel getjLabel7() {
        return jDatosComercio;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jDatosComercio = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
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

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtCuit() {
        return txtCuit;
    }

    public void setTxtCuit(JTextField txtCuit) {
        this.txtCuit = txtCuit;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtDireccionLocal() {
        return txtDireccionLocal;
    }

    public void setTxtDireccionLocal(JTextField txtDireccionLocal) {
        this.txtDireccionLocal = txtDireccionLocal;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNombreLocal() {
        return txtNombreLocal;
    }

    public void setTxtNombreLocal(JTextField txtNombreLocal) {
        this.txtNombreLocal = txtNombreLocal;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JTextField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.oper.guardar();


    }//GEN-LAST:event_btnAceptarActionPerformed


    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.getControlVista().salirse();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuitActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed

    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed


    private void jComboBoxRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRubroActionPerformed


            }//GEN-LAST:event_jComboBoxRubroActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        this.getControlVista().llenaJComboBoxCategoria(jComboBoxCategoria);
    }

    public void llenaJComboBoxRubro(JComboBox jComboBoxRubro) {
        this.getControlVista().llenaJComboBoxRubro(jComboBoxRubro);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmComercio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private com.toedter.calendar.JDateChooser dataFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxRubro;
    private javax.swing.JLabel jCompleta;
    private javax.swing.JLabel jDatosComercio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jSeleccCateg;
    private javax.swing.JLabel jSeleccRubro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionLocal;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreLocal;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
