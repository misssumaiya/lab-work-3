package ProblemE5_10;

import java.util.Scanner;

public class TwoPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();
        if((num1==num4 && num2==num3)||(num1==num2 && num3==num4))
            System.out.println("two pairs");
        else
            System.out.println("not two pairs");
    }
}
