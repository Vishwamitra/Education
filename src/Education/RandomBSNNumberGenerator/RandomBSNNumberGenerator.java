package Education.RandomBSNNumberGenerator;

import Education.BSNValidator.validateBSN;

import java.util.Random;

/**
 * Created by Vishwa on 4/25/2018.
 */
public class RandomBSNNumberGenerator {

    public static void main(String args[]) {
        RandomBSNNumberGenerator randomBSNNumberGenerator = new RandomBSNNumberGenerator();
        System.out.println(randomBSNNumberGenerator.newBSN());
    }

    private int newBSN() {
        validateBSN bsnValidator = new validateBSN();
        int input;
        do {
            Random random = new Random();
            input = 100000000 + random.nextInt(900000000);
        } while (bsnValidator.IsValid(input));
        return input;
    }
}
