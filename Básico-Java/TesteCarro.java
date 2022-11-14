package Lista01;

import java.util.Scanner;
import java.util.ArrayList;

public class TesteCarro {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option;

		ArrayList<Carro> listaCarros = new ArrayList<Carro>();

		while (true) {

			int count = -1;

			System.out.println("1 - Cadastrar carro");
			System.out.println("2 - Imprimir dados");
			System.out.println("3 - Testar Aceleração");
			System.out.println("4 - Testar freios");
			System.out.println("5 - Encerrar");
			option = input.nextInt();

			switch (option) {
			case 1:

				String placa;
				System.out.print("Insira a placa do carro: ");
				placa = input.next();

				int ano;
				System.out.print("Insira o ano do carro: ");
				ano = input.nextInt();

				String modelo;
				System.out.print("Insira o modelo do carro: ");
				modelo = input.next();

				Carro carro1 = new Carro(placa, ano, modelo);
				listaCarros.add(carro1);

				break;

			case 2:

				while (count == -1) {
					System.out.print("Insira qual carro você quer imprimir: ");
					count = input.nextInt();

					if (listaCarros.isEmpty() == true) {
						System.out.println("Nenhum carro registrado ainda!");
					}

					else if (count < 1 || count > listaCarros.get(0).getNumCarros()) {
						System.out.println("Insira um carro válido!");
						count = -1;
					}

					else {
						listaCarros.get(count - 1).mostraCarro(listaCarros.get(count - 1));
					}
				}

				break;

			case 3:

				while (count == -1) {
					System.out.print("Insira qual carro você quer testar a aceleração: ");
					count = input.nextInt();

					if (listaCarros.isEmpty() == true) {
						System.out.println("Nenhum carro registrado ainda!");
					}

					else if (count < 1 || count > listaCarros.get(0).getNumCarros()) {
						System.out.println("Insira um carro válido!");
						count = -1;
					}

					else {
						listaCarros.get(count - 1).acelerar(listaCarros.get(count - 1));
						System.out.println("Velocidade: " + listaCarros.get(count - 1).getVelocidade());
					}
				}

				break;

			case 4:
				while (count == -1) {
					System.out.print("Insira qual carro você quer testar a aceleração: ");
					count = input.nextInt();

					if (listaCarros.isEmpty() == true) {
						System.out.println("Nenhum carro registrado ainda!");
					}

					else if (count < 1 || count > listaCarros.get(0).getNumCarros()) {
						System.out.println("Insira um carro válido!");
						count = -1;
					}

					else {
						listaCarros.get(count - 1).frear(listaCarros.get(count - 1));
						System.out.println("Velocidade: " + listaCarros.get(count - 1).getVelocidade());
					}

				}

				break;

			case 5:
				System.exit(1);

			}

		}
	}
}
