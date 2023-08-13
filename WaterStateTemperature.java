package ProblemE5_24;

import java.util.Scanner;

public class WaterStateTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter C for celsius and F for fahrenheit ");
        char unitName = sc.next().charAt(0);
        System.out.println("enter temperature for conversion ");
        double temperature = sc.nextDouble();
        if(unitName=='f'||unitName=='F'){
           temperature = (temperature-32)*5.0/9.0;
        }
        String waterState;
        if(temperature<=0)
            waterState="solid";
        else if (temperature<100) {

            waterState="liquid";
        }
        else{
            waterState="gaseous";
        }
        System.out.println("water is in the " +waterState+" state at " +temperature+" temperature ");
    }
}
