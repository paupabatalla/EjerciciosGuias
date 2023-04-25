
package ejercicios;
import java.util.Scanner;
/*Consigna:
Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Por lo tanto, si queremos 
calcular el término “n” debemos escribir una función que reciba 
como parámetro el valor de “n” y que calcule la serie hasta llegar
a ese valor.

Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1

*/
public class guia5_ex07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor maximo de la sucesión de Fibonacci");
        int num = leer.nextInt();
        
        Fibonacci(num);
        
        
    }

    public static void Fibonacci (int num) {
        
        for (int i = 0; i <= num ; i++) {
          
        }
    }
}
