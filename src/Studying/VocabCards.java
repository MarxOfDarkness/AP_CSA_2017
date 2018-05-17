package Studying;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VocabCards {
    private static final Random GENERATOR = new Random();
    private static final List<FlashCards> LIST_CARDS = new ArrayList<>();
    static {
        LIST_CARDS.add(new FlashCards("cynical", "Selfishly calculating: "));
        LIST_CARDS.add(new FlashCards("tyranny", "A government in which a single ruler has absolute power: "));
        LIST_CARDS.add(new FlashCards("falter", "To hesitate or tremble: "));
        LIST_CARDS.add(new FlashCards("pre-eminent", "Superior or notable above all others; outstanding: "));
        LIST_CARDS.add(new FlashCards("apathy", "Lack of interest or concern; indifference: "));
        LIST_CARDS.add(new FlashCards("shrewd", "Disposed to being tricky: "));
        LIST_CARDS.add(new FlashCards("irrepressible", "Difficult or impossible to control or restrain: "));
        LIST_CARDS.add(new FlashCards("ignominious", "Marked by shame or disgrace: "));
        LIST_CARDS.add(new FlashCards("impromptu", "Spoken, preformed, done, or composed with little or no preparation: "));
        LIST_CARDS.add(new FlashCards("vivacious", "Full of motion and spirit: "));
        LIST_CARDS.add(new FlashCards("no", "answer is no"));
    }
    public static List<FlashCards> shuffleList(List<FlashCards> cardsIn){
        List<FlashCards> copy = new ArrayList<>(cardsIn);
        List<FlashCards> newList = new ArrayList<>();
        while(!copy.isEmpty()){
            int num = GENERATOR.nextInt(copy.size());
            newList.add(copy.remove(num));
        }
        return newList;
    }
    public static int runOneQuiz(BufferedReader in) throws Exception{
        int count = 0;
        List<FlashCards> shuffledList = shuffleList(LIST_CARDS);
        for(FlashCards card : shuffledList){
            System.out.println(card.getPrompt());
            String read = in.readLine();
            if (read.equalsIgnoreCase(card.getAnswer())){
                System.out.println("Correct");
                System.out.println();
                count++;
            }
            else {
                System.out.println("Incorrect");
                System.out.println(card.getAnswer());
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(count + "/" + 10);
        return count;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        int count = runOneQuiz(in);
        int i = 0;
        while(true){
            while(i < 1){
                if(count < 6){
                    count = runOneQuiz(in);
                }
                else
                    i++;
            }
            System.out.println("Want to go again? Y/N : ");
            String newGame = in.readLine();
            if(newGame.equals("Y")){
                System.out.println();
                System.out.println("Here we go.");
                i--;
                runOneQuiz(in);
            }
            else if (newGame.equals("N")){
                System.out.println();
                System.out.println("Have a nice day.");
                break;
            }
            else{
                System.out.println();
                System.out.println("Invalid Input");
                System.out.println();
            }
        }
    }
}
