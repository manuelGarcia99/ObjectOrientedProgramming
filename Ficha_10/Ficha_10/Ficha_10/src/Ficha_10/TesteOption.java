package Ficha_10;
import javax.swing.*;

public class TesteOption {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Ora viva");
        try {

            String valor = JOptionPane.showInputDialog(null, "Introduza um double:");
            double d = Double.parseDouble(valor);
            JOptionPane.showMessageDialog(null, " O valor dado foi " + d);
            System.exit(0);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"You either canceled or tried to type" +
                    " in something other than a digit!");
        }
    }
}
