package ejercicios;

import java.util.Scanner;

/*Consigna
Se dispone de un conjunto de N familias, cada una
de las cuales tiene una M cantidad de hijos. Escriba
un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
public class guia3_ex14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese le número de familias");
        int familia = leer.nextInt();
        int suma = 0;

        for (int i = 0; i < familia; i++) {
            System.out.println("Para la familia " + (i + 1) + ", ingrese la cantidad de hijos:");
            int hijos = leer.nextInt();
            suma += hijos;
            System.out.println("suma " + suma);
        }
        int promedio = suma / familia;
        System.out.println("La media es " + promedio + " de hijos por familia");
    }
}
