
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class CuentaBancaria {
    // Definicion de variables
    public String numCuenta;
    public String IDcliente;
    public String entradaSaldo;
    public int saldoActual;
    public String ingresoInteres;
    public float tasaInteres;
    public double calcIntereses;
    public int nuevoSaldo;
    public String entradaDeposito;
    public int deposito;
    public String entradaRetiro;
    public int retiro;
    // Metodo ingreso de datos
    public void ingresoDatos(){
        numCuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta");
        IDcliente = JOptionPane.showInputDialog("Ingrese la cedula del cliente");
        entradaSaldo = JOptionPane.showInputDialog("ingrese el saldo actual del usuario");
        saldoActual = Integer.parseInt(entradaSaldo);
        ingresoInteres = JOptionPane.showInputDialog("Ingrese la tasa de interes");
        //Integer.parseInt(ingresoInteres)
        tasaInteres = Integer.parseInt(ingresoInteres)/100f;
        nuevoSaldo = saldoActual;
    }
    // Metodo para mostrar datos
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "El numero de cedula es: "+IDcliente);
        JOptionPane.showMessageDialog(null, "El numero de cuenta es: "+numCuenta);
        JOptionPane.showMessageDialog(null, "El saldo actual es: "+saldoActual);
        JOptionPane.showMessageDialog(null, "La tasa de interes es: "+tasaInteres);
    }
    // Metodo para calcular los intereses
    public void calculoDatos(){
        calcIntereses = saldoActual * tasaInteres; // se multiplica el saldo por la tasa de interes para obtener los intereses
        nuevoSaldo += calcIntereses; // se le suman los intereses al saldo actual
        saldoActual = nuevoSaldo; // se actualiza el valor del saldo actual.
        JOptionPane.showMessageDialog(null, "Listo, se han realizado los cambios. Confirmelo en la opcion");
    }
    // Metodo para realizar los depositos
    public void deposito(){
        entradaDeposito = JOptionPane.showInputDialog("Ingrese el monto a depositar: "); // se solicita el monto a ingresar
        deposito = Integer.parseInt(entradaDeposito); // se realiza la conversion
        saldoActual += deposito; // se le suma al saldo actual el deposito.
    }
    // metodo para el retiro
    public void retiro(){
        // se muestra el saldo actual
        JOptionPane.showMessageDialog(null, "Este es su saldo actual: "+saldoActual);
        // se solicita el saldo a retirar
        entradaRetiro = JOptionPane.showInputDialog("Ingrese el monto a retirar: ");
        retiro = Integer.parseInt(entradaRetiro);
        // si el retiro es mayor al saldo actual, entonces no se realiza la transaccion
        if (retiro > saldoActual){
            JOptionPane.showMessageDialog(null,"El monto excede al saldo actual. Intente Nuevamente.");
        }else if (retiro < saldoActual) {
            saldoActual -= retiro;
            JOptionPane.showMessageDialog(null, "La transaccion se ha realizado exitosamente.");
            JOptionPane.showMessageDialog(null,"Ahora su saldo actual es: "+saldoActual);
        }



    }
}
