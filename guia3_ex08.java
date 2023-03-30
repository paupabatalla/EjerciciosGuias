package ejercicios;
import java.util.Scanner;
/*Consigna
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares. Al igual
que en el ejercicio anterior los números negativos no deben sumarse. 

Nota: recordar el uso de la sentencia break.
 */
public class guia3_ex08 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);

       int num = 0, contador = 0, par = 0, impar = 0;
       
       
       do { 
           System.out.println("Ingrese un número: ");
           num = leer.nextInt();
           
           if (num > 0) {
               contador++;
           }
           
           if (num % 2 == 0) {
               par++;
           }else{
               impar++;
           }        
        } while(num !=0 && !(num % 5 == 0));
       
       System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 5");
        System.out.println("NÚMEROS LEÍDOS: " + contador + " DE LOS CUALES HAY " + par + " PARES Y " + impar + " IMPARES");
       
       
    }

}
