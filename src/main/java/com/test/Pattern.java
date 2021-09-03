package com.test;
import java.util.*;

public class Pattern {

    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sobj.nextInt();

        for(i=0;i<no;i++)
        {
            for(j=0;j<no;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
