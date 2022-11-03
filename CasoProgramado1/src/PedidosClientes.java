import javax.swing.JOptionPane;
public class PedidosClientes {
    private String clientePedido;
    private String encargadoPedido;
    private String espPedido;
    private String entradaPrecio;
    private int precio;
    private String fechaEntrega;

    public void ingresoDatos(){
        clientePedido = JOptionPane.showInputDialog("Ingrese nombre del cliente que encargo el pedido");
        encargadoPedido = JOptionPane.showInputDialog("Ingrese el encargado en preparar el pedido");
        espPedido = JOptionPane.showInputDialog("Ingrese cual es el pedido(material, encargo de diseño. etc)");
        entradaPrecio = JOptionPane.showInputDialog("Ingrese el monto del pedido");
        precio = Integer.parseInt(entradaPrecio);
        fechaEntrega = JOptionPane.showInputDialog("Ingrese la fecha para entregar el pedido");
    }

    public void setClientePedido(String _clientePedido){
        clientePedido = _clientePedido;
    }
    public String getClientePedito(){
        return clientePedido;
    }
    public void setencargadoPedido(String _encargadoPedido){
        encargadoPedido = _encargadoPedido;
    }
    public String getencargadoPedido(){
        return encargadoPedido;
    }
    public void setespPedido(String _espPedido){
        espPedido = _espPedido;
    }
    public String getespPedido(){
        return espPedido;
    }
    public void setPrecio(int _precio){
        precio = _precio;
    }
    public int getentradaPrecio(){
        return precio;
    }
    public void setFecha(String _fechaEntrega){
        fechaEntrega = _fechaEntrega;
    }
    public String setFecha(){
        return fechaEntrega;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,
                "Nombre del cliente: "+clientePedido
                +"Encargado del pedido: "+encargadoPedido
                +"Especificacion del pedido: "+espPedido
                +"Precio del pedido: "+precio
                +"Fecha de entrega del pedido: "+fechaEntrega
                );
    }
}
