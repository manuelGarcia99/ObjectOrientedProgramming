package Ficha_10;

public class Autor {
    private int anoDeNascimento;
    private int anoDeFalecimento;
    private String nacionalidade;
    private String premio;

    Autor(){
        this.anoDeFalecimento=0;
        this.anoDeNascimento=0;
        this.nacionalidade="";
        this.premio = "";
    }

    Autor(int anoDeNascimento , String nacionalidade){
        this.anoDeNascimento = anoDeNascimento;
        this.nacionalidade= nacionalidade;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getAnoDeFalecimento() {
        return anoDeFalecimento;
    }

    public void setAnoDeFalecimento(int anoDeFalecimento) {
        this.anoDeFalecimento = anoDeFalecimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String toString(){
        return "Ano de Nascimento: " + anoDeNascimento +
                ((anoDeFalecimento == 0) ? "" : "\nAno de falecimento: " + anoDeFalecimento) +
                "\nNacionalidade: " + nacionalidade +
                ((premio.equals("") ?  "" : "\nPremio ganho: " + premio));
    }

    public Autor clone(){
        Autor copia = new Autor(anoDeNascimento,nacionalidade);
        copia.setAnoDeFalecimento(anoDeFalecimento);
        copia.setPremio(premio);

        return copia;
    }

    public boolean equals(Object o){
        if(o!= null && o.getClass()== this.getClass()){
            Autor e = (Autor) o;
            return(e.premio.equals(this.premio) && e.nacionalidade.equals(this.nacionalidade) && e.anoDeFalecimento == this.anoDeFalecimento && e.anoDeNascimento == anoDeNascimento);
        }
        else{
            return false;
        }
    }
}
