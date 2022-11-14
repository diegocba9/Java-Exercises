package lista07;

//A classe FindDups2 mostra o uso das operações sobre conjuntos de Set

import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindDups2 {
	public static void main(String[] args) {
		Set<String> uniques = new LinkedHashSet<String>(); // cria uma interface de tabela hash com lista encadeada para
															// as palavras únicas

		Set<String> dups = new LinkedHashSet<String>(); // cria uma interface de tabela hash com lista encadeada para as
														// palavras duplicadas

		for (String a : args) { // foreach que percorre a String utilizada como entrada no main
			if (!uniques.add(a)) { // salva as palavras da String "args" sem repetição
				dups.add(a); // quando ocorre repetição de palavras, essas são salvas na interface "dups"
			}
		}
		uniques.removeAll(dups); // Subtração de conjuntos de todas as palavras sem repetição pelas palavras que
									// foram repetidas, para salvar no "uniques" apenas as palavras que não se
									// repetem

		System.out.println(args.length + " palavras originais " + Arrays.toString(args)); // impressão de todos os
																							// elementos da String
		
		System.out.println(uniques.size() + " palavras únicas " + uniques); // impressão dos elementos da interface
																			// "uniques", que após a subtração não
																			// possuirá mais elementos que se repetiram
		
		System.out.println(dups.size() + " palavras duplicadas: " + dups); //impressão dos elementos que se repetiram na String "args"
	}
}
