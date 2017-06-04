package com.learnexcelmacro.SwitchStatement;
/**
 * Created by Vishwa on 7/17/2016.
 */

import com.learnexcelmacro.timeTutorial.calcAge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class switchWithString {


    public static void main(String[] args) {

        example();

    }

    public static void example() {

        Scanner inputString = new Scanner(System.in);
        String myInput = inputString.next();

        switch (myInput) {

            case "Shagun":
                System.out.print("You have just entered Shagun as an Input String");
                break;

            case "Shaggy":
                System.out.print("You just entered Shaggy as an Inout Sting");
                break;

            default:
                System.out.print("This is the default input");
        }
    }
}