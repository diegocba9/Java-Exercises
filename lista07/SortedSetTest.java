package lista07;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	public static void main(String[] args) {
		// cria TreeSet a partir do Array colors
		String[] colors = { "yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green" };
		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colors)); // Salva os elementos da String em ordem
																				// alfab�tica e sem repeti��o

		System.out.print("sorted set: ");
		printSet(tree); // impress�o de todos os elementos da �rvore sem repeti��o e em orden alfabetica

		// obt�m hadSet com base em "orange"
		System.out.print("headSet (\"orange\"): ");
		printSet(tree.headSet("orange")); // imprime todos os elementos da �rvore que v�m antes de "orange"

		// obt�m tailSet baseado em "orange"
		System.out.print("tailSet (\"orange\"): ");
		printSet(tree.tailSet("orange")); // imprime todos os elementos que v�m depois de "orange" incluindo o pr�prio
											// elemento "orange"

		// imprime o primeiro e �ltimo elementos
		System.out.printf("first: %s\n", tree.first());
		System.out.printf("last: %s\n", tree.last());

	}

	// M�todo para impress�o
	private static void printSet(SortedSet<String> tree) {
		for (String s : tree) { // foreach que percorre a interface que cont�m as cores
			System.out.printf("%s ", s); // impress�o das cores contidas na interface
		}
		System.out.println();

	}
}
