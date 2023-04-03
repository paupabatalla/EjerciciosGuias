package ejercicios;

import java.util.Scanner;

/*Consigna
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre
los números del 0-0-0 al 9-9-9, con la particularidad que cada vez
que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
public class guia3_ex12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int num1 = (int) (Math.random() * 10);
            String codi1 = String.valueOf(num1);

            if (codi1.equals("3")) {
                codi1 = "E";
            }
            System.out.println(codi1 + " - " + codi1 + " - " + codi1);
        }
    }
}
