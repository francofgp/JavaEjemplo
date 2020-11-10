/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasPA;

import Interfaz.ControladorPA.ControladorVistaLogin;
import VistasPA.FrmUsuario;
import VistasPA.FrmComercio;
import VistasPA.FrmPrincipalUsuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import VistasPA.FrmAdmin;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Chelo
 */
public class Frmlogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    ControladorVistaLogin controlVista;
    Frmlogin desktop=this;
    public Frmlogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getControlVista().setForm(desktop);
       
        /*ImageIcon imagen1 = new ImageIcon("src/Imagenes/fondoVerde6.jpg");
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono);
        this.repaint();
        
        ImageIcon imagen2 = new ImageIcon("src/Imagenes/comercioIcono.png");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(comercioIcono.getWidth(),comercioIcono.getHeight(),Image.SCALE_DEFAULT));
        comercioIcono.setIcon(icono2);
        this.repaint(); 
        */
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2_Ingresar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        checkBoxComercio = new javax.swing.JCheckBox();
        jLabel4_Contrase�a = new javax.swing.JLabel();
        jLabel2_Usuario = new javax.swing.JLabel();

        jButton5.setBackground(new java.awt.Color(153, 204, 0));
        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 204, 0));
        jButton5.setText("Crear una cuenta");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 204, 0));
        jButton7.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 204, 0));
        jButton7.setText("Crear una cuenta");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        usuarioText.setBackground(new java.awt.Color(153, 204, 0));
        usuarioText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioText.setBorder(null);
        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 145, 230, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EAT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DELIVERY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");
        jLabel3.setToolTipText("");
        jLabel3.setMaximumSize(new java.awt.Dimension(85, 19));
        jLabel3.setMinimumSize(new java.awt.Dimension(85, 19));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 30));
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        jButton1.setBackground(new java.awt.Color(153, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 30, 20));

        jButton2_Ingresar.setBackground(new java.awt.Color(153, 204, 0));
        jButton2_Ingresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_Ingresar.setText("INICIAR SESI�N");
        jButton2_Ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2_Ingresar.setContentAreaFilled(false);
        jButton2_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 150, 30));

        jPasswordField1.setBackground(new java.awt.Color(153, 204, 0));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 230, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("________________________________________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(153, 204, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 204, 0));
        jButton4.setText("Registra tu negocio");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 150, 50));

        jButton2.setBackground(new java.awt.Color(153, 204, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 204, 0));
        jButton2.setText("Crear una cuenta");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 20));

        jLabel2.setBackground(java.awt.Color.black);
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("�No ten�s una cuenta?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 130, 30));

        jButton6.setBackground(new java.awt.Color(153, 204, 0));
        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 204, 0));
        jButton6.setText("Crear Admin");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 20));

        jButton3.setBackground(new java.awt.Color(153, 204, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 330, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 320, 100));

        checkBoxComercio.setBackground(new java.awt.Color(153, 204, 0));
        checkBoxComercio.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        checkBoxComercio.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxComercio.setText("Soy un comercio");
        jPanel1.add(checkBoxComercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4_Contrase�a.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4_Contrase�a.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_Contrase�a.setText("Contrase�a");
        jPanel1.add(jLabel4_Contrase�a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel2_Usuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_Usuario.setText("Email");
        jPanel1.add(jLabel2_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public ControladorVistaLogin getControlVista() {
        if (controlVista == null) {
            synchronized (ControladorVistaLogin.class) {
                controlVista = new ControladorVistaLogin();

            }
        }
        return controlVista;    
    }

    public void setControlVista(ControladorVistaLogin controlVista) {
        this.controlVista = controlVista;
    }

    public Frmlogin getDesktop() {
        return desktop;
    }

    public void setDesktop(Frmlogin desktop) {
        this.desktop = desktop;
    }

    public JCheckBox getCheckBoxComercio() {
        return checkBoxComercio;
    }

    public void setCheckBoxComercio(JCheckBox checkBoxComercio) {
        this.checkBoxComercio = checkBoxComercio;
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

    public JButton getjButton2_Ingresar() {
        return jButton2_Ingresar;
    }

    public void setjButton2_Ingresar(JButton jButton2_Ingresar) {
        this.jButton2_Ingresar = jButton2_Ingresar;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
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

    public JLabel getjLabel2_Usuario() {
        return jLabel2_Usuario;
    }

    public void setjLabel2_Usuario(JLabel jLabel2_Usuario) {
        this.jLabel2_Usuario = jLabel2_Usuario;
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

    public JLabel getjLabel4_Contrase�a() {
        return jLabel4_Contrase�a;
    }

    public void setjLabel4_Contrase�a(JLabel jLabel4_Contrase�a) {
        this.jLabel4_Contrase�a = jLabel4_Contrase�a;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
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

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public void setjPasswordField1(JPasswordField jPasswordField1) {
        this.jPasswordField1 = jPasswordField1;
    }

    public JTextField getUsuarioText() {
        return usuarioText;
    }

    public void setUsuarioText(JTextField usuarioText) {
        this.usuarioText = usuarioText;
    }

    
    
    private void jButton2_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_IngresarActionPerformed
        
        if(checkBoxComercio.isSelected()){
            if(this.getControlVista().ingresarComercio()){
                this.setVisible(false);
            }            
        }else{
        this.getControlVista().ingresarUsuario();
        this.setVisible(false);
        }
        
        //new FrmPrincipalUsuario().setVisible(true);
        //this.setVisible(false);
        //String password = new String(jPasswordField1.getPassword());
        //Hibernate.GestorHibernate.Usuario(jLabel2_Usuario.getText(),password);
    }//GEN-LAST:event_jButton2_IngresarActionPerformed

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new FrmComercio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FrmUsuario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //new FrmComercio().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new FrmAdmin().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxComercio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2_Ingresar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_Usuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4_Contrase�a;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables



}
