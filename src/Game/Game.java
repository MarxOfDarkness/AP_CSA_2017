package Game;

import java.util.ArrayList;

public class Game {

    private static int gameNumber;
    private static String characterClass;

    public Game(String clss){
        gameNumber = -1;
        characterClass = clss;
    }

    public int getGameNumber() {
        return gameNumber;
    }
}
