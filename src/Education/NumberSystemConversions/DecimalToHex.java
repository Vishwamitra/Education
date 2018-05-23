package Education.NumberSystemConversions;

import java.util.Scanner;

/**
 * Created by vmishra on 5/23/2018.
 */
public class DecimalToHex {

    private static String intToHex(int a){
        String bin ="";
        int rem =0;
        String append="";
        while (a!=0){
            rem = a%16;
             a = a/16;
            switch (rem){
                case 10:
                    append = "A";
                    break;
                case 11:
                    append = "B";
                    break;
                case 12:
                    append = "C";
                    break;
                case 13:
                    append = "D";
                    break;
                case 14:
                    append = "E";
                    break;
                case 15:
                    append = "F";
                    break;
                default :
                    append = String.valueOf(rem);
            }
             bin = append + bin;
        }
        return bin;
    }

    private static String intToBinSimple(int a) {
        return Integer.toBinaryString(a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive integer to convert to Hex: ");
        int input = scanner.nextInt();
        scanner.close();
       System.out.println("Hex of integer " +input + " is = " + intToHex(input));
    }

}
