package org.example;

public class TwoPoints {
    public static void main(String[] args) {
        System.out.println(computePointOfInterception(2, 4));
    }
    public static int computePointOfInterception(int x, int
            y) {
        int meetingpoint=0;
        for ( int k=y;k<=14;k++)
        {
            if(x!=k)
            {
                x=x+2;
                if(k==13)
                    k=1;
                else if(k==14)
                    k=0;
                if(x==13)
                    x=1;
                else if(x==14)
                    x=0;
            }
            else {
                meetingpoint = k;
                break;
            }
        }
        return meetingpoint;
    }
}