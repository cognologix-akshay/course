package com.test;

public class MegaBytesConverter {
    public static void main(String []Args)
    {
        int Number=2500;

        if(Number <0)
        {
            System.out.println("Invalid Number");
        }
        else
        {
            int megabyte=(Number/1024);
            int kilobyte=(Number%1024);
            System.out.println(" kilobyte "+ Number +" = "+ megabyte + " mb "+ kilobyte +" kb ");
        }
    }
}
