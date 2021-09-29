/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;

public class Solution15 {
    // Declare password as final will not be modified
    private static final String userPassword;
    // not going anywhere
    static {
        userPassword = "YoMamaHouseBigDaddy69@";
    }

    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Methods for user inputs
        getUsername();
        checkPassword();
        // check password function
        // if else for validation

        if (!checkPassword()){
            System.out.println("I Don't know you.");

        }
        else {
            System.out.println("Welcome!");
        }

    }
    // method for username
    // return void
    private static void getUsername(){
        System.out.println("What is your username?");
        in.next();
    }
    // method to get user name and return it.
    // for some reason it keeps returning
    private static boolean checkPassword(){
        System.out.println("What is the password? ");
        String enteredPass = in.next();
        return enteredPass.equals(userPassword);

    }
}
