package Hibernate;

import ModelosPA.Admin;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Producto;
import ModelosPA.Rubro;
import ModelosPA.Usuario;
import ModelosPA.Pedido;
import java.awt.Component;
import java.sql.Connection;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.SessionImpl;

public class GestorHibernate extends HibernateUtil {



    private Transaction tx;

    public void eliminarObjeto(Object objeto) {
        try {
            Session s = HibernateUtil.getSession();
            Transaction tx = s.beginTransaction();
            s.delete(objeto);
            tx.commit();
        } catch (Exception ex) {
            System.out.println("Repositorio.eliminarObjeto(Object objeto)" + ex);
            ex.printStackTrace();
            JOptionPane.showMessageDialog((Component) null, "El elemento no se puede eliminar:" + ex.getMessage(), "Error", 0);
            getTx().rollback();
        }
    }
    
    

    public void guardarObjeto(Object objeto) {
        try {
            Session s = HibernateUtil.getSession();
            Transaction tx = s.beginTransaction();
            s.save(objeto);
            tx.commit();

            System.out.println(" guardaractualizarObjeto() " + objeto.getClass() + ": " + objeto.toString());
        } catch (Exception ex) {
            System.out.println("error " + ex);
            System.out.println("Repositorio.guardarObjeto(Object objeto)" + objeto.getClass() + ": " + objeto.toString() + ex);
            ex.printStackTrace();
            getTx().rollback();
        }
    }

    public void guardarUsuario(Object objeto) {

        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();

        s.save(objeto);
        tx.commit();
    }

    public void modificarUsuario(String nombre, String descripcion, Long ID) {

        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();

        Rubro rubro = (Rubro) s.createCriteria(Rubro.class)
                .add(Restrictions.eq("id", ID)).uniqueResult();

        rubro.setDescripcion(descripcion);
        rubro.setNombre(nombre);
        s.update(rubro);
        tx.commit();

    }

