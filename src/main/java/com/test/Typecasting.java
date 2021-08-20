package com.test;

public class Typecasting {
    public static void main(String[] args) {
        int a = 10;
        byte b = 20;
        short s = 30;

        long c = (10 + 10 * (a + b + s));
        System.out.println("The calulation is =" + c);

        short d = (short) (10 + 10 * (a + b + s));          //Type Casting
        System.out.println("The mathematical calulation is =" + d);
    }

}
