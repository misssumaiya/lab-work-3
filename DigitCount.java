package ProblemE5_3;

import java.util.Scanner;

public class DigitCount {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num= sc.nextInt();
    int digit=0;
    while (num!=0){
        if(num<0){
            num=num*(-1);
        }
        digit++;
        num=num/10;
    }
        System.out.println(digit);


    }
}
