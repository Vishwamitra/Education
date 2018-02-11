package AdvancedJava;

/**
 * Created by Vishwa on 3/20/2017.
 */
public class FactorialUsingRecursive {


    public static void main(String[] args) {

        System.out.print("Enter the number to calculate the Factorial");
        System.out.print(fact(5));
    }

    public static Long fact(int n) {

        for (int i = n; i >= 1; i--) {
            if (i <= 1) {
                return Long.valueOf(1);
            } else {

                return (fact(i) * fact(i - 1));
            }
        }

        return null;
    }
}


