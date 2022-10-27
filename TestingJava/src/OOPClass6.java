import javax.swing.JOptionPane;
public class OOPClass6 {
    private String nombre;
    private int edad;
    private int height;

    public OOPClass6(String _nombre, int _edad, int _height)
    {
        nombre = _nombre;
        edad = _edad;
        height = _height;
    }
    public void mostrar(){
        System.out.println("Mi nombres es "+nombre+ " y mi edad es "+edad);

    }
    public void setNombre(String _nombre){
        nombre = _nombre;
    }
    public String getNombre(){
        return nombre;
    }
    //public int a;







}
