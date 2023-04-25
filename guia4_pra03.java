package ejercicios;

import java.util.Scanner;

/*Consigna:
Crea una aplicación que a través de una función nos convierta una cantidad
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y
la moneda a convertir que será una cadena, este no devolverá ningún valor y
mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class guia4_pra03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad en euro a convertir");
        int euro = leer.nextInt();

        while (true) {
            System.out.println("A qué moneda desea pasar? libra, dolar o yen");
            String moneda = leer.next();
            convertir(euro, moneda, leer);
        }
    }

    public static void convertir(int euro, String moneda, Scanner leer) {

        switch (moneda.toLowerCase()) {
            case "libra":
                double libra = euro * 0.86;
                System.out.println("La cantidad ingresada convertida en libra es " + libra);
                break;
            case "dolar":
                double dolar = euro * 1.28611;
                System.out.println("La cantidad ingresada convertida en dolar es " + dolar);
                break;
            case "yen":
                double yen = euro * 129.852;
                System.out.println("La cantidad ingresada convertida en yen es " + yen);
            default:
                System.out.println("MONEDA INCORRECTA");
        }

    }
}
