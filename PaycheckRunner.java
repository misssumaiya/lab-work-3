package ProblemE5_22;

import java.util.Scanner;

public class PaycheckRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee name ");
        String name=sc.nextLine();
        System.out.println("enter hourly wage ");
        double hourWage= sc.nextDouble();
        System.out.println("enter hours worked in the past week ");
        double hoursWorked= sc.nextDouble();
        Paycheck paycheck=new Paycheck(name,hourWage,hoursWorked);
        paycheck.printPatcheck();
    }
}
