package controller;

import java.util.ArrayList;


import javax.swing.JOptionPane;

import model.ICliente;
import model.IVeiculo;
import model.Veiculo;

public class VeiculoController {

	private static ArrayList<IVeiculo> listaVeiculos = new ArrayList<IVeiculo>();
	
	public void addVeiculo(String placa, String modelo, ICliente cliente, int anoFabricacao, int anoModelo, String cor,
			long dataCompra) {
		Veiculo veiculo = new Veiculo(placa, modelo, cliente);
		veiculo.setAnoFabricacao(anoFabricacao);
		veiculo.setAnoModelo(anoModelo);
		veiculo.setCor(cor);
		veiculo.setDataCompra(dataCompra);
		
		listaVeiculos.add(veiculo);
	}
	
	public static void listarVeiculos() {
		StringBuilder sb = new StringBuilder();
		
		if (listaVeiculos.isEmpty()) {
			sb.append("\n\nAinda não foi cadastrado nenhum veículo!" + "\n");
		}
		else {

			sb.append("\n\n-------------Lista de Veículos-------------\n");
	
			for (int i = 0; i < listaVeiculos.size(); i++) {
				sb.append("\nProprietário do veículo: " + listaVeiculos.get(i).getCliente().getNome() + "\n" +  "RF do proprietário "
						+ listaVeiculos.get(i).getCliente().getCadastroRF() + "\n");
				sb.append("Modelo: " + listaVeiculos.get(i).getModelo() + "\n");
				sb.append("Placa: " + listaVeiculos.get(i).getPlaca() + "\n");
				sb.append("Ano de fabricação: " + listaVeiculos.get(i).getAnoFabricacao() + "\n");
				sb.append("Ano do modelo: " + listaVeiculos.get(i).getAnoModelo() + "\n");
				sb.append("Cor: " + listaVeiculos.get(i).getCor() + "\n");
				sb.append("Data de compra: " + listaVeiculos.get(i).getDataCompra() + "\n");
	
			}
		}

		JOptionPane.showMessageDialog(null, sb.toString());
	}	
	
	public IVeiculo pesquisaVeiculo (String input) {
		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getPlaca().equals(input)) {
				return listaVeiculos.get(i);
			}
		}
		return null;
	}
	
	public static String[] returnPlaca () {
		int size = listaVeiculos.size();
		String[] str = new String[size];
		for (int i=0; i < listaVeiculos.size(); i++) {
			str[i] = listaVeiculos.get(i).getPlaca();
		}
		return str;
	}
	
	public static int sizeVeiculo () {
		int size = listaVeiculos.size();
		return size;
	}
}
