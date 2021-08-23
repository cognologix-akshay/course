package com.test;

public class Nestedifelseststment {
    public static void main(String[] args) {
        int score = 2000;
        if (score >1000 && score <5000) {
            System.out.println("The number is greater than 1000 and less than 5000 i.e ="+ score);
        }
        else if(score<1000){
            System.out.println("The number is less than 1000 ");
        }
        else{
            System.out.println("Number is not in between 1000 and 5000");
        }
    }
}
