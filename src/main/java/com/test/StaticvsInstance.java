package com.test;
import java.lang.*;
import java.util.*;

class Hello1 {

    static int a=10;         //Static Variable
    int b=0;                 //Instance variable

    void sub(int no3,int no4)         //Instance method
    {
        System.out.println("Inside Sub function");
    }
    public static void Add(int no1,int no2)      //Static Method
    {
        System.out.println("inside Add function");
    }
}

public class StaticvsInstance {
    static void sub(int no2,int no3)
    {
        System.out.println("inside sub class");
    }

    public static void main(String[] args) {
        Hello1.Add(10,20);
        StaticvsInstance.sub(11,12);
        System.out.println(Hello1.a);
    }
}
