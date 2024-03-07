package Ficha_10;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class GerirLivros {

	public static int menu() { // função na classe do main
		int opcao;
		System.out.println("1 - Novo livro");
		System.out.println("2 - Listar livros");
		System.out.println("3 - Apagar livro");
		System.out.println("4 - Consultar livro dado título");
		System.out.println("5 - Alterar título livro");
		System.out.println("6 – Qual o autor com mais livros");
		System.out.println("7 - Sair");
		System.out.println("Qual a sua opção:");
		opcao = Ler.umInt();
		return opcao;
	}

	public static void main(String[] args) {
		int escolha;
		// Lista que vai conter todos os livros;
		ArrayList<Livro> meusLivros = new ArrayList<Livro>();
		// Ler ficheiro
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Users\\manec\\Desktop\\Java\\Ficha_10\\Ficha_10\\Ficha_10\\src\\Ficha_10\\livros.dat"));
			meusLivros = (ArrayList<Livro>) is.readObject();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		do {
			escolha = menu();
			switch (escolha) {
				case 1:
					FuncLivros.inserirLivro(meusLivros);
					break;
				case 2:
					System.out.println(meusLivros);
					break;
				case 3:


					boolean found = false;
					while (!found) {
						System.out.println("Que livro quer apagar?");
						int numero = Ler.umInt();
						for (Livro t : meusLivros) {
							if (numero == t.getId()) {
								found = true;
								meusLivros.remove(t);
							}
						}
						if (found) {
							System.out.println("Livro removido com sucesso!");
							try {
								ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\manec\\Desktop\\Java\\Ficha_10\\Ficha_10\\Ficha_10\\src\\Ficha_10\\livros.dat"));
								// escrever o objeto livros no ficheiro
								os.writeObject(meusLivros);
								os.flush(); // os dados são copiados de memória para o disco
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}
						}
						else {
							System.out.println("Não temos esse livro!");
						}
						break;
					}


					break;
				case 4:
					System.out.println("Que livro quer consultar?");

					boolean foundB = false;
					while (!foundB) {
						String nome = Ler.umaString();
						for (Livro t : meusLivros) {
							if (t.getTitulo().equals(nome)) {
								foundB = true;
								System.out.println(t);
								break;
							}
						}
						if (foundB) {
							break;
						}
						System.out.println("Não temos esse livro!");

					}

					break;
				case 5:
					System.out.println("A que livro quer mudar o título?");

					boolean foundA = false;
					while (!foundA) {
						String nome = Ler.umaString();
						for (Livro t : meusLivros) {
							if (t.getTitulo().equals(nome)) {
								foundA = true;
								String tituloNovo = Ler.umaString();
								t.setTitulo(tituloNovo);
								break;
							}
						}
						System.out.println("Não temos esse livro!");

					}
					if (foundA) {
						break;
					}
					System.out.println("Titulo Alterado com sucesso!");
					break;
				case 6:
					ArrayList<String> titulos = new ArrayList<>();
					HashMap<String, Integer> contas = new HashMap<>();
					for (Livro t : meusLivros) {
						if(contas.containsKey(t.getAutor())){
							Integer count = contas.get(t.getAutor());
							contas.put(t.getAutor(),count+1);
						}
						else{
							contas.put(t.getAutor(),1);
						}
					}
					int max = -1;
					for(Integer s : contas.values()){
						if(max<  s){
							max=  s;

						}
					}
					for(Entry<String,Integer> e : contas.entrySet() ){
						if(e.getValue()==max)
							System.out.println(e.getKey());
					}

					break;

				default : break;
			}
		} while (escolha != 7);
		ArrayList<Aluno> lst = new ArrayList<>();

		boolean mantain = false;
		try {
			ObjectInputStream isAlunos = new ObjectInputStream(new FileInputStream("C:\\Users\\manec\\Desktop\\Java\\Ficha_10\\Ficha_10\\Ficha_10\\src\\Ficha_10\\alunos.dat"));
			int ult = isAlunos.readInt();
			Aluno.setUltimo(ult);

			lst = (ArrayList<Aluno>) isAlunos.readObject();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		do {
			FuncAlunos.menu();
			int choice = Ler.umInt();
			switch (choice) {
				case 1:
					System.out.println("Indique o nome do aluno!");
					String str = Ler.umaString();
					Aluno a = new Aluno(str);
					lst.add(a);
					try {
						ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\manec\\Desktop\\Java\\Ficha_10\\Ficha_10\\Ficha_10\\src\\Ficha_10\\alunos.dat"));
						// escrever o objeto livros no ficheiro
						os.writeInt(Aluno.getUltimo());
						os.writeObject(lst);
						os.flush(); // os dados são copiados de memória para o disco
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

					break;
				case 2:
					System.out.println("Indique o número");
					FuncAlunos.consultNumber(Ler.umInt(), lst);

					break;

				case 3:
					System.out.println("Indique o nome");
					FuncAlunos.consultName(Ler.umaString(), lst);
					break;
				case 4:
					FuncAlunos.consultList(lst);
					break;
				case 5:
					System.out.println("Que aluno quer apagar?");
					FuncAlunos.deleteStudent(lst, Ler.umaString());
					break;
				case 6:
					System.out.println("Qual o nome do aluno que deve corrigir?");
					FuncAlunos.correctName(lst, Ler.umaString());
					break;
				default:
					mantain = true;
					break;
			}
		}while(!mantain);

	}
}
