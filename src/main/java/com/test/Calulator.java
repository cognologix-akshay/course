package com.test;
import java.lang.*;
import java.util.*;

class Calulator1
{
    void Addition(int no1,int no2)
    {
        int sum=no1+no2;
        System.out.println("The Addition of the number is ="+sum);
    }

    void Substraction(int no1,int no2)
    {
        int sub=no1-no2;
        System.out.println("The Substraction of the the number is ="+ sub);
    }

    void Multiplication(int no1,int no2)
    {
        int mul=no1*no2;
        System.out.println("The Multiplication  of the no is ="+ mul);
    }

    void Division(int no1,int no2)
    {
        int div=no1/no2;
        System.out.println("The Division of the number is ="+ div);
    }
}

 class Calculator {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First number");
        int no1 = sobj.nextInt();

        System.out.println("Enter the Second number");
        int no2 = sobj.nextInt();

        Calulator1 cobj = new Calulator1();
        cobj.Addition(no1, no2);
        cobj.Substraction(no1, no2);
        cobj.Multiplication(no1, no2);
        cobj.Division(no1, no2);
    }
}
