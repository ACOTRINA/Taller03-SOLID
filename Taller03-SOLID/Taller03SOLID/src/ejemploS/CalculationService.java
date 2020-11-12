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
 
    public void sumAreas(Circle circle, Square square){
        System.out.print(circle.getArea() + square.getArea());
    }
 
    public void diffAreas(Circle circle, Square square){
        System.out.print(circle.getArea() - square.getArea());
    }
}
