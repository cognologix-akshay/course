// Find Area of circle if it is less than 0 then print invalid value.

package com.test;

public class AreaOfCircle {
    static double Area(double radius)
    {
        if(radius <0)
        {
            System.out.println("Invalid Value");
            return 0;

        }
        else {
            double Areaofcircle = 3.14 * radius * radius;
            return Areaofcircle;
        }

    }

    public static void main(String[] args) {

        double ret=Area(5);
        System.out.println("Area of the circle is ="+ ret);
    }
}
