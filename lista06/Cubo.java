package Lista06;

public class Cubo extends FormaTridimensional {

	private double lado;
	
	public Cubo (String cor, double lado) {
		super (cor);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double obterArea() {
		return 6*lado*lado;
	}
	
	public double obterVolume() {
		return Math.pow(lado, 3);
	}
}

