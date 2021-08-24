package com.test;
import java.lang.*;
import java.util.*;

public class PositiveNegativeZeroNumber {

    public static void Number(int no) {
        if (no > 0) {
            System.out.println("Number is positive");
        } else if (no < 0) {
            System.out.println("Number is negative");
        } else if (no == 0) {
            System.out.println("Number is 0");
        }
    }

    public static void main(String[] Args) {
        Number(10);
        Number(-2);
        Number(0);
    }
}
