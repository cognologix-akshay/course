// The number which is divisible by 3 as well as 5 ,range is between 1 to 1000

package com.test;

public class Sum3and5Challange {
    public static void main(String []args)
    {
        for(int i=1;i<1000;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                System.out.println("The number is divisible by 3 and 5 is ="+i );
            }
        }

    }
}
