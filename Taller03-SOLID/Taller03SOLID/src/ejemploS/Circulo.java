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
public class Circulo{
 
    int radio;
 
    public Circulo(int radius){
        this.radio = radius;
    }
 
    public int getRadio(){
        return this.radio;
    }
 
    public void setRadio(int radio){
        this.radio = radio;
    }
 
    public double getArea(){
        return Math.PI * Math.pow(radio,2);
    }
 
}
