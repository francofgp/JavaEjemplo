package VistasPA;

import controladoresCU.RegistroAdmin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmAdmin extends javax.swing.JFrame {

    RegistroAdmin oper;
    FrmAdmin desktop=this;
    public FrmAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        oper = new RegistroAdmin();
        this.getControlVista().setForm(desktop);

        TextPrompt nombre = new TextPrompt("Nombre", txtNombre);
        TextPrompt contraseña = new TextPrompt("Contraseña", txtPassword);
    }

    public RegistroAdmin getOper() {
        return oper;
    }

    public void setOper(RegistroAdmin oper) {
        this.oper = oper;
    }

    public RegistroAdmin getControlVista() {
        if (oper == null) {
            synchronized (RegistroAdmin.class) {
                oper = new RegistroAdmin();

            }
        }
        return oper;
    }

    public void setControlVista(RegistroAdmin oper) {
        this.oper = oper;
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

    public JLabel getjLabel10() {
        return jDelivery;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jDelivery = jLabel10;
    }

    public JLabel getjLabel7() {
        return jCompletaTusDatos;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jCompletaTusDatos = jLabel7;
    }

    public JLabel getjLabel9() {
        return jEat;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jEat = jLabel9;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jEat = new javax.swing.JLabel();
        jDelivery = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jCompletaTusDatos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, 30));

        jEat.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jEat.setForeground(new java.awt.Color(255, 255, 255));
        jEat.setText("EAT");
        jPanel1.add(jEat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 60, -1));

        jDelivery.setBackground(new java.awt.Color(153, 204, 0));
        jDelivery.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jDelivery.setForeground(new java.awt.Color(255, 255, 255));
        jDelivery.setText("DELIVERY");
        jPanel1.add(jDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 140, -1));

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

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setText("______________________________");
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtPassword.setBackground(new java.awt.Color(153, 204, 0));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 20));

        jCompletaTusDatos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jCompletaTusDatos.setForeground(new java.awt.Color(255, 255, 255));
        jCompletaTusDatos.setText("Completá tus datos");
        jPanel1.add(jCompletaTusDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.getControlVista().guardar();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.getControlVista().salirse();

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jCompletaTusDatos;
    private javax.swing.JLabel jDelivery;
    private javax.swing.JLabel jEat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
