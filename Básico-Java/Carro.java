package Lista01;

public class Carro {
	private String placa;
	private int ano;
	private String modelo;
	private double velocidade;
	private static int numCarros;
	
	public Carro (String placa, int ano, String modelo) {
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.velocidade = 0;
		numCarros++;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getNumCarros () {
		return numCarros;
	}
	
	public void mostraCarro (Carro carro) {
		
		System.out.print("\nPlaca do carro: ");
		System.out.println(carro.getPlaca());
		
		System.out.print("Ano do carro: ");
		System.out.println(carro.getAno());
		
		System.out.print("Modelo do carro: ");
		System.out.println(carro.getModelo());
		
		System.out.print("Velocidade do carro: ");
		System.out.println(carro.getVelocidade());
	}
	
	public double acelerar (Carro carro) {
		double velocidade;
		velocidade = carro.getVelocidade();
		velocidade ++;
		carro.setVelocidade(velocidade);
		return velocidade;
	}
	
	public double frear (Carro carro) {
		double velocidade;
		velocidade = carro.getVelocidade();
		velocidade --;
		carro.setVelocidade(velocidade);
		return velocidade;
	}
}
