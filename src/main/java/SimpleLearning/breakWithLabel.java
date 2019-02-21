package SimpleLearning;

/**
 * Created by vmishra on 5/24/2018.
 */
public class breakWithLabel {

    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break.");
                    if (t) break second; // break out of second block
                    System.out.println("third : This won't execute");
                }
                System.out.println("Second : This won't execute");
            }
            System.out.println("First : This is after second block.");
        }
        System.out.println("This is outside first");
    }
}

