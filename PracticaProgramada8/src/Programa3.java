import javax.swing.JOptionPane;
import java.util.Arrays;
public class Programa3 {
    /*
    Escribir un programa que llene una matriz de 2 filas y 10 columnas con números
    positivos y negativos. Calcule la suma de los elementos positivos y la suma de los 4.
    elementos negativos. Muestre los resultados.
     */

    private String entradaNumeros;
    private int sumaPositivos;
    private int sumaNegativos;
    public void ejercicio3(){
        //matriz y solicitar datos
        int matriz [][] = new int[2][10];
        for(int i = 0; i<2; i++){
            for(int j=0; j<10;j++){
                entradaNumeros = JOptionPane.showInputDialog("Ingrese un numeroo cualquiera");
                matriz[i][j] = Integer.parseInt(entradaNumeros);
            }
        }
        //suma positivos
        for(int a = 0;a<2; a++){
            for(int b=0;b<10; b++){
                if(matriz[a][b]>0){
                    sumaPositivos += matriz[a][b];
                }
            }
        }
        // suma negativos
        for(int a = 0;a<2; a++){
            for(int b=0;b<10; b++){
                if(matriz[a][b]<0){
                    sumaNegativos += matriz[a][b];
                }
            }
        }
        System.out.println("La suma de los numeros positivos es "+sumaPositivos);
        System.out.println("La suma de los numeros negativos es "+sumaNegativos);
    }
}
