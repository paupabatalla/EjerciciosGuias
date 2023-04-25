package ejercicios;

import java.util.Scanner;

/*Consigna:
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres
y, a medida que el usuario las va ingresando, construya una “sopa de letras
para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas
en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por 
la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
public class guia5_ex06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] sopa = new int[20][20];
        String[][] sopaletras = new String[20][20];
        String[] palabra = new String[5];

        palabras(palabra, leer);
        System.out.println("");
        sopadeletras(sopa, leer, sopaletras, palabra);

    }

    public static void palabras(String[] palabra, Scanner leer) {

        for (int k = 0; k < 5; k++) {
            System.out.println("Ingrese una palabra de 3 y 5 letras");
            palabra[k] = leer.next();
        }

          

    }

    public static void sopadeletras(int[][] sopa, Scanner leer, String[][] sopaletras, String[] palabra) {
        int i = 0;
        int j = 0;

        for (i = 0; i < 20; i++) {
            for (j = 0; j < 20; j++) {

                sopa[i][j] = (int) (Math.random() * 10);
                sopaletras[i][j] = String.valueOf(sopa[i][j]);

                for (int k = 0; k < 5; k++) {
                    int f = (int) ((Math.random() * 10) + (Math.random() * 10));

                    if (i == f) {
                        for (int l = 0; l < palabra[k].length(); l++) {
                            String letra = palabra[k].substring(l, l+1);
                            sopaletras[i][j] = letra;
                        }
                    } else {
                        sopaletras[i][j] = String.valueOf(sopa[i][j]);

                    }

                }

            }

        }

        System.out.println("SOPA DE LETRAS");
        System.out.println("");
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 20; j++) {
                System.out.print(sopaletras[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
