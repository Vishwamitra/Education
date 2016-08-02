package com.learnexcelmacro;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Vishwa on 02/08/16.
 */
public class mainClass {

    public static void main (String[] args){

        mathsLibrary obj = new mathsLibrary();
        Scanner inputNumbers = new Scanner(System.in);
        Double a, b;

        System.out.print("Enter First Number: ");
        a= inputNumbers.nextDouble();

        System.out.print("Enter Second Number: ");
        b= inputNumbers.nextDouble();


        System.out.print("Total of two numbers is: " + obj.add(a,b) + "\n thank you");

    }
}
