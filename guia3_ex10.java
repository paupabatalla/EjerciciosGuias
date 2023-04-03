package ejercicios;
import java.util.Scanner;
/*Consigna
Realice un programa para que el usuario adivine el resultado
de una multiplicación entre dos números generados aleatoriamente
entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe
permitir al usuario ingresar su respuesta nuevamente. Para realizar
este ejercicio investigue como utilizar la función Math.random() de Java.
 */
public class guia3_ex10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
       int num = (int) (Math.random() * 10);
       int num1 = (int) (Math.random() * 10);
       int multi = num * num1;
        System.out.println(multi);
       
       while (true) {
        System.out.println("Ingrese el resultado de la multiplicación aleatoria");
        int resultado = leer.nextInt();
        
        if (resultado == multi) {
            System.out.println("RESPUESTA CORRECTA");
            break;  
        }
       }  
   
    }

}
