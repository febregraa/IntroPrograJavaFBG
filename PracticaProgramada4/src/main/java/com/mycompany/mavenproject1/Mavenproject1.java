
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class Mavenproject1 {
//
    public static void main(String[] args) {
        // Dfinicion de variables
        CuentaBancaria cliente1 = new CuentaBancaria();
        String ingresarDatos;
        boolean estado;
        estado = true;
        System.out.println("""
                1- Ingresar datos
                2- Mostrar Datos
                3- Calcular intereses y actualizar
                4- Deposito
                5- Retiro
                """);
        while (estado){
            String entradaOpcion = JOptionPane.showInputDialog("Ingrese la opcion que desee");
            int opcion = Integer.parseInt(entradaOpcion);
            switch (opcion){
                case 1:
                    cliente1.ingresoDatos();
                    break;
                case 2:
                    cliente1.mostrarDatos();
                    break;
                case 3:
                    cliente1.calculoDatos();
                    break;
                case 4:
                    cliente1.deposito();
                    break;
                case 5:
                    cliente1.retiro();            }

            ingresarDatos = JOptionPane.showInputDialog("Desea seguir utilizando el sistem? S o N");
            if (ingresarDatos.equals("S") || ingresarDatos.equals("s")){
                estado = true;
            }else{
                estado = false;
            }
        }


    }
}
