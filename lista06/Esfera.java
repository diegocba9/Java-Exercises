package Lista06;

public class Esfera extends FormaTridimensional{

	private double raio;
	
	public Esfera (String cor, double raio) {
		super (cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double obterArea() {
		return 4*Math.PI*raio*raio;
	}
	
	public double obterVolume() {
		return (4/3)*Math.PI*Math.pow(raio, 3);
	}
}
