package Lista06;

public class Tetraedro extends FormaTridimensional{

	public double aresta;
	public double altura;
	
	public Tetraedro (String cor, double aresta, double altura) {
		super (cor);
		this.aresta = aresta;
		this.altura = altura;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double obterArea() {
		return aresta*aresta*Math.sqrt(3);
	}
	
	public double obterVolume() {
		return Math.pow(aresta, 3)*Math.sqrt(2)/12; 
	}
}
