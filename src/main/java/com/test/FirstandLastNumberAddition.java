//First and last digit sum

package com.test;
import java.lang.*;
import java.util.*;


class Summ{
    void Addition(int no)
    {
        int idigit=0;
        int lastnumber=0;
        int firstnumber=0;
        int isum=0;

        idigit=no%10;
        lastnumber=idigit;
        System.out.println( "Last number is =" +lastnumber);

        while(no!=0)
        {
            idigit=no%10;
            firstnumber=idigit;
            no=no/10;
        }
        System.out.println("First Number is ="+ firstnumber);
        System.out.println("Sum is =" + (isum=lastnumber+firstnumber));


    }

}

public class FirstandLastNumberAddition {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sobj.nextInt();
        Summ sobj1=new Summ();
        sobj1.Addition(no);

    }

}
