package com.learnexcelmacro.timeTutorial;

/**
 * Created by Vishwa on 7/13/2016.
 */


class age
{
    private int days;
    private int months;
    private int years;

    private age()
    {
        //Prevent default constructor
    }

    public age(int days, int months, int years)
    {
        this.days = days;
        this.months = months;
        this.years = years;
    }

    public int getDays()
    {
        return this.days;
    }

    public int getMonths()
    {
        return this.months;
    }

    public int getYears()
    {
        return this.years;
    }

    @Override
    public String toString()
    {
        return years + " Years, " + months + " Months, " + days + " Days";
    }
}

