package Ficha2_2;
import java.util.*;


public class Teste {
    public static void main(String[] args) {
        System.out.println("Introduza uma String:");
        String s = Ler.umaString();
        System.out.print("A string que introduziu foi: " + s);
        int pequeno = Ler.umInt(), grande = Ler.umInt();
        int somatorio1=0, somatorio2 =0, somatorio3=0;
        for(int i= pequeno; i<=grande;i++)
        {
            somatorio1 += i;
        }
        System.out.println(somatorio1);
        int iterator=pequeno;
        while(iterator <= grande)
        {
            somatorio2 += iterator++;
        }
        System.out.println(somatorio2);
        iterator =pequeno;
        do{
            somatorio3 += iterator++;
        }while(iterator <= grande);
        System.out.println(somatorio3);

        System.out.print("Diga uma palavra string :");
        String str= Ler.umaString();
        char cr=(char) 256;
        for(int i = 0;i< str.length(); i++){
            if((int)str.charAt(i) < (int) cr){
                cr = str.charAt(i);
            }
        }
        System.out.println(cr);
    }
}