package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Funcionario;
import model.IFuncionario;

public class FuncionarioController {
	
	private static ArrayList<IFuncionario> listaFuncionarios = new ArrayList<IFuncionario>();
	
	public void addFuncionario(String nome, int id) {
		listaFuncionarios.add(new Funcionario(nome, id));
	}

	public void listarFuncionarios() {
		StringBuilder sb = new StringBuilder();
		
		if (listaFuncionarios.isEmpty()) {
			sb.append("\n\nAinda não foi cadastrado nenhum funcionario!" + "\n");
		}
		else {
			sb.append("\n\n-------------Lista de Funcionários-------------\n");
	
			for (int i = 0; i < listaFuncionarios.size(); i++) {
				sb.append("\nNome: " + listaFuncionarios.get(i).getNome() + "\n");
				sb.append("ID: " + listaFuncionarios.get(i).getId() + "\n");
			}
		}
		
		JOptionPane.showMessageDialog(null, sb.toString());
	}

	public IFuncionario pesquisaFuncionario (int input) {
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			if (listaFuncionarios.get(i).getId() == input) {
				return listaFuncionarios.get(i);
			}
		}
		return null;
	}
	
	public static String[] returnID () {
		int size = listaFuncionarios.size();
		String[] str = new String[size];
		for (int i=0; i < listaFuncionarios.size(); i++) {
			 str[i] = Integer.toString(listaFuncionarios.get(i).getId());
		}
		return str;
	}
	
	public static int sizeFuncionario () {
		int size = listaFuncionarios.size();
		return size;
	}
}
