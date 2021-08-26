package com.test;

public class SwitchStatmentChar {
    public static void main(String[] args) {

        char ch = 'B';

        switch (ch) {

            case 'A':
                System.out.println("char is A");
                break;

            case 'B':
                System.out.println("Char is B");
                break;

            case 'C':
                System.out.println("Char is C");
                break;

            case 'F':
            case 'G':
            case 'L':
            case 'O':
                System.out.println("Char is D or E or F or G");
                System.out.println("The actual char is =" + ch);
                break;

            default:
                System.out.println("Invalid char");
                break;
        }
    }
}
