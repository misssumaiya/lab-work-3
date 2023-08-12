package ProblemE5_5;

import java.util.Scanner;

public class CompareWord {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        int stringLength=word.length();
        String firstHalf,secondHalf;
        if(stringLength%2==0){
            firstHalf=word.substring(0,stringLength/2);
            secondHalf=word.substring(stringLength/2);
        }
        else {
            firstHalf=word.substring(0,stringLength/2+1);
            secondHalf=word.substring(stringLength/2+1);
        }
        if (firstHalf.equals(secondHalf)){
            System.out.println("first and second half are same");
        }
        else {
            System.out.println("first and second half are different");
        }
    }
}
