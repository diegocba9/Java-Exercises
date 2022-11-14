package lista07;

//classe Freq exemplifica o uso de mapeamentos em Java
import java.util.*;

public class Freq {
	public static void main(String[] args) {
		String poem = "No meio do caminho tinha uma pedra " + "Tinha uma pedra no meio do caminho " + "Tinha uma pedra "
				+ "No meio do caminho tinha uma pedra. ";

		// Particionando pelos espaços e pontos
		String[] words = poem.toLowerCase().split("[ .]");

		// Montando uma tabela de frequências
		Map<String, Integer> m = new LinkedHashMap<String, Integer>(); // cria uma interface de Map com uma tabela hash
		for (String a : words) { // for varrendo a String "words"
			Integer freq = m.get(a); // associa a variável "freq" à a palavra mapeada
			m.put(a, (freq == null) ? 1 : freq + 1); // incrementa "freq" em relação à quantidade de vezes que a palavra é mapeada
		}

		System.out.println(m.size() + " palavras distintas: " + m); // imprime a quantidade de palavras e a frequência
																	// que cada uma se repete
	}
}
