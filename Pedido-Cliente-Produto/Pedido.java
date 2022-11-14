package lista02;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pedido {

	private final int numero;
	private final Date data;
	private Cliente cliente;

	private ArrayList<ItemPedido> listaItens = new ArrayList<ItemPedido>();

	public Pedido(int numero, Date data) {
		this.numero = numero;
		this.data = data;
	}

	public Pedido(int numero, Date data, Cliente cliente) {
		this.numero = numero;
		this.data = data;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(Produto produto, int qtde) {
		ItemPedido item1 = new ItemPedido(produto, qtde);
		listaItens.add(item1);
	}

	public void removeItem(int index) {
		listaItens.remove(index);
	}

	public double getTotalPedido() {

		double total = 0.0;

		for (int i = 0; i < listaItens.size(); i++) {
			total = total + (listaItens.get(i).getTotalItem());
		}

		return total;
	}

	public String listarPedido() {
		StringBuilder sb = new StringBuilder();

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String data = df.format(getData());

		sb.append("Pedido Numero : " + getNumero() + "\n");
		sb.append("Data Pedido : " + data + "\n");
		sb.append("CPF Cliente : " + getCliente().getCpf() + "\n");
		sb.append("Nome Cliente : " + getCliente().getNome() + "\n");
		sb.append("Valor Total : " + getTotalPedido() + "\n");

		sb.append("Itens do pedido -----------------------------------\n");

		for (int i = 0; i < listaItens.size(); i++) {
			sb.append(listaItens.get(i).getLinhaPedido());
		}

		return sb.toString();
	}
}
