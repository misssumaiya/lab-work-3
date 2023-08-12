package ProblemE5_14;

import java.util.Scanner;

public class NumericToLetterGrade {
    public static void main(String[] args) {
        System.out.println("enter your numeric value: ");
        Scanner sc=new Scanner(System.in);
        double numericValue=sc.nextDouble();
        String grade = " ";
        if (numericValue == 4.3) {
            grade = "A+";
        } else if ( numericValue == 4.0) {
            grade = "A";
        } else if ( numericValue ==3.7 ) {
            grade = "A-";
        } else if ( numericValue == 3.3) {
            grade = "B+";
        } else if ( numericValue == 3.0) {
            grade= "B";
        } else if ( numericValue == 2.7) {
            grade= "B-";
        } else if ( numericValue == 2.3) {
            grade= "C+";
        } else if ( numericValue == 2.0) {
            grade= "C";
        } else if ( numericValue == 1.7) {
            grade = "C-";
        } else if ( numericValue == 1.3) {
            grade = "D+";
        } else if ( numericValue == 1.0) {
            grade = "D";
        } else if ( numericValue == 0.7) {
            grade = "D-";
        } else if ( numericValue == 0.0) {
            grade = "F";
        }
        System.out.println("numerical value to grade: " +grade);
    }
}
