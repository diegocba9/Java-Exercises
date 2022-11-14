package lista07;

//A classe FindDups2 mostra o uso das opera��es sobre conjuntos de Set

import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindDups2 {
	public static void main(String[] args) {
		Set<String> uniques = new LinkedHashSet<String>(); // cria uma interface de tabela hash com lista encadeada para
															// as palavras �nicas

		Set<String> dups = new LinkedHashSet<String>(); // cria uma interface de tabela hash com lista encadeada para as
														// palavras duplicadas

		for (String a : args) { // foreach que percorre a String utilizada como entrada no main
			if (!uniques.add(a)) { // salva as palavras da String "args" sem repeti��o
				dups.add(a); // quando ocorre repeti��o de palavras, essas s�o salvas na interface "dups"
			}
		}
		uniques.removeAll(dups); // Subtra��o de conjuntos de todas as palavras sem repeti��o pelas palavras que
									// foram repetidas, para salvar no "uniques" apenas as palavras que n�o se
									// repetem

		System.out.println(args.length + " palavras originais " + Arrays.toString(args)); // impress�o de todos os
																							// elementos da String
		
		System.out.println(uniques.size() + " palavras �nicas " + uniques); // impress�o dos elementos da interface
																			// "uniques", que ap�s a subtra��o n�o
																			// possuir� mais elementos que se repetiram
		
		System.out.println(dups.size() + " palavras duplicadas: " + dups); //impress�o dos elementos que se repetiram na String "args"
	}
}
