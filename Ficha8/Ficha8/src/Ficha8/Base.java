package Ficha8;


public class Base {
    private int a;

    private int b;
    public Base(int a, int b) {
        this.a=a; this.b=b;
    }
    public int soma(){
        return a+b;
    }
    public int soma(int x){
        return a+b+x;
    }
    public int getA(){return a;}
    public int getB(){return b;}
    public void setA(int a){this.a=a;}
    public void setB(int b){this.b=b;}
    public String toString() {return ("a= " + a + " b= " + b); }
    public boolean equals (Object o ){
        if(o != null && o.getClass() == this.getClass()){
            Base e = (Base) o;
            return (e.a == this.a && e.b == this.b);
        }
        else{return false;}
    }
    public Object clone () {
        Base base = new Base(this.a,this.b);
        return base;
    }

}

