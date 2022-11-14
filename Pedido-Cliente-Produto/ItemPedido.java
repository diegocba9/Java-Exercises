package lista02;

public class ItemPedido {

	private final Produto produto;
	private int qtde;
	
	public ItemPedido (Produto produto, int qtde) {
		this.produto = produto;
		this.qtde = qtde;
	}
	
	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public double getTotalItem () {
		return (getQtde() * produto.getPreco());
	}
	
	public String getLinhaPedido () {
		return ("\t" + produto.getCodBarras() + "   " + produto.getNome() + "      " + "Qtd: " + getQtde() + "  " + "Preco Un: " + produto.getPreco() + "\n");
	}
	
}
