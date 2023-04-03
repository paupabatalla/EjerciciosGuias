package ejercicios;
import java.util.Scanner;
/*Consigna:
Realizar un algoritmo que llene un vector de tamaño N
con valores aleatorios y le pida al usuario un número
a buscar en el vector. El programa mostrará donde se
encuentra el número y si se encuentra repetido.
 */
public class guia5_pra02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        int num = leer.nextInt();
        int[] vector = new int[num];

        System.out.println("Ingrese el número que sea buscar entre 0 y 9");
        int buscar = leer.nextInt();
        int contador = 0;

        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10);

            if (vector[i] == buscar) {
                contador++;
                System.out.println("El número se ha encontrado en la posición " + i);
            }
        }
        System.out.println("----------------------");
        System.out.println("El número ingresado se ha encontrado " + contador + " veces");
    }
}
