package AdventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckSumDay2B {

    public static void main(String[] args) throws IOException {
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

    public static int calcDiff(String values) {
        String[] parts = values.split("\t");
        List<Integer> numbers = new ArrayList<>();
        int small = 0;
        int large = 0;
        for (int i = 0; i < parts.length; i++) {
            numbers.add(Integer.parseInt(parts[i]));
        }
        for(int i = 0; i < numbers.size(); i++){
            for(int j = 0; j < numbers.size(); j++){
                if(i != j && numbers.get(i) % numbers.get(j) == 0){
                    small = numbers.get(j);
                    large = numbers.get(i);
                }
            }
        }
        return large/small;
    }
}
