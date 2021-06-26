package entities;

import java.util.List;
import java.util.Scanner;

public class Livro {
	public String titulo;
	public String editora;
	public String area;
	public int ano;
	public double valor;

	public Livro() {

	}

	public Livro(String titulo, String editora, String area, int ano, double valor) {
		this.titulo = titulo;
		this.editora = editora;
		this.area = area;
		this.ano = ano;
		this.valor = valor;
	}

	public Livro CadastroLivro() {
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.println("===============================");
		System.out.println("BEM-VINDO AO CADASTRO DE LIVROS");
		System.out.println();
		System.out.print("Cadastre o Titulo do livro: ");
		String nome = teclado.nextLine();
		System.out.print("Cadastre a editora do livro: ");
		String editora = teclado.nextLine();
		System.out.print("Cadastre a categoria do livro: ");
		String categoria = teclado.nextLine();
		System.out.print("Cadastre o ano do livro: ");

		int ano = teclado.nextInt();
		System.out.print("Cadastre o preço do livro: ");
		double valor = teclado.nextDouble();

		Livro obj = new Livro(nome.toUpperCase(), editora.toUpperCase(), categoria.toUpperCase(), ano, valor);

		return obj;

	}

	public void Listagem(List<Livro> lista) {
		System.out.println();
		System.out.println("==============================================");
		for (Livro t : lista) {
			System.out.println("Lista de livros");
			System.out.println("Titulo/Editora: " + t.titulo + "/" + t.editora);
			System.out.println("Categoria: " + t.area);
			System.out.println("Ano: " + t.ano);
			System.out.println("Valor: " + t.valor);
			System.out.println();
		}

	}

	public void BuscaNome(List<Livro> lista, String nome) {
		System.out.println();
		System.out.println("==============================================");
		System.out.println("Lista de livros");
		int contador = lista.size() - 1;

		for (Livro t : lista) {
			if (t.titulo.contains(nome.toUpperCase())) {
				System.out.println();
				System.out.println(t.toString());
				contador++;
			}

		}
		if (contador == lista.size() - 1) {
			System.out.println("");
			System.out.println("Nada encontrado!");

		}

	}

	public void BuscaPreco(List<Livro> lista, double preco) {
		System.out.println();
		System.out.println("==============================================");
		System.out.println("Lista de livros");
		int contador = lista.size() - 1;
		for (Livro t : lista) {
			if (t.valor < preco) {
				System.out.println();
				System.out.println(t.toString());
				contador++;

			}

		}
		if (contador == lista.size() - 1) {
			System.out.println("");
			System.out.println("Nada encontrado!");

		}

	}

	public void BuscaCategoria(List<Livro> lista, String categoria) {
		System.out.println();
		System.out.println("==============================================");
		System.out.println("Lista de livros");
		int contador = lista.size() - 1;
		for (Livro t : lista) {
			if (t.area.contains(categoria.toUpperCase())) {
				System.out.println();
				System.out.println(t.toString());
				contador++;

			}

		}
		if (contador == lista.size() - 1) {
			System.out.println("");
			System.out.println("Nada encontrado!");

		}

	}

	public void MenuInfo() {
		System.out.println("");
		System.out.println("========================================");
		System.out.println("============MENU DO SISTEMA=============");
		System.out.println("ESCOLHA A OPÇÃO QUE DESEJA:");
		System.out.println();
		System.out.println("Cadastrar novo livro => (1)");
		System.out.println("Listar livros => (2)");
		System.out.println("Buscar livros por Titulo => (3)");
		System.out.println("Buscar livros por Categoria => (4) ");
		System.out.println("Buscar livros por Preço => (5)");
		System.out.println("Sair do programa => (0)");
		System.out.print("DIGITE: ");

	}

	public int Menu(List<Livro> lista) {
		Scanner teclado = new Scanner(System.in);
		MenuInfo();
		int escolha = teclado.nextInt();

		switch (escolha) {
		case 1:

			lista.add(CadastroLivro());
			break;
		case 2:
			Listagem(lista);
			break;
		case 3:
			BuscaNome(lista, NomeEscolha());
			break;
		case 4:

			BuscaCategoria(lista, CategoriaEscolha());
			break;
		case 5:
			BuscaPreco(lista, PrecoEscolha());
			break;
		case 0:
			System.out.println();
			System.out.println("O sistema foi encerrado! Volte sempre :D");
			break;

		}

		return escolha;

	}

	public String NomeEscolha() {
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.println("Qual Titulo você busca:");
		System.out.print("DIGITE: ");
		String nome = teclado.nextLine();
		System.out.println();

		return nome.toUpperCase();

	}

	public String CategoriaEscolha() {
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.println("Qual Categoria você busca:");
		System.out.print("DIGITE: ");
		String categoria = teclado.nextLine();
		System.out.println();

		return categoria.toUpperCase();

	}

	public double PrecoEscolha() {
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.println("Qual o valor máximo que você busca:");
		System.out.print("DIGITE: ");
		double preco = teclado.nextDouble();
		System.out.println();
		return preco;

	}

	public String toString() {
		return "Titulo/Editora: " + this.titulo + "/" + this.editora + " \nCategoria: " + this.area + " \nAno: "
				+ this.ano + " \nValor: " + this.valor;
	}

}
