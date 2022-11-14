package Lista03;

public class Aluno {
	
	private double nota;
	private String nome;
	private static int quantAlunos;
	private static double totalNotas;
	
	public Aluno (String nome, double nota) {
		quantAlunos++;
		totalNotas += nota;
		this.nota = nota;
		this.nome = nome;
	}

	//sobrecarga para printar apos a insercao de todos os alunos
	public Aluno () {
		
	}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public double getMedia () {
		double med = 0.0;
		med = totalNotas/quantAlunos;
		return med;
	}
	
	public boolean isAprovado () {
		if (nota >= 7) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String print () {
		StringBuilder sb = new StringBuilder ();
		
		sb.append ("A media total dos alunos é " + getMedia() + "\n");
		if (isAprovado() == true) {
			sb.append("O aluno foi aprovado! Nome: " + getNome() + "\n");
			sb.append("Nota: " + getNota() + "\n");
		}
		
		return sb.toString();
	}
}
