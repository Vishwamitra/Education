package GTINCalculator;

/**
 * Created by vmishra on 5/3/2018.
 */
public class GenerateGTINNumber {

    public String generateGTINNumber(String input) {
        String gtin;
        String gtinType;
        String checkDigit;

        gtinType = getGS1Type(input.length());
        if (gtinType!="Invalid") {
            checkDigit = getCheckDigit(input);
            gtin =gtinType + " : " + input + checkDigit;

        }else {
            gtin ="Invalid Number Type.";
        }
            return gtin;
    }

    private String getCheckDigit(String input) {
        String checkDigit;
        int multiplyer;
        int sum = 0;
        multiplyer = 3;
        int j=1;

        for( int i= input.length()-1; i>=0; i--, j++) {
            if(j%2==1)
                sum = sum + Integer.valueOf( String.valueOf(input.charAt(i))) * multiplyer;
            else
                sum = sum + Integer.valueOf( String.valueOf(input.charAt(i)));
        }
        if( sum%10==0) {
            sum=0;
        }else {
            sum = (((sum/10)+1)*10 -sum);
        }
        checkDigit= String.valueOf(sum);
        return checkDigit;
    }

    private String getGS1Type(int length){
        switch (length){
            case 7:
                return "GTIN-8";
            case 11:
                return "GTIN-12";
            case 12:
                return "GTIN-13";
            case 13:
                return "GTIN-14";
            default:
                return "Invalid";
        }
    }
}
