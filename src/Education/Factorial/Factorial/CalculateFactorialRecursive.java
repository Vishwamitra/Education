package Education.Factorial.Factorial;

import java.math.BigInteger;
import java.util.Scanner;

class CalculateFactorialRecursive {

    private static BigInteger calcFactorialUsingRecursiveFunction(int inputNumber) {

        BigInteger factVal;

        if (inputNumber == 1)
            return BigInteger.ONE;
        factVal = (calcFactorialUsingRecursiveFunction(inputNumber-1).multiply(BigInteger.valueOf(inputNumber)));

        return factVal;
    }


    // MainMethodToTest Function to test the factorial function
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any Integer : \n");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
           BigInteger fact = calcFactorialUsingRecursiveFunction(input);
            System.out.println("Factorial is : " + fact);
        }
        else {
            System.out.println("Invalid input !! Please Enter an Integer");
        }
    }
}