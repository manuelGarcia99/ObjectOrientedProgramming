package AulaTeorica;

import java.util.ArrayList;

public class Exemplo {
    private int dim;
    private String[] listaEstatica;
    private ArrayList<String> listaDinamica;

    public Exemplo (int d){
        dim=d;
        listaEstatica= new String [dim];
        listaDinamica= new ArrayList<String>();
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public ArrayList<String> getListaDinamica() {
        return listaDinamica;
    }

    public void setListaDinamica(ArrayList<String> listaDinamica) {
        this.listaDinamica = listaDinamica;
    }

    public String[] getListaEstatica() {
        return listaEstatica;
    }

    public void setListaEstatica(String[] listaEstatica) {
        this.listaEstatica = listaEstatica;
    }

    public boolean equals(Exemplo obj){
        if(obj != null && obj.getClass() == this.getClass()){
            Exemplo e = (Exemplo) obj;
            boolean iguais = e.dim == this.dim && e.listaDinamica.equals(this.listaDinamica);
            for(int i = 0 ; i<listaEstatica.length ; i++){
                iguais = iguais && e.listaEstatica[i].equals(this.listaEstatica[i]);
            }
            return iguais;
        }


        return false;
    }
    @SuppressWarnings("uncheked")
    public Object clone(){
        Exemplo copia = new Exemplo(dim);
        copia.setListaDinamica((ArrayList<String>)listaDinamica.clone());
        for(int iter=0;i<listaEstatica.length;i++)
        {
            copia.listaEstatica[i]=listaEstatica[i];
        }
        return copia;
    }

}
