package JavaWork;

import java.io.*;
import java.util.ArrayList;

public class Admin {
    private final static String name = "Admin";
    private final static String password = "0000";


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static void deleteUser(ArrayList<User> users) {
        System.out.println("What is the ID of the User? ");
        int id = Ler.umInt();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(users.get(i));
            } else {
                System.out.println("There is no User with that ID");
            }
        }
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\v1.1\\User.dat"));
            os.writeObject(users);
            os.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void authentication(ArrayList<User> myUsers, ArrayList<Teacher> myTeachers){
        if(guess(3,password)){
            menu(myUsers,myTeachers);
        }
        else {
            System.out.println("\nYou have wasted your guesses!");
        }
    }

    public static boolean guess(int maxGuesses, String password){
        String guess;
        int guessCount = 0;
        boolean outOfGuesses = false;
        /*
         * "guess == password" doesn't work because it only works for numbers.
         * For Strings, you must use "guess.equals(password)"
         */
        while (!outOfGuesses && guessCount < maxGuesses) {
            System.out.print("Enter password: ");
            guess = Ler.umaString();
            guessCount++;
            if (guess.equals(password))
                return true;
        }
        return false;

    }

    public static void menu(ArrayList<User> users, ArrayList<Teacher> teachers) {
        int answer;
        do {
            answer = menuPrompt();
            if(answer == 1) {
                int userAnswer ;
                do {
                    userAnswer = usersPrompt();
                    if(userAnswer == 1) {
                        showInfoAllUsers(users);
                    } else if(userAnswer == 2) {
                        searchUserByID(users);
                    } else if(userAnswer == 3) {
                        searchUserByName(users);
                    } else if(userAnswer==0){
                        break;
                    }

                } while(userAnswer!=0);
            } else if(answer == 2) {
                int teacherAnswer ;
                do {
                    teacherAnswer = teachersPrompt();
                    if(teacherAnswer == 1) {
                        showInfoAllTeachers(teachers);
                    } else if(teacherAnswer == 2) {
                        searchTeacherByID(teachers);
                    } else if(teacherAnswer == 3) {
                        searchTeacherByName(teachers);
                    } else if(teacherAnswer == 0){
                        break;
                    }
                } while(teacherAnswer != 0);
            }
        } while(answer !=0);
    }

    public static int menuPrompt(){
        System.out.println("0- Cancel");
        System.out.println("1- Check users");
        System.out.println("2- Check teachers");
        int answer = Ler.umInt();
        return answer;
    }

    public static int usersPrompt() {
        System.out.println("0- Cancel");
        System.out.println("1- Show information about all the users");
        System.out.println("2- Search User by ID");
        System.out.println("3- Search User by Name");
        int answer = Ler.umInt();
        return answer;
    }

    public static void showInfoAllUsers(ArrayList<User> users) {
        for(User t : users) {
            System.out.println(t);
            System.out.println("-----------------");
        }
    }

    public static void searchUserByID(ArrayList<User> users) {
        System.out.println("Insert the ID of the User you want to search: ");
        int id = Ler.umInt();
        boolean found =false;
        for(int i=0; i<users.size(); i++) {
            if(users.get(i).getId() == id && users.get(i) != null){
                found = true;
                System.out.println(users.get(i));
                System.out.println("-----------------");
            }
        }
        if(!found){
            System.out.println("You inserted an ID that doesn't exist");
        }
    }


    public static void searchUserByName(ArrayList<User> users) {
        System.out.println("What is the name of the User you want to search: ");
        String name = Ler.umaString();
        for(int i=0; i<users.size(); i++) {
            if(users.get(i).getName().equals(name)) {
                System.out.println(users.get(i));
                System.out.println("-----------------");
            }
        }
    }

    public static int teachersPrompt() {
        System.out.println("0- Cancel");
        System.out.println("1- Show information about all the Teachers");
        System.out.println("2- Search Teacher by ID");
        System.out.println("3- Search Teacher by Name");
        int answer = Ler.umInt();
        return answer;
    }

    public static void showInfoAllTeachers(ArrayList<Teacher> teachers) {
        for(int i=0; i<teachers.size(); i++) {
            System.out.println(teachers.get(i));
            System.out.println("-----------------");
        }
    }

    public static void searchTeacherByID(ArrayList<Teacher> teachers) {
        System.out.println("Insert the ID of the Teacher you want to search: ");
        int id = Ler.umInt();
        boolean found =false;
        for(int i=0; i<teachers.size(); i++) {
            if(teachers.get(i).getId() == id && teachers.get(i) != null){
                found = true;
                System.out.println(teachers.get(i));
                System.out.println("-----------------");
            }
        }
        if(!found){
            System.out.println("You inserted an ID that doesn't exist");
        }
    }

    public static void searchTeacherByName(ArrayList<Teacher> teachers) {
        System.out.println("What is the name of the Teacher you want to search: ");
        String name = Ler.umaString();
        for(int i=0; i<teachers.size(); i++) {
            if(teachers.get(i).getName().equals(name)) {
                System.out.println(teachers.get(i));
                System.out.println("-----------------");
            }
        }
    }



}
