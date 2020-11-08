/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasPA;

import Hibernate.GestorHibernate;
import Interfaz.ControladorPA.ControladorCategoria;
import Interfaz.ControladorPA.ControladorRubro;
import Interfaz.ControladorPA.ControladorVentanaAdmin;
import ModelosPA.Categoria;
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
    FrmCategoria frmCategoria;
    ControladorRubro rubro;
    ControladorCategoria categoria;
    
    String nombre;
    String descripcion;
    Long ID;
    ControladorVentanaAdmin controlAdmin;


    /**
     * Creates new form FrmComercio
     */
    public FrmVentanaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        oper = new GestorHibernate();
        controlAdmin = new ControladorVentanaAdmin();
        frmRubro = new FrmRubro();
        frmCategoria = new FrmCategoria();
        rubro = new ControladorRubro();
        categoria = new ControladorCategoria();
        LoadRubro();
        LoadCategoria();

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
        btnNuevaCategoria = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        btnAceptar4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRubro = new javax.swing.JTable();
        btnAceptar5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        seleccionTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        btnModificarCategoria = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
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
        jPanel1.add(btnNuevaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 110, 30));

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
        jPanel1.add(btnEliminarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 110, 30));

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
        jPanel1.add(btnAceptar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 110, 30));

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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elemento Seleccionado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, -1));

        seleccionTxt.setForeground(new java.awt.Color(255, 255, 255));
        seleccionTxt.setText("No ha seleccionado ningun elemento");
        jPanel1.add(seleccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 500, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Categor�a");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableCategoria);
        if (jTableCategoria.getColumnModel().getColumnCount() > 0) {
            jTableCategoria.getColumnModel().getColumn(0).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(1).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, 230));

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
        jPanel1.add(btnModificarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 110, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Rubro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

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
        jButton5.setText("Generar Reporte Rubro");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 160, 30));

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
            JOptionPane.showMessageDialog(null,"no hay registros de rubros");
    }
    
    void LoadCategoria(){
        List<Categoria> categoria = oper.CategoriaShow();
        if (categoria.size()>0){
            Iterator consulta = categoria.iterator();
            while(consulta.hasNext()){
                DefaultTableModel tabla = (DefaultTableModel)jTableCategoria.getModel();
                Vector datos = new Vector();
                Categoria fila = (Categoria)consulta.next();
                datos.add(fila.getNombre());
                datos.add(fila.getDescripcion());
                datos.add(fila.getId());
                tabla.addRow(datos);
                }
        }else
            JOptionPane.showMessageDialog(null,"no hay registros de categorias");
    }
    
    void ClearTableRubro(){
        while(jTableRubro.getRowCount()!=0){
             ((DefaultTableModel)jTableRubro.getModel()).removeRow(0);
        }
    }
        
    void ClearTableCategoria(){
        while(jTableCategoria.getRowCount()!=0){
             ((DefaultTableModel)jTableCategoria.getModel()).removeRow(0);
        }
    }
    
    public void conseguirValoresTxt(){
        DefaultTableModel model = (DefaultTableModel)jTableRubro.getModel();
        int selectedRowIndex = jTableRubro.getSelectedRow();
        ID = Long.parseLong(model.getValueAt(selectedRowIndex,2).toString());
        nombre = model.getValueAt(selectedRowIndex,0).toString();
        descripcion = model.getValueAt(selectedRowIndex,1).toString();

    }
    public void conseguirValoresTxtCategoria(){
        DefaultTableModel model = (DefaultTableModel)jTableCategoria.getModel();
        int selectedRowIndex = jTableCategoria.getSelectedRow();
        ID = Long.parseLong(model.getValueAt(selectedRowIndex,2).toString());
        nombre = model.getValueAt(selectedRowIndex,0).toString();
        descripcion = model.getValueAt(selectedRowIndex,1).toString();

    }
    
    
    
    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed
        new FrmCategoria().setVisible(true);
    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        new FrmRubro().setVisible(true);
        //this.setVisible(false);
        
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        conseguirValoresTxtCategoria();
                       
            categoria.eliminar(ID);
            
            ClearTableCategoria();
            LoadCategoria();
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnAceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar4ActionPerformed
        //Primero Obtengo todos los valores de la tabla
        conseguirValoresTxt();
        frmRubro.modificar("1",nombre,descripcion,ID );
        frmRubro.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar4ActionPerformed

    private void btnAceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar5ActionPerformed
        //CONSIGO EL ID
        int preg = JOptionPane.showConfirmDialog(null,"Seguro que desea elimar este rubro?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(preg==JOptionPane.YES_OPTION){
            conseguirValoresTxt();
            //Long id;
            //DefaultTableModel model = (DefaultTableModel)jTableRubro.getModel();
            //int selectedRowIndex = jTableRubro.getSelectedRow();
            
            //id = Long.parseLong(model.getValueAt(selectedRowIndex,2).toString());
            
            
            rubro.eliminar(ID);
            
            ClearTableRubro();
            LoadRubro();
            
        // TODO add your handling code here:
        
        //System.out.println(id); //esto era para probar si no manqui�
        }
        
    }//GEN-LAST:event_btnAceptar5ActionPerformed

    private void jTableRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRubroMouseClicked
            DefaultTableModel model = (DefaultTableModel)jTableRubro.getModel();
            int selectedRowIndex = jTableRubro.getSelectedRow();
            seleccionTxt.setText("Nombre: "+ model.getValueAt(selectedRowIndex,0).toString() + " "+
                    "Descripci�n: "+ model.getValueAt(selectedRowIndex,1).toString() + " "+
                    "ID: "+ model.getValueAt(selectedRowIndex,2).toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_jTableRubroMouseClicked

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        //Primero Obtengo todos los valores de la tabla
        conseguirValoresTxtCategoria();
        frmCategoria.modificar("1",nombre,descripcion,ID );
        frmCategoria.setVisible(true);
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
oper.reporteRubro();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnAceptar4;
    private javax.swing.JButton btnAceptar5;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCategoria;
    private javax.swing.JTable jTableRubro;
    private javax.swing.JLabel seleccionTxt;
    // End of variables declaration//GEN-END:variables
}
