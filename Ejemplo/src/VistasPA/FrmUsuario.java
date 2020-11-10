/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasPA;

import Hibernate.GestorHibernate;
import Interfaz.ControladorPA.ControladorUsuario;
import Interfaz.ControladorPA.ControladorVistaUsuario;
import ModelosPA.Usuario;
//import Modelos.GestionProyecto.Usuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CrapBoy
 */
public class FrmUsuario extends javax.swing.JFrame {
    
    ControladorVistaUsuario controlVista;
    ControladorUsuario oper;
    
    
    /**
     * Creates new form FrmUsuario
     */
    public FrmUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        oper = new ControladorUsuario();
        this.getControlVista().setForm(this);
        
        /*is.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon("src/Imagenes/fondoVerde6.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono);
        this.repaint();*/
    }

    public ControladorVistaUsuario getControlVista() {
        if (controlVista == null) {
            synchronized (ControladorVistaUsuario.class) {
                controlVista = new ControladorVistaUsuario();

            }
        }
        return controlVista;
    }

    public void setControlVista(ControladorVistaUsuario controlVista) {
        this.controlVista = controlVista;
    }

    public ControladorUsuario getOper() {
        return oper;
    }

    public void setOper(ControladorUsuario oper) {
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

    public JLabel getFechaTxt() {
        return fechaTxt;
    }

    public void setFechaTxt(JLabel fechaTxt) {
        this.fechaTxt = fechaTxt;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
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
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
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
        fechaTxt = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Crea una cuenta como Comercio");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 210, 30));

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
        txtNombre.setText("Nombre");
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
        txtEmail.setText("Email");
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 20));

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setText("______________________________");
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtPassword.setBackground(new java.awt.Color(153, 204, 0));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Contraseña");
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 20));

        direccionTxt.setBackground(new java.awt.Color(255, 255, 255));
        direccionTxt.setForeground(new java.awt.Color(255, 255, 255));
        direccionTxt.setText("______________________________");
        jPanel1.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 20));

        txtDireccion.setBackground(new java.awt.Color(153, 204, 0));
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setText("Dirección");
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 20));

        telefonoTxt.setBackground(new java.awt.Color(255, 255, 255));
        telefonoTxt.setForeground(new java.awt.Color(255, 255, 255));
        telefonoTxt.setText("______________________________");
        jPanel1.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(153, 204, 0));
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setText("Teléfono");
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 20));

        fechaTxt.setBackground(new java.awt.Color(255, 255, 255));
        fechaTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaTxt.setText("______________________________");
        jPanel1.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        txtFecha.setBackground(new java.awt.Color(153, 204, 0));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Fecha de Nacimiento");
        txtFecha.setBorder(null);
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 20));

        apellidoTxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setText("______________________________");
        jPanel1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        txtApellido.setBackground(new java.awt.Color(153, 204, 0));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText("Apellido");
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
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
            //LO QUE HAGO ACA ES, CREAR UN OBJETO USUARIO Y PASERLE TODOS ESOS DATOS Y LLAMAR A LA FUNCION
            // GUARDAR USUARIO QUE CREE YO,que esta en el gestor del HIBERNATE (controlador), AHORA ESTO ES LA VISTA
            
         this.getControlVista().Guardar();
        /*Usuario user = new Usuario(this.txtPassword.getText(),this.txtNombre.getText(), this.txtApellido.getText(),
                                    this.txtEmail.getText(),this.txtDireccion.getText(),this.txtTelefono.getText(),
                                    this.txtFecha.getText());*/
        //public Usuario(String password, String nombre, String apellido, String email, String direccion, String telefono, String fechaNac) {

            //HACER CLICK ACA PARA SEGUIR LA EXPLICACION
        //oper.guardarUsuario(user);  //Long.parseLong(this.txtId.getText()  esto lo guarde, porque estaba probando
        // TODO add your handling code here:
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Frmlogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmComercio().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoTxt;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel direccionTxt;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
