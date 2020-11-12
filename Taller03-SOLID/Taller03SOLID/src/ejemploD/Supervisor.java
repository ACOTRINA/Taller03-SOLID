/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploD;

/**
 *
 * @author USER
 */
public class Supervisor {
    Empleado empleado;

	public void setWorker(Empleado t) {
		empleado = t;
	}

	public void gestionar() {
		empleado.trabajar();
	}
}