    public void modificarCategoria(String nombre, String descripcion, Long ID) {

        try {
            Session s = HibernateUtil.getSession();
            Transaction tx = s.beginTransaction();

            Categoria categoria = (Categoria) s.createCriteria(Categoria.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();

            categoria.setDescripcion(descripcion);
            categoria.setNombre(nombre);
            s.update(categoria);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar la categoria " + e.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }

    }

    public boolean actualizarObjeto(Object objeto) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.update(objeto);
            tx.commit();
            System.out.println(" actualizarObjeto() " + objeto.getClass() + ": " + objeto.toString());
            return true;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, e);
            tx.rollback();
            JOptionPane.showMessageDialog(null, "No se pueden guardar los datos. \nLos mismos han sido modificados por otra persona.");

            return false;
        }
    }

    public List<Rubro> rubroShow() {
        Session sesion = HibernateUtil.getSession();
        List<Rubro> rubro = session.createCriteria(Rubro.class).list();
        return rubro;

    }
    
    public List<Rubro> rubroComboBox() {
        Session sesion = HibernateUtil.getSession();
        List<Rubro> rubro = session.createCriteria(Rubro.class)
                            .add(Restrictions.eq("estado", "Activo")).list();
        return rubro;

    }



    public List<Comercio> buscarComercioPorCategoriaYRubro(String nombreComercio, Categoria categoria, Rubro rubro) {

        Session sesion = HibernateUtil.getSession();
        List<Comercio> comercio = session.createCriteria(Comercio.class)
                .createAlias("rubro", "rub")
                .add(Restrictions.eq("categoria", categoria))
                .add(Restrictions.eq("rub.nombre", rubro.getNombre()))
                .add(Restrictions.like("nombreLocal", "%" + nombreComercio + "%"))
                .list();
        return comercio;

        


    }

    public  List<Producto> BuscarProducto() {
        Session sesion = HibernateUtil.getSession();
        List<Producto> producto = session.createCriteria(Producto.class).list();
        return producto;

    }

    public Transaction getTx() {
        return tx;
    }

    public void setTx(Transaction tx) {
        this.tx = tx;
    }

    public List listarClase(Class clase) {
        Criteria crit = getSession().createCriteria(clase);
        return crit.list();
    }

    public List listarClase(Class clase, String atributoOrden, int estado) {
        Criteria crit = getSession().createCriteria(clase).addOrder(Order.asc(atributoOrden))
                .add(Restrictions.eq("estado", estado));
        return crit.list();
    }

    public List listarClase(Class clase, String atributoOrden) {
        Criteria crit = getSession().createCriteria(clase).addOrder(Order.asc(atributoOrden));
        return crit.list();
    }

    public List listarUltimo(Class clase) {
        Criteria crit = getSession().createCriteria(clase)
                .addOrder(Order.desc("codigo"));
        return crit.list();
    }

    public List listarClaseCodigo(Class clase, int valor) {
        Criteria crit = getSession().createCriteria(clase)
                .add(Restrictions.eq("codigo", valor))
                .add(Restrictions.eq("estado", 0));
        return crit.list();
    }

    public Object listarClaseCodigoUnique(Class clase, int valor) {
        Criteria crit = getSession().createCriteria(clase)
                .add(Restrictions.eq("codigo", valor))
                .add(Restrictions.eq("estado", 0));
        return crit.uniqueResult();
    }

    public void eliminar(Long ID) {

        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            Class clase = (Class) s.createCriteria(Class.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();

            s.delete(clase);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el rubro ya que lo tiene seleccionado un comercio " /*+ e.getMessage()*/, " Error ", JOptionPane.ERROR_MESSAGE);
            //getTx().rollback();

        }

    }

    public void eliminarCategoria(Long ID) {

        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();

        try {
            Categoria categoria = (Categoria) s.createCriteria(Categoria.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();

            s.delete(categoria);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la categoria ya que la tiene seleccionada un comercio" /*+ e.getMessage()*/, " Error ", JOptionPane.ERROR_MESSAGE);

        }

    }

    public List<Categoria> categoriaShow() {
        Session sesion = HibernateUtil.getSession();
        List<Categoria> categoria = session.createCriteria(Categoria.class).list();

        return categoria;
    }
    
    public List<Categoria> categoriaComboBox() {
        Session sesion = HibernateUtil.getSession();
        List<Categoria> categoria = session.createCriteria(Categoria.class)
                                    .add(Restrictions.eq("estado", "Activo")).list();
        return categoria;
    }

    public long buscarObjeto(String nombre) {

        Session sesion = HibernateUtil.getSession();

        Rubro rubro = (Rubro) sesion.createCriteria(Rubro.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();
        System.out.println(rubro.getId());
        return rubro.getId();
    }

    public Object buscarObjetoPorId(Long id) {

        Session sesion = HibernateUtil.getSession();

        Rubro rubro = (Rubro) sesion.createCriteria(Rubro.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        System.out.println(rubro.getId());
        return rubro;
    }

    public long buscarCategoria(String nombre) {

        Session sesion = HibernateUtil.getSession();

        Categoria categoria = (Categoria) sesion.createCriteria(Categoria.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();
        System.out.println(categoria.getId() + " categoria");
        return categoria.getId();
    }

    public void reporteRubro() {

        try {
            SessionFactory sessionFactory1 = HibernateUtil.getSessionFactory();
            Session session1 = sessionFactory1.openSession();

            SessionImpl sessionImpl = (SessionImpl) session1;
            Connection connection = sessionImpl.connection();

            JasperReport archivo = JasperCompileManager.compileReport("rubro.jrxml");

            JasperPrint prin = JasperFillManager.fillReport(archivo, null, connection);
            JasperExportManager.exportReportToPdfFile(prin, "reporte.pdf");

            JasperPrint jprint = JasperFillManager.fillReport(archivo, null, connection);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(2);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(GestorHibernate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Object buscarCategoriaPorId(Long idCategoriaSeleccionado) {
        Session sesion = HibernateUtil.getSession();

        Categoria categoria = (Categoria) sesion.createCriteria(Categoria.class)
                .add(Restrictions.eq("id", idCategoriaSeleccionado)).uniqueResult();
        System.out.println(categoria.getId());
        return categoria;
    }

    public Object buscarProducto(Long idProducto) {
        Session sesion = HibernateUtil.getSession();

        Producto producto = (Producto) sesion.createCriteria(Producto.class)
                .add(Restrictions.eq("id", idProducto)).uniqueResult();

        return producto;
    }

    public Object buscarComercio(Long idProducto) {
        Session sesion = HibernateUtil.getSession();

        Comercio comercio = (Comercio) sesion.createCriteria(Comercio.class)
                .add(Restrictions.eq("id", idProducto)).uniqueResult();

        return comercio;
    }

    public boolean ingresarComercio(String username, String password) {
        Session sesion = HibernateUtil.getSession();

        Comercio comercio = (Comercio) sesion.createCriteria(Comercio.class)
                .add(Restrictions.eq("nombre", username)).uniqueResult();

        try {
            if (comercio != null) {

                if (comercio.getPassword().equals(password)) {

                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                            + "no corresponde con el comercio", "", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El comercio "
                        + " no existe", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El comercio "
                    + " no existe", "", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return false;
        }
    }

    public Comercio buscarComercioLogin(String username, String password) {
        Session sesion = HibernateUtil.getSession();

        try {
            Comercio comercio = (Comercio) sesion.createCriteria(Comercio.class)
                    .add(Restrictions.eq("nombre", username))
                    .add(Restrictions.eq("password", password)).uniqueResult();

            return comercio;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta ",
                    " ", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return null;
        }
    }

    public boolean ingresarUsuario(String username, String password) {
        Session sesion = HibernateUtil.getSession();

        Usuario usuario = (Usuario) sesion.createCriteria(Usuario.class)
                .add(Restrictions.eq("nombre", username)).uniqueResult();

        try {
            if (usuario != null) {

                if (usuario.getPassword().equals(password)) {
                    //JOptionPane.showMessageDialog(null, "Bienvenido Comercio "+comercio.getNombre());
                    //lo saco de aca porque spamea mucho sino
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                            + "no corresponde con el usuario", "", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El usuario "
                        + " no existe", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El usuario "
                    + " no existe", "", JOptionPane.ERROR_MESSAGE);

            return false;
        }
    }

    public boolean ingresarAdmin(String username, String password) {
        Session sesion = HibernateUtil.getSession();

        Admin admin = (Admin) sesion.createCriteria(Admin.class)
                .add(Restrictions.eq("class", Admin.class))
                .add(Restrictions.eq("nombre", username)).uniqueResult();

        if (admin != null) {
            if (admin.getPassword().equals(password)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public Comercio buscarComercioIngresante(String username, String password) {
        Session sesion = HibernateUtil.getSession();

        Comercio comercio = (Comercio) sesion.createCriteria(Comercio.class)
                .add(Restrictions.eq("nombre", username)).uniqueResult();

        try {
            if (comercio != null) {

                if (comercio.getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Comercio " + comercio.getNombre());
                    return comercio;
                } else {
                    JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                            + "no corresponde con el usuario", "", JOptionPane.ERROR_MESSAGE);
                    return null;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El comercio " + comercio.getNombre()
                        + " no existe", "", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El comercio " + comercio.getNombre()
                    + " no existe", "", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return null;
        }
    }

    public Usuario buscarUsuarioIngresante(String username, String password) {
        Session sesion = HibernateUtil.getSession();

        Usuario usuario = (Usuario) sesion.createCriteria(Usuario.class)
                .add(Restrictions.eq("nombre", username)).uniqueResult();

        try {
            if (usuario != null) {

                if (usuario.getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Usuario " + usuario.getNombre());
                    return usuario;
                } else {
                    JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                            + "no corresponde con el Usuario", "", JOptionPane.ERROR_MESSAGE);
                    return null;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El Usuario " + usuario.getNombre()
                        + " no existe", "", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El Usuario " + usuario.getNombre()
                    + " no existe", "", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return null;
        }
    }

    public boolean corroborarRubro(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Rubro rubro = (Rubro) sesion.createCriteria(Rubro.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (rubro != null) {
                String nom = rubro.getNombre();
                if (nom.equals(nombre)) {

                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public boolean corroborarProducto(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Producto producto = (Producto) sesion.createCriteria(Producto.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (producto != null) {
                String nom = producto.getNombre();
                if (nom.equals(nombre)) {

                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public void eliminarRubro(Long ID) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            Rubro rubro = (Rubro) s.createCriteria(Rubro.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();
            s.delete(rubro);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el rubro ya que lo tiene seleccionado un comercio " /*+ e.getMessage()*/, " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void darDeBajaRubro(Rubro rubro) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            rubro.setEstado("Dado de Baja");
            s.update(rubro);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja al rubro ", " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void darDeAltaRubro(Rubro rubro) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            rubro.setEstado("Activo");
            s.update(rubro);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja al rubro ", " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void cambiarEstadoProducto(Producto producto, String estado) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            producto.setEstado(estado);
            s.update(producto);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja al rubro ", " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void cancelar(Pedido pedido) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            pedido.setEstado("Cancelado");
            s.update(pedido);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja al rubro ", " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void darDeBajaCategoria(Categoria categoria) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            categoria.setEstado("Dado de Baja");
            s.update(categoria);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja a la categoria ", " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void darDeAltaCategoria(Categoria categoria) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            categoria.setEstado("Activo");
            s.update(categoria);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja a la categoria ", " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    public boolean corroborarCategoria(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Categoria categoria = (Categoria) sesion.createCriteria(Categoria.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (categoria != null) {
                String nom = categoria.getNombre();
                return nom.equals(nombre);
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public boolean corroborarUsuario(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Usuario usuario = (Usuario) sesion.createCriteria(Usuario.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (usuario != null) {
                String nom = usuario.getNombre();
                return nom.equals(nombre);
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public List<Producto> buscarProducto(Categoria categoria, Comercio comercio) {
        Session sesion = HibernateUtil.getSession();

        List<Producto> producto = session.createCriteria(Producto.class)
                .createAlias("categoria", "cat")
                .createAlias("comercio", "com")
                .add(Restrictions.eq("cat.nombre", categoria.getNombre()))
                .add(Restrictions.eq("com.nombre", comercio.getNombre()))
                .add(Restrictions.eq("estado", "Activo")).list();

        return producto;

    }

    public List<Producto> buscarProducto(Comercio comercio) {
        Session sesion = HibernateUtil.getSession();

        List<Producto> producto = session.createCriteria(Producto.class)
                .createAlias("comercio", "com")
                .add(Restrictions.eq("com.nombre", comercio.getNombre()))
                .add(Restrictions.eq("estado", "Activo")).list();

        return producto;

    }

    public  List<Pedido> buscarPedido(Usuario usuario) {
        Session sesion = HibernateUtil.getSession();

        List<Pedido> pedido = session.createCriteria(Pedido.class)
                .createAlias("usuario", "usu")
                .add(Restrictions.eq("usu.nombre", usuario.getNombre()))
                .list();

        return pedido;

    }

    public  List<Pedido> buscarPedidoComercio(Comercio comercio) {
        Session sesion = HibernateUtil.getSession();

        List<Pedido> pedido = session.createCriteria(Pedido.class)
                .createAlias("comercio", "com")
                .add(Restrictions.eq("com.nombre", comercio.getNombre()))
                .list();

        return pedido;

    }

    public boolean corroborarAdmin(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Admin admin = (Admin) sesion.createCriteria(Admin.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (admin != null) {
                String nom = admin.getNombre();
                return nom.equals(nombre);
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public boolean corroborarComercio(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Comercio comercio = (Comercio) sesion.createCriteria(Comercio.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (comercio != null) {
                String nom = comercio.getNombre();
                return nom.equals(nombre);
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public Usuario buscarUsuarioLogin(String username, String password) {

        Session sesion = HibernateUtil.getSession();

        try {
            Usuario usuario = (Usuario) sesion.createCriteria(Usuario.class)
                    .add(Restrictions.eq("nombre", username))
                    .add(Restrictions.eq("password", password)).uniqueResult();

            return usuario;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta ",
                    " ", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return null;

        }

    }

    public List<Comercio> buscarComercioPorNombre(String nombre) {
        Session sesion = HibernateUtil.getSession();
        List<Comercio> comercio = session.createCriteria(Comercio.class)
                .add(Restrictions.like("nombreLocal", "%" + nombre + "%")).list();
        return comercio;

    }

    public List<Producto> productosComercio(Comercio comercio) {
        Session sesion = HibernateUtil.getSession();
        List<Producto> producto = session.createCriteria(Producto.class)
                .createAlias("comercio", "com")
                .add(Restrictions.eq("com.nombre", comercio.getNombre()))
                .list();

        return producto;
    }

    public List<Rubro> busquedaRubroPorNombre(String nombre) {
        Session sesion = HibernateUtil.getSession();
        List<Rubro> rubro;
        rubro = session.createCriteria(Rubro.class)
                .add(Restrictions.like("nombre", "%" + nombre + "%")).list();
        return rubro;
    }

    public List<Categoria> busquedaCategoriaPorNombre(String nombre) {
        Session sesion = HibernateUtil.getSession();
        List<Categoria> categoria;
        categoria = session.createCriteria(Categoria.class)
                .add(Restrictions.like("nombre", "%" + nombre + "%")).list();
        return categoria;
    }

    public List<Comercio> buscarComercioPorCategoria(String nombreComercio, Categoria categoria) {
        Session sesion = HibernateUtil.getSession();
        List<Comercio> comercio = session.createCriteria(Comercio.class)
                .add(Restrictions.like("nombreLocal", "%" + nombreComercio + "%"))
                .add(Restrictions.eq("categoria", categoria)).list();
        return comercio;

    }

    public List<Comercio> buscarComercioPorRubro(String nombreComercio, Rubro rubro) {
        Session sesion = HibernateUtil.getSession();
        List<Comercio> comercio = session.createCriteria(Comercio.class)
                .add(Restrictions.eq("rubro", rubro))
                .add(Restrictions.like("nombreLocal", "%" + nombreComercio + "%"))
                .list();
       
        return comercio;

    }



    public List<Pedido> busquedaPedidoPorNombre(Usuario usuario, String nombreComercio) {
                Session sesion = HibernateUtil.getSession();

        List<Pedido> pedido = session.createCriteria(Pedido.class)
                .createAlias("usuario", "usu")
                .createAlias("comercio", "com")
                .add(Restrictions.eq("usu.nombre", usuario.getNombre()))
                .add(Restrictions.like("com.nombre", "%" + nombreComercio + "%"))
                .list();

        return pedido;
    }



    public List<Pedido> buscarPedidoComercioYFecha(Comercio comercio, Date minDate, Date maxDate) {

        Criteria crit = getSession().createCriteria(Pedido.class);
        crit.add(Restrictions.eq("comercio", comercio));
        crit.add(Restrictions.ge("fecha", minDate));
        crit.add(Restrictions.lt("fecha", maxDate));

        return crit.list();

    }

    public List<Pedido> buscarPedidoPorFecha(Usuario usuario, Date minDate, Date maxDate) {
        
        Criteria crit = getSession().createCriteria(Pedido.class);
        crit.add(Restrictions.eq("usuario", usuario));
        crit.add(Restrictions.ge("fecha", minDate));
        crit.add(Restrictions.lt("fecha", maxDate));

        return crit.list();
        

    }

}
