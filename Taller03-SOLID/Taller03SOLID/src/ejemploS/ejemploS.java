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
public class ejemploS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculo calculationService = new Calculo();
        Impresion imp = new Impresion();
 
        Circulo cir = new Circulo(5);
        Cuadrado square = new Cuadrado(6);
 
        double result = calculationService.sumAreas(cir, square);
        imp.impresion(result);
    }
    
}
