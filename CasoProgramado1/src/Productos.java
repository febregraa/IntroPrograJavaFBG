import javax.swing.JOptionPane;
public class Productos {
    private String IDProducto;
    private String nombreProducto;
    private String IDProveedor;
    private String nombreProveedor;
    private String entradaImpuesto;
    private int impuesto;
    private String entradaPrecioUnitarioBruto;
    private int precioUnitarioBruto;
    private double precioUnitarioNeto;

    public void ingresoProductos(){
        IDProducto = JOptionPane.showInputDialog("Ingrese el ID del producto");
        nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        IDProveedor = JOptionPane.showInputDialog("Ingrese el ID del proveedor");
        nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
        entradaImpuesto = JOptionPane.showInputDialog("Ingrese el impuesto");
        impuesto = Integer.parseInt(entradaImpuesto);
        entradaPrecioUnitarioBruto = JOptionPane.showInputDialog("Ingrese el precio unitario en bruto");
        precioUnitarioBruto = Integer.parseInt(entradaPrecioUnitarioBruto);
        precioUnitarioNeto = ((impuesto/100) * precioUnitarioBruto) + precioUnitarioBruto;

    }
    public void setIDProducto(String _IDProducto){
        IDProducto = _IDProducto;
    }
    public String getIDProducto(){
        return IDProducto;
    }
    public void setNombreProducto(String _nombreProducto){
        nombreProducto = _nombreProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }
    public void setIDProveedor(String _IDProveedor){
        IDProveedor = _IDProveedor;
    }
    public String setIDProveedor(){
        return IDProveedor;
    }
    public void setNombreProveedor(String _nombreProveedor){
        nombreProveedor = _nombreProveedor;
    }
    public String getNombreProveedor(){
        return nombreProveedor;
    }
    public void setImpuesto(int _impuesto){
        impuesto = _impuesto;
    }
    public int getImpuesto(){
        return impuesto;
    }
    public void setPrecioUnitarioBruto(int _precioUnitarioImpuesto){
        precioUnitarioBruto = _precioUnitarioImpuesto;
    }
    public int getPrecioUnitarioBruto(){
        return precioUnitarioBruto;
    }

    public void mostrarDatosProducto(){
        JOptionPane.showMessageDialog(null,
                "ID producto: "+ IDProducto+
                        "Producto: "+nombreProducto+
                        "ID proveedor: "+IDProveedor+
                        "Proveedor: "+nombreProveedor+
                        "Impuesto: "+impuesto+
                        "Precio unitario en bruto: "+precioUnitarioBruto+
                        "Precito unitario neto: "+precioUnitarioNeto
                );
    }

}
