package ejercicios;
import java.util.Scanner;
/*Consigna
 */
public class guia4_pra01 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
       int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
       int num1 = leer.nextInt();
       
       int retorno = sumar(num,num1);
        System.out.println("LA SUMA DE AMBOS ES " + retorno);
    
        
    }
    
    
public static int sumar (int num, int num1) {
    int suma;
suma = num+ num1;    
    return suma;
    
}
}
