package Game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RunGame {
    private static ArrayList<CharacterClass> go = new ArrayList();
    private static ArrayList<Game> savedGames = new ArrayList();
    private static Game running;
    public static void main(String[] args)throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        running = startGame(input);


    }

    private static Game startGame(BufferedReader input)throws Exception{
        System.out.println("New game (n) or saved game (s): ");
        String saved = input.readLine();
        if (saved.equalsIgnoreCase("n")){
            return newGame(input);
        }
        else{
            System.out.println("Game number: ");
            String game = input.readLine();
            return savedGames.get(Integer.parseInt(game));
        }
    }

    private static void save(){
        if (running.getGameNumber() == -1){
            savedGames.add(running);
        }
        else{
            savedGames.set(running.getGameNumber(), running);
        }
    }

    private static Game newGame(BufferedReader input)throws Exception{
        String cClass = "";
        System.out.println("Wizard (wi), Bard (b), Explorer (e), Warrior (wa), Tinkerer (t), Mystic (m)");
        String clss = input.readLine();
        if (clss.equalsIgnoreCase("wi")) {
            cClass = "Wizard";
        }
        else if (clss.equalsIgnoreCase("b")){
            cClass = "Bard";
        }
        else if (clss.equalsIgnoreCase("e")){
            cClass = "Explorer";
        }
        else if (clss.equalsIgnoreCase("wa")){
            cClass = "Warrior";
        }
        else if (clss.equalsIgnoreCase("t")){
            cClass = "Tinkerer";
        }
        else if (clss.equalsIgnoreCase("m")){
            cClass = "Mystic";
        }

        return new Game(cClass);
    }


    /**System.out.println("Sorcerer");
     System.out.println("Wizard");
     System.out.println("Mystic");
     System.out.println("Bard");
     System.out.println("Rogue");
     System.out.println("Barbarian");
     System.out.println("Choose a class: ");**/
}
