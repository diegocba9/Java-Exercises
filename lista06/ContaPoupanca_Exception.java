package Lista06;

public class ContaPoupanca_Exception extends ContaBancaria_Exception {
	
	private double diaRendimento;
	
	public ContaPoupanca_Exception (String nomeCliente, int numConta, double saldo, double diaRendimento) {
		super (nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public String toString () {
		return "\n" + "Nome do cliente : " + getNomeCliente() + "\nNúmero da conta: " + getNumConta() + "\nSaldo: " + getSaldo();
	}
	
	public void calcularNovoSaldo () {
		double saldo = getSaldo();
		saldo = saldo + (saldo * getDiaRendimento());
		setSaldo(saldo);
	}

}
