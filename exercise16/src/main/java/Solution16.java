/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;

public class Solution16 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // print statement asking for age
        // returning next int
        // age gonna be used for conditional
        System.out.print("What is your age? ");
        int age = in.nextInt();
        // print statement with conditionals for output
        System.out.println(age >=16 ?"You are old enough to legally drive.":"You are not old enough to legally drive");

    }
    // Method for getting and returning age
    private boolean ageLimit(int age){
        return age >= 16;
    }
    // im getting tired
    // 16 onward will have short psuedocode lol
}
