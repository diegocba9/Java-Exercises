package lista07;

//A classe FindDups mostra o uso da coleção Set, armazenando e depois imprimindo um conjunto de Strings

import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindDups {
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>(); // cria uma interface de tabela hash com lista encadeada,
														// armazenando os elementos em ordem
		
		for (String a : args) { // foreach que percorre a String utilizada como entrada no main
			s.add(a); // adiciona à interface Set os elementos da String "args"
		}

		System.out.println(args.length + " palavras originais " + Arrays.toString(args)); // impressão de todos os
																							// elementos da String
		
		System.out.println(s.size() + " palavras distintas: " + s); // impressão dos elementos da interface Set, que
																	// filtra aqueles que forem repetidos
	}
}
