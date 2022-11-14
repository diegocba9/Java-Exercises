package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import controller.CatalogoController;

public class OrdemServico {

	private Date dataOS;
	private long kmAtual;
	private String descricao;
	private final int idOS;

	private ICliente cliente;
	private IVeiculo veiculo;
	private IFuncionario funcionario;

	private static int count = 1;

	private ArrayList<ItemOS> listaItens = new ArrayList<ItemOS>();

	public OrdemServico(Date dataOS) {
		this.dataOS = dataOS;
		idOS = count;

		count++;
	}

	public OrdemServico(Date dataOS, ICliente cliente, IVeiculo veiculo, IFuncionario funcionario) {
		this.dataOS = dataOS;
		idOS = count;
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.funcionario = funcionario;

		count++;
	}

	public Date getDataOS() {
		return dataOS;
	}

	public void setDataOS(Date dataOS) {
		this.dataOS = dataOS;
	}

	public long getKmAtual() {
		return kmAtual;
	}

	public void setKmAtual(long kmAtual) {
		this.kmAtual = kmAtual;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ICliente getCliente() {
		return cliente;
	}

	public void setCliente(ICliente cliente) {
		this.cliente = cliente;
	}

	public IVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(IVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public IFuncionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(IFuncionario funcionario) {
		this.funcionario = funcionario;
	}

	public ArrayList<ItemOS> getListaItens() {
		return listaItens;
	}

	public int getIdOS() {
		return idOS;
	}

	public void addServico_Peca(double preco, int qtde, String descricao, int opt) {
		if (opt == 0) {
			Item item = new Item (descricao, preco, TipoItem.SERVICO);
			ItemOS itemOS = new ItemOS (item, preco, qtde);
			
			listaItens.add(itemOS);
			CatalogoController.addItem(item); 
		}
		else {
			Item item = new Item (descricao, preco, TipoItem.PECA);
			ItemOS itemOS = new ItemOS (item, preco, qtde);
			
			listaItens.add(itemOS);
			CatalogoController.addItem(item);
		}
	}

	public void removeItemOS() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\n-----------Lista das Pecas------------\n");
		for (int i = 1; i < listaItens.size(); i++) {
			sb.append("\n" + i + " - " + listaItens.get(i).getLinhaOS());
		}

		JOptionPane.showMessageDialog(null, sb);

		int index = 0;
		int j = listaItens.size();

		while (index == 0 || index > j) { // index = 0 é reservado para o serviço a ser realizado
			String str = JOptionPane.showInputDialog("Insira o número do item a ser removido!");
			try {
				index = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Insira um valor numérico!",
						JOptionPane.ERROR_MESSAGE);
				index = 0;
			}
		}
		
		listaItens.remove(index);
		JOptionPane.showMessageDialog (null, "Item temovido com sucesso!");
	}

	public double getTotalOS() {
		double total = 0.0;

		for (int i = 0; i < listaItens.size(); i++) {
			total = total + (listaItens.get(i).getTotalItem());
		}

		return total;
	}

	public void renegociaServico(double preco) {
		listaItens.get(0).setPreco(preco); // índice 0 é reservado para o serviço
	}

	public String listarOS() {
		StringBuilder sb = new StringBuilder();

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String data = df.format(getDataOS());

		sb.append("\n\n---------Ordem de serviço----------\n\n");
		sb.append("Número da OS: " + getIdOS() + "\n");
		sb.append("Data:" + data + "\n");
		sb.append("\nCPF/CNPJ Cliente: " + getCliente().getCadastroRF() + "\n");
		sb.append("Nome Cliente: " + getCliente().getNome() + "\n");
		sb.append("\nPlaca do veículo: " + getVeiculo().getPlaca() + "\n");
		sb.append("Modelo do veículo: " + getVeiculo().getModelo() + "\n");
		sb.append("Quilometragem atual: " + getKmAtual() + "\n");
		sb.append("\nNome do funcionário responsável: " + getFuncionario().getNome() + "\n");
		sb.append("ID do funcionário responsável: " + getFuncionario().getId() + "\n\n");	
		sb.append("Descrição da OS: " + getDescricao() + "\n");
		
		sb.append("Itens da OS ---------------------------------------\n");


		for (int i = 0; i < listaItens.size(); i++) {
			sb.append(listaItens.get(i).getLinhaOS());
		}
		sb.append("\t------VALOR TOTAL-------\n\t\t " + getTotalOS() + "\n");

		return sb.toString();
	}
}
