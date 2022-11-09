import javax.swing.JOptionPane;
import java.util.Arrays;
public class Programa2 {
    /*
    Escribir un programa que permita llenar un vector con 20 números. Recorra el arreglo y
    determine: el número mayor, el número menor, el primer par, el primer impar, el último
    par y el último impar almacenados en el arreglo. Muestre los resultados.
     */

    private int par;
    private int ultimoPar;
    private int impar;
    private int ultimoImpar;
    private int mayor = 0;
    private int menor = 1;
    private String entradaNumeros;
    private int numeros[] = new int[20];
    private int reverseArray[] = new int[20];
    public void ejercicio2() {
        //soliciatar datos
        for (int i = 0; i < 20; i++) {
            entradaNumeros = JOptionPane.showInputDialog("Ingrese el numero en posicion "+ i);
            numeros[i] = Integer.parseInt(entradaNumeros);
        }
        //primer numero par del arreglo
        for(int j=0; j<20; j++){
            if (numeros[j]%2 == 0){
                par = numeros[j];
                break;
            }
        }
        // primer numero impar del arreglo
        for(int j=0; j<20; j++){
            if (numeros[j]%2 != 0){
                impar = numeros[j];
                break;
            }
        }
        // revertir el arreglo
        int a = 20;
        for(int k=0; k<20; k++){
            reverseArray[k]= numeros[a-1];
            a-=1;
        }
        System.out.println(Arrays.toString(reverseArray));
        // Encontrar el ultimo par
        for(int l = 0; l<20; l++){
            if(reverseArray[l]%2==0){
                ultimoPar = reverseArray[l];
                break;
            }
        }
        //encontrar el ultimo impar
        for(int l = 0; l<20; l++){
            if(reverseArray[l]%2!=0){
                ultimoImpar = reverseArray[l];
                break;
            }
        }
        // encontrar el mayor
        for(int m = 0; m<20; m++){
            if (mayor<numeros[m]){
                mayor = numeros[m];
            }
        }
        //encontrar el menor
        for(int n =0; n<20; n++){
            if(menor>numeros[n]){
                menor = numeros[n];
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("El numero mayor del arreglo es: "+mayor);
        System.out.println("El numero menor del arreglo es: "+menor);
        System.out.println("El primer numero par del arreglo es: "+par);
        System.out.println("El primer numero impar del arreglo es: "+impar);
        System.out.println("El ultimo numero par del arreglo es: "+ultimoPar);
        System.out.println("El ultimo numero impar del arreglo es: "+ultimoImpar);
    }
}
