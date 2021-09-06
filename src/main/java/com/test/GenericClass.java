package com.test;
import java.lang.*;
import java.util.*;
class Hello12<X,Y,Z>
{
    X name;
    Y no;
    Z bn;
    public Hello12()
    {

    }
    public  Hello12(X name,Y no,Z bn)
    {
        this.name=name;
        this.no=no;
        this.bn=bn;
    }

    public void Gott()
    {
        System.out.println(name +"\t"+ no+"\t"+ bn);
    }

    public void mott(X name,Y no)
    {

        System.out.println(name +"" + no);
    }

}

public class GenericClass {
    public static void main(String[] args) {

        Hello12 hobj=new Hello12(11,"Akshay",true);
        Hello12 hobj1=new Hello12("Deepak",false,26);
        hobj.Gott();
        hobj1.Gott();
        Hello12 hobj2=new Hello12();
        hobj2.mott(11,"Ambure");


    }
}
