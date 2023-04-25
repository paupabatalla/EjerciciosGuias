
package ejercicios;
import java.util.Scanner;
/*Consigna:
Realiza un algoritmo que calcule la suma de todos los
elementos de un vector de tamaño N, con los valores
ingresados por el usuario.
*/
public class guia5_ex01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int num = leer.nextInt();
        
        System.out.println("Ingrese valores para el vector");
        int[] retorno = llenarVector(num, leer);
        sumarVector(retorno, num);    
    }

    public static int [] llenarVector (int num, Scanner leer) {
        int[] vector = new int[num];
        
        for (int i = 0; i < num; ++i) {
            vector[i] = leer.nextInt();
        }
        return vector;  
    }
    
   public static void sumarVector(int[] retorno, int n) {
        int suma = 0;
        for (int i = 0; i < n; ++i) {
            suma +=retorno[i];
        }
        System.out.println("La suma de los numeros ingresado es " + suma);
    }
    }

