
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class CuentaBancaria {
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
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "El numero de cedula es: "+IDcliente);
        JOptionPane.showMessageDialog(null, "El numero de cuenta es: "+numCuenta);
        JOptionPane.showMessageDialog(null, "El saldo actual es: "+saldoActual);
        JOptionPane.showMessageDialog(null, "La tasa de interes es: "+tasaInteres);
    }
    public void calculoDatos(){
        calcIntereses = saldoActual * tasaInteres;
        nuevoSaldo += calcIntereses;
        saldoActual = nuevoSaldo;
        JOptionPane.showMessageDialog(null, "Listo, se han realizado los cambios. Confirmelo en la opcion");
    }
    public void salidaDatos(){
        JOptionPane.showMessageDialog(null, "Numero de cuentra: "+numCuenta);
        JOptionPane.showMessageDialog(null, "Cedula: "+IDcliente);
        JOptionPane.showMessageDialog(null, "Saldo Actual: "+saldoActual);
        JOptionPane.showMessageDialog(null, "Tasa de interes: "+tasaInteres);
    }
    public void deposito(){
        entradaDeposito = JOptionPane.showInputDialog("Ingrese el monto a depositar: ");
        deposito = Integer.parseInt(entradaDeposito);
        saldoActual += deposito;
    }
    public void retiro(){
        JOptionPane.showMessageDialog(null, "Este es su sado actual: "+saldoActual);
        entradaRetiro = JOptionPane.showInputDialog("Ingrese el monto a retirar: ");
        retiro = Integer.parseInt(entradaRetiro);

        if (retiro > saldoActual){
            JOptionPane.showMessageDialog(null,"El monto excede al saldo actual. Intente Nuevamente.");
        }else if (retiro < saldoActual) {
            saldoActual -= retiro;
            JOptionPane.showMessageDialog(null, "La transaccion se ha realizado exitosamente.");
            JOptionPane.showMessageDialog(null,"Ahora su saldo actual es: "+saldoActual);
        }



    }
}
