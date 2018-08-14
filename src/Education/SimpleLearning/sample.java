package Education.SimpleLearning;

/**
 * Created by vmishra on 5/23/2018.
 */
public class sample {

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("This is the for each method....\n");
        for (int i : a) {
            System.out.println(i);
        }

    }
}
