package ProblemE5_13;

import java.util.Scanner;

public class GradeToNumeric {
    public static void main(String[] args) {
        System.out.println("enter your letter grade: ");
        Scanner sc=new Scanner(System.in);
        String grade=sc.next();
        double numericValue = 0;
        switch (grade){
            case "A+":
                numericValue=4.3;
                break;
            case "A":
                numericValue=3.7;
                break;
            case "A-":
                numericValue=4.0;
                break;
            case "B+":
                numericValue=3.3;
                break;
            case "B":
                numericValue=3.0;
                break;
            case "B-":
                numericValue=2.7;
                break;
            case "C+":
                numericValue=2.3;
                break;
            case "C":
                numericValue=2.0;
                break;
            case "C-":
                numericValue=1.7;
                break;
            case "D+":
                numericValue=1.3;
                break;
            case "D":
                numericValue=1.0;
                break;
            case "D-":
                numericValue=0.7;
                break;
            case "F":
                numericValue=0.0;
                break;

        }
        System.out.println("numeric value of letter grade :" +numericValue);
    }
}
