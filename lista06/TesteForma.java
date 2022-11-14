package Lista06;

import java.util.ArrayList;

public class TesteForma {

	public static void main(String[] args) {
		
		ArrayList<Forma> listaFormas = new ArrayList<Forma>();
		
		Circulo circulo = new Circulo ("verde", 10);
		Quadrado quadrado = new Quadrado ("vermelho", 5);
		Triangulo triangulo = new Triangulo ("branco", 6, 5);
		
		Esfera esfera = new Esfera ("cinza", 7);
		Cubo cubo = new Cubo ("amarelo", 10);
		Tetraedro tetraedro = new Tetraedro ("preto", 5, 10);
		
		listaFormas.add(circulo);
		listaFormas.add(quadrado);
		listaFormas.add(triangulo);
		
		listaFormas.add(esfera);
		listaFormas.add(cubo);
		listaFormas.add(tetraedro);
		
		for (int i=0; i<listaFormas.size(); i++) {
			System.out.println("\nO objeto é um " + listaFormas.get(i).getClass().getSimpleName());
			System.out.println("Cor: " + listaFormas.get(i).getCor());
			if (listaFormas.get(i) instanceof FormaBidimensional) {
				System.out.println("A forma é uma forma bidimensional");
				System.out.println("Área: " + listaFormas.get(i).obterArea());
			}
			else {
				System.out.println("A forma é uma forma tridimensional");
				System.out.println("Área: " + listaFormas.get(i).obterArea());
				System.out.println("Volume: " + listaFormas.get(i).obterVolume());
			}
		}
		
	}

}
