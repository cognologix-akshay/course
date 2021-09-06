// Sort an Array in Descending order

package com.test;

import java.util.Scanner;

public class Array1sorting {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int  Arr[]={12,15,1,2,18};

        int i=0;
        int j=0;

        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr.length;j++)
            {
                if (Arr[i] > Arr[j]) {
                    int temp=Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        System.out.println("Array in Descending order");
        for(i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i] + "\t");
        }
    }

}
