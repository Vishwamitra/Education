package com.learnexcelmacro;

/**
 * Created by Vishwa on 8/2/2016.
 */
public class priceClac {

    private double burgerPrice = 2.4; //per quantity
    private double friesPrice = 1.9; //per quantity
    private double cokePrice = 2.0; //per quantity

    private double vatTax = 10.5; //percent


    //get the fries cost
    public double getFriesCost (int itemQty) {
        double total = friesPrice * itemQty;
        return total;
    }

    //get the burger cost
    public double getBurgerCost (int itemQty) {
        double total = burgerPrice * itemQty;
        return total;
    }

    //get the coke cost

    public double getCokeCost (int itemQty) {
        double total = cokePrice * itemQty;
        return total;
    }

}
