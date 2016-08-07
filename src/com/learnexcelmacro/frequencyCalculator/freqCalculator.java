package com.learnexcelmacro.frequencyCalculator;

import java.util.Random;

/**
 * Created by Vishwa on 8/6/2016.
 */
public class freqCalculator {

    int  freq[]=new int[6];

    public int getFrequency(int maxCount)[]{

        System.out.println("Here are the results from type 1....\n");
        System.out.println("Random Number between 1 to 5 \tFrequency within 500 times");

      Random myRandNum = new Random(5);
        for (int i=1; i<maxCount;i++){
             ++freq[myRandNum.nextInt(5)+1];
             }
        return freq;
    }

}
