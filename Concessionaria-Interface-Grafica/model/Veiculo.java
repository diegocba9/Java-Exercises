package model;

import javax.swing.text.MaskFormatter;

public class Veiculo implements IVeiculo {

	private final String placa;
	private String modelo;
	private ICliente cliente;

	private int anoFabricacao;
	private int anoModelo;
	private String cor;
	private long dataCompra;

	public Veiculo(String placa, String modelo, ICliente cliente) {
		this.placa = placa;
		this.modelo = modelo;
		this.cliente = cliente;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public ICliente getCliente() {
		return cliente;
	}

	public void setCliente(ICliente cliente) {
		this.cliente = cliente;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDataCompra() {
		String data = String.format("%08d", dataCompra);

		try {
			MaskFormatter mask = new MaskFormatter("##/##/####");
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(data);
			
		} catch (Exception e) {
			return ("Erro!");
		}
	}

	public void setDataCompra(long dataCompra) {
		this.dataCompra = dataCompra;
	}

}
