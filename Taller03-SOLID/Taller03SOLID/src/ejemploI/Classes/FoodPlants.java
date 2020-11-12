/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploI.Classes;

import ejemploI.Interfaces.CommonActivities;
import ejemploI.Interfaces.Nutritious;

/**
 *
 * @author User
 */
public class FoodPlants implements CommonActivities, Nutritious{
    private int size;
    private int fruitsAmount;

    public void setFruitsAmount(int fruitsAmount) {
        this.fruitsAmount = fruitsAmount;
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
    public int offerFood() {
        return fruitsAmount;
    }
}
