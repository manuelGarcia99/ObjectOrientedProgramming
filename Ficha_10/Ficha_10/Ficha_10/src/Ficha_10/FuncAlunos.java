package Ficha_10;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class FuncAlunos {
    public static void consultNumber(int num, ArrayList<Aluno> lst) {
        for (Aluno t : lst) {
            if (t.getNumero() == num) {
                System.out.println(t);
            }
        }
    }

    public static void consultName(String name, ArrayList<Aluno> lst) {
        for (Aluno t : lst) {
            if (t.getNome().equals(name)) {
                System.out.println(t);
            }
        }
    }

    public static void consultList(ArrayList<Aluno> lst) {
        System.out.println(lst);
    }

    public static void deleteStudent(ArrayList<Aluno> lst, String name) {
        boolean found = false;
        for(Aluno t : lst)
        {
            if(t.getNome().equals(name))
            {
                lst.remove(t);
                try {
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\manec\\Desktop\\Java\\Ficha_10\\Ficha_10\\Ficha_10\\src\\Ficha_10\\alunos.dat"));
                    // escrever o objeto livros no ficheiro
                    os.writeInt(Aluno.getUltimo());
                    os.writeObject(lst);
                    os.flush(); // os dados são copiados de memória para o disco
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                found =true;
            }
        }

        if (!found) {
            System.out.println("Esse nome não existe enganou-se? Prima y se se enganou prima qualquer outro botão se não se enganou!");
            char ask = Ler.umChar();
            if(ask == 'y'){
                System.out.println("Indique o nome ");
                name= Ler.umaString();
                deleteStudent(lst,name);
            }
        }
    }

    public static void correctName(ArrayList<Aluno> lst, String name){
        boolean found = false;
        for(Aluno t : lst)
        {
            if(t.getNome().equals(name))
            {
                System.out.println("Indique o nome:");
                t.setNome(Ler.umaString());
                found =true;
                try {
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\manec\\Desktop\\Java\\Ficha_10\\Ficha_10\\Ficha_10\\src\\Ficha_10\\alunos.dat"));
                    // escrever o objeto livros no ficheiro
                    os.writeInt(Aluno.getUltimo());
                    os.writeObject(lst);
                    os.flush(); // os dados são copiados de memória para o disco
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        if (!found) {
            System.out.println("Esse nome não existe enganou-se? Prima y se se enganou prima qualquer outro botão se não se enganou!");
            char ask = Ler.umChar();
            if(ask == 'y'){
                System.out.println("Indjique o nome ");
                name= Ler.umaString();
                correctName(lst,name);
            }
        }

    }
    public static void menu(){
        System.out.println("1 - Criar aluno\n" +
                "2 – Consultar aluno, dado o seu número\n" +
                "3 – Consultar aluno, dado o seu nome\n" +
                "4 – Listar todos os alunos\n" +
                "5 – Apagar um aluno\n" +
                "6 – Corrigir o nome de um aluno\n" +
                "7 – Terminar");
    }
}