package lista02.enunciado;

import java.util.Date;

public class TestePedido {

	public static void main(String[] args) {

		
		// Clientes
		
		Cliente cliente1 = new Cliente(11001, "Cliente 1");
		Cliente cliente2 = new Cliente(11002, "Cliente 2");
		
		
			// Produtos
			
		Produto produto1 = new Produto(101, "Produto A", 10.0);
		Produto produto2 = new Produto(102, "Produto B", 20.5);
		Produto produto3 = new Produto(103, "Produto C", 30.0);
		Produto produto4 = new Produto(104, "Produto D", 40.5);
		
		
		// Pedido1		
		
		Pedido pedido1 = new Pedido(1001, new Date(), cliente1); // new Date(): retorna objeto com data atual	
		
		pedido1.addItem(produto1, 1);
		pedido1.addItem(produto2, 2);

		System.out.println(pedido1.listarPedido());

		
		// Pedido2
		
		Pedido pedido2 = new Pedido(1002, new Date(), cliente2);	
		
		pedido2.addItem(produto2, 2);
		pedido2.addItem(produto3, 2);
		pedido2.addItem(produto4, 2);

		System.out.println();
		System.out.println(pedido2.listarPedido());
		
		
		// Pedido2 atualização
		
		pedido2.removeItem(2);

		System.out.println();
		System.out.println(pedido2.listarPedido());		
	}

}
