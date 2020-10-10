/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasPA;

import Hibernate.GestorHibernate;
import Interfaz.ControladorPA.ControladorRubro;
import ModelosPA.Rubro;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chelo
 */
public class FrmVentanaAdmin extends javax.swing.JFrame {
    GestorHibernate oper;
    FrmRubro frmRubro;
    
    
    
    String nombre;
    String descripcion;
    Long ID;


    /**
     * Creates new form FrmComercio
     */
    public FrmVentanaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
         oper = new GestorHibernate();
         frmRubro = new FrmRubro();
         LoadRubro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        btnAceptar2 = new javax.swing.JButton();
        Recargar = new javax.swing.JButton();
        btnAceptar4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRubro = new javax.swing.JTable();
        btnAceptar5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        seleccionTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAceptar3 = new javax.swing.JButton();
        btnAceptar6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1274, 767));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptar.setText("Registrar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 130, 30));

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
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 30));

        btnAceptar2.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar2.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptar2.setText("Eliminar");
        btnAceptar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptar2.setContentAreaFilled(false);
        btnAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 130, 30));

        Recargar.setBackground(new java.awt.Color(153, 204, 0));
        Recargar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Recargar.setForeground(new java.awt.Color(153, 204, 0));
        Recargar.setText("Recargar Tabla");
        Recargar.setToolTipText("");
        Recargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        Recargar.setContentAreaFilled(false);
        Recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargarActionPerformed(evt);
            }
        });
        jPanel1.add(Recargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 110, 30));

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
        jPanel1.add(btnAceptar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 110, 30));

        jTableRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 230));

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
        jPanel1.add(btnAceptar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 110, 30));

        jLabel2.setText("Elemento Seleccionado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, -1));

        seleccionTxt.setText("No ha seleccionado ningun elemento");
        jPanel1.add(seleccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 500, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Rubro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripci�n", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, 230));

        btnAceptar3.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar3.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptar3.setText("Modificar ");
        btnAceptar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptar3.setContentAreaFilled(false);
        btnAceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 130, 30));

        btnAceptar6.setBackground(new java.awt.Color(153, 204, 0));
        btnAceptar6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar6.setForeground(new java.awt.Color(153, 204, 0));
        btnAceptar6.setText("Recargar");
        btnAceptar6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        btnAceptar6.setContentAreaFilled(false);
        btnAceptar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1270, 570));

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

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("email:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Configuracion");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton5.setContentAreaFilled(false);
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void LoadRubro(){
        List<Rubro> rubro = oper.RubroShow();
        if (rubro.size()>0){
            Iterator consulta = rubro.iterator();
            while(consulta.hasNext()){
                DefaultTableModel tabla = (DefaultTableModel)jTableRubro.getModel();
                Vector datos = new Vector();
                Rubro fila = (Rubro)consulta.next();
                datos.add(fila.getNombre());
                datos.add(fila.getDescripcion());
                datos.add(fila.getId());
                tabla.addRow(datos);
                }
        }else
            JOptionPane.showMessageDialog(null,"no hay registros");
    }
    
    void ClearTableRubro(){
        while(jTableRubro.getRowCount()!=0){
             ((DefaultTableModel)jTableRubro.getModel()).removeRow(0);
        }
    }
    
    public void conseguirValoresTxt(){
        DefaultTableModel model = (DefaultTableModel)jTableRubro.getModel();
        int selectedRowIndex = jTableRubro.getSelectedRow();
        ID = Long.parseLong(model.getValueAt(selectedRowIndex,2).toString());
        nombre = model.getValueAt(selectedRowIndex,0).toString();
        descripcion = model.getValueAt(selectedRowIndex,1).toString();

    }
    
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        new FrmCategoria().setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        new FrmRubro().setVisible(true);
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar2ActionPerformed

    private void RecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargarActionPerformed
        ClearTableRubro(); //limpio la tabla antes de cargar, para que no sume
                //por ejemplo si tengo 10 regs, y agrego 1 mas, no me traeria 11 sino 22, por eso limpio
        LoadRubro();
// TODO add your handling code here:
    }//GEN-LAST:event_RecargarActionPerformed

    private void btnAceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar4ActionPerformed
        //Primero Obtengo todos los valores de la tabla
        conseguirValoresTxt();
        frmRubro.modificar("1",nombre,descripcion,ID );
        frmRubro.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar4ActionPerformed

    private void btnAceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar5ActionPerformed
        //CONSIGO EL ID
        conseguirValoresTxt();
            //Long id;
            //DefaultTableModel model = (DefaultTableModel)jTableRubro.getModel();
            //int selectedRowIndex = jTableRubro.getSelectedRow();
            
            //id = Long.parseLong(model.getValueAt(selectedRowIndex,2).toString());
            
            oper.eliminarRubro(ID);
            
            ClearTableRubro();
            LoadRubro();
            
        // TODO add your handling code here:
        
        //System.out.println(id); //esto era para probar si no manqui�
    }//GEN-LAST:event_btnAceptar5ActionPerformed

    private void jTableRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRubroMouseClicked
            DefaultTableModel model = (DefaultTableModel)jTableRubro.getModel();
            int selectedRowIndex = jTableRubro.getSelectedRow();
            seleccionTxt.setText("Nombre: "+ model.getValueAt(selectedRowIndex,0).toString() + " "+
                    "Descripci�n: "+ model.getValueAt(selectedRowIndex,1).toString() + " "+
                    "ID: "+ model.getValueAt(selectedRowIndex,2).toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_jTableRubroMouseClicked

    private void btnAceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar3ActionPerformed

    private void btnAceptar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar6ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentanaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Recargar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnAceptar2;
    private javax.swing.JButton btnAceptar3;
    private javax.swing.JButton btnAceptar4;
    private javax.swing.JButton btnAceptar5;
    private javax.swing.JButton btnAceptar6;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableRubro;
    private javax.swing.JLabel seleccionTxt;
    // End of variables declaration//GEN-END:variables
}
