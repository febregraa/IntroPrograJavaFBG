import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args)
    {

       OOPClass6 persona1 = new OOPClass6("Felipe", 18, 180);
       OOPClass6 persona2 = new OOPClass6("Erika", 46, 173);

       persona1.setNombre("Mattio");

       persona1.mostrar();

       String a = persona1.getNombre();
       System.out.println(a);

    }
}