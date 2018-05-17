package Studying;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudyTemplate {
    private static final Random GENERATOR = new Random();
    static final List<FlashCards> CARDS = new ArrayList<>();

    private static List<FlashCards> shuffleList(List<FlashCards> CardsIn){
        List<FlashCards> copy = new ArrayList<>(CardsIn);
        List<FlashCards> newList = new ArrayList<>();
        while (!copy.isEmpty()){
            int num = GENERATOR.nextInt(copy.size());
            newList.add(copy.remove(num));
        }
        return newList;
    }

    private static int RunOneQuiz(BufferedReader in) throws Exception{
        int count = 0;
        List<FlashCards> shuffledList = shuffleList(CARDS);
        for(FlashCards card : shuffledList){
            System.out.println(card.getPrompt());
            String read = in.readLine();
            if(read.equalsIgnoreCase(card.getAnswer())){
                System.out.println("Correct");
                count++;
                System.out.println();
            }
            else{
                System.out.println("Incorrect");
                System.out.println(card.getAnswer());
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(count + "/" + CARDS.size());
        return count;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        int count = RunOneQuiz(in);
        int i = 0;
        while(true){
            while(i < 1){
                if(count < 6){
                    count = RunOneQuiz(in);
                }
                else{
                    i++;
                }
            }
            System.out.println("Want to go again? Y/N: ");
            String again = in.readLine();
            if(again.equalsIgnoreCase("Y")){
                System.out.println();
                System.out.println("Here we go");
                i--;
                count = RunOneQuiz(in);
            }
            else if(again.equalsIgnoreCase("N")){
                System.out.println();
                System.out.println("Have a nice day.");
                break;
            }
            else{
                System.out.println();
                System.out.println("Invalid input");
                System.out.println();
            }
        }
    }
}
