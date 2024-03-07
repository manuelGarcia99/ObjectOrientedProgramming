package Ficha8;

import java.util.ArrayList;

public class BaseTest {
    public static int QuantosA(Aluno [] licenciados){
        int somador = 0;
        for(Aluno t: licenciados){
            if(t instanceof AlunoLicenciatura){
                somador++;
            }
        }
        return somador;
    }

    public static int QuantosAL(ArrayList<Aluno> licenciados){
        int somador = 0;
        for(Aluno t: licenciados){
            if(t instanceof AlunoLicenciatura){
                somador++;
            }
        }
        return somador;
    }

    public static void main(String[] args) {
        Base base = new Base(4,3);
        Derivada exemplo = new Derivada(base,5,4);
        System.out.println(exemplo.soma());
        Base base2 = new Base(4,4);
        Derivada exemplo2 = new Derivada(base2,5,4);
        System.out.println(exemplo.equals(exemplo2));
        Derivada exemplo3= (Derivada) exemplo2.clone();
        System.out.println(exemplo3);
        Disciplina fisica = new Disciplina(59,"Fisica");
        fisica.setNota(17);
        Disciplina fisica2 = new Disciplina(fisica);
        fisica2.setNota(15);
        System.out.println(fisica);
        System.out.println(fisica2);
        System.out.println(fisica.equals(fisica2));
        Aluno Jorge = new Aluno(46712,"Sampaio");
        Aluno Manuel = new Aluno(-1,"");
        Manuel= (Aluno) Jorge.clone();
        System.out.println(Manuel.equals(Jorge));
        Aluno Joao = new Aluno(47733,"João");
        AlunoLicenciatura Rafael = new AlunoLicenciatura(Joao,"Francês");
        Disciplina matematica = new Disciplina(60,"Matematica");
        matematica.setNota(17);
        AlunoLicenciatura Augusto = new AlunoLicenciatura(Manuel, "Alemão");
        Augusto.addDisciplina(matematica);
        Augusto.addDisciplina(fisica2);
        System.out.println(Augusto.getNotaDisciplina(60) + "\n" + Augusto.getMedia());

        Aluno [] alunosarr = {Jorge , Augusto ,Rafael};
        ArrayList<Aluno> alunosarrl = new ArrayList<>();
        alunosarrl.add(Augusto);
        alunosarrl.add(Jorge);
        alunosarrl.add(Rafael);
        System.out.println(QuantosA(alunosarr) + "\n" + QuantosAL(alunosarrl) );


    }
}