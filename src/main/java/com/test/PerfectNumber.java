package com.test;
import java.lang.*;
import java.util.*;
import java.math.*;

class PerfectNumber1 {
    void Number(int no)
    {
        int i=0;
        int digit=0;
        int sum=0;
        if(no<0)
        {
            System.out.println("Invalid Number");
        }

        for(i=1;i<no;i++)
        {
            if(no%i==0)
            {
                digit=i;
                sum=sum+digit;
            }
        }
        if(sum==no)
        {
            System.out.println("Is is a perfect number");
        }
        else
        {
            System.out.println("It is not perfect Number");
        }
    }
}


public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sobj.nextInt();
        PerfectNumber1 sobj1=new PerfectNumber1();
        sobj1.Number(no);

    }

}
