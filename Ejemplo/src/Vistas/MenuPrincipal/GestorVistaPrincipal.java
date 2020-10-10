package Vistas.MenuPrincipal;
import Vistas.GestionProyecto.FrmUsuario;
import Vistas.GestorVista;
import Vistas.GestionProyecto.GestorVistaProyecto;
import Vistas.GestionProyecto.GestorVistaTipoProyecto;
import javax.swing.JDesktopPane;

public class GestorVistaPrincipal extends GestorVista{
    public FrmPrincipal frmPrincipal;

    ////////////////////////////////////////////////////////////////
    public void abrirPrincipal() {
        FrmPrincipal frmPrincipal = new FrmPrincipal(this);
        FrmUsuario frmUsuario = new FrmUsuario();
        frmPrincipal.setVisible(true);
        frmUsuario.setVisible(true);
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
