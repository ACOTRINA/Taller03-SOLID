/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploS;

/**
 *
 * @author lolac
 */
/*Aplicando el principio de responsabilidad única para refactorizar el código creamos una 
clase Impresion en la que implementamos las funciones encargadas de la presentación del programa*/

public class Impresion {
 
    public void impresion(double resultado){
        System.out.print("Resultado: " + resultado+"\n");
    }
 
}