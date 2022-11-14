package Lista06;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		
		double valor; 
		
		ContaBancaria conta1 = new ContaBancaria ("Cliente 1", 1, 200);
		ContaPoupanca conta2 = new ContaPoupanca ("Cliente 2", 2, 100, 0.02);
		ContaEspecial conta3 = new ContaEspecial ("Cliente 3", 3, 300, 500);
		
		Scanner sc = new Scanner(System.in);
		
		//------SAQUES----------
		
		//conta 1
		System.out.println(conta1.toString());
		System.out.println("\nInsira o quanto quer sacar da conta 1: ");
		valor = sc.nextDouble();
		
		conta1.sacar(valor);
		System.out.println(conta1.toString());
		
		
		//conta 2
		System.out.println(conta2.toString());
		System.out.println("\nInsira o quanto quer sacar da conta 2: ");
		valor = sc.nextDouble();
		
		conta2.sacar(valor);
		System.out.println(conta2.toString());
		
		
		//conta 3
		System.out.println(conta3.toString());
		System.out.println("\nInsira o quanto quer sacar da conta 3: ");
		valor = sc.nextDouble();
		
		conta3.sacar(valor);
		System.out.println(conta3.toString());
		
		
		//-------DEPOSITOS--------
		
		//conta 1
		
		System.out.println("\nSaldo da conta 1: " + conta1.getSaldo());
		System.out.println("Insira o quanto quer depositar na conta 1: ");
		valor = sc.nextDouble();
		
		conta1.depositar(valor);
		System.out.println(conta1.toString());
		
		
		//conta 2
		
		System.out.println("\nSaldo da conta 2: " + conta2.getSaldo());
		System.out.println("Insira o quanto quer depositar na conta 2: ");
		valor = sc.nextDouble();
		
		conta2.depositar(valor);
		System.out.println(conta2.toString());
		
		
		//conta 3
		
		System.out.println("\nSaldo da conta 3: " + conta3.getSaldo());
		System.out.println("Insira o quanto quer depositar na conta 3: ");
		valor = sc.nextDouble();
		
		conta3.depositar(valor);
		System.out.println(conta3.toString());

		
		//--------RENDIMENTO POUPANÇA----------
		System.out.println(conta2.toString());
		conta2.calcularNovoSaldo();
		System.out.println("\nNovo saldo após rendimento: " + conta2.getSaldo());
		
		sc.close();
	}

}
