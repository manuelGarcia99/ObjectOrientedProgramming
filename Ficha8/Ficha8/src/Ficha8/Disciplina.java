package Ficha8;

public class Disciplina {
     private int nota , codigo;
     private String designacao;

     Disciplina(int codigo , String designacao){
         this.codigo = codigo;
         this.designacao= designacao;
     }

    public int getNota() {
        return nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", codigo=" + codigo +
                ", designacao='" + designacao + '\'' +
                '}';
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && this.getClass() == obj.getClass()){
            Disciplina e = (Disciplina) obj;
            return (this.nota == e.nota && this.codigo == e.codigo && this.designacao.equals(e.designacao));
        }
        else{ return false;}
    }

    public Object clone(){
         Disciplina c = new Disciplina(this.codigo,this.designacao);
         c.nota = this.nota;
         return c; /*Depois fazer casting*/
    }

    Disciplina(Disciplina original){
         codigo = original.codigo;
         designacao = original.designacao;
         nota = original.nota;
    }

}
