package ejercicios;
import java.util.Scanner;
/*Consigna
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma.
 */
public class guia2_pra01 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num1 = leer.nextInt();
        
       int suma = num + num1;
        System.out.println("La suma de los numeros ingresados es " + suma);

    }

}
