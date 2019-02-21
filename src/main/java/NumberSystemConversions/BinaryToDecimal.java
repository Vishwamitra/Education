package NumberSystemConversions;

import java.util.Scanner;

/**
 * Created by vmishra on 5/23/2018.
 */
public class BinaryToDecimal {

    private static int binToDec(String bin) {
        double dec = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                dec = dec + Math.pow(2, bin.length() - i - 1);
            }
        }
        return (int) dec;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        String input = scanner.next("[0-1]*");
        scanner.close();
        System.out.println("Decimal of Binary " + input + " is = " + binToDec(input));
    }

}
