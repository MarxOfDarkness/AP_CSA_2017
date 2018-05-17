package csa.TIcTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringJoiner;

public class TicTacToeV1 {
    private static boolean gameOver = false;
    private static boolean playerWins = false;
    private static boolean computerWins = false;
    private static boolean catWins = false;
    private static String[] board = new String[9];
    private static ArrayList<String> diagBoard = new ArrayList<>();
    private static ArrayList<String> colBoard = new ArrayList<>();
    private static ArrayList<String> Board = new ArrayList<>();
    private static ArrayList<String> Wins = new ArrayList<>();
    public static void main (String[] args)throws Exception{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in)
        );

        for (int i = 0; i < board.length; i++){
            board[i] = "" + (i + 1);

        }
        System.out.println("Do you want to play the game? Y/N");
        String ans = in.readLine();

        while (!ans.equalsIgnoreCase("Y") || !ans.equalsIgnoreCase("N")) {
            if (ans.equalsIgnoreCase("Y")) {
                runGame(in);
            } else if (ans.equalsIgnoreCase("N")) {
                System.out.println("Ok. Have a nice day.");
            } else {
                System.out.println("Invalid input");
                ans = in.readLine();
            }
        }


    }

    private static void setBoard(String [] board){
        boardRow(new String[]{board[0], board[1], board[2]});
        boardRow(new String[]{board[3], board[4], board[5]});
        boardRow(new String[]{board[6], board[7], board[8]});

        boardCol(new String[]{board[0], board[3], board[6]});
        boardCol(new String[]{board[1], board[4], board[7]});
        boardCol(new String[]{board[2], board[5], board[8]});

        boardDiag(new String[]{board[0], board[4], board[8]});
        boardDiag(new String[]{board[2], board[4], board[6]});
    }

    private static void boardRow(String[] spaces){
        if (Board.size() >= 3){
            for (int i = 0; i < Board.size() -1; i++){
                Board.remove(i);
            }
        }
        StringJoiner joiner = new StringJoiner("\t");
        for (String space : spaces){
            joiner.add(space);
        }
        String row = joiner.toString();
        Board.add(row);
    }

    private static void boardCol(String[] spaces){
        if (colBoard.size() >= 3){
            for (int i = 0; i < colBoard.size() -1; i++){
                colBoard.remove(i);
            }
        }
        StringJoiner joiner = new StringJoiner("\t");
        for (String space : spaces){
            joiner.add(space);
        }
        String col = joiner.toString();
        colBoard.add(col);
    }

    private static void boardDiag(String[] spaces){
        if (diagBoard.size() >= 2){
            for (int i = 0; i < diagBoard.size() -1; i++){
                diagBoard.remove(i);
            }
        }
        StringJoiner joiner = new StringJoiner("\t");
        for (String space : spaces){
            joiner.add(space);
        }
        String diag = joiner.toString();
        diagBoard.add(diag);
    }

    private static void runGame(BufferedReader in)throws Exception{
        boolean playerFirst = false;
        String playerLetter = "";
        String computerLetter = "";
        System.out.println("Ok. Xs or Os?");
        String letter = in.readLine();
        while (playerLetter.equals("")) {
            if (letter.equalsIgnoreCase("X")) {
                playerLetter = "X";
                computerLetter = "O";
                playerFirst = true;
            } else if (letter.equalsIgnoreCase("O")) {
                playerLetter = "O";
                computerLetter = "X";
                playerFirst = false;
            } else {
                System.out.println("X or O: ");
                letter = in.readLine();
            }
        }
        System.out.println();
        System.out.println("Alright you're " + playerLetter + "s Let's go.");

        setBoard(board );
        printBoard();

        while (!gameOver){
            if (playerFirst){
                playerTurn(in, playerLetter, computerLetter);
                if (playerWins){
                    gameOver = true;
                    break;
                }
                else if (catWins){
                    gameOver = true;
                    break;
                }
                computerTurn(playerLetter, computerLetter);
                if (computerWins) {
                    gameOver = true;
                }
                else if (catWins){
                    gameOver = true;
                }
            }
            else{
                computerTurn(playerLetter, computerLetter);
                if (computerWins){
                    gameOver = true;
                    break;
                }
                else if (catWins){
                    gameOver = true;
                    break;
                }
                playerTurn(in, playerLetter, computerLetter);
                if (playerWins){
                    gameOver = true;
                }
                else if (catWins){
                    gameOver = true;
                }
            }
        }
    }

    private static void playerTurn(BufferedReader in, String playerLetter, String computerLetter) throws IOException {
        System.out.println("Your turn. Where do you want to play? ");
        int space = Integer.parseInt(in.readLine());
        while (board[space - 1].equals(playerLetter) || board[space - 1].equals(computerLetter)){
            System.out.println("There is already a letter there.");
            System.out.println("Choose another space.");
            space = Integer.parseInt(in.readLine());
        }

        board[space - 1] = playerLetter;

        setBoard(board);
        printBoard();

        for (String row : Board) {
            if (row.equals(playerLetter + "\t" + playerLetter + "\t" + playerLetter)){
                System.out.println("YOU WIN!! \nGood game.");
                playerWins = true;
            }
        }

        for (String col : colBoard) {
            if (col.equals(playerLetter + "\t" + playerLetter + "\t" + playerLetter)){
                System.out.println("YOU WIN!! \nGood game.");
                playerWins = true;
            }
        }

        for (String diag : diagBoard) {
            if (diag.equals(playerLetter + "\t" + playerLetter + "\t" + playerLetter)){
                System.out.println("YOU WIN!! \nGood game.");
                playerWins = true;
            }
        }
    }

    private static void printBoard() {
        System.out.println();
        for (String row : Board){
            System.out.println(row);
            System.out.println();
        }
        System.out.println();
    }

    private static void computerTurn( String playerLetter, String computerLetter) {
        System.out.println("My turn.");
        int place = (int) (Math.random() * 9);
        boolean space = true;
        while (space) {
            for (int row = 0; row < Board.size(); row++) {
                if(Board.get(row).equals(playerLetter + "\t" + playerLetter + "\t" + ((row + 1) * 3))){
                    place = ((row + 1) * 3) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (Board.get(row).equals(playerLetter + "\t" + (((row + 1) * 3) - 1) + "\t" + playerLetter)){
                    place = (((row + 1) * 3) - 1) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (Board.get(row).equals((((row + 1) * 3) - 2) + "\t" + playerLetter + "\t" + playerLetter)){
                    place = (((row + 1) * 3) - 2) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
            }

            for (int col = 0; col < colBoard.size(); col++) {
                if(colBoard.get(col).equals(playerLetter + "\t" + playerLetter + "\t" + ((col + 1) + 6))){
                    place = ((col + 1) + 6) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (colBoard.get(col).equals(playerLetter + "\t" + ((col + 1) + 3) + "\t" + playerLetter)){
                    place = ((col + 1) + 3) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (colBoard.get(col).equals((col + 1) + "\t" + playerLetter + "\t" + playerLetter)){
                    place = col;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
            }

            for (int diag = 0; diag < diagBoard.size(); diag++) {
                if(diagBoard.get(diag).equals(playerLetter + "\t" + playerLetter + "\t" + (10 - (diag + 1)))){
                    place = (10 - (diag + 1)) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (diagBoard.get(diag).equals(playerLetter + "\t" + 5 + "\t" + playerLetter)){
                    place = 4;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (diagBoard.get(diag).equals(((diag + 1) + diag) + "\t" + playerLetter + "\t" + playerLetter)){
                    place = ((diag + 1) + (diag)) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
            }

            for (int row = 0; row < Board.size(); row++) {
                if(Board.get(row).equals(computerLetter + "\t" + computerLetter + "\t" + ((row + 1) * 3))){
                    place = ((row + 1) * 3) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (Board.get(row).equals(computerLetter + "\t" + (((row + 1) * 3) - 1) + "\t" + computerLetter)){
                    place = (((row + 1) * 3) - 1) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (Board.get(row).equals((((row + 1) * 3) - 2) + "\t" + computerLetter + "\t" + computerLetter)){
                    place = (((row + 1) * 3) - 2) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
            }

            for (int col = 0; col < colBoard.size(); col++) {
                if(colBoard.get(col).equals(computerLetter + "\t" + computerLetter + "\t" + ((col + 1) + 6))){
                    place = ((col + 1) + 6) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (colBoard.get(col).equals(computerLetter + "\t" + ((col + 1) + 3) + "\t" + computerLetter)){
                    place = ((col + 1) + 3) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (colBoard.get(col).equals((col + 1) + "\t" + computerLetter + "\t" + computerLetter)){
                    place = col;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
            }

            for (int diag = 0; diag < diagBoard.size(); diag++) {
                if(diagBoard.get(diag).equals(computerLetter + "\t" + computerLetter + "\t" + (10 - (diag + 1)))){
                    place = (8 - (diag * 2));
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (diagBoard.get(diag).equals(computerLetter + "\t" + 5 + "\t" + computerLetter)){
                    place = 4;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
                else if (diagBoard.get(diag).equals( (diag + (diag + 1)) + "\t" + computerLetter + "\t" + computerLetter)){
                    place = ((diag + 1) + (diag)) - 1;
                    if (!board[place].equals(playerLetter) || !board[place].equals(computerLetter)) {
                        break;
                    }
                }
            }

            space = false;
        }

        board[place] = computerLetter;

        setBoard(board);
        printBoard();

        for (String row : Board) {
            if (row.equals(computerLetter + "\t" + computerLetter + "\t" + computerLetter)) {
                System.out.println("Nice try. \nBetter luck next time.");
                computerWins = true;
            }
        }

        for (String col : colBoard) {
            if (col.equals(computerLetter + "\t" + computerLetter + "\t" + computerLetter)) {
                System.out.println("Nice try. \nBetter luck next time.");
                computerWins = true;
            }
        }

        for (String diag : diagBoard) {
            if (diag.equals(computerLetter + "\t" + computerLetter + "\t" + computerLetter)) {
                System.out.println("Nice try. \nBetter luck next time.");
                computerWins = true;
            }
        }

        int count = 0;
        for (String row : Board){
            if (row.equals(computerLetter + "\t" + computerLetter + "\t" + playerLetter)){
                count++;
            }
            else if (row.equals(computerLetter + "\t" + playerLetter + "\t" + computerLetter)){
                count++;
            }
            else if (row.equals(playerLetter + "\t" + computerLetter + "\t" + computerLetter)){
                count++;
            }
            else if (row.equals(computerLetter + "\t" + playerLetter + "\t" + playerLetter)){
                count++;
            }
            else if (row.equals(playerLetter + "\t" + computerLetter + "\t" + playerLetter)){
                count++;
            }
            else if (row.equals(playerLetter + "\t" + playerLetter + "\t" + computerLetter)){
                count++;
            }
        }

        if (count == 3){
            System.out.println("Cat's game!");
        }
    }
}
