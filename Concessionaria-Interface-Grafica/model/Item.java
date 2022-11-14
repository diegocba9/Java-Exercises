package model;

public class Item implements IItem{
	
	private double preco;
	private String descricao;
	private TipoItem tipo;
	
	public Item (String descricao, double preco, TipoItem tipo) {
		this.descricao = descricao;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoItem getTipo() {
		return tipo;
	}

	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}

}
