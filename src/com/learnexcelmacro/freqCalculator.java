package com.learnexcelmacro;

import java.util.Random;

/**
 * Created by Vishwa on 8/2/2016.
 */
public class freqCalculator {


    public void getFrequency( int max ){
        int freq[] = new int[6];
        Random rand = new Random();

        System.out.println("Random Number between 1 to 5 \tFrequency within 500 times");

        for (int counter = 1; counter<=max;counter++)
            ++freq[1+rand.nextInt(5)];

        System.out.println("Here are the results....");
        for (int j=1; j<freq.length;j++)
            System.out.print(j + "\t\t\t\t\t\t\t\t\t\t" + freq[j] +"\n");


    }


}
