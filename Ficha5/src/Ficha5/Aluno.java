package Ficha5;

import java.util.Arrays;

public class Aluno {
    private static int ultimo = 0;
    private int numero;
    private String nome;
    private Disciplina [] lista;


    Aluno(String nome ){
        ultimo++;
        numero= ultimo;
        this.nome = nome;
        lista=new Disciplina[3];

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina [] getLista(){
        return lista;
    }

    public void setLista(Disciplina [] lista){
        this.lista= lista.clone();
        lista=new Disciplina[]{null,null,null};
    }

    public void adicionarDisciplina(Disciplina d, int p){
        lista[p] =d;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", lista=" + Arrays.toString(lista) +
                '}';
    }

    public boolean itExists(Disciplina d){
        for(Disciplina s : lista){
            if(d.getCodigo() == s.getCodigo()){return true;}
    }
        return false;
    }
}
