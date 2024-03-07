package Ficha4;



public class Teste {
    public static void main(String[] args) {
        CadeirasCriticas cc1, cc2;
        cc1 = new CadeirasCriticas("Gestão");
        cc2 = new CadeirasCriticas("Engenharia Informática");
        String[] cadeiras = {"Macroeconomia", "Direito Comercial", "Contabilidade Financeira "};
        cc1.setDisciplinas(cadeiras);
        cadeiras[0] = "POO";
        cadeiras[1] = "Multimédia";
        cadeiras[2] = "Base de Dados";
        cc2.setDisciplinas(cadeiras);
        System.out.println(cc1 + "\n" + cc2);
        String[] novasCriticas = {"Microeconomia", "Marketing", "Introdução á Gestão"};
        cc1.setDisciplinas(novasCriticas);
        System.out.println(cc1);
        String test1 = "The competent programmer is fully aware of the limited size of his own skull. He therefore \n" +
                "approaches his task with full humility, and avoids clever tricks like the plague.";
        System.out.println("Tamanho: " + test1.length());
        String[] nospaces = test1.split(" ");
        int somador = 0;
        for (String t : nospaces) {
            somador += t.length();
        }
        System.out.println("Tamanho sem espaços:" + somador);
        System.out.println("Numero de palavras:" + nospaces.length);
        for (int i = 0; i < 123 - 97; i++) {
            int somatorium = 0;
            for (int iter = 0; iter < test1.length(); iter++) {
                if (test1.charAt(iter) == (char) (97 + i)) {
                    somatorium++;
                }
            }
            System.out.println((char) (97 + i) + " : " + somatorium);
        }
        String teste = Ler.umaString();
        int tamanhoDaPalavra=0;
        int summer = 0;
        if (test1.contains(teste)) {
            for (int i = 0; i < nospaces.length; i++) {

                if(teste.equals(nospaces[i])){
                    summer += i;
                    tamanhoDaPalavra=nospaces[i].length();
                    break;
                }
                summer += nospaces[i].length();
            }
            System.out.println("Da posição " + (summer - 1) + " até á posição " + (summer + tamanhoDaPalavra -1));
        }
    }
}