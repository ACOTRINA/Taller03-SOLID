/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploS;




/**
 *
 * @author Intel
 */

/*Aplicando el principio de responsabilidad única para refactorizar el código creamos una 
clase Calculo en la que implementamos las funciones encargadas de realizar las operaciones 
entre los polígonos*/

public class Calculo{
 
    public double sumAreas(Circulo poligono1, Cuadrado poligono2){
        return poligono1.getArea() + poligono2.getArea();
    }
 
    public double difAreas(Circulo poligono1, Cuadrado poligono2){
        return poligono1.getArea() - poligono2.getArea();
    }
 
}
