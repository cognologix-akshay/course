package com.test;

public class MethodOverloading {
    public static int Addition(int a,int b)
    {
        int ans=a+b;
        return ans;
    }
    public static int Addition(int a,int b,int c)
    {
        int ans=a+b+c;
        return ans;
    }

    public static void main(String[] args) {
        int ret=Addition(10,20);
        System.out.println("The Addition of 2 number is ="+ ret);
        int ret1=Addition(10,30,50);
        System.out.println("Addition of three number is ="+ ret1);


    }
}
