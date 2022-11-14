package ListaEx;

import java.util.Scanner;

public class TesteAluno {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String nome;
		double cpf;
		String curso;
		String disciplina;
		double notaP1;
		double notaP2;		
		
		System.out.print("Insira o nome do primeiro aluno: ");
		nome = input.next();
			
		System.out.print("Insira o CPF do primeiro aluno: ");
		cpf = input.nextDouble();
		
		Aluno aluno1 = new Aluno(nome, cpf);
		
		System.out.print("Insira o curso desse aluno: ");
		curso = input.next();
		aluno1.setCurso(curso);
		
		System.out.print("Insira a disciplina desse aluno: ");
		disciplina = input.next();
		aluno1.setDisciplina(disciplina);
		
		System.out.print("Insira a nota da P1: ");
		notaP1 = input.nextInt();
		aluno1.setNotaP1(notaP1);
			
		System.out.print("Insira a nota da P2: ");
		notaP2 = input.nextInt();
		aluno1.setNotaP2(notaP2);
		
		aluno1.mostraAluno (aluno1);
		aluno1.mostraSituacao (aluno1);
		
//------------------------------------

		System.out.print("\nInsira o nome do segundo aluno: ");
		nome = input.next();
		
		System.out.print("Insira o CPF do segundo aluno: ");
		cpf = input.nextDouble();
		
		Aluno aluno2 = new Aluno(nome, cpf);
		
		System.out.print("Insira o curso desse aluno: ");
		curso = input.next();
		aluno2.setCurso(curso);
		
		System.out.print("Insira a disciplina desse aluno: ");
		disciplina = input.next();
		aluno2.setDisciplina(disciplina);
		
		System.out.print("Insira a nota da P1: ");
		notaP1 = input.nextInt();
		aluno2.setNotaP1(notaP1);
		
		System.out.print("Insira a nota da P2: ");
		notaP2 = input.nextInt();
		aluno2.setNotaP2(notaP2);	
		
		aluno2.mostraAluno (aluno2);
		aluno2.mostraSituacao (aluno2);
		
	}
	
}
