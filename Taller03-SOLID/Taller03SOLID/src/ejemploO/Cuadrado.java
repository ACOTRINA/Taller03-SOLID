package ejemploO;

public class Cuadrado implements IFigurasG{
	public double lado;
	
    public Cuadrado(double lado){
        this.lado = lado;
    }
 
    public double getLado(){
        return this.lado;
    }   
    
    public void setLado(int lado){
        this.lado = lado;
    }
 
	@Override
	public double getArea() {
		return lado*lado;
	}

	@Override
	public double getPerimetro() {
		return lado*4;
	}
	
}
