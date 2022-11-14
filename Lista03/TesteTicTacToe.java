package Lista03;

import java.util.Scanner;
import java.util.Random;

public class TesteTicTacToe {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linha;
		int coluna;
		
		TicTacToe jogo = new TicTacToe();
		String vencedor = jogo.vencedor();
		
		int jogador = 1;
		jogo.show();
		
		while (vencedor == ".") {
			if (jogador == 1) {
				System.out.println("Jogador -> X");
				System.out.println("PC -> O\n");
				
				System.out.println("Sua vez!");
				
				System.out.print("Linha: ");
				linha = sc.nextInt();
				
				System.out.print("Coluna: ");
				
				coluna = sc.nextInt();
			}
			else {
				Random pc = new Random();
				linha = pc.nextInt(4);
				coluna = pc.nextInt(4);			
			}
			
			if (!jogo.jogada(jogador, linha-1, coluna-1)) {
				if (jogador == 1) {
					System.out.println("\nJogada invalida...\n");
					jogo.show();
				}
			} 
			
			else {
				if (jogador == 1) {
					jogador = 2;
					jogo.show();
					vencedor = jogo.vencedor();
				}
				
				else {
					jogador = 1;
					System.out.println("Jogada do PC:");
					jogo.show();
					vencedor = jogo.vencedor();
				}
			}		
		}
		
		switch (vencedor) {
		case "X" :
			System.out.println("Vencedor: jogador 1!");
			break;
		case "O":
			System.out.println("Vencedor: PC!");
			break;
		case "3":
			System.out.println("Empate");
			break;
		}
	}
}
