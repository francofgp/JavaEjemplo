package VistasPA;

import com.toedter.calendar.JDateChooser;
import controladoresCU.RegistroUsuario;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmUsuario extends javax.swing.JFrame {

    private RegistroUsuario oper;

    public FrmUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        oper = new RegistroUsuario();
        this.getOper().setForm(this);

        TextPrompt nom = new TextPrompt("Nombre", txtNombre);
        TextPrompt des = new TextPrompt("Apellido", txtApellido);
        TextPrompt email = new TextPrompt("Email", txtEmail);
        TextPrompt direcc = new TextPrompt("Direccion", txtDireccion);
        TextPrompt contrasena = new TextPrompt("Contraseña", txtPassword);
        TextPrompt telefono = new TextPrompt("Telefono", txtTelefono);

    }

    public RegistroUsuario getControlVista() {
        if (oper == null) {
            synchronized (RegistroUsuario.class) {
                oper = new RegistroUsuario();

            }
        }
        return oper;
    }

    public RegistroUsuario getOper() {
        return oper;
    }

    public void setOper(RegistroUsuario oper) {
        this.oper = oper;
    }

    public JLabel getApellidoTxt() {
        return apellidoTxt;
    }

    public void setApellidoTxt(JLabel apellidoTxt) {
        this.apellidoTxt = apellidoTxt;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JLabel getDireccionTxt() {
        return direccionTxt;
    }

    public void setDireccionTxt(JLabel direccionTxt) {
        this.direccionTxt = direccionTxt;
    }

    public JLabel getEmailTxt() {
        return emailTxt;
    }

    public void setEmailTxt(JLabel emailTxt) {
        this.emailTxt = emailTxt;
    }



    public JButton getjButton2() {
        return btnVolver;
    }

    public JDateChooser getDataFecha() {
        return dataFecha;
    }

    public void setDataFecha(JDateChooser dataFecha) {
        this.dataFecha = dataFecha;
    }

    public void setjButton2(JButton jButton2) {
        this.btnVolver = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
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

    public JLabel getNombreTxt() {
        return nombreTxt;
    }

    public void setNombreTxt(JLabel nombreTxt) {
        this.nombreTxt = nombreTxt;
    }

    public JLabel getPasswordTxt() {
        return passwordTxt;
    }

    public void setPasswordTxt(JLabel passwordTxt) {
        this.passwordTxt = passwordTxt;
    }

    public JLabel getTelefonoTxt() {
        return telefonoTxt;
    }

    public void setTelefonoTxt(JLabel telefonoTxt) {
        this.telefonoTxt = telefonoTxt;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }



    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        emailTxt = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dataFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("CREAR CUENTA");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EAT");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 60, -1));

        jLabel10.setBackground(new java.awt.Color(153, 204, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DELIVERY");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 260, 140, -1));

        nombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.setText("______________________________");
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtNombre.setBackground(new java.awt.Color(153, 204, 0));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, 20));

        emailTxt.setBackground(new java.awt.Color(255, 255, 255));
        emailTxt.setForeground(new java.awt.Color(255, 255, 255));
        emailTxt.setText("______________________________");
        jPanel1.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtEmail.setBackground(new java.awt.Color(153, 204, 0));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 20));

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setText("______________________________");
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtPassword.setBackground(new java.awt.Color(153, 204, 0));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, -1));

        direccionTxt.setBackground(new java.awt.Color(255, 255, 255));
        direccionTxt.setForeground(new java.awt.Color(255, 255, 255));
        direccionTxt.setText("______________________________");
        jPanel1.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 20));

        txtDireccion.setBackground(new java.awt.Color(153, 204, 0));
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 20));

        telefonoTxt.setBackground(new java.awt.Color(255, 255, 255));
        telefonoTxt.setForeground(new java.awt.Color(255, 255, 255));
        telefonoTxt.setText("______________________________");
        jPanel1.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

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

        apellidoTxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setText("______________________________");
        jPanel1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        txtApellido.setBackground(new java.awt.Color(153, 204, 0));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 200, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Completá tus datos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 204, 0));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(153, 204, 0));
        btnVolver.setText("<");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton3.setContentAreaFilled(false);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 310));
        jPanel1.add(dataFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        this.getOper().guardar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new Frmlogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoTxt;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser dataFecha;
    private javax.swing.JLabel direccionTxt;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JLabel telefonoTxt;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
