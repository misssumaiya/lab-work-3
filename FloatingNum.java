package ProblemE5_2;

import java.util.Scanner;

public class FloatingNum {
    public static final int VALUE1 = 1;
    public static final long VALUE2 = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if (num == 0) {
            System.out.println("number is zero");
        }
        if (num > 0) {
            System.out.println("number is positive");
        }
        if (num < 0) {
            System.out.println("number is negative");
        }
        if (Math.abs(num) < VALUE1) {
            System.out.println("number is small");
        }
        if (Math.abs(num) > VALUE2) {
            System.out.println("number is large");
        }

    }
}

