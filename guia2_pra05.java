package ejercicios;
import java.util.Scanner;
/*Consigna
Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt()
 */
public class guia2_pra05 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble del numero ingresado es " + num*2);
        System.out.println("El triple del numero ingresado es " + num*3);
        System.out.println("La raiz cuadrada del numero ingresado es " + raiz);

    }

}