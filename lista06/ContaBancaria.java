package Lista06;

import java.util.Scanner;

public class ContaBancaria {

	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria (String nomeCliente, int numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar (double valor) {
		while (getSaldo() < 1 || getSaldo() < valor) {
			Scanner sc = new Scanner (System.in);
			System.out.println("\nSaldo insuficiente! Insira novo valor de saque: ");
			valor = sc.nextDouble();
			sc.close();
		}
		double saldo = getSaldo();
		saldo = saldo-valor;
		if (saldo < 0) {
			setSaldo(0);
		}
		else {
			setSaldo(saldo);
		}
	}
	
	public void depositar (double valor) {
		while (valor<0) {
			Scanner sc = new Scanner (System.in);
			System.out.println("\nInsira um valor válido para o depósito!");
			valor = sc.nextDouble();
			sc.close();
		}
		double saldo = getSaldo();
		saldo = saldo + valor;
		setSaldo(saldo);
	}
	
	public String toString() {
		return "\n" + "Nome do cliente : " + this.nomeCliente + "\nNúmero da conta: " + this.numConta + "\nSaldo: " + this.saldo;
	}
}
