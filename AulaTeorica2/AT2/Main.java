package AT2;

import java.util.*;


public class Main {
    public static int valida(int v1, int v2) throws ValorErrado{
        System.out.println("Introduza um valor entre " + v1 + " e "+ v2);
        int tentativa = Ler.umInt();
        if(tentativa>= v1 && tentativa <v2)
            return tentativa;

        throw new ValorErrado("Fora do Range");
    }

    public static void main(String[] args){
        int valor1 = Ler.umInt();
        int valor2 = Ler.umInt();
        System.out.println("Indique um valor entre esses 2 ");
        boolean toContinue = false;
        do {
            try {
                int y = valida(valor1, valor2);
                toContinue=false;
            } catch (ValorErrado e) {
                System.out.println(e.getMessage());
                toContinue = true;
            }
        }while(toContinue);
    }
}
