package com.mycompany.examenii;

import java.util.Scanner;

/**
 * Clase principal en la cual estara el menu, el mismo que llamara con que desea
 * hacer las operaciones con numeros o flotantes.
 *
 * @author: Solange Pico, David Suarez, Alejandro Torres.
 * @version: 12/07/2017
 */
public class Started {

    public static void main(String[] args) {
        int op, op1, a, b;
        Scanner sc = new Scanner(System.in);
        Operaciones ope = new Operaciones();
        OperacionesFlotantes ope1 = new OperacionesFlotantes();
        System.out.println("Ingrese la opcion que desea");
        System.out.println("Quiere una opercaion con numero enteros o flotantes?");
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("1. Suma");
                System.out.println("2. resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4.  Division");
                System.out.println("5. Exponencial");
                System.out.println("6. Modulo");
                op1 = sc.nextInt();
                switch (op1) {
                    case 1:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope.suma(a, b));
                        break;
                    case 2:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope.resta(a, b));
                        break;
                    case 3:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope.multiplicacion(a, b));
                        break;
                    case 4:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope.division(a, b));
                        break;
                    case 5:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope.potencia(a, b));
                        break;
                    case 6:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope.modulo(a, b));
                        break;
                }
            case 2:
                System.out.println("1. Suma");
                System.out.println("2. resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4.  Division");
                System.out.println("5. Exponencial");
                System.out.println("6. Modulo");
                op1 = sc.nextInt();
                switch (op1) {
                    case 1:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope1.suma(a, b));
                        break;
                    case 2:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope1.resta(a, b));
                        break;
                    case 3:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope1.multiplicacion(a, b));
                        break;
                    case 4:
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("La respuesta es:" + ope1.division(a, b));
                        break;
                }
        }
    }
}
