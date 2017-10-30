package LA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VocabCards {
    private static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
    private static int Count = 0;
    private static final List<FlashCards> LIST_CARDS = new ArrayList<>();
    static {
        LIST_CARDS.add(new FlashCards("Selfishly calculating: ", "cynical"));
        LIST_CARDS.add(new FlashCards("A government in which a single ruler has absolute power: ", "tyranny"));
        LIST_CARDS.add(new FlashCards("To hesitate or tremble: ", "falter"));
        LIST_CARDS.add(new FlashCards("Superior or notable above all others; outstanding: ", "pre-eminent"));
        LIST_CARDS.add(new FlashCards("Lack of interest or concern; indifference: ", "apathy"));
        LIST_CARDS.add(new FlashCards("Disposed to being tricky: ", "shrewd"));
        LIST_CARDS.add(new FlashCards("Difficult or impossible to control or restrain: ", "irrepressible"));
        LIST_CARDS.add(new FlashCards("Marked by shame or disgrace: ", "ignominious"));
        LIST_CARDS.add(new FlashCards("Spoken, preformed, done, or composed with little or no preparation: ", "impromptu"));
        LIST_CARDS.add(new FlashCards("Full of motion and spirit: ", "vivacious"));
    }
    public static List<FlashCards> shuffleList(List<FlashCards> l){
        List<FlashCards> copy = new ArrayList<>(l);
        List<FlashCards> newList = new ArrayList<>();
        Random generator = new Random();
        while(copy.size() > 0){
            int num = generator.nextInt(copy.size());
            newList.add(copy.get(num));
            copy.remove(num);
        }
        return newList;
    }
    public static void runTest() throws Exception{
        List<FlashCards> shuffledList = shuffleList(LIST_CARDS);
        int i = 0;
        while(i < shuffledList.size()){
            System.out.println(shuffledList.get(i).getDefinition());
            String read = in.readLine();
            if (read.equals(shuffledList.get(i).getWord())){
                System.out.println("Correct");
                Count++;
            }
            else {
                System.out.println("Incorrect");
            }
            i++;
        }
        System.out.println();
        System.out.println(Count + "/" + 10);
    }
    public static void main(String[] args)throws Exception{
        runTest();
        while(true){
            if(Count < 6){
                runTest();
            }
            System.out.println("Want to go again? Y/N : ");
            String newGame = in.readLine();
            if(newGame.equals("Y")){
                System.out.println();
                System.out.println("Here we go.");
                runTest();
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
