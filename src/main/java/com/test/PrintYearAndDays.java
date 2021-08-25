//Print Year and days from minute

package com.test;

public class PrintYearAndDays {

    static void Yearoftheday(long minute)
    {
        if(minute<0)
        {
            System.out.println("Invalid Number");
        }
        else {
            int Hour = (int) minute / 60;
            int day = (int) Hour / 24;
            int year = (int) day / 365;
            int remainingdays = day % 365;

            System.out.println(year + " year " + remainingdays + " days ");
        }
    }

    public static void main(String[] args) {

        Yearoftheday(525600);
        Yearoftheday(1051200);
        Yearoftheday(561600);
        Yearoftheday(-11);


    }
}
