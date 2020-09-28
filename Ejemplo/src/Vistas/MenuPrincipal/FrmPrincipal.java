package Vistas.MenuPrincipal;
import Vistas.GestionProyecto.FrmUsuario;
import javax.swing.JDesktopPane;

public class FrmPrincipal extends  javax.swing.JFrame {
    public GestorVistaPrincipal gestorVista;
 
    
    public FrmPrincipal() {
        initComponents();
    }

    public FrmPrincipal(GestorVistaPrincipal aThis) {
        initComponents();
        gestorVista=aThis;
    }


    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jmenu = new javax.swing.JMenuBar();
        mnConfiguracion = new javax.swing.JMenu();
        mnuProyecto = new javax.swing.JMenuItem();
        mnuTipoProyecto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo");

        jButton1.setText("Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        escritorio.add(jButton1);
        jButton1.setBounds(110, 120, 67, 21);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        escritorio.add(jButton2);
        jButton2.setBounds(100, 180, 71, 21);

        jmenu.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N

        mnConfiguracion.setText("Configuración");
        mnConfiguracion.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N

        mnuProyecto.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        mnuProyecto.setText("Proyecto");
        mnuProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProyectoActionPerformed(evt);
            }
        });
        mnConfiguracion.add(mnuProyecto);

        mnuTipoProyecto.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        mnuTipoProyecto.setText("Tipo Proyecto");
        mnuTipoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTipoProyectoActionPerformed(evt);
            }
        });
        mnConfiguracion.add(mnuTipoProyecto);

        jMenuItem1.setText("Costo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnConfiguracion.add(jMenuItem1);

        jmenu.add(mnConfiguracion);

        setJMenuBar(jmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1393, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProyectoActionPerformed
        this.gestorVista.abrirProyecto(getEscritorio());
    }//GEN-LAST:event_mnuProyectoActionPerformed

    private void mnuTipoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTipoProyectoActionPerformed
        this.gestorVista.abrirTipoProyecto(getEscritorio());
    }//GEN-LAST:event_mnuTipoProyectoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmUsuario().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //new Frmlogin().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar jmenu;
    private javax.swing.JMenu mnConfiguracion;
    private javax.swing.JMenuItem mnuProyecto;
    private javax.swing.JMenuItem mnuTipoProyecto;
    // End of variables declaration//GEN-END:variables

}
