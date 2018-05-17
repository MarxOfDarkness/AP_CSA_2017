package csa;

import java.util.ArrayList;
import java.util.List;

public class RandomStringChooser {
    private static List<String> wordList = new ArrayList<>();

    public RandomStringChooser(String[] words){
        for (int i = 0; i < words.length; i++){
            wordList.set(i, words[i]);
        }
    }

    public static String getNext(){
        if (!wordList.isEmpty()){
            return wordList.remove((int) (Math.random() * wordList.size()));
        }
        return "NONE";
    }
}
