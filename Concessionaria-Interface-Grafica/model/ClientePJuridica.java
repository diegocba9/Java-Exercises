package model;

import javax.swing.text.MaskFormatter;

public class ClientePJuridica extends Cliente {

	private final long cnpj;
	
	public ClientePJuridica(String nome, long cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	public long getCNPJ() {
		return cnpj;
	}

	public String getCadastroRF() {
		String cnpj_ = String.format("%014d", cnpj);

		try {
			MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(cnpj_);
		} catch (Exception e) {
			return ("Erro!");
		}
	}

}
