package AdventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Day4CheckPassPhrase {
    public static void main(String[] args) throws Exception  {
        int count = 0;
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null){
            if(isValid(line)){
                count++;
            }
            line = reader.readLine();
        }
        System.out.println(count);
    }
    private static boolean isValid(String line){
        String[] words = line.split(" ");
        for(int i = 0; i < words.length - 1; i++){
            for(int j = 0; j < words.length - 1; j += i){
                if(words[i].equals(words[j])){
                    return false;
                }
            }
        }
        return true;
    }
}
