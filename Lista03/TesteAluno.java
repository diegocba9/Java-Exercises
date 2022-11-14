package Lista03;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
			
		int quantAlunos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de alunos que deseja inserir: ");
		quantAlunos = sc.nextInt();
		
		double nota[] = new double[quantAlunos];
		String nome[] = new String[quantAlunos];
		
		for (int i=0; i<quantAlunos; i++) {
			System.out.print("Insira o nome do " + (i+1) + "� aluno: ");
			nome[i] = sc.next();
			
			System.out.print("Insira a nota desse aluno: ");
			nota[i] = sc.nextDouble();
			Aluno aluno1 = new Aluno (nome[i], nota[i]);
			
			System.out.println(aluno1.print());
		}		
		
	}
}
