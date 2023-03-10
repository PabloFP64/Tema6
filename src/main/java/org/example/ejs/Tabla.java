package org.example.ejs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla {
    int t;
    int min;
    int max;

    public void queFuncion(Scanner teclado) throws InputMismatchException {
        int seleccion = 0;
        boolean ejecutado = false;

        while (seleccion != 3) {
            menu();
            seleccion = teclado.nextInt();
            switch (seleccion) {
                case 1:
                    t = 10;
                    int[] tabla = new int[t];
                    teclado.nextLine();
                    System.out.println("limite minimo: ");
                    min = teclado.nextInt();
                    System.out.println("limite maximo: ");
                    max = teclado.nextInt();
                    funcion1(t, min, max, tabla);
                    for (int i = 0; i < tabla.length; i++) {
                        System.out.print("-" + tabla[i]);
                    }
                    System.out.print("-");
                    break;
                case 2:

                    teclado.nextLine();
                    System.out.println("Tamaño de la tabla: ");
                    t = teclado.nextInt();
                    System.out.println("limite minimo: ");
                    min = teclado.nextInt();
                    System.out.println("limite maximo: ");
                    max = teclado.nextInt();
                    int[] tabla2 = new int[t];
                    funcion1(t, min, max , tabla2);
                    System.out.println("");
                    for (int i = 0; i < tabla2.length; i++) {
                        System.out.print("-" + tabla2[i]);
                    }
                    System.out.print("-");
                    funcion2(t, tabla2);
                    break;

                case 3:
                    System.out.println("Volviendo . . .");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }
    public void funcion1(int t, int min, int max, int[] tabla) {
        if (t == 0) {
            System.out.println("Tabla creada");
        } else {
            tabla[t - 1] = (int) (Math.random() * (max + 1 - min)) + min;
            funcion1(t - 1, min, max, tabla);
        }


    }
    public void funcion2(int t, int[] tabla) {
        int mayor = 0;
        for (int i : tabla) {
            if (i > mayor) {
                mayor = i;
            }
        }
        System.out.println("\nEl mayor es: " + mayor);
    }

    private static void menu () {
        System.out.println("\nSeleccione un ejercico:");
        System.out.println("1 - Funcion 1 ");
        System.out.println("2 - Funcion 2 ");
        System.out.println("3 - Volver atras ");
    }
}
