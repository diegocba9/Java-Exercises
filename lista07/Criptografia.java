package lista07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Criptografia {
	public static int codigo_ASCII;
	private static String cript = "";
	private static String descript = "";
	
	public static String getCript() {
		return cript;
	}

	public void Criptografar(int k) {
		char a;
		k=k%95;
		
		try {

			FileReader arq = new FileReader("src/lista07/entrada.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			
			File saida = new File ("src/lista07/saida.txt");
			saida.createNewFile();
		
			FileWriter escreveSaida = new FileWriter ("src/lista07/saida.txt");
			
			String linha = lerArq.readLine();
			while (linha != null) {
				for (int i = 0; i <= linha.length() - 1; i++) {
					codigo_ASCII = linha.charAt(i) + k;
					if (codigo_ASCII > 126) {
						int x = codigo_ASCII - 126;
						x = 31+x;
						codigo_ASCII = x;
					}
					a = (char) codigo_ASCII;

					cript += Character.toString(a);
				}
				escreveSaida.write(cript);
				linha = lerArq.readLine();
			}
			
			arq.close();
			escreveSaida.close();
			
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}

	public void Descriptografar (int k) {
		char a;
		k=k%95;
		
		try {
			FileReader arq = new FileReader("src/lista07/saida.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		    String linha = lerArq.readLine();
		    
		    while (linha !=null) {
		    	for (int i = 0; i <= linha.length() - 1; i++) {
	    			codigo_ASCII = linha.charAt(i) - k;
	    			if (codigo_ASCII < 32) {
						int x = linha.charAt(i) - 31;
						x = k - x;
						x = 126-x;
						codigo_ASCII = x;
					}
					a = (char) codigo_ASCII;
					descript += Character.toString(a);
				}
		    	linha=lerArq.readLine();
		    }
		    arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}	
	}

	public String MensagemCript() {
		return "\nFrase Criptografada: " + cript ;
	}

	public String MensagemOriginal() {
		return "Frase Descriptografada: " + descript;
		  
	}
	
	public static void main(String[] args) {
		int k;
		
		System.out.print("Insira o parâmetro para criptografia do arquivo de entrada: ");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		sc.close();
		
		Criptografia cript = new Criptografia();
		cript.Criptografar(k);
		cript.Descriptografar(k); 
		
		System.out.println(cript.MensagemCript());
		System.out.println(cript.MensagemOriginal());
	}
}
