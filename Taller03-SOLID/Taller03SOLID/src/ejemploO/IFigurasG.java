package ejemploO;
/* Aplicando el principio Open/close "Las entidades de software (clases, módulos, funciones, etc.) 
 * deben estar abiertas para su extensión, pero cerradas para modificación" se crea una interfaz para 
 * las funciones en común que implementen las clases
 * Las figuras geometricas tienen en común que se les puede sacar área y perímetro*/

public interface IFigurasG {
	public double getArea();
	public double getPerimetro();
}
