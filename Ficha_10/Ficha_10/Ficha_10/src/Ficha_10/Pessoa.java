package Ficha_10;

public class Pessoa {
    private String nome;
    private char sexo;
    private String nacionalidade;
    Pessoa(String nome, char sexo, String nacionalidade){
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;

    }
    Pessoa(Pessoa p){
        this.nome= p.nome;
        this.sexo= p.sexo;
        this.nacionalidade= p.nacionalidade;
    }
    Pessoa(){
        this.nome = "";
        this.sexo = 0;
        this.nacionalidade = "";
    }

    public char getSexo() {
        return sexo;
    }

    public String getNome(){
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString(){
        return "Nome: " + nome +"\nSexo: " + sexo + "\nNacionalidade: " + nacionalidade;
    }

    public Pessoa clone(){
        Pessoa nova = new Pessoa(this.nome,this.sexo,this.nacionalidade);
        return nova;
    }

    public boolean equals(Object o){
        if(o.getClass() == this.getClass() && o!=null){
            Pessoa e = (Pessoa) o;
            return(e.nome.equals(this.nome) && e.sexo== this.sexo && e.nacionalidade.equals(nacionalidade));
        }
        else{
            return false;
        }
    }
}
