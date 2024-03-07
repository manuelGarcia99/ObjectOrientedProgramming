package AT2;

public class ValorErrado extends Exception{
    public ValorErrado(){
        super ();
    }
    public ValorErrado(String erro){
        super (erro);
    }
}
