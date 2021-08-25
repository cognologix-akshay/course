//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

package com.test;

public class AreEqualByThreeDecimalPlace {

    public static boolean Compare(double no1, double no2) {

        float a = (float) no1 * 1000;
        float b = (float) no2 * 1000;

        int c = (int) a;
        int d = (int) b;

        if (c == d) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ret = Compare(3.125, 3.1257);
        System.out.println(ret);

    }
}
