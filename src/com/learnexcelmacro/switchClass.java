package com.learnexcelmacro;
/**
 * Created by Vishwa on 7/17/2016.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class switchClass {

    public static void main(String[] args){

        /*
        We have an age range where a company is giving different discount based on different age group

        age <=20 - 10%
        Age >20 and =<30  - 20%
        Age >30 and =<40  - 30%
        Age >40 and =<60  - 40%
        Age >60  - 50%

        */
        Scanner inputDOB = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        System.out.println("Enter date and time in the format yyyy-MM-dd");
        System.out.println("For example, it is now " + format.format(new Date()));
        Date dob = null;
        while (dob == null) {
            String line = inputDOB.nextLine();
            try {
                dob = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Sorry, that's not valid. Please try again.");
            }
        }

        calcAge calcAge = new calcAge();
        int age = calcAge.ageInYears(dob);

        switch (age) {

            case 20:
            {

            }

            case 30:
            {

            }
        }



    }

}
