package com.test;
import java .lang.*;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the length of the array is ");
        int length=sobj.nextInt();
        int  Arr[]=new int[length];

        int i=0;
        System.out.println("Enter the array");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        System.out.println("Out of the array is ");
        for (i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }

}
