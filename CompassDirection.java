package ProblemE5_11;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angle= sc.nextInt();
        angle=((angle%360)+360)%360;
        String directions[]={"N","NE","E","SE","S","SW","W","MW"};
        int directionsAngle[]={0,45,90,135,180,225,270,315};
        int nearestDirestionAngle=0;
        int minDifference=Math.abs(angle-directionsAngle[0]);
        for(int counter=1;counter<directionsAngle.length;counter++){
            int difference=Math.abs(angle-directionsAngle[counter]);
            if(difference<minDifference){
                minDifference=difference;
                nearestDirestionAngle=counter;
            }
        }
        System.out.println("nearest compass direction: " +directions[nearestDirestionAngle]);
    }
}
