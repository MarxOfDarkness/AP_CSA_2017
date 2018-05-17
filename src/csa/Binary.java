package csa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Binary {
    public static void main (String[] args)throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input decimal form number: ");
        int num = Integer.parseInt(in.readLine());
        System.out.println(findBinary(num));
    }


    private static String findBinary(int numIn){
        int numOut;
        String out = "";
        for (int i = numIn; i >= 0; i--){
            numOut = numIn % 2;
            out = Integer.toString(numOut) + out;
            numIn = numIn/2;
        }
        out = out.substring(out.indexOf("1"));
        return out;
    }
}
