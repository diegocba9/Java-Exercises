package lista07;
import java.io.Serializable;

public class Pessoa implements Serializable{

	private String nome;
	private int cpf;
	private String telefone;
	private static final long serialVersionUID = -6875210512346855839l;
	
	public Pessoa (String nome, int cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String printPessoas () {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "Telefone: " + getTelefone());
		return sb.toString();
	}
	
}
