import javax.swing.JOptionPane;

public class MostrarMenu {
    public String mostrarMenu(){
        String opcion = JOptionPane.showInputDialog("""
                        Opciones:
                        
                        1- Ingresar clientes.
                        2- Ingresar Colaboradores.
                        3- Ingresar productos.                      
                        4- Ingresar pedidos de clientes.
                        5- Ingresar facturas.
                        
                        Opciones Adicionales

                        6- Mostrar clientes.
                        7- Mostrar colaboradores.
                        8- Mostrar productos y datos.
                        9- Mostrar pedidos de clientes.
                        10- Mostrar facturas.
                        11- Salir
                        """);
        return opcion;
    }
}
