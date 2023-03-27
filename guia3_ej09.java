package ejercicios;
import java.util.Scanner;
/*Consigna
Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
public class guia3_ej09 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       int contador = 0;
        int suma = 0;
        
        do {               
               System.out.println("Ingrese un número");
               int num = leer.nextInt();
               contador++;
               System.out.println("contador= " + contador);
               
               if (num==0) {
                   System.out.println("SE HA ENCONTRADO EL NÚMERO 0 (CERO)");
                   break;
               }
               if (num > 0) {
                   suma+= num;
               }
               
           } while (contador < 20);
        
        System.out.println("La suma de los números ingresados es " + suma);
    }
}
