package Education.Factorial.Factorial;

import java.math.BigInteger;
import java.util.Scanner;

@SuppressWarnings("WeakerAccess")
class CalculateFactorial {

    private static void calcFactorialUsingForLoop(int inputNumber) {

        BigInteger factVal;
        factVal = BigInteger.ONE;

        for (int i = 1; i <= inputNumber; i++) {
            factVal = factVal.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factVal);
    }

    // MainMethodToTest Function to test the factorial function
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any Integer : \n");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            calcFactorialUsingForLoop(input);
        }
        else {
            System.out.println("Invalid input !! Please Enter an Integer");
        }
    }
}