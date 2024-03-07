package Followers;
import java.util.*;
import java.util.Map.Entry;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        int maxNumber, numberOfPeople;
        maxNumber = Ler.umInt();
        numberOfPeople = Ler.umInt();
        HashMap Hm1= new HashMap<>();
        HashMap Hm3= new HashMap<>();
        for(int i = 0 ; i< numberOfPeople ; i++){
            String nome = Ler.umaString() ;
            Hm1.put(nome, Ler.umInt());//Não pode conter 2 iguais for while for criar uma soma
            Hm3.put(nome, Ler.umInt());
            arr.add(nome);
        }
        int numberOfPossibleGroups=0;
        Map Hm2 =new HashMap<String,Integer>();
        boolean jump=true;
        int skipper=0;

        //System.out.println((int)Hm1.get(arr.get(0)));
        for(int i=0;i<numberOfPeople;i++){
            while(numberOfPossibleGroups < Fact.factorial(numberOfPeople-i -1 ) +1){
                String summer= "";
                int adder=0;
                for(int j =i ; j<numberOfPeople;j++){
                    if(j==i)
                        jump =true;
                    else{
                        if(!jump){
                          j= j+skipper-1;
                          jump = true;
                          continue;
                    }
                    }


                    numberOfPossibleGroups++;
                    if(adder +(int) Hm1.get(arr.get(j)) > maxNumber){
                        skipper= j;
                        jump = false;
                        summer="";
                        adder=0;
                        continue;
                    }
                    summer += " " + arr.get(j);
                    adder += (int) Hm1.get(arr.get(j));
                    Hm2.put(summer,adder);

                }
                skipper=0;
            }
        }

        int max=0;
        System.out.println(Hm2);
        Iterator<Entry<String, Integer>> new_Iterator = Hm2.entrySet().iterator();

        while(new_Iterator.hasNext()){
            Map.Entry<String, Integer> new_Map = (Map.Entry<String, Integer>) new_Iterator.next();
            if(max< new_Map.getValue())
              max = new_Map.getValue();
        }
        while(new_Iterator.hasNext()){
            Map.Entry<String, Integer> new_Map = (Map.Entry<String, Integer>) new_Iterator.next();
            if(max== new_Map.getValue())
                System.out.println(new_Map.getKey());
        }

    }
}