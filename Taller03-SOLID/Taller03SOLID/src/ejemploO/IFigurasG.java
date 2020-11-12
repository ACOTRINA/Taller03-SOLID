package ejemploO;
/* Aplicando el principio Open/close "Las entidades de software (clases, m�dulos, funciones, etc.) 
 * deben estar abiertas para su extensi�n, pero cerradas para modificaci�n" se crea una interfaz para 
 * las funciones en com�n que implementen las clases
 * Las figuras geometricas tienen en com�n que se les puede sacar �rea y per�metro*/

public interface IFigurasG {
	public double getArea();
	public double getPerimetro();
}
