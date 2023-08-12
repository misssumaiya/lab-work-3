package ProblemE5_6;

import java.util.Scanner;

public class CompareThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3 && num3 == num1) {
            System.out.println("all three number are same");
        }
        else if (num1!=num2 && num2!=num3 && num3!=num1) {
            System.out.println("all three number are different");
        }
        else {
            System.out.println("neither");
        }
    }
}