package Ficha5;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Manuel Silva");
        Disciplina d1 = new Disciplina(1000,"POO");
        d1.setProf("Paula Prate");
        Disciplina d2 = new Disciplina(2000, "IA");
        d2.setProf("Luís Alexandre");
        Disciplina d3 = new Disciplina(3000,"Multimédia");
        d3.setProf("Manuela Pereira");
        Disciplina d4 = new Disciplina(4000, "Probabilidade");
        d4.setProf("José Duque");
        a1.adicionarDisciplina(d1,0);
        a1.adicionarDisciplina(d2,1);
        a1.adicionarDisciplina(d3,2);
        Aluno a2 = new Aluno("Maria Espinho");
        a2.adicionarDisciplina(d1,0);
        a2.adicionarDisciplina(d4,1);
        System.out.println(a1);
        System.out.println(a2);
    }
}