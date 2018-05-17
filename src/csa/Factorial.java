package csa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args)throws Exception{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Input a number: ");
        int high = Integer.parseInt(in.readLine());
        System.out.println(high + "!" + " = " + calcFactorial(high));
        System.out.println("Base: " + runCalc(calcFactorial(high)) + "!");

    }

    private static int calcFactorial(int fact){
        int num = 1;
        int result = 1;
        while (num < fact + 1){
            result *= num;
            num++;
        }
        return result;
    }

    private static int runCalc(int high){
        int result = 1;
        while(result > 1){
            result = ((calcFactorial(high)) / calcFactorial(high - 1));
        }
        return result;
    }

}
