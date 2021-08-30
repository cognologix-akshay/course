//Greatest Common Divisor

package com.test;
import java.lang.*;
import java.util.*;

class Div {
    void Addition(int no,int no1) {

        int lagno=0;
        int i=0;

        if(no <0 ||no1 <0)
        {
            System.out.println("Invalid value");
        }
        for( i=1;i<no || i< no1;i++)
        {
            if(no%i==0 && no1%i==0)
            {
                lagno=i;
            }
        }
        System.out.println("The Largest factor is = "+lagno);


    }
}

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sobj.nextInt();
        System.out.println("Enter the second number");
        int no1=sobj.nextInt();
        Div sobj1=new Div();
        sobj1.Addition(no,no1);

    }

}
