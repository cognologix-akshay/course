// The number which is divisible by 3 as well as 5  and calulate sum ,range is in between 1 to 100

package com.test;

public class Sum3and5Challange {
    public static void main(String []args)
    {
        int sum=0;
        for(int i=1;i<100;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                sum=sum+i;
                System.out.println("The number is divisible by 3 and 5 is ="+i );
            }
        }
        System.out.println("sum is = "+ sum);


    }
}
