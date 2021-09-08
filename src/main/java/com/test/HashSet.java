package com.test;
import java.lang.*;
import java.util.*;

public class HashSet {
    public static void main(String []Args)
    {
        Set<Integer> sobj=new java.util.HashSet<>();

        sobj.add(88);
        sobj.add(11);
        sobj.add(99);

        Set<Integer> dobj=new java.util.HashSet<>();

        dobj.add(89);
        dobj.add(11);
        dobj.add(33);

        sobj.addAll(dobj);
        System.out.println(sobj);
    }
}
