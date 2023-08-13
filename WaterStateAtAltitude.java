package ProblemE5_25;

import java.util.Scanner;

public class WaterStateAtAltitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter altitude ");
        double altitude= sc.nextDouble();
        System.out.println("enter 'M' for meter or'F' for feet " );
        char unit=sc.next().charAt(0);

        if(unit=='f'||unit=='F'){
            altitude=feetToMeterAltitude(altitude);
        }
        double boilingPoint= 100 - (altitude/300);
        String waterState;
        if(boilingPoint<=0){
            waterState="solid";
        }
        else if (boilingPoint<100) {
            waterState="liquid";

        }
        else {
            waterState="gaseous";
        }
        System.out.println("water is in the " +waterState+"state at an altitude of" +altitude+"meters");
        System.out.println("adjusted boiling point of water "+boilingPoint+"degree celsius");
    }

    private static double feetToMeterAltitude(double feet) {
        return feet*0.304;
    }
}
