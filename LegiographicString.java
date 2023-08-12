package ProblemE5_18;

import java.util.Arrays;
import java.util.Scanner;

public class LegiographicString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1= sc.next();
        String string2= sc.next();
        String string3= sc.next();
        String array[]={string1,string2,string3};
        Arrays.sort(array);
        System.out.println("sorted string are: ");
        for(String element: array){
            System.out.println(element);
        }

    }
}
