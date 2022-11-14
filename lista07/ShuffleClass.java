package lista07;

//A classe ShuffleClass exemplifica o processamento polimórfico para embaralhar os elementos de listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleClass {
	//método que realiza a troca dos elementos 'i' e 'j' da lista 'a'
	public static <E> void swap(List <E> a, int i, int j) {
		E tmp = a.get(i);	//a variável "tmp" salva o elemento que está na posição i da lista a
		a.set(i, a.get(j));	//a lista coloca na posição i o elemento da posição j
		a.set(j, tmp);		//a lista coloca na posição j o elemento que estava na posição i, salvo na variável "tmp"
	}
	
	//embaralha a lista
	public static void shuffle(List<?> list, Random rnd) {
		for(int i = list.size(); i>1 ; i--) {
			swap(list, i-1, rnd.nextInt(i));	//chamada do método swap, que realiza a troca da ordem dos elementos da lista
		}
	}
	
	public static void main(String[] args) {
		Random rnd = new Random(0);		//gera um número aleatório
		List<Integer> numbers = new ArrayList<Integer>();	//cria uma lista chamada "numbers"
		
		for(int i=0; i<10; i++) {
			numbers.add(i);		//adiciona à lista os números de 0 a 9
		}
		System.out.println("Lista original: " + numbers);	//imprime a lista em sequência
		shuffle(numbers,rnd);	//chamada do método shuffle, que tem a função de embaralhar a lista
		System.out.println("Lista embaralhada: " + numbers);	//imprime a lista embaralhada
	}
}
