package csa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LoanTracker {
    private static double principal;
    private static double AnnualInterest;
    private static double MonthlyPayment;
    private static double MonthlyInterest = (double)(AnnualInterest / 12);
    private static double interest;

    private static double calculateInterest(){
        interest = principal * MonthlyInterest;
        return interest;
    }

    private static double calculateNewBalance(){
        principal = principal + interest - MonthlyPayment;
        return principal;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.println("Annual interest rate: ");
        AnnualInterest = Double.parseDouble(in.readLine());
        System.out.println("Monthly payment: ");
        MonthlyPayment = Double.parseDouble(in.readLine());
        System.out.println("Loan ammount: ");
        principal = Double.parseDouble(in.readLine());
        System.out.println(AnnualInterest);
        System.out.println(MonthlyInterest);
        /**while(true){
            System.out.println("Principal loan amt.: " + principal);
            System.out.println("Interest: " + calculateInterest());
            System.out.println("Payment: " + MonthlyPayment);
            System.out.println("New balance: " + calculateNewBalance());
            System.out.println();
            if(principal == 0)
                break;

        }**/
    }
}
