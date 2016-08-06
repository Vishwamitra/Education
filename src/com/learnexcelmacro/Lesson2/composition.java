package com.learnexcelmacro.Lesson2;

/**
 * Created by Vishwa on 8/6/2016.
 */
public class composition {

    private myPuppet puppyObject;
    private String dateOfBirth;
    private String myName ="Vishwa";

    myPuppet myPuppy = new myPuppet(myName,puppyObject);

    public composition(){

    System.out.printf("My Name is %s and my Date of Birth is %s ", myName , this);
    }

    public  String toString(){

        return  dateOfBirth;
    }

}
