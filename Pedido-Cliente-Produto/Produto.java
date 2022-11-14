package lista02;

public class Produto {
	private final int codBarras;
	private String nome;
	private double preco;
	
	public Produto (int codBarras, String nome) {
		this.codBarras = codBarras;
		this.nome = nome;
	}
	
	public Produto (int codBarras, String nome, double preco) {
		this.codBarras = codBarras;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodBarras() {
		return codBarras;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	 	
}
