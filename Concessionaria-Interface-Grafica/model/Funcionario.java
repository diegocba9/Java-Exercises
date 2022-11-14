package model;

public class Funcionario implements IFuncionario{
	
	private String nome;
	private final int id;
	
	public Funcionario (String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}
	
	
}
