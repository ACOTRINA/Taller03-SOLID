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
public class CalculationService {
 
    public double sumAreas(Circle circle, Square square){
        return circle.getArea() + square.getArea();
    }
 
    public double diffAreas(Circle circle, Square square){
        return circle.getArea() - square.getArea();
    }
}
