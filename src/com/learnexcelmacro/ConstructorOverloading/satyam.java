package com.learnexcelmacro.ConstructorOverloading;
import java.util.Scanner;
/**
 * Created by Vishwa on 8/6/2016.
 */
public class satyam {

    public satyam(){ //this is a constructor with one parameter
        this (0, 0, 0);
    }

    public satyam(int a){ //this is a constructor with one parameter
        this (a, 0, 0);
    }

    public satyam(int a, int b){ //this is a constructor with two parameter
        this (a, b, 0);
    }

    public  satyam(int a, int b, int c){ //this is a constructor with two parameter

        System.out.printf("The sum of all the numbers you entered is : %d", a+b+c);

    }

    public  satyam(int a, int b, int c, int d){ //this is a constructor with two parameter

        System.out.printf("The sum of all the numbers you entered is : %d", a+b+c+d);

    }



    }

