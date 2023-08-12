package ProblemE5_9;

import java.util.Scanner;

public class CheckOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        if((num1<num2 && num2<num3)||(num1>num2 && num2>num3)||(num1<=num2 && num2<num3)||(num1>=num2 && num2>num3)||(num1<num2 && num2<=num3)||(num1>num2 && num2>=num1))
            System.out.println("In order");
        else
            System.out.println("Not in order");

    }
}
