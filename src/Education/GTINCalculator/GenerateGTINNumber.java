package Education.GTINCalculator;

/**
 * Created by vmishra on 5/3/2018.
 */
public class GenerateGTINNumber {

    public String generateGTINNumber(int input) {
        String gtin;
        String checkDigit;

        checkDigit = getCheckDigit(input);
        gtin = input + checkDigit;
        return gtin;
    }

    private String getCheckDigit(int input) {
        String checkDigit;
        int singleDigit;
        int multiplyer;
        int sum = 0;
        multiplyer = 3;
        checkDigit = "";
        while (input > 0) {
            singleDigit = input % 10;
            input = input / 10;
            sum = sum + singleDigit * multiplyer;
            //multiplyer =
        }

        return checkDigit;

    }

}
