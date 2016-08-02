package com.learnexcelmacro;

/**
 * Created by Vishwa on 8/2/2016.
 */
public class DateOfBirthValidator {


    static boolean eighteenAboveOrNot(String input)
    {
        try
        {
            // if  Date.valueOf(input)
            return true;
        }
        catch(NumberFormatException ex)
        {
            return false;
        }

    }

}
