package com.mycompany.examenii;

/**
 * Clase que tendra las operaciones de suma, resta, multiplicacion, division.
 * @author: Solange Pico, David Suarez, Alejandro Torres.
 * @version: 12/07/2017
 */

public class OperacionesFlotantes {

    /**
     * metodo que devuleve la multiplicacion entre flotantes.
     *
     * @param n1
     * @param n2
     * @return
     */
    public float multiplicacion(float n1, float n2) {
        return n1 * n2;
    }

    /**
     * Metodo que devueleve la division entre flotantes.
     *
     * @param n1
     * @param n2
     * @return
     */
    public float division(float n1, float n2) {
        if (n2 == 0) {
            return -1;
        } else {
            return n1 / n2;
        }
    }
    
    /**
     * Método que realiza la suma entre dos números flotantes.
     *
     * @return the a + b
     */
    public float suma(float a, float b) {
        return a + b;
    }

    /**
     * Método que realiza la resta entre dos números flotantes.
     *
     * @return the a - b
     */
    public float resta(float a, float b) {
        return a - b;
    }
}
