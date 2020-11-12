package ejemploO;

public class Circulo implements IFigurasG{
	private double radio;
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI*radio*radio;
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*radio;
	}
	
}
