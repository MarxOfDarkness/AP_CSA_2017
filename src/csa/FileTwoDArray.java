package csa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTwoDArray {
    public static void main(String[] args)throws IOException {
        int[][] numbers = new int[100][100];
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader( new FileReader(file));
        String input = in.readLine();
        int row = 0;
        int x = 0, y = 0;
        while(input != null){
            input = in.readLine();
            String[] nums = input.split("\t");
            for (int col = 0; col < nums.length; col++){
                numbers[row][col] = Integer.parseInt(nums[col]);
                x++;
            }
            row++;
            y++;
        }

        for (row = 0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length; col++){
                if (numbers[row][col] != numbers[100][100]){
                    System.out.println(numbers[row][col]);
                }
            }
        }

    }
}
