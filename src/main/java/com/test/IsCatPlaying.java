/*The Cat is playing most of the day in playing if temperature is between
 25 and 35 .unless it is summer ,then upper limit is 45 instade of 35
*/

package com.test;

public class IsCatPlaying {

    public static boolean Playingcat(boolean Summer,int Temperature)
    {
        if((Temperature>=25 && Temperature<=35) && Summer==false)
        {
            System.out.println("Cat is palying");
            return true;
        }
        else if((Summer==true)&&(Temperature>=25 && Temperature<=45))
        {
            System.out.println("Cat is playing");
            return true;
        }
        else
        {
            System.out.println("Cat is not playing");
            return false;
        }


    }

    public static void main(String[] args) {

        boolean ret=Playingcat(true,10);
        System.out.println(ret);
        System.out.println();
        boolean ret1=Playingcat(true,43);
        System.out.println(ret1);

    }

}
