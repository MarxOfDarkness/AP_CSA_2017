package AdventOfCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindNumberDay3b {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("End point: ");
        final int END = Integer.parseInt(in.readLine());
        int[] numbers = new int[END];
        numbers[0] = 1;
        for(int i = 1; i <= END; i++){
            numbers[i] = numbers[i - 1];
        }
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] >= END){
                System.out.println(numbers[i]);
            }
        }
    }
}
