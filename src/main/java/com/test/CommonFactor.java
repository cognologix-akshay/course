//Print All factors whose reminder is 0

package com.test;
import java.lang.*;
import java.util.*;

class Factor {
    void Div(int no)
    {
        int i=0;
        int digit=0;
        if(no<0)
        {
            System.out.println("Invalid Number");
        }

        System.out.println("All Common Factors are");
        for(i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                digit=i;
                System.out.println(digit);
            }
        }
    }
}
public class CommonFactor {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sobj.nextInt();
        Factor sobj1=new Factor();
        sobj1.Div(no);

    }

}
