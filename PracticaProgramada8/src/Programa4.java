import javax.swing.JOptionPane;
import java.util.Arrays;
public class Programa4 {
    /*
    En una matriz de 3 filas y 4 columnas se almacenan los salarios de los empleados de una
    compañía. Se requiere aumentar cada salario en un 20%. Escriba un programa que
    realice dicho aumento y calcule la suma de los salarios antes y después del aumento.
    Muestre el arreglo antes y después del aumento
     */
    private float sumaSalariosAntes = 0;
    private float sumaSalariosDespues = 0;
    private String entradaSalario;
    public void ejercicio4(){
        //Matriz y solicitar datos
        float matriz[][] = new float[3][4];
        for (int a = 0; a<3;a++){
            for(int b = 0; b<4;b++){
                entradaSalario = JOptionPane.showInputDialog("Ingrese el salario del empleado");
                matriz[a][b] = Float.parseFloat(entradaSalario);
            }
        }
        //Mostrar salarios
        System.out.println(Arrays.deepToString(matriz));
        //suma salarios antes del cambio
        for (int a = 0; a<3;a++){
            for(int b = 0; b<4;b++){
                sumaSalariosAntes += matriz[a][b];
            }
        }
        //modificacion salarios
        for (int a = 0; a<3;a++){
            for(int b = 0; b<4;b++){
                matriz[a][b] = (float)(matriz[a][b] + (matriz[a][b]*0.20));
            }
        }
        //Suma salarios depues de la modificacion
        for(int a = 0; a<3; a++){
            for(int b = 0; b<4; b++){
                sumaSalariosDespues+= matriz[a][b];
            }
        }
        System.out.println("La suma de los salarios antes de la modificacion es: "+sumaSalariosAntes);
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("La suma de los salarios despues de la modificacion es: "+sumaSalariosDespues);
    }
}
