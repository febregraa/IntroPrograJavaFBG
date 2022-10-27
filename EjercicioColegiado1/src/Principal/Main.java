package Principal;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        // se solicitan los datos
        String cancion = JOptionPane.showInputDialog("Ingrese la cancion: ");
        String IDcancion = JOptionPane.showInputDialog("Ingrese el ID de la cancion: ");
        String autor = JOptionPane.showInputDialog("Ingrese el autor de la cancion: ");
        String duracion = JOptionPane.showInputDialog("Ingrese la duracion de la cancion: ");
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de creacion de la cancion: ");
        // se instancia un objeto y se envian por parametro los datos solicitados
        GestionCanciones cancion1 = new GestionCanciones(IDcancion, cancion, autor, duracion, fecha);
        cancion1.mostrar(); // se invoca el metodo de mostrar datos
        System.out.println("");
        System.out.println("Modificacion de los datos ingresados");
        System.out.println("");
        // cambio de los datos de los atributos del objeto 1 con setters.
        cancion1.setCancion("Something Big");
        cancion1.setAutor("Shawn Mendez");
        cancion1.setDuracion("2 min con 41 seg");
        // se muestran los datos para verificar el cambio de los datos
        cancion1.mostrar();
        System.out.println("");
        // uso de los getters
        String a = cancion1.getCancion();
        String b = cancion1.getAutor();
        String c = cancion1.getDuracion();

        System.out.println("Se actualizaron los datos por "+a+", "+b+" y "+c);

    }
}
