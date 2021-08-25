//write a progarm has equal sum with 3 parameter of type int
//Return True If The Sum Of The 1st And 2nd Parameter Is Equal To The 3rd

package com.test;
import java.lang.*;
import java.util.*;

class Parameter {
    boolean Pass(int no1, int no2, int no3) {
        int ans = no1 + no2;

        if (ans == no3) {
            return true;
        } else {
            return false;
        }
    }
}

public class Sumwith3parameter {
        public static void main(String[] Args) {

        Parameter pobj = new Parameter();
        boolean ret = pobj.Pass(10, 10, 20);
        System.out.println(ret);


    }
}
