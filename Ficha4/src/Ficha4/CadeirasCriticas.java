package Ficha4;

import java.util.Arrays;

public class CadeirasCriticas {
    private String nome ;
    private String [] disciplinas ;

    CadeirasCriticas(String nome){
        disciplinas = new String[3];
        this.nome =nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getDisciplinas(){
        return disciplinas;
    }

    public void setDisciplinas(String [] disciplinas){
        this.disciplinas= disciplinas.clone();
    }

    @Override
    public String toString() {
        return "CadeirasCriticas{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                '}';
    }

}
