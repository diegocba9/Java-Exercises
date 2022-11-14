package Lista06;

public class ContaEspecial_Exception extends ContaBancaria_Exception {
	
		private double limite;
		
		public ContaEspecial_Exception (String nomeCliente, int numConta, double saldo, double limite) {
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
			if (getSaldo() < 1 || valorLimite < valor) {
				throw new IllegalArgumentException("Saldo insuficiente!");
			}
			else {
				double saldo = getSaldo();
				saldo = saldo-valor;
				setSaldo(saldo);
			}
		}

}
