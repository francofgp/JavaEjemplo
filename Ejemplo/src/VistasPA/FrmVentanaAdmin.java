package VistasPA;

import Interfaz.ControladorPA.ControladorVentanaAdminPrincipal;
import controladoresCU.ABMCategoria;
import controladoresCU.ABMRubro;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Chelo
 */
public class FrmVentanaAdmin extends javax.swing.JFrame {

    FrmRubro frmRubro;
    FrmCategoria frmCategoria;
    FrmVentanaAdmin desktop = this;
    ABMRubro rubro;
    ABMCategoria categoria;
    String nombre;
    String descripcion;
    Long ID;

    ControladorVentanaAdminPrincipal controlVista;

    /**
     * Creates new form FrmComercio
     */
    public FrmVentanaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getControlVista().setForm(desktop);
        cargarRubro();
        cargarCategoria();

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
        btnDarDeBaja = new javax.swing.JButton();
        btnDarDeBajaCategoria = new javax.swing.JButton();
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
        jPanel1.add(seleccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 520, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Categoría");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

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
        jPanel1.add(btnDarDeBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 30));

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
        jPanel1.add(btnDarDeBajaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 110, 30));

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

    public FrmRubro getFrmRubro() {
        if (frmRubro == null) {
            synchronized (FrmRubro.class) {
                frmRubro = new FrmRubro();
            }
        }
        return frmRubro;
    }

    public void setFrmRubro(FrmRubro frmRubro) {
        this.frmRubro = frmRubro;
    }

    public FrmCategoria getFrmCategoria() {
        if (frmCategoria == null) {
            synchronized (FrmCategoria.class) {
                frmCategoria = new FrmCategoria();
            }
        }
        return frmCategoria;
    }

    public void setFrmCategoria(FrmCategoria frmCategoria) {
        this.frmCategoria = frmCategoria;
    }

    public ABMRubro getRubro() {
        if (rubro == null) {
            synchronized (ABMRubro.class) {
                rubro = new ABMRubro();
            }
        }
        return rubro;
    }

    public void setRubro(ABMRubro rubro) {
        this.rubro = rubro;
    }

    public ABMCategoria getCategoria() {
        if (categoria == null) {
            synchronized (ABMCategoria.class) {
                categoria = new ABMCategoria();
            }
        }
        return categoria;
    }

    public void setCategoria(ABMCategoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

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
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
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

    public JLabel getSeleccionTxt() {
        return seleccionTxt;
    }

    public void setSeleccionTxt(JLabel seleccionTxt) {
        this.seleccionTxt = seleccionTxt;
    }

    void cargarRubro() {
        this.getControlVista().cargarRubro();

    }

    void cargarCategoria() {
        this.getControlVista().cargarCategoria();

    }

    void ClearTableRubro() {
        this.getControlVista().ClearTableRubro();

    }

    void ClearTableCategoria() {
        this.getControlVista().ClearTableCategoria();
        /*
        while(jTableCategoria.getRowCount()!=0){
             ((DefaultTableModel)jTableCategoria.getModel()).removeRow(0);
        }
         */
    }

    public void conseguirRubro() {

        this.getControlVista().conseguirRubro();
        /*
        DefaultTableModel model = (DefaultTableModel)jTableRubro.getModel();
        int selectedRowIndex = jTableRubro.getSelectedRow();
        ID = Long.parseLong(model.getValueAt(selectedRowIndex,2).toString());
        nombre = model.getValueAt(selectedRowIndex,0).toString();
        descripcion = model.getValueAt(selectedRowIndex,1).toString();
         */

    }

    public void conseguirCategoria() {
        this.getControlVista().conseguirCategoria();

        /*DefaultTableModel model = (DefaultTableModel)jTableCategoria.getModel();
        int selectedRowIndex = jTableCategoria.getSelectedRow();
        ID = Long.parseLong(model.getValueAt(selectedRowIndex,2).toString());
        nombre = model.getValueAt(selectedRowIndex,0).toString();
        descripcion = model.getValueAt(selectedRowIndex,1).toString();
         */
    }


    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed
        new FrmCategoria().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        new FrmRubro().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        conseguirCategoria();
        this.getCategoria().setCategoriaElegida(this.getControlVista().getCategoria());
        this.getCategoria().preguntarEliminar();
        ClearTableCategoria();
        cargarCategoria();
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnAceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar4ActionPerformed
        //Primero Obtengo todos los valores de la tabla
        conseguirRubro();
        this.getRubro().setRubroElegido(this.getControlVista().getRubro());
        this.getFrmRubro().modificar("1", this.getRubro().getRubroElegido());
        this.getFrmRubro().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar4ActionPerformed

    private void btnAceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar5ActionPerformed

        conseguirRubro();
        this.getRubro().setRubroElegido(this.getControlVista().getRubro());
        this.getRubro().preguntarEliminar();
        ClearTableRubro();
        cargarRubro();


    }//GEN-LAST:event_btnAceptar5ActionPerformed

    private void jTableRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRubroMouseClicked


    }//GEN-LAST:event_jTableRubroMouseClicked

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        conseguirCategoria();
        this.getCategoria().setCategoriaElegida(this.getControlVista().getCategoria());
        this.getFrmCategoria().modificar("1", this.getCategoria().getCategoriaElegida());
        this.getFrmCategoria().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.getControlVista().reporteRubro();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaActionPerformed
        conseguirRubro();
        this.getRubro().setRubroElegido(this.getControlVista().getRubro());
        this.getRubro().darDeBaja();
        ClearTableRubro();
        cargarRubro();
    }//GEN-LAST:event_btnDarDeBajaActionPerformed

    private void btnDarDeBajaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaCategoriaActionPerformed
        conseguirCategoria();
        this.getCategoria().setCategoriaElegida(this.getControlVista().getCategoria());
        this.getCategoria().darDeBajaCategoria();
        ClearTableCategoria();
        cargarCategoria();

// TODO add your handling code here:
    }//GEN-LAST:event_btnDarDeBajaCategoriaActionPerformed

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
    private javax.swing.JButton btnDarDeBaja;
    private javax.swing.JButton btnDarDeBajaCategoria;
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
