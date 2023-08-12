package ProblemE5_15;

import java.util.Scanner;

public class TaxCalculate {
    public static void main(String[] args) {
        System.out.println("enter your income : ");
        Scanner sc=new Scanner(System.in);
        int income= sc.nextInt();
        double tax=0;
        if(income<50000){
            tax=0;
        }
        else if(income==50000){
            tax=income*0.01;
        }
        else if(income>50000 && income<=750000){
            tax=income*0.02;
        }
        else if(income>75000 && income<=100000){
            tax=income*0.03;
        }else if(income>100000 && income<=250000){
            tax=income*0.04;
        }else if(income>250000 && income<=500000){
            tax=income*0.05;
        }else if( income>500000){
            tax=income*0.06;
        }
        System.out.println("your income tax is: " +tax);
    }
}
