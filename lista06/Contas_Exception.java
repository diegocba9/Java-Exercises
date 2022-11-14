package Lista06;

public class Contas_Exception {

	public static void main(String[] args) {
		
		ContaBancaria_Exception conta1 = new ContaBancaria_Exception ("Cliente 1", 1, 200);
		ContaPoupanca_Exception conta2 = new ContaPoupanca_Exception ("Cliente 2", 2, 100, 0.02);
		ContaEspecial_Exception conta3 = new ContaEspecial_Exception ("Cliente 3", 3, 300, 500);
		//------SAQUES----------
		
		//conta 1		
		//Teste de exceção
		try {
			conta1.sacar(250);
		} catch (IllegalArgumentException e) {
			System.out.println("Conta 1");
			System.out.println("--------" + e.getMessage() + "----------\n");
		}
		
		
		//conta 2
		//Teste de exceção
		try {
			conta2.sacar(150);
		} catch (IllegalArgumentException e) {
			System.out.println("\nConta 2");
			System.out.println("-------" + e.getMessage() + "----------\n");
		}
		
		
		//conta 3		
		//Teste de exceção
		try {
			conta3.sacar(900);
		} catch (IllegalArgumentException e) {
			System.out.println("\nConta 3");
			System.out.println("----------" + e.getMessage() + "-------------\n");
		}
			
		//-------DEPOSITOS--------
		
		//conta 1
		
		try {
			conta1.depositar(-100);
		} catch (IllegalArgumentException e) {
			System.out.println("\nConta 1");
			System.out.println("----------" + e.getMessage() + "-------------\n");
		}
		
		
		//conta 2
		
		try {
			conta2.depositar(-100);
		} catch (IllegalArgumentException e) {
			System.out.println("\nConta 2");
			System.out.println("----------" + e.getMessage() + "-------------\n");
		}
		
		//conta 3
		
		try {
			conta3.depositar(-100);
		} catch (IllegalArgumentException e) {
			System.out.println("\nConta 3");
			System.out.println("----------" + e.getMessage() + "-------------\n");
		}

	}

}
