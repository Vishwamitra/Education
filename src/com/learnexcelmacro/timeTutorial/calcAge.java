package com.learnexcelmacro.timeTutorial;
import java.util.Date;
import java.util.Calendar;

/**
 * Created by Vishwa on 7/17/2016.
 */
public class calcAge {

    public int ageInYears(Date dob){

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.setTime(dob);
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        int age;
        age=currentDate.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        return age;
    }



}
