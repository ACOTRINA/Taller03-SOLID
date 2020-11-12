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
        CalculationService calculationService = new CalculationService();
        PrintService printService = new PrintService();

        Circle circle = new Circle(5);
        Square square = new Square(6);

        double result = calculationService.sumAreas(circle, square);
        printService.printResult(result);
    }
    
}
