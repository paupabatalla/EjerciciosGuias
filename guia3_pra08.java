package ejercicios;
import java.util.Scanner;
/*Consigna
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class guia3_pra08 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i==num-1 || j == 0 || j == num-1) {
                    System.out.print("* ");
                } else if (j!=0 || j<num-1) {
                    System.out.print("  ");
                }
            }
            System.out.println("");   
        }
        
    }

}
