package com.test;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> aobj=new java.util.ArrayList<String>();

        aobj.add("Physic");
        aobj.add("Math");
        aobj.add("Science");

        aobj.remove(1);
        aobj.add(1,"Bot");
        System.out.println(aobj.size());

        for(int i=0;i<aobj.size();i++)
        {
            System.out.println(aobj.get(i));
        }
    }
}
