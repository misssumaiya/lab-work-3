package ProblemE5_26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WaterStateAtAltitudeplus {
    public static void main(String[] args) throws StringIndexOutOfBoundsException {
        Scanner sc=new Scanner(System.in);
        double altitude=0.0;
        try {
            System.out.println("enter the altitude ");
            altitude= sc.nextDouble();
        }catch (InputMismatchException e) {
            System.out.println("error: please enter a valid numeric value for altitude");
            System.exit(1);
        }

            char unit=' ';
            try {

                System.out.println("enter 'M' for meter or 'F' for feet ");
                unit = sc.next().charAt(0);
            }catch (StringIndexOutOfBoundsException e1) {

                System.out.println("error: please enter a valid unit for(M or F)");
                System.exit(1);
            }

            if(unit=='F'||unit=='f'){
                altitude = feetToMeter(altitude);
            }
            double boilingPoint = 100 - (altitude/300);
            String waterState;
            if(boilingPoint<=0){
                waterState = "solid";
            } else if (boilingPoint<100) {
                waterState = "liquid";

            }
            else {
                waterState = "gaseous";
            }
            System.out.println("water is in the " +waterState+ "sate at an altitude of " +altitude +"meters");
            System.out.println("adjusted boiling point of water " +boilingPoint+ " degree celsius");


    }

    public static double feetToMeter(double feet) {
        return feet*0.304;
    }
}
