/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploI.Classes;

import ejemploI.Interfaces.CommonActivities;
import ejemploI.Interfaces.Esthetic;

/**
 *
 * @author User
 */
public class OrnamentalPlant implements CommonActivities, Esthetic{
    private int size;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    
    

    @Override
    public int grow() {
        return size;
    }

    @Override
    public void absorbWater() {
        //codigo
        System.out.println("La planta absorve agua");
    }

    @Override
    public void reproduce() {
        //codigo 
        System.out.println("La planta se reproduce");
    }

    @Override
    public void purifyAir() {
        //codigo
        System.out.println("Las plantas purifican el aire");
    }

    @Override
    public String decorate() {
        return color;
    }
}
