/**
 * Clase que contiene las operaciones matemáticas entre dos números enteros.
 *
 * @author Alejandro Torres, Solange Pico, David Suaréz.
 * @version 1.0
 *
 */
package com.mycompany.examenii;

/**
 *
 * @author dovac
 */
public class Operaciones {

    /**
     * Método que realiza la suma entre dos números enteros.
     *
     * @return the a + b
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    /**
     * Método que realiza la resta entre dos números enteros.
     *
     * @return the a - b
     */
    public static int resta(int a, int b) {
        return a - b;
    }

    /**
     * metodo que devuleve la multiplicacion de dos numeros.
     *
     * @param n1
     * @param n2
     * @return
     */
    public int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    /**
     * multiplicacion que devuelve la dvision de dos numeros.
     *
     * @param n1
     * @param n2
     * @return
     */
    public int division(int n1, int n2) {
        if (n2 == 0) {
            return -1;
        } else {
            return n1 / n2;
        }
    }
}
