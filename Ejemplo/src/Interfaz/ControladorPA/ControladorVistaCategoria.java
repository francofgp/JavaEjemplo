/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import VistasPA.FrmCategoria;
import VistasPA.FrmVentanaAdmin;
import javax.swing.JOptionPane;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaCategoria {
    private ControladorCategoria oper;
    private FrmCategoria form;

    public ControladorCategoria getOper() {
        if (oper == null) {
            synchronized (ControladorVistaCategoria.class) {
                oper = new ControladorCategoria();

            }
        }
        return oper;    
    }

    public void setOper(ControladorCategoria oper) {
        this.oper = oper;
    }

    public FrmCategoria getForm() {
        return form;
    }

    public void setForm(FrmCategoria form) {
        this.form = form;
    }

    public void crearModificar() {

        oper = getOper();

        String nombre = form.getTxtNombre().getText();

        if(form.getModificado()=="1"){
            if(form.getNombrePrimero().equals(nombre)){
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                //this.ID=ID;
                oper.modificar(form.getNombre(),form.getDescripcion(),form.getID());
                JOptionPane.showMessageDialog(null,"La categoría se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
            }else{
                if(oper.corroborar(nombre)==false){
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                //this.ID=ID;
                oper.modificar(form.getNombre(),form.getDescripcion(),form.getID());
                JOptionPane.showMessageDialog(null,"La categoría se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
            }
            //Rubro rubro = new Rubro(this.txtNombre.getText(),this.txtDescripcion.getText());
            
                   
            }}else{
            //LO QUE HAGO ACA ES, CREAR UN OBJETO USUARIO Y PASERLE TODOS ESOS DATOS Y LLAMAR A LA FUNCION
            // GUARDAR USUARIO QUE CREE YO,que esta en el gestor del HIBERNATE (controlador), AHORA ESTO ES LA VISTA
            System.out.println(nombre);
            if(oper.corroborar(nombre)==false){
                //Rubro rubro = new Rubro(this.txtNombre.getText(),this.txtDescripcion.getText());
                oper.guardar(form.getTxtNombre().getText(),form.getTxtDescripcion().getText());
                JOptionPane.showMessageDialog(null,"La categoría se registró con éxito!");       
                form.setVisible(false);   
                new FrmVentanaAdmin().setVisible(true);
            }
            //Rubro rubro = new Rubro(this.txtNombre.getText(),this.txtDescripcion.getText());
        //public Usuario(String password, String nombre, String apellido, String email, String direccion, String telefono, String fechaNac) {
        
            //HACER CLICK ACA PARA SEGUIR LA EXPLICACION
        //oper.guardarUsuario(rubro);  //Long.parseLong(this.txtId.getText()  esto lo guarde, porque estaba probando
        // TODO add your handling code here: 
        //JOptionPane.showMessageDialog(null,"El rubro se registrón con éxito!");
        
        //this.setVisible(false);   
        //new FrmVentanaAdmin().setVisible(true);      
        
        }
        
        //FrmVentanaAdmin clear = new FrmVentanaAdmin(); 
        //clear.ClearTableRubro();
        //clear.LoadRubro();  
        
        
        }


        
    }


    
    


