package ejemploO;
//Pentagono regular con sus lados iguales
public class Pentagono implements IFigurasG {
	private double apotema;
	private double lado;
	
	public Pentagono(double apotema, double lado) {
		this.apotema = apotema;
		this.lado = lado;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		double p=getPerimetro();
		return (p*apotema)/2;
	}
	@Override
	public double getPerimetro() {
		return 6*lado;
	}
	
}
