/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution14 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int orderAmount = orderAmount();
        String state = isItWis();

        String wis = "WI";

        if(state.equals(wis))
        {
           double rate = 0.055;
           System.out.println("The subtotal is $" + orderAmount);
           double tax = orderAmount * rate;
           DecimalFormat format = new DecimalFormat("0.00");
           System.out.println(format.format("The tax is" + tax));

        }
        else{

            System.out.println("The total is $" + orderAmount);
        }


    }

    private static String isItWis() {
        System.out.print("What is the state? ");
        return in.nextLine();
    }

    private static int orderAmount() {
        System.out.print("What is the order amount? ");
        return in.nextInt();
    }
}
