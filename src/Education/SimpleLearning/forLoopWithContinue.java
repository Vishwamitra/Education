package Education.SimpleLearning;

/**
 * Created by vmishra on 5/24/2018.
 */
public class forLoopWithContinue {
    // to print all the number except which are divisible by 5 [between 1 - 100]
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("   is removed from this list");
                continue;
            }
            System.out.println(i);
        }
    }
}
