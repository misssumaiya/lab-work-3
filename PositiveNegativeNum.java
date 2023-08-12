package ProblemE5_1;

import java.util.Scanner;

public class PositiveNegativeNum {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if(number>0){
            System.out.println("number is positive");
        } else if (number<0) {
            System.out.println("number is negative");

        }
        else {
            System.out.println("number is zero");
        }

    }
}
