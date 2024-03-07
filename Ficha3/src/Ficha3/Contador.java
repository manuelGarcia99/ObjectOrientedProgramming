package Ficha3;
import java.util.*;
import java.io.*;

public class Contador {
    public int contador;

    Contador(){
        contador=0;
    }

    Contador(int valor){
        contador= valor;
    }

    public void increment(){
        contador++;
    }

    public void userInc(int valor){
        contador += valor;
    }

    public void decrement(){
        contador--;
    }

    public void userDec(int valor){
        contador -= valor;
    }

    public int getC(){
        return contador;
    }

    public void setC(int valor){
        contador = valor;
    }

    public String toString() {
        return "\ncontador: " + contador;
    }
}
