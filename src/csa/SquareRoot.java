package csa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SquareRoot {
    private static int[] numbers = new int[10];
    public static void main (String[] args)throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number: ");
        String num = in.readLine();
        int index = num.length() - 2;
        System.out.println(num.substring(index));
        System.out.println(index);
        for (int i = 0; i < num.length(); i++){
            if (index >= 0) {
                numbers[i] = Integer.parseInt(num.substring(index - 1, index + 1));
                index = index - 1;
            }
            System.out.println(num.substring(index));
        }
    }
}
