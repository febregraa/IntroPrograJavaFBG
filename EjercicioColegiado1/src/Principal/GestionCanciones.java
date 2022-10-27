package Principal;
import javax.swing.JOptionPane;
public class GestionCanciones {
    private String IDcancion;
    private String nombreCancion;
    private String autor;
    private String duracion;
    private String fechaCreacion;

    public GestionCanciones(String _IDcancion, String _nombreCancion, String _autor,String _duracion, String _fechaCreacion ){
        IDcancion = _IDcancion;
        nombreCancion = _nombreCancion;
        autor = _autor;
        duracion = _duracion;
        fechaCreacion = _fechaCreacion;
    }
    public void mostrar (){
        System.out.println("ID cancion: "+IDcancion);
        System.out.println("Cancion: "+nombreCancion);
        System.out.println("Autor: "+autor);
        System.out.println("Duracion: "+duracion);
        System.out.println("Fecha: "+fechaCreacion);
    }
    public void setCancion(String _cancion){
        nombreCancion = _cancion;
    }
    public String getCancion(){
        return nombreCancion;
    }
    public void setAutor(String _autor){
        autor = _autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setIDcancion(String _IDcancion){
        IDcancion = _IDcancion;
    }
    public String getIDCancion(){
        return IDcancion;
    }
    public void setDuracion(String _duracion){
        duracion = _duracion;
    }
    public String getDuracion(){
        return duracion;
    }
    public void setFecha(String fecha){
        fechaCreacion = fecha;
    }
    public String getFecha(){
        return fechaCreacion;
    }
}
