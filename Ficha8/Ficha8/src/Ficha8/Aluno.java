package Ficha8;

public class Aluno {
    private int numero;
    private String nome;

    Aluno(int numero , String nome){
        this.numero = numero;
        this.nome =nome;
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

    @Override
    public String toString() {
        return "Aluno{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                '}';
    }

    public boolean equals(Object o){
        if(o != null && o.getClass() == this.getClass()) {
            Aluno e = (Aluno) o;
            return(e.numero == this.numero && e.nome.equals(this.nome));
        }
        else{
            return false;
        }
    }

    public Object clone(){
        Aluno c= new Aluno(this.numero,this.nome);
        return c;
    }
}
