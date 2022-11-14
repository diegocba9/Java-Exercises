package model;

import javax.swing.text.MaskFormatter;

public abstract class Cliente implements ICliente {
	
	private String nome;
	
	private String email;
	private long telefone;
	private String endereco;

	public Cliente (String nome) {
		this.nome = nome;	
	}

	public abstract String getCadastroRF ();
	
	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		String tel = String.format("%011d", telefone);
		try {
			MaskFormatter mask = new MaskFormatter("(##)#####-####");
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(tel);
		} catch (Exception e) {
			return ("Erro!");
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
