/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasPA;

import Hibernate.GestorHibernate;

//import Modelos.GestionProyecto.Usuario;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controladoresCU.registrarProducto;
/**
 *
 * @author CrapBoy
 */
public class FrmProducto extends javax.swing.JFrame {
    
registrarProducto controlVista;
FrmProducto desktop=this;



    public FrmProducto() {
        initComponents();
        this.setLocationRelativeTo(null);//
        this.getControlVista().setForm(desktop);
        
        this.llenaJComboBoxCategoria(jComboBoxCategoria);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtRuta = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        LblImagen = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        btnAceptar1.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar1.setText("CREAR CUENTA");
        btnAceptar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAceptar1.setContentAreaFilled(false);
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EAT");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 60, -1));

        jLabel10.setBackground(new java.awt.Color(153, 204, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DELIVERY");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 140, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("______________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtNombre.setBackground(new java.awt.Color(153, 204, 0));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombre");
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("______________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(153, 204, 0));
        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setText("Precio");
        txtPrecio.setBorder(null);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("______________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(153, 204, 0));
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setText("Descripción");
        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 30));

        jTextField3.setBackground(new java.awt.Color(153, 204, 0));
        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Categoría");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 30));

        txtRuta.setBackground(new java.awt.Color(255, 255, 255));
        txtRuta.setForeground(new java.awt.Color(153, 204, 0));
        txtRuta.setText("_____________________________________________________");
        jPanel1.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 300, -1));

        jTextField4.setBackground(new java.awt.Color(153, 204, 0));
        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 204, 0));
        jTextField4.setText("Ruta de la imagen");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 300, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registar Producto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        jButton3.setContentAreaFilled(false);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 310));
        jPanel1.add(LblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 370, 180));

        btnCrear.setBackground(new java.awt.Color(153, 204, 0));
        btnCrear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR PRODUCTO");
        btnCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCrear.setContentAreaFilled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 30));

        jComboBoxCategoria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 0), 2, true));
        jComboBoxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, -1));

        jButton4.setBackground(new java.awt.Color(153, 204, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("X");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int estadoCategoria = 0;
    
    
    
    public registrarProducto getOper() {
        return controlVista;
    }

    public void setOper(registrarProducto oper) {
        this.controlVista = oper;
    }

    public registrarProducto getControlVista() {
        if (controlVista == null) {
            synchronized (registrarProducto.class) {
                controlVista = new registrarProducto();

            }
        }
        return controlVista;    }

    public void setControlVista(registrarProducto controlVista) {
        this.controlVista = controlVista;
    }

    public FrmProducto getDesktop() {
        return desktop;
    }

    public void setDesktop(FrmProducto desktop) {
        this.desktop = desktop;
    }

    public JLabel getLblImagen() {
        return LblImagen;
    }

    public void setLblImagen(JLabel LblImagen) {
        this.LblImagen = LblImagen;
    }



    public JButton getBtnAceptar1() {
        return btnAceptar1;
    }

    public void setBtnAceptar1(JButton btnAceptar1) {
        this.btnAceptar1 = btnAceptar1;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JComboBox<String> getComboBoxCategoria() {
        return jComboBoxCategoria;
    }

    public void setComboBoxCategoria(JComboBox<String> comboBoxCategoria) {
        this.jComboBoxCategoria = comboBoxCategoria;
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

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
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

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    public JTextField getTxtPrecio() {
        
        
        
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio ) {
        
        
        this.txtPrecio = txtPrecio;
        
        
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextField txtPassword) {
        this.txtDescripcion = txtPassword;
    }

    public JLabel getTxtRuta() {
        return txtRuta;
    }

    public void setTxtRuta(JLabel txtRuta) {
        this.txtRuta = txtRuta;
    }
    
    
    
    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
                this.controlVista.guardar();


//String image =txtRuta.getText();
    //image = image.replace("\\","\\\\");
// TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    /*public Object buscarCategoriaPorId(Long id) {
        return controlVista.buscarCategoriaPorId(idCategoriaSeleccionado);
    }
    */
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        this.getControlVista().conseguirCategoriaSeleccionado();

    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblImagen;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtRuta;
    // End of variables declaration//GEN-END:variables


    public JComboBox<String> getjComboBoxCategoria() {
        return jComboBoxCategoria;
    }

    public void setjComboBoxCategoria(JComboBox<String> jComboBoxCategoria) {
        this.jComboBoxCategoria = jComboBoxCategoria;
    }
/*
    public Long getIdCategoriaSeleccionado() {
        return idCategoriaSeleccionado;
    }

    public void setIdCategoriaSeleccionado(Long idCategoriaSeleccionado) {
        this.idCategoriaSeleccionado = idCategoriaSeleccionado;
    }
*/
    public int getEstadoCategoria() {
        return estadoCategoria;
    }

    public void setEstadoCategoria(int estadoCategoria) {
        this.estadoCategoria = estadoCategoria;
    }
    


    private void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        this.getOper().llenaJComboBoxCategoria(jComboBoxCategoria);
    }




}
