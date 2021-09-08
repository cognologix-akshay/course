package com.test;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String []Args)
    {
        Set<Integer> sobj=new java.util.LinkedHashSet<>();

        sobj.add(78);
        sobj.add(1);
        sobj.add(200);

        System.out.println(sobj);
    }
}
