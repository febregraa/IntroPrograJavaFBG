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
public class Tarea2 {
    public static void TareaProgramada2(){
        
        /* 
        1. Un corredor de Fórmula 1 requiere de un programa que le capture los tiempos 
        realizados en cada vuelta y los tiempos utilizados en PITS, de manera que este al final le 
        indique lo siguiente: 
        • Cuál es el tiempo promedio por vuelta. 
        • Cuál es el tiempo promedio por PITS. 
        • Qué porcentaje del tiempo PITS corresponde al tiempo de recorrido de una 
        vuelta. 
        • Considere que son 10 vueltas y 10 entradas a PITS.
        */
        
        
        String entradaTempVuelta; 
        int tempVuelta;
        String entradaTempPits;
        int tempPits;
        int sumaVueltas = 0;
        double promVueltas = 0;
        int sumaPits = 0;
        double promPits = 0;
        double porcentaje;
        
        for (int i = 1; i <= 10 ; i++){
            entradaTempVuelta = JOptionPane.showInputDialog("Ingrese el timepo de la vuelta "+i+" en segundos");
            tempVuelta = Integer.parseInt(entradaTempVuelta);
            sumaVueltas += tempVuelta;
            entradaTempPits = JOptionPane.showInputDialog("Ingrese el tiempo en PITS del ingreso "+i+" en segundos");
            tempPits = Integer.parseInt(entradaTempPits);
            sumaPits += tempPits;
            porcentaje = tempPits * 100 /tempVuelta;
            JOptionPane.showMessageDialog(null,"Para la vuelta "+i+" el porcentaje del tiempo de PITS que corresponde al tiempo medido es " + porcentaje+ "%");
        }
        promVueltas = sumaVueltas/10;
        promPits = sumaPits/10;
        System.out.println("El tiempo promedio por vuelta es "+promVueltas + ". El tiempo promedio por PITS es "+promPits);
        
        
        /*
        2. Se requiere analizar las estaturas de los N niños de una escuela y extraer la siguiente
            estadística:
            • Cantidad de niños que miden menos de 100 cm.
            • Cantidad de niños que miden entre 100 y 120 cm.
            • Cantidad de niños que miden entre 121 y 130 cm.
            • Cantidad de niños que miden entre 131 y 140 cm.
            • Cantidad de niños que miden más de 140 cm.
            • Promedio de estaturas.
            • Muestre los resultados obtenidos.
        */
        
        String ingresoCantNinos = JOptionPane.showInputDialog("Ingrese la cantidad de niños");
        int cantNinos = Integer.parseInt(ingresoCantNinos);
        String ingresoEstatura;
        int estatura;
        int low = 0; // Los que miden menos que 100
        int midLow = 0; // Los que miden entre 100 y 120
        int mid = 0; // Los que miden entre 121 y 130
        int midHigh = 0; // Los que miden entre 131 y 140 
        int high = 0; // Los que miden mas de 140
        int sumaEstaturas = 0;
        double promEstatura = 0;
        for ( int j = 1; j <= cantNinos; j++){
            ingresoEstatura = JOptionPane.showInputDialog("Ingrese la estatura del niño "+j);
            estatura = Integer.parseInt(ingresoEstatura);
            if (estatura<100){
                low += 1;
            }else if (estatura<=120){
                midLow += 1;
            }else if (estatura<=130){
                mid += 1;
            }else if(estatura<=140){
                midHigh +=1;
            }else{
                high +=1;
            }
            sumaEstaturas += estatura;
        }
        promEstatura = sumaEstaturas / cantNinos;
        System.out.println("La estatura promedio es "+promEstatura);
        System.out.println("La cantidad de niños que miden menos de 100 cm es "+low);
        System.out.println("La cantidad de niños que miden entre 100 y 120 cm es "+midLow);
        System.out.println("La cantidad de niños que miden entre 121 y 130 cm es "+mid);
        System.out.println("La cantidad de niños que miden entre 131 y 140 cm es "+midHigh);
        System.out.println("La cantidad de niños que miden mas de 140 cm es "+high);
    }
}
