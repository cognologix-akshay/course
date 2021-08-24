package com.test;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean barking= shouldWakeUp(true,25);
        boolean barking1=shouldWakeUp(true,3);
        boolean barking2=shouldWakeUp(true,8);

        System.out.println(barking);    //false
        System.out.println(barking1);   //true
        System.out.println(barking2);   //false


    }
}


