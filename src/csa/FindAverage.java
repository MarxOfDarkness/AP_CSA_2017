package csa;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args){
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;
        double count = 0;
        double average;

        //read inputs

        System.out.println("Please enter values Q to quit: ");
        Scanner in  = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length){
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        //Find average value of array

        for (int i = 0; i < currentSize; i++){
            count += values[i];
        }
        average = count/currentSize;

        //Print values and average

        for (int i = 0; i < currentSize; i++){
            System.out.println(values[i]);
        }
        System.out.println("Average = " +  average);
    }
}
