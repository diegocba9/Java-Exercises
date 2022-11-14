package Lista03;

public class AlunoArray {
	
	private String nome;
	private double nota;
	
	public AlunoArray (String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String printInfo () {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome: " + getNome() + "\n");
		sb.append("Nota: " + getNota() + "\n");
		
		return sb.toString();
	}
	
}
