package com.learnexcelmacro.ConstructorOverloading;

/**
 * Created by Vishwa on 8/6/2016.
 */
public class StudentData
{
    private int stuID;
    private String stuName;
    private int stuAge;
    StudentData()
    {
        //Default constructor
        this(10,"Name",22);

    }

    StudentData(int num1)
    {
        //Parameterized constructor - 3 parameters
        this(num1,"Name is not found",0000);
    }

    StudentData(int num1, String str, int num2)
    {
        //single Parameterized constructor
        setStuDetails(num1,str,num2);
    }

    //Getter and setter methods

    public void setStuDetails(int stuID, String stuName, int stuAge) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public void getStuDetails() {

        System.out.printf("Student details are as follows: %s",this ); // passing an object as a string to print

        //System.out.println("Student ID is : " + this.stuID);
        //System.out.println("Student Name is : " + this.stuName);
        //System.out.println("Student Age is : " + this.stuAge);
    }

    public String toString(){ //Java looks for this toString method in the class to print the object in string format

        return String.format("\n Student ID is : %d\n Student ID is : %s\n Student ID is : %d\n\n " , this.stuID, this.stuName, this.stuAge);
    }

}