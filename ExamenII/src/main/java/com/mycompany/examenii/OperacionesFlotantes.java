/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenii;

/**
 *
 * @author solan
 */
public class OperacionesFlotantes {
    /**
     * metodo que devuleve la multiplicacion entre flotantes.
     * @param n1
     * @param n2
     * @return 
     */
    public float multiplicacion(float n1, float n2){
        return n1*n2;
    }
    /**
     * Metodo que devueleve la division entre flotantes.
     * @param n1
     * @param n2
     * @return 
     */
    public float division(float n1, float n2){
        if (n2 == 0) {
            return -1;
        }else{
            return n1/n2;
        }
    }
}
