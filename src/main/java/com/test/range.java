package com.test;

public class range {
    public static void main(String[] args) {
        int Minintvalue = Integer.MIN_VALUE;
        int Maxintvalue = Integer.MAX_VALUE;
        System.out.println("the minimum value of the int number is =" + Minintvalue);
        System.out.println("the maximum value of the int number is + "+ Maxintvalue);

        System.out.println("");

        byte minbytevalue=Byte.MIN_VALUE;
        byte maxbytevalue=Byte.MAX_VALUE;
        System.out.println("The minimum value of the byte  is =" + minbytevalue);
        System.out.println("The maximum value of the byte is ="+ maxbytevalue);

        System.out.println("");

        short a=Short.MIN_VALUE;
        short b=Short.MAX_VALUE;
        System.out.println("The minimum value of the short is ="+ a);
        System.out.println("The maximum value of short is =" + b);

        System.out.println("");

        long c=Long.MIN_VALUE;
        long d=Long.MAX_VALUE;
        System.out.println("The minimu value of the long is ="+ c);
        System.out.println("The maximum value of the long is ="+ d);

        int ansvalue=(Minintvalue/2);
        byte ansvalue1=(byte)(minbytevalue/2);

        System.out.println(ansvalue);
        System.out.println(ansvalue1);
    }
}
