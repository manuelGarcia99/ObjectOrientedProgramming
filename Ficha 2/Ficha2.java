import javax.swing.*;
import java.util.*;

public class Ficha2 {
    public static void main(String[] args){
        System.out.println("Inteiro ASCII\n_____________");
        for(int i = 1;i<257;i++)
        {
              System.out.println(i +" -> "+ (char) i);  
        }
    

    JOptionPane.showMessageDialog(null , "A minha primeira caixa de diálogo"); 
    JOptionPane.showMessageDialog(null , "Adeus");
    int numeroDeAluno;
    String nomeDoAluno  = JOptionPane.showInputDialog(null, "Introduza um nome:");/*fazer o scanner */
    String s= JOptionPane.showInputDialog(null, "Introduza um inteiro:");
    numeroDeAluno = Integer.parseInt(s);
    JOptionPane.showMessageDialog(null,numeroDeAluno + " : " +nomeDoAluno);
    
    final double PI = 3.14159273269;
    double raio;
    String auxiliar = JOptionPane.showInputDialog(null,"Qual é o rádio do círculo:");
    raio= Double.parseDouble(auxiliar);
    JOptionPane.showMessageDialog(null, "Perímetro :" + (2 * PI * raio) + "\n" + "Área :" + (PI * raio * raio));
    /*3-b o que fazer? */
}
}
