//Even Number Addition

package com.test;
import java.lang.*;
import java.util.*;
import java.math.*;

class Sum{
    void Addition(int no)
    {
        int isum=0;
        int idigit=0;
        while (no!=0)
        {
            idigit=no%10;
            if(idigit%2==0)
            {
                isum=isum+idigit;
            }
            no=no/10;
        }
        System.out.println("The addition of the even nuber is = "+ isum);


    }

}


public class EvenNumberAddition {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sobj.nextInt();
        Sum sobj1=new Sum();
        sobj1.Addition(no);

    }
}
