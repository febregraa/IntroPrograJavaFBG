package Principal;
// se importan librerias
import javax.swing.JOptionPane;

// clase de publica
public class GestionCanciones {
    // se definen los atributos privados
    private String IDcancion;
    private String nombreCancion;
    private String autor;
    private String duracion;
    private String fechaCreacion;

    // metodo constructor
    public GestionCanciones(String _IDcancion, String _nombreCancion, String _autor,String _duracion, String _fechaCreacion ){
        // se asignan a los atributos los valores de los argumentos cuando se instancian los objetos
        IDcancion = _IDcancion;
        nombreCancion = _nombreCancion;
        autor = _autor;
        duracion = _duracion;
        fechaCreacion = _fechaCreacion;
    }
    // metodo para mostrar datos
    public void mostrar (){
        System.out.println("ID cancion: "+IDcancion);
        System.out.println("Cancion: "+nombreCancion);
        System.out.println("Autor: "+autor);
        System.out.println("Duracion: "+duracion);
        System.out.println("Fecha: "+fechaCreacion);
    }
    // setters y getters
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
