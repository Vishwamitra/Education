package AdvancedJava;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

    private  void printValue()
    {
    String[] words= {"Ram", "Shyam", "Haram", "Pranam"};

    List<String> word = new ArrayList<>();

    word.add(1, "Mango");
        word.add(1, "Banana");
        word.add(1, "Apple");
        word.add(1, "Orange");
        word.add(1, "Coconut");
        word.add(1, "Peers");
        word.add(1, "Grapes");
        word.add(1, "Pineapple");


    for (String e: words)
    {
        if (e.contains("a") == true){
            System.out.println(e.codePointAt(1) + " - " + e.toUpperCase());
        }
    }

  /*  for (String w: words)
    {
        System.out.print(w.indexOf("Pranam") + "\t" +  w.toUpperCase() +"\n");
    }*/
    }

    public void printVal(){

        this.printValue();

    }
}
