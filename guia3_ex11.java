package ejercicios;
import java.util.Scanner;
/*Consigna
Escribir un programa que lea un número entero y devuelva
el número de dígitos que componen ese número. Por ejemplo,
si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo
entero truncan los números o resultados.
 */
public class guia3_ex11 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int contador = 0;
        
        while (true) {
        num /= 10;
          contador ++;
          
          if (num == 0) {
              break;
          }
        }
        
        System.out.println("El número ingresado tiene " + contador + " digitos");
        
       

    }

}
