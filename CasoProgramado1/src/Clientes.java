import javax.swing.JOptionPane;
public class Clientes {
    private String IDCliente;
    private String nombreCliente;
    private String apellido1;
    private String apellido2;
    private String numTelefono;
    private String email;

    public void ingresoDatosCliente() {
        IDCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        apellido1 = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        apellido2 = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        numTelefono = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        email = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
    }
    public void setIDCliente(String _IDCliente){
        IDCliente = _IDCliente;
    }
    public String getIDCLiente(){
        return IDCliente;
    }
    public void setNombreCliente(String _NombreCliente){
        nombreCliente = _NombreCliente;
    }
    public String getIDCliente(){
        return nombreCliente;
    }
    public void setApellido1(String _apellido1){
        apellido1 = _apellido1;
    }
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido2(String _apellido2){
        apellido2 = _apellido2;
    }
    public String getApellido2(){
        return apellido2;
    }
    public void setNumTelefono(String _numTelefono){
        numTelefono = _numTelefono;
    }
    public String getNumTelefono(){
        return numTelefono;
    }
    public void setEmail(String _email){
        email = _email;
    }
    public String getEmail(){
        return email;
    }
    public void mostrarCliente(){
        JOptionPane.showMessageDialog(null,
                "Cedula: "+IDCliente
                +"Nombre: " + nombreCliente
                +"Primer apellido: " + apellido1
                +"Segundo apellido: " + apellido2
                +"Numero telefonico: " + numTelefono
                +"Email: "+email
                );
    }

}
