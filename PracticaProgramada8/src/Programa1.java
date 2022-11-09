import java.util.Arrays;
import javax.swing.JOptionPane;
/*
Escribir un programa que almacene 10 números en un vector. Seguidamente, por aparte,
lea dos números más, recorra el arreglo e indique mediante un mensaje si estos
números existen dentro del arreglo. Si no existen, también debe mostrar un mensaje que
lo indique
 */
public class Programa1 {
    private String entradaNumero;
    private int num;
    private int cont=0;
    private boolean existe;

    public void ejercicio1(){
        int numeros[] = new int[10];
        for(int i = 0; i<numeros.length; i++){
            numeros[i] = i+1;
        }

        while(cont<2){
            entradaNumero = JOptionPane.showInputDialog("Ingrese un numero cualquiera");
            num = Integer.parseInt(entradaNumero);
            for(int j = 0; j<numeros.length; j++){
                if(numeros[j] == num){
                    existe = true;
                    break;
                }else{
                    existe = false;
                }
            }
            if (existe == true){
                System.out.println("El numero "+num+" si existe dentro del arreglo "+Arrays.toString(numeros));
            }else{
                System.out.println("El numero "+num+" no existe dentro del arreglo "+Arrays.toString(numeros));
            }
            cont++;
        }


    }


}
