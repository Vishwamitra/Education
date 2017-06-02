

package AdvancedJava;

public class ListInJava {

    private  void printValue()
    {
    String[] words= {"Ram", "Shyam", "Haram", "Pranam"};

    for (String w: words)
    {
        System.out.print(w.indexOf("r"));
    }
    }

    public void printVal(){

        this.printValue();

    }
}
