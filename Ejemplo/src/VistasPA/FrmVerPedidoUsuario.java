package VistasPA;

import Interfaz.ControladorPA.ControladorVentanaAdminPrincipal;
import ModelosPA.Usuario;
import controladoresCU.GestionCalificacion;
import controladoresCU.GestionPedido;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmVerPedidoUsuario extends javax.swing.JFrame {

    GestionCalificacion controlVista;
    FrmVerPedidoUsuario desktop = this;
    

    public FrmVerPedidoUsuario() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.getControlVista().setForm(desktop);
        this.getControlVista().activarCalificacion(false);
    }

    public GestionCalificacion getControlVista() {
        if (controlVista == null) {
            synchronized (GestionCalificacion.class) {
                controlVista = new GestionCalificacion();

            }
        }
        return controlVista;

    }

    public void setControlVista(GestionCalificacion controlVista) {
        this.controlVista = controlVista;
    }

    public JTable getjTableProducto() {
        return jTableProducto;
    }

    public void setjTableProducto(JTable jTableProducto) {
        this.jTableProducto = jTableProducto;
    }

    public void setjTablePedidos(JTable jTable1) {
        this.jTablePedidos = jTable1;
    }

    public JButton getBtnAceptarCancelarCalificacion() {
        return btnAceptarCancelarCalificacion;
    }

    public void setBtnAceptarCancelarCalificacion(JButton btnAceptarCancelarCalificacion) {
        this.btnAceptarCancelarCalificacion = btnAceptarCancelarCalificacion;
    }

    public JButton getBtnAceptarConfirmarCalificacion() {
        return btnAceptarConfirmarCalificacion;
    }

    public void setBtnAceptarConfirmarCalificacion(JButton btnAceptarConfirmarCalificacion) {
        this.btnAceptarConfirmarCalificacion = btnAceptarConfirmarCalificacion;
    }

    public JButton getBtnCalificar() {
        return btnCalificar;
    }

    public void setBtnCalificar(JButton btnCalificar) {
        this.btnCalificar = btnCalificar;
    }

    public JButton getBtnValor1() {
        return btnValor1;
    }

    public void setBtnValor1(JButton btnValor1) {
        this.btnValor1 = btnValor1;
    }

    public JButton getBtnValor2() {
        return btnValor2;
    }

    public void setBtnValor2(JButton btnValor2) {
        this.btnValor2 = btnValor2;
    }

    public JButton getBtnValor3() {
        return btnValor3;
    }

    public void setBtnValor3(JButton btnValor3) {
        this.btnValor3 = btnValor3;
    }

    public JButton getBtnValor4() {
        return btnValor4;
    }

    public void setBtnValor4(JButton btnValor4) {
        this.btnValor4 = btnValor4;
    }

    public JLabel getjLabelDescrip() {
        return jLabelDescrip;
    }

    public void setjLabelDescrip(JLabel jLabelDescrip) {
        this.jLabelDescrip = jLabelDescrip;
    }

    public JButton getBtnValor5() {
        return btnValor5;
    }

    public void setBtnValor5(JButton btnValor5) {
        this.btnValor5 = btnValor5;
    }

    public JLabel getjLabelDescripcion() {
        return jLabelDescripcion;
    }

    public void setjLabelDescripcion(JLabel jLabelDescripcion) {
        this.jLabelDescripcion = jLabelDescripcion;
    }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextField txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

