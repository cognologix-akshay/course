//Check Number is bet in 13-19(inclusive)

package com.test;
import java.lang.*;
import java.util.*;

class Parameter1
{
    boolean Pass(int no1,int no2,int no3)
    {
        if((no1>=13 && no1<=19)||(no2>=13 && no2<=19)||(no3>=13 && no3<=19))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

public class TeenNumberChecker {
    public static void main(String[] Args) {

        Parameter1 pobj=new Parameter1();
        boolean ret=pobj.Pass(14,10,20);
        System.out.println(ret);


    }
}
