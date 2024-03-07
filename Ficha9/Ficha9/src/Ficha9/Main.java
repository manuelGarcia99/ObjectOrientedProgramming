package Ficha9;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int index;
        String palavra = " ";
        String[] tabPal = new String[10];
        System.out.print("Introduza uma palavra: ");
        palavra=Exemplo1.leStr();

        while (!palavra.equals("fim") ) {

            System.out.print("Introduza um índice (int): ");
            index = Integer.valueOf(Exemplo1.leStr().trim()).intValue();
            tabPal[index]=palavra;
            System.out.print("Introduza uma palavra");
            System.out.println ("(para terminar escreva fim): ");
            palavra=Exemplo1.leStr();
    }
        return;
}
}