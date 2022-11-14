package lista07;

//A classe ShuffleClass exemplifica o processamento polim�rfico para embaralhar os elementos de listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleClass {
	//m�todo que realiza a troca dos elementos 'i' e 'j' da lista 'a'
	public static <E> void swap(List <E> a, int i, int j) {
		E tmp = a.get(i);	//a vari�vel "tmp" salva o elemento que est� na posi��o i da lista a
		a.set(i, a.get(j));	//a lista coloca na posi��o i o elemento da posi��o j
		a.set(j, tmp);		//a lista coloca na posi��o j o elemento que estava na posi��o i, salvo na vari�vel "tmp"
	}
	
	//embaralha a lista
	public static void shuffle(List<?> list, Random rnd) {
		for(int i = list.size(); i>1 ; i--) {
			swap(list, i-1, rnd.nextInt(i));	//chamada do m�todo swap, que realiza a troca da ordem dos elementos da lista
		}
	}
	
	public static void main(String[] args) {
		Random rnd = new Random(0);		//gera um n�mero aleat�rio
		List<Integer> numbers = new ArrayList<Integer>();	//cria uma lista chamada "numbers"
		
		for(int i=0; i<10; i++) {
			numbers.add(i);		//adiciona � lista os n�meros de 0 a 9
		}
		System.out.println("Lista original: " + numbers);	//imprime a lista em sequ�ncia
		shuffle(numbers,rnd);	//chamada do m�todo shuffle, que tem a fun��o de embaralhar a lista
		System.out.println("Lista embaralhada: " + numbers);	//imprime a lista embaralhada
	}
}
