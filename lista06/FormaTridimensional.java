package Lista06;

public abstract class FormaTridimensional extends Forma{

	public FormaTridimensional (String cor) {
		super (cor);
	}
	
	public abstract double obterArea();
	
	public abstract double obterVolume();
}
