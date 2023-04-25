package ejercicios;

import java.util.Scanner;

/*Consigna:
Los profesores del curso de programación de Egg necesitan llevar un registro
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con
promedio mayor o igual al 7 de sus notas del curso.
 */
public class guia5_ex04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int alumnos = 3;
        int notas = 5;
        double[][] matriz = new double[alumnos][notas];
        
        notastotales(matriz, alumnos, notas, leer);
        resultado(matriz,alumnos,notas);

    }

    public static void notastotales(double[][] matriz, int alumnos, int notas, Scanner leer) {
        int suma, nota;

        for (int i = 0; i < alumnos; i++) {
            suma = 0;
            for (int j = 0; j < notas; j++) {
                switch (j) {
                    case 0:
                        System.out.println("NOTA DEL TP1");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.10;
                        suma += nota;
                        break;
                    case 1:
                        System.out.println("NOTA DEL TP2");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.15;
                        suma += nota;
                        break;
                    case 2:
                        System.out.println("NOTA DEL PARCIAL 1");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.25;
                        suma += nota;
                        break;
                    case 3:
                        System.out.println("NOTA DEL PARCIAL 2");
                        nota = leer.nextInt();
                        matriz[i][j] = nota * 0.50;
                        suma += nota;
                        break;
                    case 4:
                        double promedio = suma / 4;
                        matriz[i][j] = promedio;
                        break;
                }
            }

        }

    }

    public static void resultado(double[][] matriz, int alumnos, int notas) {
        int aprobados = 0, desaprobados = 0;

        for (int i = 0; i < alumnos; i++) {
       
            if (matriz[i][notas-1] >= 7) {
              aprobados++;
          } else {
              desaprobados++;
          }
        }

        System.out.println("La cantidad de aprobados es de " + aprobados + " alumnos");
        System.out.println("La cantidad de desaprobados es de " + desaprobados + " alumnos");
    }
}
