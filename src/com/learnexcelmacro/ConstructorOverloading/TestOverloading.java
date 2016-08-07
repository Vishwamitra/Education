package com.learnexcelmacro.ConstructorOverloading;

/**
 * Created by Vishwa on 8/6/2016.
 */
class TestOverloading
{
    public static void main(String args[])
    {
        //This object creation would call the default constructor
        StudentData myobj = new StudentData();
        myobj.getStuDetails();

       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
        StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
        myobj2.getStuDetails();

        /*This object creation would call the parameterized
        * constructor StudentData(int)*/

        StudentData myobj3 = new StudentData(555);
        myobj3.getStuDetails();

    }
}