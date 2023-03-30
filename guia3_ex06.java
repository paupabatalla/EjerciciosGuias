package ejercicios;

import java.util.Scanner;

/*Consigna
Leer la altura de N personas y determinar el promedio
de estaturas que se encuentran por debajo de 1.60 mts.
y el promedio de estaturas en general.
 */
public class guia3_ex06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int persona = leer.nextInt();
        int contador = 0, suma = 0, suma2 = 0;

        for (int i = 0; i < persona; i++) {
            System.out.println("Ingrese la altura en cm de la persona  " + (i + 1));
            int altura = leer.nextInt();

            if (altura < 160) {
                suma += altura;
                contador++;
            }
            suma2 += altura;
        }
        
        double promedio1 = suma / contador;
        double promedio2 = suma2 / persona;
        System.out.println(" El promedio de altura de las personas que miden menos de 160 cm es " + promedio1 + " cm");
        System.out.println("El promedio de la altura de todas personas es " + promedio2 + " cm");
    }

}
