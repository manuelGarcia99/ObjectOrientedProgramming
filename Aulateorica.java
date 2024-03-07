/*import java.util.*;

public class Exemplo{
    private int n;
    private String s ;
    private double d;
    public Exemplo(){
        n=0;
        s="";
        d=0.0;
    }
    public int getN(){
        return n;
    }
    public void setN(int num){
        n= num;
    }
    public String getS(){
        return s;
    }
    public void setS(String str){
        s= str;
    }
    public double getD(){
        return d;
    }
    public void setD(double dbl){
        d = dbl;
    }
    public boolean equals (Exemplo obj){
        if(obj!= null && this.getClass() == obj.getClass())
        {
            Exemplo viande = (Exemplo) obj;
            return (this.getN()== viande.getN() && this.getS() == viande.getS() && this.getD() == viande.getD());
        }
    }

    public Exemplo clone(){
        Exemplo copia = new Exemplo();
        copia.setN(this.n);
        copia.setS(this.s);
        copia.setD(this.d);

        return copia;
    }
}
*/