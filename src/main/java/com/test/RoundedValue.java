package com.test;

public class RoundedValue {
    public static void main(String[] Args) {
        double number = 2.6;

        if (number < 0) {
            System.out.println("Invalid Number");
        } else {
            long rounded = Math.round(number);
            System.out.println("The rounded number of "+ number + " is " + rounded);
        }
    }
}
