package com.test;

public class ForLoop {

    public static void main(String []args)
    {
        int i=1;
        int amount=10000;
        int Arr[]={1,2,3,4,5,6,7,8};
        for(i=1;i<Arr.length;i++)
        {

            System.out.println("10000 at " + i +" intrest "+ (amount*i)/100);
        }

    }
}
