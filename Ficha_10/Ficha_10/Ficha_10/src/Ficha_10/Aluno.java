package Ficha_10;

import java.io.*;

public class Aluno implements Serializable {
// Para poder ser escrita num ficheiro a classe tem que implementar a interface Serializable
	private static int ultimo = 0;
	private int numero;
	private String nome;

	public Aluno(String n) {
		ultimo++;
		numero = ultimo;
		nome = n;
	}

	public static int getUltimo() {
		return ultimo;
	}

	public static void setUltimo(int ultimo) {
		Aluno.ultimo = ultimo;
	}

	public void setNome(String n) {
		nome = n;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public String toString() {
		return "Aluno nº: " + numero + "\t Nome: " + nome;
	}

	public void menu(){
		System.out.println("1 - Criar aluno\n" +
				"2 – Consultar aluno, dado o seu número\n" +
				"3 – Consultar aluno, dado o seu nome\n" +
				"4 – Listar todos os alunos\n" +
				"5 – Apagar um aluno\n" +
				"6 – Corrigir o nome de um aluno\n" +
				"7 – Terminar");
	}
}
