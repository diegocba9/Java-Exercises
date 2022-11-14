package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import model.IItem;
import model.IVeiculo;
import model.ItemOS;
import model.OrdemServico;
import model.TipoItem;

import controller.VeiculoController;
@SuppressWarnings("unused")

public class OrdemServicoController {

	private VeiculoController controller;

	private static ArrayList<OrdemServico> listaOS = new ArrayList<OrdemServico>();
	
	public void setVeiculoController (VeiculoController controller) {
		this.controller = controller;
	}

	public void addOS(OrdemServico os) {
		listaOS.add(os);
	}

	public void listarHistoricoOS() {
		if (listaOS.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não foi feita nenhuma ordem de serviço!");
		} 
		else {
			String str = JOptionPane.showInputDialog(null,
					"Qual a placa do veículo do qual quer listar as ordens de serviço?");

			StringBuilder sb = new StringBuilder();

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String data;

			if (controller.pesquisaVeiculo(str) != null) {
				
				sb.append("\n\n-----Histórico das Ordens de Serviço desse veículo-----\n");
				
				for (int i = 0; i < listaOS.size(); i++) {

					if (listaOS.get(i).getVeiculo().getPlaca().equals(str)) {
						sb.append("\nNúmero da OS: " + listaOS.get(i).getIdOS() + "\n");

						data = df.format(listaOS.get(i).getDataOS());
						sb.append("Data do serviço: " + data + "\n");
						sb.append("Placa do veículo: " + str + "\n");
						sb.append("Quilometragem do veículo: " + listaOS.get(i).getKmAtual() + "\n");
						sb.append("Serviço realizado: " + listaOS.get(i).getDescricao() + "\n");
						sb.append("Peças e serviços da OS:\n\n");
						for (int j = 0; j < listaOS.get(i).getListaItens().size(); j++) {
							sb.append(listaOS.get(i).getListaItens().get(j).getLinhaOS() + "\n");
						}
						sb.append("\n\t------Valor total da OS-------\n\t\t   " + listaOS.get(i).getTotalOS() + "\n");
					}
				}
			} else {
				sb.append("Nenhuma ordem de serviço criada com esse veículo!");
			}

			JOptionPane.showMessageDialog(null, sb.toString());
		}
	}
	

	public static String[] returnIdOS () {
		int size = listaOS.size();
		String[] str = new String[size];
		for (int i=0; i < listaOS.size(); i++) {
			str[i] = Integer.toString(listaOS.get(i).getIdOS());
		}
		return str;
	}
	
	public static int sizeOS () {
		int size = listaOS.size();
		return size;
	}

	public OrdemServico pesquisaOS (int input) {
		for (int i = 0; i < listaOS.size(); i++) {
			if (listaOS.get(i).getIdOS() == input) {
				return listaOS.get(i);
			}
		}
		return null;
	}
	
	

}
