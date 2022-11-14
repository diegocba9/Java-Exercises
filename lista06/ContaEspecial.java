package Lista06;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {
	
		private double limite;
		
		public ContaEspecial (String nomeCliente, int numConta, double saldo, double limite) {
			super (nomeCliente, numConta, saldo);
			this.limite = limite;
		}

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		public String toString () {
			return "\n" + "Nome do cliente : " + getNomeCliente() + "\nNúmero da conta: " + getNumConta() + "\nSaldo: " + getSaldo() + "\nLimite: " + getLimite();
		}
		
		public void sacar (double valor) {
			double valorLimite = getSaldo() + getLimite();
			while (getSaldo() < 1 || valorLimite < valor) {
				Scanner sc = new Scanner(System.in);
				System.out.println("\nSaldo insuficiente! Insira novo valor de saque: ");
				valor = sc.nextDouble();
				sc.close();
			}
			double saldo = getSaldo();
			saldo = saldo-valor;
			setSaldo(saldo);
		}

}
