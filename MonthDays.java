package ProblemE5_21;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        System.out.println("enter month a number :");
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int day;
        if(month==2){
            day=28;
        } else if (month==4||month==6||month==9||month==11) {
            day=30;
        }
        else {
            day=31;
        }
        System.out.println("month has :" +day+"days");

    }
}
