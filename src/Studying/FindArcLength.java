package Studying;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindArcLength {
    public static void main(String[] args)throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double l, X, D;
        System.out.println("What do you want to calculate: ");
        if(in.readLine().equalsIgnoreCase("diameter")){
            System.out.println("Input the length: ");
            l = Double.parseDouble(in.readLine());
            System.out.println("Input arc degree measure: ");
            X = Double.parseDouble(in.readLine());
            System.out.println(calcDiameter(X, l));
        }
        else if (in.readLine().equalsIgnoreCase("length")){
            System.out.println("Input arc degree measure: ");
            X = Double.parseDouble(in.readLine());
            System.out.println("Input diameter: ");
            D = Double.parseDouble(in.readLine());
        }
        else if (in.readLine().equalsIgnoreCase("circumfrence")){}

        System.out.println(calcLengthPi(48, 90));
    }
    private static double calcLength(double x, double d){
        return (x/360) * (Math.PI * d);
    }
    private static double calcCircumfrence(double x, double L){
        return L/(x/360);
    }
    private static double calcDiameter(double x, double L){
        return L/(x/360);
    }
    private static double calcLengthPi(double x, double d){
        return (x/360) * d;
    }
}
