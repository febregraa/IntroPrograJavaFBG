import javax.swing.JOptionPane;
public class Facturas {
    private String nombreCliente;
    private String apellidosCliente;
    private String numTelefono;
    private String producto;
    private String entradaPrecioPago;
    private int precio;

    public void facturacion(){
        nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        apellidosCliente = JOptionPane.showInputDialog("Ingrese los apellidos del cliente");
        numTelefono = JOptionPane.showInputDialog("Ingrese el numero telofonico del cliente");
        producto = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        entradaPrecioPago = JOptionPane.showInputDialog("Ingrese el precio del producto");
        precio = Integer.parseInt(entradaPrecioPago);
    }
    public void setNombreCliente(String _nombreCliente){
        nombreCliente = _nombreCliente;
    }
    public String getNombreCliente(){
        return nombreCliente ;
    }
    public void setApellidosCliente(String _apellidosCliente){
        apellidosCliente = _apellidosCliente;
    }
    public String getApellidosCliente(){
        return apellidosCliente;
    }
    public void setNumTelefono(String _numTelefono){
        numTelefono = _numTelefono;
    }
    public String getNumTelefono(){
        return numTelefono;
    }
    public void setProducto(String _producto){
        producto = _producto;
    }
    public String getProducto(){
        return producto;
    }
    public void setPrecio(int _precio) {
        precio = _precio;
    }
    public int getPrecio() {
        return precio;
    }
    public void mostrarFacturas(){
        JOptionPane.showMessageDialog(null,
                "Nombre del cliente: "+nombreCliente
                +"Apellidos del cliente: "+apellidosCliente
                +"Numero telefonico: "+numTelefono
                +"Nombre del producto comprado: "+producto
                +"Precio del producto: "+precio
                );
    }
}

