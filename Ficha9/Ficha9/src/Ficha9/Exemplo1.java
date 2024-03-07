package Ficha9;

import java.io.IOException;

public class Exemplo1  {

    public static String leStr () throws IOException{
        int ch;
        String r ="";
        boolean fim = false;
        while (!fim){
            ch = System.in.read();
            if (ch < 0 || (char)ch=='\n')
                fim = true;
            else
                r += (char) ch;
        }
        return r;
    }
}
