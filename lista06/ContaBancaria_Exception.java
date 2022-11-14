package Lista06;

public class ContaBancaria_Exception {

	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria_Exception (String nomeCliente, int numConta, double saldo) {
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
		if (getSaldo() < 1 || getSaldo() < valor) {
			throw new IllegalArgumentException("Saldo insuficiente!");
		}
		else {
			double saldo = getSaldo();
			saldo = saldo-valor;
			if (saldo < 0) {
				setSaldo(0);
			}
			else {
				setSaldo(saldo);
			}
		}
	}
	
	public void depositar (double valor) {
		if (valor<0) {
			throw new IllegalArgumentException("Valor de depósito inválido!");
		}
		else {
			double saldo = getSaldo();
			saldo = saldo + valor;
			setSaldo(saldo);
		}
	}
	
	public String toString() {
		return "\n" + "Nome do cliente : " + this.nomeCliente + "\nNúmero da conta: " + this.numConta + "\nSaldo: " + this.saldo;
	}
}
