package com.test;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;

class  GenArr<X,Y>
{
    X name;
    Y no;
    void Add(X name,Y no)
    {
        System.out.println(name +""+ no);
    }
}

public class GenericArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> aobj=new ArrayList<String>();
        GenArr<String,Integer> hobj=new GenArr<>();    // GenArr hobj=new GenArr();

        hobj.Add("akshay",1234);

    }

}
