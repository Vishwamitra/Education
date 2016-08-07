package com.learnexcelmacro.SwitchStatement;
/**
 * Created by Vishwa on 7/17/2016.
 */
import com.learnexcelmacro.timeTutorial.calcAge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class switchClass {


    public static void main (String[] args){

        example();

    }

    public static  void example(){

        /*
        We have an age range where a company is giving different discount based on different age group

        age <=20 - 10%
        Age >20 and =<30  - 20%
        Age >30 and =<40  - 30%
        Age >40 and =<60  - 40%
        Age >60  - 50%

        */
        Scanner inputDOB = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
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

            //this means for any integer between 14 till 20, all will print
            //"You are too young to drink"
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            {
                System.out.print("You are too young to drink\n");
                System.out.println("You'r Date of Birth is : " + dob);
                System.out.print("You'r Age (today) is : " + age + " years");
                break;
            }

            case 29:
            {
                System.out.print("Show your ID proof and take this\n");
                System.out.println("You'r Date of Birth is : " + dob);
                System.out.print("You'r Age (today) is : " + age + " years");
                break;
            }

            default:
                System.out.print("Age is undefined\n");
                System.out.println("You'r Date of Birth is : " + dob);
                System.out.print("You'r Age (today) is : " + age + " years");

        }



    }

}
