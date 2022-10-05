/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprogramadas;

/**
 *
 * @author Felipe
 */
import javax.swing.JOptionPane;
public class Tarea1 {
    public static void TareaProgramada1(){
        
    // Ejercicio 1
        System.out.println("Primer Programa de la tarea 1: Identificador de meses del año");
        //Ingrresar el numero del mes y recibir en texto el mes correspondiente a dicho numero junto al cuatrimestre
        String entradaMes = JOptionPane.showInputDialog("Ingrese numero correspondiente al mes que desee: "); //Declaracion de variable para la entrada del numero de mes
        int mes = Integer.parseInt(entradaMes);//Conversion del numero de mes ingresado de formato texto a numeros enteros 
        switch(mes){ // switch con las opciones que puede escoger el usuario y sus respectivos datos de salida
            // Al ingresar un numero en el rango rango del 1 al 12, el programa despliega el mes correspendiente junto al respectivo cuatrimestre al que pertenece dicho mes.
            case 1: 
                System.out.println("Enero.");
                System.out.println("Primer cuatrimestre.");
                break;
            case 2:
                System.out.println("Febrero.");
                System.out.println("Primer cuatrimestre.");
                break;
            case 3: 
                System.out.println("Marzo.");
                System.out.println("Primer cuatrimestre.");
                break;
            case 4: 
                System.out.println("Abril.");
                System.out.println("Primer cuatrimestre.");
                break;
            case 5: 
                System.out.println("Mayo.");
                System.out.println("Segundo cuatrimestre.");
                break;
            case 6: 
                System.out.println("Junio.");
                System.out.println("Segundo cuatrimestre.");
                break;
            case 7: 
                System.out.println("Julio.");
                System.out.println("Segundo cuatrimestre.");
                break;
            case 8: 
                System.out.println("Agosto.");
                System.out.println("Segundo cuatrimestre.");
                break;
            case 9:
                System.out.println("Setiembre.");
                System.out.println("Tercer cuatrimestre.");
                break;
            case 10: 
                System.out.println("Octubre.");
                System.out.println("Tercer cuatrimestre.");
                break;
            case 11: 
                System.out.println("Noviembre.");
                System.out.println("Tercer cuatrimestre.");
                break;
            case 12: 
                System.out.println("Diciembre.");
                System.out.println("Tercer cuatrimestre.");
                break;    
        }
        System.out.println("******************");
        // Segundo ejercicio 
        System.out.println("Segundo Programa de la tarea 1: Identificador de etapa de vida según la edad.");
         
        
        String ingresoEdad; // Se define la variable ingresoEdad como cadena de caracteres para luego ser converitda a un numero entero.
        ingresoEdad = JOptionPane.showInputDialog("Ingrese su edad para ser categorizada: "); // Input para ingresar la edad del usuario
        int edad = Integer.parseInt(ingresoEdad); // Conversion de la edad ingresada de string a int
        
        // estructura condicional if para determinar la etapa de vida segun la edad ingresada
        if (edad<=5){
            System.out.println("Segun su edad, usted pertenece a la primera infancia.");
        }else if (edad<=11){
            System.out.println("Segun su edad, usted pertenece a la infancia.");
        }else if (edad<=18){
            System.out.println("Segun su edad, usted pertenece a la adolescencia.");
        }else if (edad<=30){
            System.out.println("Segun su edad, usted pertenece a ;a juventud.");
        }else if(edad<= 59){
            System.out.println("Segun su edad, usted pertenece a la adultez.");
        }else
            System.out.println("Segun su edad, usted pertenece a la edad avanzada.");
    }
}
