package Lista03;

import java.util.ArrayList;

public class TesteArray {
	public static void main(String[] args) {

		ArrayList<AlunoArray> listaAlunos = new ArrayList<AlunoArray>();
		
		//Teste add
		AlunoArray aluno1 = new AlunoArray ("Diego", 8);
		listaAlunos.add (aluno1);		
		AlunoArray aluno2 = new AlunoArray ("Luis", 10);
		listaAlunos.add(aluno2);
		AlunoArray aluno3 = new AlunoArray ("Carlos", 5);
		listaAlunos.add(aluno3);
	
		//Continua��o teste add + teste get
		System.out.println("--------Teste add e get --------");
		for (int i=0; i < listaAlunos.size(); i++) {
			System.out.println(listaAlunos.get(i).printInfo());
		}
		
		//Teste clear
		listaAlunos.clear();
		if (listaAlunos.isEmpty() == true) {
			System.out.println("--------Teste clear--------\nLista limpa!");
		}
		
		//Teste contains
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		
		System.out.println("\n--------Teste contains--------");
		System.out.println("A lista cont�m o aluno 2?\n" + listaAlunos.contains(aluno2));
		System.out.println("A lista cont�m o aluno 3?\n" + listaAlunos.contains(aluno3));
		
		//Teste indexOf
		System.out.println("\n--------Teste indexOf--------");
		System.out.println("�ndice do aluno 2: " + listaAlunos.indexOf(aluno2));
		System.out.println("�ndice do aluno 1: " + listaAlunos.indexOf(aluno1));
		
		//Teste remove
		listaAlunos.remove(0);
		System.out.println("\n--------Teste remove--------");
		System.out.println("Aluno 1 existe na lista ap�s ser removido?\n" + listaAlunos.contains(aluno1));
		
		//Teste size
		System.out.println("\n--------Teste size--------");
		System.out.println("Tamanho da lista com aluno 2: " + listaAlunos.size());
		listaAlunos.add(aluno3);
		listaAlunos.add(aluno1);
		System.out.println("Tamanho da lista ap�s adi��o dos alunos 1 e 3: " + listaAlunos.size());
	}
}
