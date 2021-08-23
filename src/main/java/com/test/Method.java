package com.test;
import java.lang.*;
import java.util.*;

public class Method {

    public static int add(int no1, int no2) {
        int ans = no1 + no2;
        return ans;
    }
    public static void main(String[] args) {
        int ans1 = add(11, 10);
        System.out.println("The addition of the number is =" + ans1);

    }
}
