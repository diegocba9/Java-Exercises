package Lista06;

public class Quadrado extends FormaBidimensional{

	private double lado;
	
	public Quadrado (String cor, double lado) {
		super(cor);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double obterArea() {
		return lado*lado;
	}
	
	public double obterVolume() {
		return 0;
	}
}
