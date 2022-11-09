import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        // Elaboracion del login
        /* se van a trabajar con tres colaboradores, tres productos, tres facturas, tres pedidos y tres clientes para no hacer el registro muy extenso.

         */

        String contrasenia1 = "Colaborador1";
        String contrasenia2 = "Colaborador2";
        String contrasenia3 = "Colaborador3";
        String ingresoContrasenia = "";
        String entradaOpcion;
        int opcion;
        // Se tiene tres oportunidades para ingresar la contraseña
        int intentos = 3;
        int cont = 1;
        boolean accesoGarantizado = true;
        // Creacion de objetos
        // Se instancian los objetos: clientes
        Clientes cliente1 = new Clientes ();
        Clientes cliente2 = new Clientes ();
        Clientes cliente3 = new Clientes ();
        // Se instancian los objetos: colaboradores
        Colaboradores colaborador1 = new Colaboradores();
        Colaboradores colaborador2 = new Colaboradores();
        Colaboradores colaborador3 = new Colaboradores();
        // Se instancias los objetos: productos
        Productos producto1 = new Productos();
        Productos producto2 = new Productos();
        Productos producto3 = new Productos();
        //Se instancias los objetos: pedidos
        PedidosClientes pedido1 = new PedidosClientes();
        PedidosClientes pedido2 = new PedidosClientes();
        PedidosClientes pedido3 = new PedidosClientes();
        //Se instancian los objetos: facturas
        Facturas factura1 = new Facturas();
        Facturas factura2 = new Facturas();
        Facturas factura3 = new Facturas();
        MostrarMenu menu = new MostrarMenu();

        // Login a partir de un while que contabilizado hasta 3 intentos max
        while (cont<=3){
            ingresoContrasenia = JOptionPane.showInputDialog("Ingrese la contraseña para ingresar");
            if (ingresoContrasenia.equals(contrasenia1) || ingresoContrasenia.equals(contrasenia2) || ingresoContrasenia.equals(contrasenia3)){
                cont = 3;// maximo
                accesoGarantizado = true;
            }else{
                intentos--;
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta. Intentos restante "+intentos);
                if (intentos == 0){
                    accesoGarantizado = false;
                }
            }
            cont ++;
        }
        // switch con las respectivas acciones segun la opcion
        if (accesoGarantizado){
            opcion = 1;

            while (opcion != 11){ // S de si
                menu.mostrarMenu();
                // se utilizo un do while para que el usuario ingrese una opcion correcta, en caso de que este haya digitado una incorrecta fuera de rango
                do {
                    opcion = Integer.parseInt(menu.mostrarMenu());
                }while(opcion<1 || opcion>11);

                switch(opcion){
                    case 1: // Ingreso clientes
                        // se invocan los metodos
                        cliente1.ingresoDatosCliente();
                        cliente2.ingresoDatosCliente();
                        cliente3.ingresoDatosCliente();
                        break;
                    case 2:
                        colaborador1.ingresoDatosColaborador();
                        colaborador2.ingresoDatosColaborador();
                        colaborador3.ingresoDatosColaborador();
                        break;
                    case 3:
                        producto1.ingresoProductos();
                        producto2.ingresoProductos();
                        producto3.ingresoProductos();
                        break;

                    case 4:
                        pedido1.ingresoDatos();
                        pedido2.ingresoDatos();
                        pedido3.ingresoDatos();

                        break;
                    case 5:
                        factura1.facturacion();
                        factura2.facturacion();
                        factura3.facturacion();

                        break;
                    case 6: // Mostrar datos de clientes
                        cliente1.mostrarCliente();
                        cliente2.mostrarCliente();
                        cliente3.mostrarCliente();
                        break;
                    case 7:
                        colaborador1.mostrarColaboradores();
                        colaborador2.mostrarColaboradores();
                        colaborador3.mostrarColaboradores();
                        break;
                    case 8:
                        producto1.mostrarDatosProducto();
                        producto2.mostrarDatosProducto();
                        producto3.mostrarDatosProducto();
                        break;

                    case 9:
                        pedido1.mostrarDatos();
                        pedido2.mostrarDatos();
                        pedido3.mostrarDatos();
                        break;
                    case 10:
                        factura1.mostrarFacturas();
                        factura2.mostrarFacturas();
                        factura3.mostrarFacturas();
                        break;
                    case 11: // salir
                        JOptionPane.showMessageDialog(null,"Gracias por usar nuestros servicios");
                        break;
                }

            }
        }
    }


    }
