package Interfaz.ControladorPA;

public interface ICategoriaRubro {

    void guardar(String nombre, String descripcion);

    boolean corroborar(String nombre);

    void modificar(String nombre, String descripcion, Long ID);

}
