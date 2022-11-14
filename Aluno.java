package ListaEx;
import java.util.Scanner;

public class Aluno {

	private String nome;
	private double cpf;
	
	private String curso;
	private String disciplina;
	
	private double notaP1;
	private double notaP2;
	private double notaFinal;
	
	public Aluno (String nome, double cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) { //existe a possibilidade de trocar de nome
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) { 
		this.curso = curso;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina (String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getNotaP1() {
		return notaP1;
	}
	
	public void setNotaP1(double notaP1) { 
		if (notaP1>=0 && notaP1<=10) {
			this.notaP1 = notaP1;
		}
		else {
			Scanner input = new Scanner (System.in);
			System.out.print("Valor inserido inválido! Insira uma nota possível:");
			notaP1 = input.nextDouble();
			setNotaP1(notaP1);
		}
	}
	
	public double getNotaP2() {
		return notaP2;
	}
	
	public void setNotaP2(double notaP2) {
		if (notaP2>=0 && notaP2<=10) {
			this.notaP2 = notaP2;
		}
		else {
			Scanner input = new Scanner (System.in);
			System.out.print("Valor inserido inválido! Insira uma nota possível:");
			notaP2 = input.nextDouble();
			setNotaP2(notaP2);
		}
	}
	
	public double getNotaFinal() {
		return notaFinal;
	}
	
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public double calculaNota (Aluno aluno) {
		double nota;
		double notaP1;
		double notaP2;
		
		notaP1= aluno.getNotaP1();
		notaP2= aluno.getNotaP2();
		nota = (notaP1+notaP2)/2;
		return nota;
	}

	public double calculaNotaFinal (Aluno aluno) {
		double media;
		media = calculaNota(aluno);
		
		if (media>=7 || media<3) {
			aluno.setNotaFinal(media);
			return media;
		}
		
		else {
			Scanner input = new Scanner (System.in);
			double notaFinal;
			double notaReal;
			System.out.print("\nO aluno ficou em prova final!\nInsira a nota da PF: ");
			notaFinal = input.nextDouble();
			
			while (notaFinal<0 || notaFinal>10) {
				System.out.print("Valor inserido inválido! Insira uma nota possível: ");
				notaFinal = input.nextDouble();
			}
			
			notaReal = (media + notaFinal) /2;
			aluno.setNotaFinal(notaReal);
			return notaReal;
		}
	}
	
	public void mostraAluno (Aluno aluno) {
		
		System.out.print("\nNome do aluno: ");
		System.out.println(aluno.getNome());
		
		System.out.print("CPF do aluno: ");
		System.out.println(aluno.getCpf());
		
		System.out.print("Curso: ");
		System.out.println(aluno.getCurso());
		
		System.out.print("Disciplina: ");
		System.out.println(aluno.getDisciplina());
		
		System.out.print("Nota da P1: ");
		System.out.println(aluno.getNotaP1());
		
		System.out.print("Nota da P2: ");
		System.out.println(aluno.getNotaP2());
		
		double nota = calculaNota (aluno);
		System.out.print("A média desse aluno é " + nota);
		nota = calculaNotaFinal(aluno);
	}
	
	public void mostraSituacao (Aluno aluno) {
		double nota;
		nota = aluno.getNotaFinal();
		if (nota >= 5) {
			System.out.print("\nNota final: " + nota);
			System.out.print("\nAprovado!\n");
		}
		else {
			System.out.print("\nNota final: " + nota);
			System.out.print("\nReprovado!\n");
		}
	}
	
}


