/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploD;

/**
 *
 * @author Intel
 */
public class ejemploD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Supervisor sup = new Supervisor();
        sup.setWorker(new Secretario());
        sup.gestionar();
        sup.setWorker(new Cajero());
        sup.gestionar();
        sup.setWorker(new Programador());
        sup.gestionar(); 
    }
    
}
