package Lista06;

import java.util.Scanner;

public class Vetor {

	private int vet[];
	private int tam;

	public int[] getVet() {
		return vet;
	}

	public void setVet(int[] vet) {
		this.vet = vet;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public void aloca(int x) {
		int vet[];
		vet = new int[x];
		for (int i = 0; i < x; i++) {
			vet[i] = 0;
		}
		setVet(vet);
	}

	public int[] desaloca(int vet[]) {
		vet = null;
		return vet;
	}

	public void insere(int valor) {
		int vet[] = getVet();
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == 0) {
				vet[i] = valor;
				break;
			}
		}
	}

	public void remove(int index) {
		int vet[] = getVet();
		Scanner sc = new Scanner(System.in);
		
		while (index>vet.length) {
			System.out.println("Index fora dos limites!");
			index = sc.nextInt();
		}
		vet[index] = 0;
		sc.close();
	}

	public int retorna(int index) {
		int vet[] = getVet();
		return vet[index];
	}

	public int[] calcula(String operando, int operador) {
		int vet[] = getVet();
		Scanner sc = new Scanner(System.in);
		if (operando.equals("/") == false && operando.equals("*") == false && operando.equals("+") == false
				&& operando.equals("-") == false) {
			System.out.println("Operando inválido! Insira um operando correto (/, *, + ou -): ");
			operando = sc.next();
		}
		sc.close();
		for (int i = 0; i < vet.length; i++) {
			if (operando.equals("/")) {
				vet[i] = vet[i] / operador;
			} else if (operando.equals("*")) {
				vet[i] = vet[i] * operador;
			} else if (operando.equals("+") && vet[i]!=0) {
				vet[i] = vet[i] + operador;
			} else if (operando.equals("-") && vet[i]!=0) {
				vet[i] = vet[i] - operador;
			}
		}
		return vet;
	}

	public static void main(String[] args) {

		Vetor vet = new Vetor();
		vet.aloca(5);
		
		//Inserindo
		vet.insere(1);
		vet.insere(5);
		vet.insere(10);
		vet.insere(8);
		vet.insere(4);
		
		//Imprimindo
		System.out.println("Vet[0] = " + vet.retorna(0));
		System.out.println("Vet[1] = " + vet.retorna(1));
		System.out.println("Vet[2] = " + vet.retorna(2));
		System.out.println("Vet[3] = " + vet.retorna(3));
		System.out.println("Vet[4] = " + vet.retorna(4));
		
		//Removendo
		vet.remove(2);
		System.out.println("\n\nVet[2] = " + vet.retorna(2));
		
		//Calculando
		vet.calcula("*", 5);
		
		System.out.println("\n\nVet[0] = " + vet.retorna(0));
		System.out.println("Vet[1] = " + vet.retorna(1));
		System.out.println("Vet[2] = " + vet.retorna(2));
		System.out.println("Vet[3] = " + vet.retorna(3));
		System.out.println("Vet[4] = " + vet.retorna(4));
		
		vet.calcula("-", 10);
		
		System.out.println("\n\nVet[0] = " + vet.retorna(0));
		System.out.println("Vet[1] = " + vet.retorna(1));
		System.out.println("Vet[2] = " + vet.retorna(2));
		System.out.println("Vet[3] = " + vet.retorna(3));
		System.out.println("Vet[4] = " + vet.retorna(4));
		
		
	}
}
