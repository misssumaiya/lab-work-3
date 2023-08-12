package ProblemE5_8;

import java.util.Scanner;

public class IncreasingDecreasingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        if ((num1<num2 && num2<num3)||(num1<=num2 && num2<num3)||(num1<num2 && num2<=num3)){
            System.out.println("numbers are in increasing order");
        }
       else  if ((num1>num2 && num2>num3)||(num1>=num2 && num2>num3)||(num1>num2 && num2>=num3)) {
            System.out.println("numbers are in decreasing order");
        }
       else if (num1==num2 && num2==num3 && num3==num1) {
            System.out.println("numbers are in both increasing and decreasing order");
        }
       else {
            System.out.println("neither");
        }

    }
}
