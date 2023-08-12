package ProblemE5_19;


import java.util.Scanner;

public class CompareFloatingPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1= sc.nextFloat();
        float num2= sc.nextFloat();

        boolean areEqual= areEqualUpToTwoDecimalPlaces(num1,num2);
        if(areEqual){
            System.out.println("numbers are same up to two decimal point");
        }
        else {
            System.out.println("numbers are not same up to two decimal point");
        }
    }

    private static boolean areEqualUpToTwoDecimalPlaces(float num1, float num2) {
        int scaledNum1=(int)num1*100;
        int scaledNum2=(int)num2*100;
        return scaledNum1==scaledNum2;

    }
}
