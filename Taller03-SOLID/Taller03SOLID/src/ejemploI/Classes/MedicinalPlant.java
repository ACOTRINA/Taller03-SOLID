/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploI.Classes;

import ejemploI.Interfaces.CommonActivities;
import ejemploI.Interfaces.Curative;

/**
 *
 * @author User
 */
public class MedicinalPlant implements CommonActivities, Curative{
    private int medicinesAmount;
    private int size ;

    
    public int getMedicinesAmount() {
        return medicinesAmount;
    }

    public int getSize() {
        return size;
    }

    public void setMedicinesAmount(int medicinesAmount) {
        this.medicinesAmount = medicinesAmount;
    }

    public void setSize(int size) {
        this.size = size;
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
    public int naturalMedicines() {
        return medicinesAmount;
    }
}
