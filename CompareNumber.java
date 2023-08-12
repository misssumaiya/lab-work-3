package ProblemE5_17;

import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1= sc.nextFloat();
        float num2= sc.nextFloat();
        float num3= sc.nextFloat();
        if(num1>num2 && num1>num3) {
            System.out.println("largest number is: " + num1);
        }
        else if(num2>num1 && num2>num3) {
            System.out.println("largest number is: " + num2);
        }
        else{
            System.out.println("largest number is :" +num3);
        }
    }

}
