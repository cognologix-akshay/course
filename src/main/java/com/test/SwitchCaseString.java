package com.test;

public interface SwitchCaseString {

    public static void main(String[] args) {

        String month="January";

        switch (month.toLowerCase())
        {
            case "january":
                System.out.println("Month is January");
                break;

            case "february":
                System.out.println("Month is February");
                break;

            case "march":
                System.out.println("Month is March");
                break;

            case "april": case "may":
            System.out.println("Month is March");
            break;

            default :
                System.out.println("Invalid month");
                break;
        }
    }
}
