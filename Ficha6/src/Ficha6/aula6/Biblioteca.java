package Ficha6.aula6;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<String> livros;
	
	// Defina o construtor sem parâmetros
	public Biblioteca() {
		nome = "";
		livros = new ArrayList<>();
	}
	
	// Defina o construtor que receba como parâmetro o nome da biblioteca
	public Biblioteca(String nome) {
		this.nome = nome;
		livros = new ArrayList<>();
	}
	
	// Defina os getters e os setters
	public String getNome() {
		return nome;
	}
	
	public ArrayList<String> getLivros() {
		return livros;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setLivros(ArrayList<String> livros) {
		this.livros = (ArrayList<String>) livros.clone();
	}
	
	public String toString() {
		return "nome: " + nome + "\nlivros: " + livros + "\n";
	}
	
	public boolean isEqual(String nome, ArrayList<String> livros) {
		return nome.equals(this.nome) && livros.equals(this.livros);
	}
	
	public boolean equals(Object biblioteca) {
		if(biblioteca!=null && this.getClass() == biblioteca.getClass()) {
			Biblioteca x = (Biblioteca)biblioteca;
			// compara as variaveis de instancia dos 2 objetos
			return(this.nome.equals(x.nome) && (this.livros.equals(x.livros)));
		} else {
			return false;
		}
	}
	
	public Object clone() {
		Biblioteca copia = new Biblioteca();
		copia.nome = this.nome;
		copia.livros = (ArrayList<String>)this.livros.clone();
		// em cima, podiamos tb substituir por
		// Biblioteca copia = new Biblioteca(this.nome, this.livros);
		return copia;
	}
	
	public boolean livroBelongs(String livro) {
		return livros.contains(livro);
	}
	
	public ArrayList<String> livrosComPalavra(String word) {
		ArrayList<String> array = new ArrayList<>();
		for(int i = 0; i<livros.size(); i++) {
			if(livros.get(i).contains(word)) {
				array.add(livros.get(i));
			}
		}
		return array;
	}

	public void adicionalivro(String livro){
		livros.add(livro);
	}
}
