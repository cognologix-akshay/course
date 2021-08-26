package com.test;

public class SwitchCaseDay {

    public static void printoftheday(int day)
    {
        switch(day)
        {
            case 0:
                System.out.println("Day is Monday");
                break;

            case 1:
                System.out.println("Day is Tuesday");
                break;

            case 2:
                System.out.println("Day is wedneday");
                break;

            case 3:
                System.out.println("Day is Thursday");
                break;


            case 4: case 5: case 6: case 7:
            System.out.println("Day is 4 or 5 or 6 or 7");
            break;

            default:
                System.out.println("Invalid");
                break;
        }

    }

    public static void main(String[] args) {
        printoftheday(0);
        printoftheday(1);
        printoftheday(2);
        printoftheday(9);


    }
}
