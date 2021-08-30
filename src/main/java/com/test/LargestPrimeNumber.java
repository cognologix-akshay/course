//Find Largest prime number

package com.test;
import java.lang.*;
import java.util.*;
import java.math.*;

class getLargestPrime
{
    void prime(int no)
    {
        int idigit=0;
        int idigit1=0;
        for(int i=2;i<no;i++)
        {
            if(no%i==0)
            {
                idigit = i;
                if(idigit%2!=0)
                {
                    idigit1=idigit;
                    //System.out.println("gprime "+idigit1);
                }
            }
        }
        System.out.println("Largest prime number is ="+idigit1);
    }
}


public class LargestPrimeNumber {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number ");
        int no=sobj.nextInt();
        getLargestPrime gobj=new getLargestPrime();
        gobj.prime(no);

    }
}
