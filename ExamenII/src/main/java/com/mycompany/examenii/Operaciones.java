package com.mycompany.examenii;

/**
 * Clase que tendra las operaciones de suma, resta, multiplicacion, division.
 * @author: Solange Pico, David Suarez, Alejandro Torres.
 * @version: 12/07/2017
 */

public class Operaciones {

    /**
     * Método que realiza la suma entre dos números enteros.
     *
     * @return the a + b
     */
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * Método que realiza la resta entre dos números enteros.
     *
     * @return the a - b
     */
    public int resta(int a, int b) {
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
    
    /**
     * metodo que devuleve la potencia de dos numeros enteros.
     *
     * @param a
     * @param b
     * @return
     */
    public double potencia(int a, int b) {
        double n1, n2;
        n1 = (double) a;
        n2 = (double) b;
        return Math.pow(n1, n2);
    }
    
    /**
     * Metodo que devuelve el modulo del numero 1 frente al n2.
     * @param n1
     * @param n2
     * @return 
     */
    public int modulo(int n1,int n2){
        if (n2 == 0) {
            return -1;
        } else {
            return n1%n2;
        }
    }
}