//    public JTable getjTablePedido() {
//        
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        btnValor3 = new javax.swing.JButton();
        btnAceptarCancelarCalificacion = new javax.swing.JButton();
        btnValor1 = new javax.swing.JButton();
        btnValor4 = new javax.swing.JButton();
        btnValor5 = new javax.swing.JButton();
        btnValor2 = new javax.swing.JButton();
        btnCalificar = new javax.swing.JButton();
        btnAceptarConfirmarCalificacion = new javax.swing.JButton();
        jLabelDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabelDescrip = new javax.swing.JLabel();
        btnAceptarConfirmarCalificacion1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jScrollPane3.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 204, 0));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 20, 490));

        jPanel4.setBackground(new java.awt.Color(153, 204, 0));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 820, 20));

        jPanel2.setBackground(new java.awt.Color(153, 204, 0));
        jPanel2.setForeground(new java.awt.Color(102, 204, 0));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 830, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Total", "IDcompra", "NombreCliente", "Estado", "NombreComercio", "Calificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            jTablePedidos.getColumnModel().getColumn(5).setResizable(false);
            jTablePedidos.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 170));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Precio", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProducto);
        if (jTableProducto.getColumnModel().getColumnCount() > 0) {
            jTableProducto.getColumnModel().getColumn(0).setResizable(false);
            jTableProducto.getColumnModel().getColumn(1).setResizable(false);
            jTableProducto.getColumnModel().getColumn(2).setResizable(false);
            jTableProducto.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 730, 150));

        btnValor3.setBackground(new java.awt.Color(153, 204, 0));
        btnValor3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnValor3.setForeground(new java.awt.Color(153, 204, 0));
        btnValor3.setText("3");
        btnValor3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnValor3.setContentAreaFilled(false);
        btnValor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValor3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 30, 30));

        btnAceptarCancelarCalificacion.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptarCancelarCalificacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAceptarCancelarCalificacion.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptarCancelarCalificacion.setText("Cancelar");
        btnAceptarCancelarCalificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptarCancelarCalificacion.setContentAreaFilled(false);
        btnAceptarCancelarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCancelarCalificacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarCancelarCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 110, 30));

        btnValor1.setBackground(new java.awt.Color(153, 204, 0));
        btnValor1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnValor1.setForeground(new java.awt.Color(153, 204, 0));
        btnValor1.setText("1");
        btnValor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnValor1.setContentAreaFilled(false);
        btnValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValor1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 30, 30));

        btnValor4.setBackground(new java.awt.Color(153, 204, 0));
        btnValor4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnValor4.setForeground(new java.awt.Color(153, 204, 0));
        btnValor4.setText("4");
        btnValor4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnValor4.setContentAreaFilled(false);
        btnValor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValor4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 30, 30));

        btnValor5.setBackground(new java.awt.Color(153, 204, 0));
        btnValor5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnValor5.setForeground(new java.awt.Color(153, 204, 0));
        btnValor5.setText("5");
        btnValor5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnValor5.setContentAreaFilled(false);
        btnValor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValor5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 30, 30));

        btnValor2.setBackground(new java.awt.Color(153, 204, 0));
        btnValor2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnValor2.setForeground(new java.awt.Color(153, 204, 0));
        btnValor2.setText("2");
        btnValor2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnValor2.setContentAreaFilled(false);
        btnValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValor2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 30, 30));

        btnCalificar.setBackground(new java.awt.Color(153, 204, 0));
        btnCalificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCalificar.setForeground(new java.awt.Color(153, 204, 0));
        btnCalificar.setText("Calificar");
        btnCalificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnCalificar.setContentAreaFilled(false);
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 30));

        btnAceptarConfirmarCalificacion.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptarConfirmarCalificacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAceptarConfirmarCalificacion.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptarConfirmarCalificacion.setText("Aceptar");
        btnAceptarConfirmarCalificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptarConfirmarCalificacion.setContentAreaFilled(false);
        btnAceptarConfirmarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarConfirmarCalificacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarConfirmarCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 110, 30));

        jLabelDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setForeground(new java.awt.Color(153, 204, 0));
        jLabelDescripcion.setText("__________________________________________________");
        jPanel1.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 290, -1));

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 204, 0));
        txtDescripcion.setBorder(null);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 270, 20));

        jLabelDescrip.setBackground(new java.awt.Color(153, 204, 0));
        jLabelDescrip.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabelDescrip.setForeground(new java.awt.Color(153, 204, 0));
        jLabelDescrip.setText("Descripcion:");
        jPanel1.add(jLabelDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, 20));

        btnAceptarConfirmarCalificacion1.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptarConfirmarCalificacion1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAceptarConfirmarCalificacion1.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptarConfirmarCalificacion1.setText("Cancelar Pedido");
        btnAceptarConfirmarCalificacion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptarConfirmarCalificacion1.setContentAreaFilled(false);
        btnAceptarConfirmarCalificacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarConfirmarCalificacion1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarConfirmarCalificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 150, 30));

        jButton1.setBackground(new java.awt.Color(153, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 204, 0));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 470));

        jPanel5.setBackground(new java.awt.Color(153, 204, 0));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, -10, 30, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        // TODO add your handling code here:

        this.getControlVista().cargarProductosPedido();


    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void btnValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValor3ActionPerformed
        this.getControlVista().obtenerPuntaje(3.0f);
    }//GEN-LAST:event_btnValor3ActionPerformed

    private void btnAceptarCancelarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCancelarCalificacionActionPerformed
        this.getControlVista().cancelarCalificacion();
    }//GEN-LAST:event_btnAceptarCancelarCalificacionActionPerformed


    private void btnValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValor1ActionPerformed
        this.getControlVista().obtenerPuntaje(1.0f);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValor1ActionPerformed

    private void btnValor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValor4ActionPerformed
        this.getControlVista().obtenerPuntaje(4.0f);        // TODO add your handling code here:
    }//GEN-LAST:event_btnValor4ActionPerformed

    private void btnValor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValor5ActionPerformed
        this.getControlVista().obtenerPuntaje(5.0f);       // TODO add your handling code here:
    }//GEN-LAST:event_btnValor5ActionPerformed

    private void btnValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValor2ActionPerformed
        this.getControlVista().obtenerPuntaje(2.0f);
    }//GEN-LAST:event_btnValor2ActionPerformed

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed
        this.getControlVista().calificar();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalificarActionPerformed

    private void btnAceptarConfirmarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarConfirmarCalificacionActionPerformed
        this.getControlVista().aceptarCalificacion();
    }//GEN-LAST:event_btnAceptarConfirmarCalificacionActionPerformed

    private void btnAceptarConfirmarCalificacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarConfirmarCalificacion1ActionPerformed
        // TODO add your handling code here:
        this.getControlVista().cancelar();

    }//GEN-LAST:event_btnAceptarConfirmarCalificacion1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVerPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVerPedidoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCancelarCalificacion;
    private javax.swing.JButton btnAceptarConfirmarCalificacion;
    private javax.swing.JButton btnAceptarConfirmarCalificacion1;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnValor1;
    private javax.swing.JButton btnValor2;
    private javax.swing.JButton btnValor3;
    private javax.swing.JButton btnValor4;
    private javax.swing.JButton btnValor5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDescrip;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

//    private void setLocationRelativeTo(int i, int i0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


    public JTable getjTablePedidos() {

        return jTablePedidos;

    }

}
