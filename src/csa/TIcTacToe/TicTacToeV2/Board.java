package csa.TIcTacToe.TicTacToeV2;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Board {
    private ArrayList<String> board = new ArrayList<>();
    public Board(int squaresInRow){
        for (int i = squaresInRow; i >= 1; i++){
            board.add(i + "");
        }
    }



    private void setLetter(int place, String letter){
        board.set(place, letter);
    }
}
