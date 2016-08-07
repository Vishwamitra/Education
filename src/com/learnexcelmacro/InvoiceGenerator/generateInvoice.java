package com.learnexcelmacro.InvoiceGenerator;

/**
 * Created by Vishwa on 8/7/2016.
 */

import java.util.Scanner;

public class generateInvoice {

    public static void main (String args[]) {

        //Personal details of the customer
        //*********************************************************

        System.out.print("Enter your Name : ");
        Scanner input = new Scanner(System.in);
        String eName = input.nextLine();

        System.out.print("Enter your Phone Number : ");
        String ePhoneNo = input.nextLine();

        System.out.print("Enter your Age in years : ");
        String cAge = input.nextLine();


        //Provide the order details from the customer
        //*********************************************************

        System.out.print("How Many veg Burger? : ");
        int burgerQty = input.nextInt();

        System.out.print("How many bottles of Coke? : ");
        int cokeQty = input.nextInt();

        System.out.print("How many fries? : ");
        int friesQty = input.nextInt();


        //Generated bill here

        priceList cost = new priceList();


        System.out.println("Invoice\n");

        System.out.print("Customer Name : \t\t\t" + eName + "\n");
        System.out.println("Phone Number : \t\t\t\t" + ePhoneNo + "\t");
        System.out.println("Age : \t\t\t\t\t\t" + cAge + "\t");
        System.out.println("*******************************************************");
        System.out.print("Item Description\t");
        System.out.print("Item Quantity\t");
        System.out.println("Total Cost");
        System.out.println("*******************************************************\n");
        System.out.print("Burger\t\t\t\t\t");
        System.out.print(burgerQty + "\t\t\t");
        System.out.print("$" +cost.getBurgerCost(burgerQty) + "\n");

        System.out.print("Fries\t\t\t\t\t");
        System.out.print(friesQty + "\t\t\t");
        System.out.print("$" +cost.getFriesCost(friesQty) + "\n");

        System.out.print("Coke\t\t\t\t\t");
        System.out.print(cokeQty + "\t\t\t");
        System.out.println("$" +cost.getCokeCost(cokeQty) + "\n");

        System.out.println("*******************************************************");
        System.out.print("Grand Total : \t\t\t\t\t\t");
        System.out.println("$" + (cost.getBurgerCost(burgerQty)+ cost.getCokeCost(cokeQty)+cost.getFriesCost(friesQty)) + "\n");
        System.out.println("*******************************************************");



    }
}

