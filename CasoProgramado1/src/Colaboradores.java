import javax.swing.JOptionPane;
public class Colaboradores {
    private String IDColaborador;
    private String nombreColaborador;
    private String apellidoColaborador1;
    private String apellidoColaborador2;
    private String puestoColaborador;

    public void ingresoDatosColaborador(){
        IDColaborador = JOptionPane.showInputDialog("Ingrese el ID del colaorador");
        nombreColaborador = JOptionPane.showInputDialog("Ingrese el ID del colaorador");
        apellidoColaborador1 = JOptionPane.showInputDialog("Ingrese el ID del colaorador");
        apellidoColaborador2 = JOptionPane.showInputDialog("Ingrese el ID del colaorador");

        String entradaOpcionColab = JOptionPane.showInputDialog("""
                Ingrese la opcion segun el colaborador a ingresar:
                1- Diseñador.
                2- Administrador.
                3- Cajas.
                """);
        int opcionColab = Integer.parseInt(entradaOpcionColab);
        switch(opcionColab){
            case 1:
                puestoColaborador = "Diseñador";
                break;
            case 2:
                puestoColaborador = "Administrador";
                break;
            case 3:
                puestoColaborador = "Cajas";
                break;
        }
    }
    public void setIDColaborador(String _IDColaborador){
        IDColaborador = _IDColaborador;
    }
    public String getIDColaborador(){
        return IDColaborador;
    }
    public void setNombreColaborador(String _nombreColaborador){
        nombreColaborador = _nombreColaborador;
    }
    public String getNombreColaborador(){
        return nombreColaborador;
    }
    public void setApellidoColaborador1(String _apellidoColaborador1){
        apellidoColaborador1 = _apellidoColaborador1;
    }
    public String getApellidoColaborador1(){
        return apellidoColaborador1;
    }
    public void setApellidoColaborador2(String _apellidoColaborador2){
        apellidoColaborador2 = _apellidoColaborador2;
    }
    public String getApellidoColaborador2(){
        return apellidoColaborador2;
    }
    public void setPuestoColaborador(String _puestoColaborador){
        puestoColaborador = _puestoColaborador;
    }
    public String getPuestoColaborador(){
        return puestoColaborador;
    }
    public void mostrarColaboradores(){
        JOptionPane.showMessageDialog(null,
                "Cedula: "+IDColaborador+
                 "Nombre: "+nombreColaborador+
                 "Primer apellido: "+apellidoColaborador1+
                 "Segundo apellido: "+apellidoColaborador2+
                 "Puesto: "+puestoColaborador
                );
    }
}
