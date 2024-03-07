package Ficha5;

public class Disciplina {
    private  int codigo;
    private String nome;
    private String prof;
    public Disciplina ( ) {
        codigo = 0;
        nome = "";
        prof = "";
    }
    public Disciplina (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.prof = "";
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", prof='" + prof + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public boolean isThere(String busca){
        if(nome.contains(busca)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isItIn(int inicio, int fim){
        return(codigo >= inicio && codigo < fim);
    }
}