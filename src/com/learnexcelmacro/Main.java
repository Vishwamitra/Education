package com.learnexcelmacro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FrequencyCalculator obj = new FrequencyCalculator();
        Scanner inputMax = new Scanner(System.in);
        System.out.print("Enter maximum count: \t");
        obj.getFrequency(inputMax.nextInt());
    }


}



