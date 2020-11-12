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
public class Circle{
 
    int radius;
 
    public Circle(int radius){
        this.radius = radius;
    }
 
    public int getRadius(){
        return this.radius;
    }
 
    public void setRadius(int radius){
        this.radius = radius;
    }
 
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
 
}
