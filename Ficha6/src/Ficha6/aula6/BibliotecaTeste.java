package Ficha6.aula6;

import java.util.ArrayList;

public class BibliotecaTeste {
	public static void main(String[] args) {
		Biblioteca porto = new Biblioteca();
		Biblioteca lisboa = new Biblioteca("Lisboa");
		Biblioteca braga = new Biblioteca("Braga");

		porto.setNome("Porto");

		ArrayList<String> lst = new ArrayList<>();
		ArrayList<String> lst1 = new ArrayList<>();

		lst.add("porto livro1");
		lst.add("porto livro2");

		lst1.add("lisboa livro1");
		lst1.add("lisboa livro2");
		lst1.add("lisboi livro3");

		porto.setLivros(lst);
		lisboa.setLivros(lst1);

		System.out.println(porto);
		System.out.println(lisboa);

		System.out.println(porto.isEqual("Porto", lst));
		System.out.println(porto.equals(porto));

		braga = (Biblioteca) lisboa.clone();
		// biblioteca braga passa a ter o nome e livros de lisboa
		System.out.println(braga);

		System.out.println(lisboa.livroBelongs("lisboa livro2"));

		System.out.println(lisboa.livrosComPalavra("lisboa"));
		int escolha;

		Biblioteca NovaBib = (Biblioteca) lisboa.clone();

		do {
			System.out.println(
					"1  Mostrar livros da biblioteca\n2  Adicionar um novo livro;\n3  Remover um livro da biblioteca;\n4  Pesquisar livro por nome;		\n5  Pesquisar livro por uma palavra contida no título;\n6  Terminar.");
			escolha = Ler.umInt();
			switch (escolha) {

			case 1:
				System.out.println(NovaBib.getLivros());
				break;
			case 2:
				NovaBib.adicionalivro(Ler.umaString());
				break;
			case 3:
				NovaBib.getLivros().remove(NovaBib.getLivros().indexOf(Ler.umaString()));//O remobve pode recerber so a string!!!
				break;
			case 4:
				String nome = Ler.umaString();
				if (NovaBib.getLivros().contains(nome)) {
					System.out.println("Livro existe na posição: " + NovaBib.getLivros().indexOf(nome));
				} else {
					System.out.println("O livro não existe");
				}
				break;
			case 5:
				System.out.println(NovaBib.livrosComPalavra(Ler.umaString()));
				break;
			case 6:
				System.out.println("Escolheu terminar");
				break;
			default:
				System.out.println("Mete um numero certo ");

			}

		} while (escolha != 6);
	}
}
