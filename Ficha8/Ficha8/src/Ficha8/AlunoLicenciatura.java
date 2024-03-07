package Ficha8;
import java.util.ArrayList;

public class AlunoLicenciatura extends Aluno {
    private String curso;
    private ArrayList<Disciplina> disciplinas ;

    AlunoLicenciatura(Aluno a , String curso){
        super (a.getNumero(), a.getNome() );
        this.curso = curso;
        disciplinas = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas){
        this.disciplinas = (ArrayList<Disciplina>) disciplinas.clone();
    }

    @Override
    public String toString() {
        return "AlunoLicenciatura{" +
                "curso='" + curso + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    public boolean equals(Object o){
        if(o != null && o.getClass() == this.getClass()){
            AlunoLicenciatura e = (AlunoLicenciatura) o;
            return (super.equals(e) && this.curso == e.curso && this.disciplinas.equals(e.disciplinas));
        }
        else{
            return false;
        }
    }

    public Object clone(){
        Aluno help = (Aluno) super.clone();
        AlunoLicenciatura c = new AlunoLicenciatura(help,this.curso );
        c.disciplinas = (ArrayList<Disciplina>) this.disciplinas.clone();
        return c;
    }

    public void addDisciplina(Disciplina disc){
        if(!(disciplinas.contains(disc))) {
            disciplinas.add(disc);
        }
    }

    public int getNotaDisciplina(int codigo){
        for(Disciplina t : disciplinas){
            if(t.getCodigo() == codigo ){
                return t.getNota();
            }
        }
        return 0;
    }
    public double getMedia(){
        double somador= 0.0;
        for(Disciplina t : disciplinas){
            somador+= t.getNota();
        }
        return somador/ disciplinas.size();

    }
}
