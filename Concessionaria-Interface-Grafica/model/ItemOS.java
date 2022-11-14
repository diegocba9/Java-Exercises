package model;

public class ItemOS{

	private double preco;
	private int qtde;

	private IItem item;
	
	public ItemOS(IItem item, double preco, int qtde) {
		this.item = item;
		this.preco = preco;
		this.qtde = qtde;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	
	public double getTotalItem() {
		return (getPreco() * getQtde());
	}

	public String getLinhaOS() {
		StringBuilder sb = new StringBuilder();
		if (item.getTipo() == TipoItem.SERVICO) {
			sb.append("\tMão de Obra: " + item.getDescricao());
		}
		else {
			sb.append("\tPeça: " + item.getDescricao());
		}
		sb.append("\n\t" + "Valor: " + getPreco() + "\n\t" + "Quantidade: " + getQtde() + "\n\n");
		
		return sb.toString();
		
	}

}
