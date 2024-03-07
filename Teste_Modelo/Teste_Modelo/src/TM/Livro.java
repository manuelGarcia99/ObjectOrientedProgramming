package TM;

public class Livro {
    public String nome;
    public String[] autores;
    public double preco;
    Livro(String arg){
        autores = new String[3];
        nome = arg;
    }
    public String GetN(){
        return nome;
    }
    public void SetN(String arg){
        nome = arg;
    }
    public String[] GetA(){
        return autores;
    }
    public void SetA(String[] arg){
        for(int i = 0 ; i < autores.length;i++)
        {
            autores[i] = arg[i];
        }
    }
    public double GetP(){
        return preco;
    }

    public void SetP(double arg){
        preco = arg;
    }
}
