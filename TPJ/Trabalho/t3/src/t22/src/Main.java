import java.io.*;

import java.util.ArrayList;

package t22;
public class Main{

    public static int menu() {
        int option;
        System.out.println("1- Enter new User");
        System.out.println("2- Delete User");
        System.out.println("3- Show all People");
        System.out.println("5- Leave");
        System.out.println("Choose an option");
        option = Ler.umInt();
        return option;
    }

    public static void main(String[] args) {
        int option;
        ArrayList<User> myUsers = new ArrayList<User>();
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "C:\\People\\Lenovo\\Documents\\2Ano\\Semestre1\\Programacao Orientada a Objetos\\Trabalho\\trabalhoBeta\\Users.dat"));
            myUsers = (ArrayList<User>) is.readObject();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        do {
            option = menu();
            switch (option) {
                case 1:
                    FuncUser.insertUser(myUsers);
                    break;
                case 2:
                FuncUser.deleteUser(myUsers);
                    break;
                case 3:
                System.out.println(myUsers);
                    break;
                case 4:
                    break;
            }
        } while (option != 5);
    }

    // Login (User(People or Teacher) or Administrator)
    // Sign in (only User(People or Teacher))

    // Users can change their passwords
    // Teacher can see everything in it's Users data, except passwords
    // Administrator can see everything (User(People or Teacher) data)

    // In Sign in, Users choose their name, telefone, ... and create password
    // Be able to change passwords

    // User(People and Teachers) can change their own passwords and see their data
    // Teachers see Students of their classes data (except passwords)

    // Administrators can see everyones data (not including passwords) and create
    // classes and give Teacher priviledges to a User

    // Users can be 'People' or Teachers


    // (1.0) 1- Login
    // (2.0) 2- Sign in

    // If you choose 1:
    // (1.1) 1- Adminitrator (default name and password until you change it)
    //                       (Pretending there are already Administrator id=1
    //                        and Adminstrator id=2, ...
    //                       (By default, your id is "3" and your
    //                        default password is "0000", please change it)
    // (1.2) 2- User

    // (1.1.1) Insert your ID:
    // (1.1.1.1) Insert password:
    // (1.1.1.1.1) 1- See Users (People and Teachers)
    //             2- Make a User become a Teacher
    //             3- See Teachers
    //             4- Create classes

    // (1.2.1) Insert your ID:
    // (1.2.1.1) Insert password:


    // Users[1, 2, 3(Teacher), 4, 5(Teacher)]
    // Teacher[3(Teacher), 5(Teacher)]
}
