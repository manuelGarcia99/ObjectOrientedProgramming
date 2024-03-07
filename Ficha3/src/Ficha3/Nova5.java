package Ficha3;

interface Addable{
    int add(int a,int b);
}
public class Nova5 {
    public static void main(String[] args) {
// Expressão lambda com vários parâmetros
        Addable ad1= (a,b) -> (a+b);
        System.out.println( ad1.add(10,20) );
// Expressão lambda com vários parâmetros e tipos de dados
        Addable ad2=(int a,int b)->(a+b);
        System.out.println( ad2.add(100,200) );
// Expressão lambda sem return.
        Addable ad3=(a,b)->(a+b);
        System.out.println( ad3.add(10,20) );
// Expressão lambda com return
        Addable ad4=(int a,int b)->{
            return (a+b);
        };
        System.out.println( ad4.add(100,200) );
    }
}