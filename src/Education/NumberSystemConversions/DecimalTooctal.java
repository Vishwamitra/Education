package Education.NumberSystemConversions;

import java.util.Scanner;

/**
 * Created by vmishra on 5/23/2018.
 */
public class DecimalTooctal {

    private static String intToOct(int a){
        String bin ="";
        int rem =0;
        while (a!=0){
            rem = a%8;
            a = a/8;
            bin = String.valueOf(rem) + bin;
        }
        return bin;
    }

    private static String intToBinSimple(int a) {
        return Integer.toBinaryString(a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive integer to convert to Octal: ");
        int input = scanner.nextInt();
        scanner.close();
       System.out.println("Octa of integer " +input + " is = " + intToOct(input));
    }

}
