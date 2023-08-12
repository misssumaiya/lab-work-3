package ProblemE5_20;

import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String statement=" ";
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                statement="vowel";
            }
            else {
                statement="consonant";
            }

        }
        else {
            statement="not an alphabet";
        }
        System.out.println(statement);
    }
}
