import  java.util.*;



public class Primeira {
   public static void main(String[] args){
        System.out.println("Este é o 1º programa em Java");
        System.out.println("1ª aula de POO");
        System.out.println();
        System.out.println("Estudo da instrução de escrita");
        boolean tiago = false;
        char greek = 'y';
        byte tiny = 123;
        short small = 1234;
        int normal = 12345;
        long big = 123456;
        float real = 123.45f;
        double huge = 123.456;
        System.out.println(tiago);

        for(int i = 1;i <101 ;i++){
            System.out.println(i);
        }
        int j=100; 
        while(j>0){
            System.out.println(j--);
        }

        int sumatorium=0, iter=1;
        do{
            sumatorium+= (iter++);
        }while(iter !=101);
        System.out.println(sumatorium);

        double mult = 1;

        for(int i = 1 ; i <=100; i++){
         mult *= i;
        }
        System.out.println(mult);
}
}