package com.learnexcelmacro;

/**
 * Created by Vishwa on 8/6/2016.
 */
public class timeClass {

    private int hour;
    private int minute;
    private int seconds;
    private void setTime (int h, int m, int s){

        hour = ((h>0 || h < 24) ?  h: 0);
        minute = ((m>0 || m < 60) ?  m: 0);
        seconds = ((s>0 || s < 24) ?  s: 0);

    }

    public  void displayMillitoryTime(int h, int m, int s){

        setTime(h,m,s);
        System.out.print(String.format("%02d : %02d : %02d",hour,minute,seconds));
    }


}
