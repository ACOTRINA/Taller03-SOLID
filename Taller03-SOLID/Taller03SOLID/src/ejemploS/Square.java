/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploS;

import javafx.scene.shape.Polygon;

/**
 *
 * @author Intel
 */
public class Square extends Polygon {
 
    int side;
 
    public Square(int side){
        this.side = side;
    }
 
    public int getSide(){
        return this.side;
    }
 
    public void setSide(int side){
        this.side = side;
    }
 
    public double getArea(){
        return Math.pow(side,2);
    }
 
}