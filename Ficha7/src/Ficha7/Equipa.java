package Ficha7;
import java.util.ArrayList;

public class Equipa {
    private ArrayList<Jogador> lista;
    private String nome;

    Equipa(String nome){
        this.nome = nome;
        lista = new ArrayList<>();
    }
    public void adicionaJogador(Jogador jogador){
        lista.add(jogador);
    }
    public void removeJogador(int posicao)
    {
        lista.remove(posicao-1);
    }
    public void numeroJogadores(){
        System.out.println("Número de jogadores da equipa " + nome + " " + lista.size());
    }
    public boolean jogadorPertence(String nome){
        for(Jogador j : lista){
            if(j.getNome() == nome){
                return true;
            }
        }
        return false;
    }
    public String maiorGoleador(){
        String goleador= "";
        int max= -1;
        for(Jogador j : lista){
            if(j.totalDeGolos() > max){
                max = j.totalDeGolos();
                goleador= j.getNome();
            }
        }

        return goleador;
    }


    @Override
    public String toString() {
        return "nome : " + nome + " lista : " + lista;
    }

    public boolean equals(Object o){
        if(o != null && this.getClass()== o.getClass()){
            Equipa e = (Equipa) o;
            return (e.nome.equals(this.nome) && e.lista.equals(this.lista));
        }
        else{
            return false;
        }
    }

}
