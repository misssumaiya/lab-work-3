package ProblemE5_7;

import java.util.Scanner;

public class StrictIncreasingDecrasingOrder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num1= sc.nextByte();
        int num2= sc.nextByte();
        int num3= sc.nextByte();
        if(num1<num2 && num2<num3){
            System.out.println("numbers are in increasing order");
        }
        else if (num1>num2 && num2>num3) {
            System.out.println("numbers are in decreasing orde");
        }
        else {
            System.out.println("neither");
        }

    }
}