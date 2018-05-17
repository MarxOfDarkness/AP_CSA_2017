package AdventOfCode;

import java.io.*;


public class CheckSumDay2A {

    public static void main(String[] args) throws Exception {
        int checkSum = 0;
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while(line != null){
            checkSum += calcDiff(line);
            line = reader.readLine();
        }
        System.out.println(checkSum);
    }

    public static int calcDiff(String values){
        String[] parts = values.split("\t");
        int smallest = Integer.parseInt(parts[0]);
        int largest = Integer.parseInt(parts[0]);
        for(int i = 0; i < parts.length; i++){
            int num = Integer.parseInt(parts[i]);
            if(num < smallest){
                smallest = num;
            }
            if(num > largest){
                largest = num;
            }
        }
        return largest - smallest;
    }
}
