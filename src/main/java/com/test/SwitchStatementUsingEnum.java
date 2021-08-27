package com.test;

public class SwitchStatementUsingEnum {
    enum car
    {
        maruti,honda,audi,hero,suzuki;
    }

    public static void main(String []args)
    {

        //car c=car.audi;
        switch(car.audi)
        {
            case maruti:
                System.out.println("Car is maruti");
                break;

            case audi:
                System.out.println("Car is audi");
                break;

            case suzuki:
                System.out.println("Car is suzuki");
                break;

            case hero:
                System.out.println("Car is hero");
                break;

            default:
                System.out.println("Invalid car");
                break;
        }
    }

}
