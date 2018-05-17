package csa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompoundInterest {
    public static void main (String[] args)throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double R, P, T;
        System.out.println("Principle amount: ");
        P = Double.parseDouble(in.readLine());
        System.out.println("Rate: ");
        R = Double.parseDouble(in.readLine());
        System.out.println("Years: ");
        T = Double.parseDouble(in.readLine());
        System.out.println(calc(P, R, T));
    }

    private static double calc(double p, double r, double t){
        double amount = p;
        if (t == 0){
            return amount;
        }
        else {
            amount += p * ((1 + (r/100)) + calc(p, r, t - 1));
        }
        return amount;
    }
}
