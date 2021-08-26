//Switch Statement

package com.test;

public class SwitchStatement {
    public static void main(String[] args) {

       int no=4;

       switch (no)
       {
           case 1:
               System.out.println("No is 1");
               break;

           case 2:
               System.out.println("No is 2");
               break;

           case 3: case 4: case 5: case 6:
           System.out.println("No is either 3 or 4 or 5 or 6 ");
           System.out.println("actual number is ="+ no);
           break;

           default:
               System.out.println("Number is not present");
               break;
       }
    }
}
