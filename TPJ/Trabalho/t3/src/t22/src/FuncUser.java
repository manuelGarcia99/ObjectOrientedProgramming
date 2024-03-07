import java.io.*;
import java.util.ArrayList;

public class FuncUser {

    public static void insertUser(ArrayList<User> People) {
        System.out.println("What is the name of the User? ");
        String name = Ler.umaString();
        User l = new User(name);
        People.add(l);
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\People\\Lenovo\\Documents\\2Ano\\Semestre1\\Programacao Orientada a Objetos\\Trabalho\\trabalhoBeta\\People.dat"));
            os.writeObject(People);
            os.flush();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteUser(ArrayList<User> People) {
        System.out.println("What is the ID of the User? ");
        int id = Ler.umInt();
        for(int i=0; i<People.size(); i++) {
            if(People.get(i).getId() == id) {
                People.remove(People.get(i));
            } else {
                System.out.println("There is no User with that ID");
            }
        }
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\People\\Lenovo\\Documents\\2Ano\\Semestre1\\Programacao Orientada a Objetos\\JavaAulas\\Aulas\\aula10\\Livros.dat"));
            os.writeObject(People);
            os.flush();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
