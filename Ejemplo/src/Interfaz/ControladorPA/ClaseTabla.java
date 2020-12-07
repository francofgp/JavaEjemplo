/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CrapBoy
 */
public class ClaseTabla {
    
    public void limpiarTabla(JTable tabla) {
        while (tabla.getRowCount() != 0) {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }
    
    
    public Object conseguirObjetoDeTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int selectedRowIndex = tabla.getSelectedRow();

        return((Object) model.getValueAt(selectedRowIndex, 0));
    }
    

    
}
