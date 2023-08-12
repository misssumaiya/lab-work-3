package ProblemE5_4;

import java.util.Scanner;

public class CompareStringLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        int stringLength=name.length();
        char firstLetter=name.charAt(0);
        char lastLetter=name.charAt(stringLength-1);
        if(firstLetter==lastLetter){
            System.out.println("first and last letter are same");
        }
        else {
            System.out.println("first and last letter are different");
        }

    }
}
