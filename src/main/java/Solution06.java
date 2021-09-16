/*
 *
 */


import java.util.Scanner;

public  class Solution06 {
    // declare static scanner object

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int currentAge = getCurrentAge();
        int retiredAge = getRetiredAge();
        double retireTime = calculateAgeToRetire();

    }

    private static double calculateAgeToRetire() {
      double retireTime = (retiredAge - currentAge);
    }

    private static int getRetiredAge() {
        System.out.println("What is your current age? ");
        return in.nextInt();
    }

    private static int getCurrentAge() {
        System.out.println("What age do you wish to retire? ");
        return in.nextInt();
    }

}
