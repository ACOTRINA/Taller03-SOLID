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
public class Cuadrado{
 
    int lado;
 
    public Cuadrado(int lado){
        this.lado = lado;
    }
 
    public int getLado(){
        return this.lado;
    }
 
    public void setLado(int lado){
        this.lado = lado;
    }
 
    public double getArea(){
        return Math.pow(lado,2);
    }
 
}