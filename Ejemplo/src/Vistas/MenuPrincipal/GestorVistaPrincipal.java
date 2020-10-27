package Vistas.MenuPrincipal;
import Interfaz.ControladorPA.ControladorVistaRubro;
import Vistas.GestorVista;
import Vistas.GestionProyecto.GestorVistaProyecto;
import Vistas.GestionProyecto.GestorVistaTipoProyecto;
import VistasPA.FrmUsuario;
import VistasPA.FrmVentanaAdmin;
import VistasPA.Frmlogin;
import javax.swing.JDesktopPane;

public class GestorVistaPrincipal extends GestorVista{
    public FrmPrincipal frmPrincipal;

    ////////////////////////////////////////////////////////////////
    public void abrirPrincipal() {
        //FrmPrincipal frmPrincipal = new FrmPrincipal(this);
        //frmPrincipal.setVisible(true);
        Frmlogin frmLogin = new Frmlogin();
        frmLogin.setVisible(true);
        
        FrmVentanaAdmin frmVentanaAdmin = new FrmVentanaAdmin();
        frmVentanaAdmin.setVisible(true);
    }

        
    public void abrirRubro(JDesktopPane escritorio) {
        ControladorVistaRubro gestor = new ControladorVistaRubro();
        gestor.openFormulario(escritorio);
    }
    public void abrirProyecto(JDesktopPane escritorio ) {
        GestorVistaProyecto gestor= new GestorVistaProyecto();
        gestor.openFormulario(escritorio);
    }

    public  void abrirTipoProyecto(JDesktopPane escritorio) {
        GestorVistaTipoProyecto gestor= new GestorVistaTipoProyecto();
        gestor.openFormulario(escritorio); 
    }
    
    public  void abrirUsuario(JDesktopPane escritorio) {
        GestorVistaTipoProyecto gestor= new GestorVistaTipoProyecto();
        gestor.openFormulario(escritorio); 
    }

}
