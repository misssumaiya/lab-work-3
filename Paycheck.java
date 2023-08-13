package ProblemE5_22;

public class Paycheck {

    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;
    public Paycheck(String name,double wage,double hours){
        employeeName=name;
        hourlyWage=wage;
        hoursWorked=hours;
    }
    public void printPatcheck(){
        double regularPay;
        double overTimePay=0;
        if(hoursWorked<=40){
            regularPay=hoursWorked*hourlyWage;
        }
        else{
            regularPay=40*hourlyWage;
            overTimePay=(hoursWorked-40)*hourlyWage*1.5;
        }
        double totalPay=regularPay+overTimePay;
        System.out.println("paycheck for" +employeeName);
        System.out.println("regular hours " +hoursWorked+"hours");
        if(hoursWorked>40){
            System.out.println("overtime hour " +(hoursWorked-40)+"hours");
        }
        System.out.println("regular pay "+regularPay);
        System.out.println("overtime pay " +overTimePay);
        System.out.println("total pay " +totalPay);
    }
}
