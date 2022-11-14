package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ICliente;

public class ClienteController {

	private static ArrayList<ICliente> listaClientes = new ArrayList<ICliente>();
	
	public static void addCliente(ICliente cliente) {
		listaClientes.add(cliente);
	}
	
	public static void listarClientes() {
		StringBuilder sb = new StringBuilder();
		
		if (listaClientes.isEmpty()) {
			sb.append("\n\nAinda não foi cadastrado nenhum cliente!" + "\n");
		}
		else {

			sb.append("\n\n-------------Lista de Clientes-------------\n");
	
			for (int i = 0; i < listaClientes.size(); i++) {
				sb.append("\nNome: " + listaClientes.get(i).getNome() + "\n");
				sb.append("Cadastro RF: " + listaClientes.get(i).getCadastroRF() + "\n");
				sb.append("E-mail: " + listaClientes.get(i).getEmail() + "\n");
				sb.append("Endereço: " + listaClientes.get(i).getEndereco() + "\n");
				sb.append("Telefone: " + listaClientes.get(i).getTelefone() + "\n");
			}
		}

		JOptionPane.showMessageDialog(null, sb.toString());
	}
	
	public ICliente pesquisarCliente(String RF) {
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getCadastroRF().equals(RF)) {
				return listaClientes.get(i);
			}
		}
		return null;
	}
	
	public static String[] returnRF () {
		int size = listaClientes.size();
		String[] str = new String[size];
		for (int i=0; i < listaClientes.size(); i++) {
			str[i] = listaClientes.get(i).getCadastroRF();
		}
		return str;
	}
	
	public static int sizeCliente () {
		int size = listaClientes.size();
		return size;
	}
	
}
