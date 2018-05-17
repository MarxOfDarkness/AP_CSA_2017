package csa;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        //Read inputs

        System.out.println("Please enter values, Q to quit: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length){
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        //Find the largest value

        double largest = values[0];
        for(int i = 1; i < currentSize; i++){
            if(values[i] > largest){
                largest = values[i];
            }
        }

        //Find the smallest value

        double smallest = values[0];
        for(int i = 1; i < currentSize; i++){
            if(values[i] < smallest){
                smallest = values[i];
            }
        }
        //Print all values, marking the largest and smallest

        for(int i = 0; i < currentSize; i++){
            System.out.println(values[i]);
            if(values[i] == largest){
                System.out.println(" <== largest value");
            }
            if(values[i] == smallest){
                System.out.println(" <== smallest value");
            }
            System.out.println();
        }

    }
}
