package lista07;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	public static void main(String[] args) {
		// cria TreeSet a partir do Array colors
		String[] colors = { "yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green" };
		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colors)); // Salva os elementos da String em ordem
																				// alfabética e sem repetição

		System.out.print("sorted set: ");
		printSet(tree); // impressão de todos os elementos da árvore sem repetição e em orden alfabetica

		// obtém hadSet com base em "orange"
		System.out.print("headSet (\"orange\"): ");
		printSet(tree.headSet("orange")); // imprime todos os elementos da árvore que vêm antes de "orange"

		// obtém tailSet baseado em "orange"
		System.out.print("tailSet (\"orange\"): ");
		printSet(tree.tailSet("orange")); // imprime todos os elementos que vêm depois de "orange" incluindo o próprio
											// elemento "orange"

		// imprime o primeiro e último elementos
		System.out.printf("first: %s\n", tree.first());
		System.out.printf("last: %s\n", tree.last());

	}

	// Método para impressão
	private static void printSet(SortedSet<String> tree) {
		for (String s : tree) { // foreach que percorre a interface que contém as cores
			System.out.printf("%s ", s); // impressão das cores contidas na interface
		}
		System.out.println();

	}
}
