/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploL;


/**
 *
 * @author Intel
 */
public class ejemploL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Coche[] arrayCoches= { new Renault(),
        		new Chevrolet(),
        		new Skoda()
        };
    	imprimirNumAsientos(arrayCoches);
    }
    public static void imprimirNumAsientos(Coche[] arrayCoches) {
    	for(Coche coche:arrayCoches) {
    		System.out.println(coche.numAsientos());
    	}
    }
   
}
