package lista03;

import java.util.Random;

//Classe que calcula a quantidade de vezes que aparece determinada combinação de resultados em dados de 6 faces através de uma matriz

public class Dices {
	private int matrix [][] = new int [7][7];
	
	public Dices () {
	}
	
	public void print(int times) {
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		int dice1;
		int dice2;
		
		for (int i=0; i<7; i++) {
			for (int j=0; j<7; j++) {
				if (i==0) {
					if (j==0) {
						matrix[i][j] = 0;
					}
					else {
						matrix[i][j] = j;
					}
				}
				else if(j==0) {
					matrix[i][j] = i;
				}
				else {
					matrix[i][j] = 0;
				}
			}		
		}
		
		for (int i=0; i<times; i++) {
			dice1 = rand.nextInt(6)+1;
			dice2 = rand.nextInt(6)+1;		
			
			matrix[dice1][dice2]++;			
		}
		
		for (int i=0; i<7; i++) {
			for (int j=0; j<7; j++) {
				if (i==0) {
					sb.append(matrix[i][j] + "   ");
				}
				else {
					sb.append(matrix[i][j] + " ");
				}
			}		
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
