package model;

import javax.swing.text.MaskFormatter;

public class ClientePFisica extends Cliente {
	
	private final long cpf;
	
	public ClientePFisica (String nome, long cpf) {
		super(nome);
		this.cpf = cpf;	
	}
	
	public String getCadastroRF () {
		String cpf_ = String.format("%011d", cpf);
		
		try {
			MaskFormatter mask = new MaskFormatter("###.###.###-##");
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(cpf_);
		}
		catch (Exception e) {
			return ("Erro!");
		}
	}

	public long getCPF() {
		return cpf;
	}
}
