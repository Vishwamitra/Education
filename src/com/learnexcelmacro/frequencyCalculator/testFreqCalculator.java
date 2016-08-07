package com.learnexcelmacro.frequencyCalculator;

/**
 * Created by Vishwa on 8/6/2016.
 */
public class testFreqCalculator {

    public static void main (String[] args){

        freqCalculator obj = new freqCalculator();

        int y[]= obj.getFrequency(500);

        for (int i=1; i <y.length; i++){
            System.out.printf("%d \t\t\t\t\t\t\t\t\t\t %d \n",i, y[i]);
        }

        //Call type 2 method

        freqCalcType2 objNew = new freqCalcType2();

        objNew.getFreq(500);

    }
}
