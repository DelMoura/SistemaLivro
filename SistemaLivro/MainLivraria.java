package application;

import java.util.ArrayList;

import entities.Livro;

public class MainLivraria {

	public static void main(String[] args) {
		Livro livro = new Livro();
		ArrayList<Livro> lista = new ArrayList<>();
		int escolha = -1;
		while (escolha != 0) {
			escolha = livro.Menu(lista);

			if (escolha > 5) {
				System.out.println();
				System.out.println("Digite as opções certas!  >:(");

			}

		}

	}

}
