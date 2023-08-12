package ProblemE5_23;

import java.util.Scanner;

public class CouponAward {
    public static void main(String[] args) {
        System.out.println("enter your spend money: ");
        Scanner sc=new Scanner(System.in);
        int spentMoney= sc.nextInt();
        double couponDiscount=0;
        if(spentMoney<10)
            couponDiscount = 0;
        else if (spentMoney>=10 && spentMoney<=60)
            couponDiscount = spentMoney*0.08;
        else if (spentMoney>60 && spentMoney<=150)
            couponDiscount = spentMoney*0.1;
        else if(spentMoney>150 && spentMoney<=210)
            couponDiscount = spentMoney*0.12;
        else
            couponDiscount=spentMoney*0.14;
        System.out.println("your discount coupon: " +couponDiscount);

    }
}
