package Ficha8;

public class Derivada extends Base{
    private int a;
    private int c;
    Derivada(Base b, int a , int c){
        super (b.getA(), b.getB());
        this.c = c;
        this.a =a;
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String toString(){
        return ("a = " + a + " c = " + c + " a-super = " + super.getA() + " b= " + super.getB());
    }

    public int soma(){
        return super.soma() +a +c;
    }

    public boolean equals(Object o){
        if(o!= null && this.getClass() == o.getClass()){
            Derivada e = (Derivada) o;
            return (super.equals(e) && this.a == e.a && this.c == e.c );
        }
        else{
            return false;
        }
    }
    public Object clone () {
        Base help = (Base) super.clone();
        Derivada copia = new Derivada(help,this.a,this.c);
        return copia;
    }
}