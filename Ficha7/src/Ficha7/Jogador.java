package Ficha7;

import java.util.Arrays;

public class Jogador {
    private int numero;

    private static int ultimo=0;
    private String nome;
    private double salario;
    private int [] golos;

    Jogador(String nome){
        ultimo++;
        numero = ultimo;
        this.nome = nome;
        golos = new int[34];
    }

    Jogador(String nome,double salario){
        ultimo++;
        numero = ultimo;
        this.nome = nome;
        golos = new int[34];
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int[] getGolos() {
        return golos;
    }

    public void setGolos(int[] golos) {
        this.golos = golos;
    }
    public void aumento(double percentagem){
        if(percentagem>= 0 && percentagem<=100){
            salario = (salario * (100+ percentagem) )/100;
        }
        else{
            System.out.println("O aumento tem que ser entre 0 e 100");
        }
    }
    public void modificaGolos(int posicao, int golos){
        this.golos[posicao]= golos;
    }
    public int getGolosJornada(int posicao){
        return golos[posicao];
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", golos=" + Arrays.toString(golos) +
                '}';
    }

    public int totalDeGolos(){
        return Arrays.stream(golos).sum();
    }

    public boolean equals( Object o){
        if(o != null && o.getClass() == this.getClass()){
            Jogador e = (Jogador) o;
            return (e.numero == this.numero && e.nome.equals(this.nome) && e.salario == this.salario && e.golos.equals(this.golos) );
        }
        else{
        return false;
        }
    }
   /// public Object clone(){
        /*...*/
    ///}


}
