package BSNValidator;

/**
 * Created by Vishwa on 4/24/2018.
 */
public class validateBSN {

    private boolean IsValidBSN(int bsn) {

        int inputNum = bsn;
        if (inputNum > 999999999 || inputNum < 100000000) return false;
        int totalSum;

        // Weighted multiplication factor for
        // the last digit is (-1)
        totalSum = (-1) * inputNum % 10;

        // Follow standard 11-check algorithm till the
        // second last digit of the 9 digit number
        for (int i = 2; inputNum > 0; i++)
            totalSum += (inputNum /= 10) % 10 * i;

        // 11-Check true if divisible by 11
        return totalSum % 11 == 0;
    }

    // Overrride with following two different types of input
    // String and Integer

    public boolean IsValid(String input) {
        return IsValidBSN(Integer.valueOf(input));
    }

    public boolean IsValid(int input) {
        return IsValidBSN(input);
    }

}
