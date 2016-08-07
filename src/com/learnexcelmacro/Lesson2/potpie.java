package com.learnexcelmacro.Lesson2;

/**
 * Created by Vishwa on 8/6/2016.
 */
public class potpie {
    public int month;
    public int day;
    public int year;

    //this is a constructor

    public potpie(int m, int d, int y){
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this is %s\n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}