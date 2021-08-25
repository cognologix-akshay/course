//Compare 3 number are equal ar not

package com.test;

public class PrintEqual {
    public static void PrintEqual(int no1,int no2,int no3)
    {
        if(no1<0 ||no2 <0||no3<0)
        {
            System.out.println("invalid number");
        }
        else
        {
            int no4=no1;
            if(no1 == no4 && no2== no4 && no3==no4)
            {
                System.out.println("All three number are euqal");
            }
            else
            {
                System.out.println("Number are not Equal");
            }

        }
    }


    public static void main(String[] args) {

        PrintEqual(8,1,1);
        PrintEqual(2,2,2);

    }

}
