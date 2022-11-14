package model;

public interface IVeiculo {
	
	public String getPlaca ();
	public String getModelo();
	public int getAnoFabricacao();
	public int getAnoModelo();
	public String getCor();
	public String getDataCompra();
	public ICliente getCliente();
	
}
