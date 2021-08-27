package com.test;

public class PalindromeNumber {
    public static int pailndrome(int no) {
        int idigit = 0;
        int isum = 0;
        if (no < 0) {
            System.out.println("Invalid number");
        } else if(no>0){
            while (no != 0) {
                idigit = no % 10;
                isum = isum*10 + idigit;
                no = no / 10;
            }

        }
        return isum;
    }

    public static void main(String[] args) {
        int no=707;
        int no1=122;
        int iret=pailndrome(no);
        int iret1=pailndrome(no1);
        if(iret==no)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }

        if(iret1==no1)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }


    }
}
