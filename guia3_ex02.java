package ejercicios;
import java.util.Scanner;
/*Consigna
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones necesarias
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y
D tome el valor de B. Mostrar los valores iniciales y los valores finales de
cada variable. Utilizar sólo una variable auxiliar.
 */
public class guia3_ex02 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para A,B,C,D");
        int A = leer.nextInt(), B = leer.nextInt(), C = leer.nextInt(), D = leer.nextInt();
        int X;
        
        System.out.println("VALORES ORINGALES:");
        System.out.println("A = " + A + "; B = " + B + "; C = " + C + "; D = " + D);
        
        X = B;
        B = C;
        C = A;
        A = D;
        D = X;
        
        System.out.println("VALORES INVERTIDOS:");
        System.out.println("A = " + A + "; B = " + B + "; C = " + C + "; D = " + D);
    }

}
