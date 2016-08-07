package com.learnexcelmacro.timeTutorial;

/**
 * Created by Vishwa on 8/6/2016.
 */
public class timeClass {

    private static int hour;
    private static int minute;
    private  static int seconds;
    private static void setTime (int h, int m, int s, boolean isNormal){

        if (isNormal==false) {
            hour = ((h > 0 && h < 24) ? h : 0);
            minute = ((m > 0 && m < 60) ? m : 0);
            seconds = ((s > 0 && s < 60) ? s : 0);
        }
        else {

            hour = ((h > 0 && h < 24) ? h%12 : 0);
            minute = ((m > 0 && m < 60) ? m : 0);
            seconds = ((s > 0 && s < 60) ? s : 0);
        }

    }

    public static void displayMilitaryTime(int h, int m, int s){

        setTime(h,m,s,false);
        System.out.println(String.format("%02d : %02d : %02d",hour,minute,seconds));
    }

    public static void displayNormalTime(int h, int m, int s){

        setTime(h,m,s, true);
        System.out.print(String.format("%02d : %02d : %02d %s",hour,minute,seconds, ((h/12==0) ? "AM" : "PM")));
    }

    public static void main (String[] args){

        displayMilitaryTime(10,10,60);
        displayNormalTime(9,10,60);
    }


}
