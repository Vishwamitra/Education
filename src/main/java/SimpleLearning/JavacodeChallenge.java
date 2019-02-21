package SimpleLearning;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by vmishra on 5/4/2018.
 */
public class JavacodeChallenge {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int minNum = 0;

        Pattern pattern1 = Pattern.compile("(.)*(\\d)(.)*");
        Matcher matcher1 = pattern1.matcher(password);
        if (!(matcher1.matches())) {
            minNum++;
        }

        Pattern pattern2 = Pattern.compile("(.)*[A-Z](.)*");
        Matcher matcher2 = pattern2.matcher(password);
        if (!(matcher2.matches())) {
            minNum++;
        }

        Pattern pattern3 = Pattern.compile("(.)*[a-z](.)*");
        Matcher matcher3 = pattern3.matcher(password);
        if (!(matcher3.matches())) {
            minNum++;
        }

        Pattern pattern4 = Pattern.compile("(.)*[!@#$%^&*()-+](.)*");
        Matcher matcher4 = pattern4.matcher(password);
        if (!(matcher4.matches())) {
            minNum++;
        }


        if (password.length() + minNum < 6) {
            minNum = 6 - password.length();
        }

        return minNum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}


