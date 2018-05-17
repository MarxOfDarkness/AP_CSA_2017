package csa.dice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Write a description of class RollDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RollDice
{
    public static void main(String[] args) throws Exception{
        List<String> pips = new ArrayList<>();
        addPip(pips, new String[]{
                "   ",
                " * ",
                "   "
        });
        addPip(pips, new String[]{
                "*  ",
                "   ",
                "  *"
        });
        addPip(pips, new String[]{
                "*  ",
                " * ",
                "  *"
        });
        addPip(pips, new String[]{
                "* *",
                "   ",
                "* *"
        });
        addPip(pips, new String[]{
                "* *",
                " * ",
                "* *"
        });
        addPip(pips, new String[]{
                "* *",
                "* *",
                "* *"
        });
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.println("Number of sides on die 1 : ");
        int faces1 = Integer.parseInt(in.readLine());
        System.out.println("Number of sides on die 2 : ");
        int faces2 = Integer.parseInt(in.readLine());

        Die die1 = new Die(faces1);
        Die die2 = new Die(faces2);

        
        while(true){
            System.out.println("Press enter key to roll");
            String read = in.readLine();
            if(read.equals("stop")){
                break;
            }
            if(die1.getNumFaces() > 0) {
                System.out.print(die1.roll() + ", ");
            }
            if (die2.getNumFaces() > 0) {
                System.out.print(die2.roll());
                System.out.println();
            }
            if(die1.getNumFaces() <= 6 && die1.getNumFaces() > 0) {
                System.out.println(pips.get(die1.getFaceValue() - 1));
                System.out.println();
            }
            if(die2.getNumFaces() <= 6 && die2.getNumFaces() > 0) {
                System.out.println(pips.get(die2.getFaceValue() - 1));
            }
            System.out.println("------------------------------------------------------------------");
        }
        
    }

    private static void addPip(List<String> pips, String[] lines) {
        StringJoiner joiner = new StringJoiner("\n");
        for (String line: lines) {
            joiner.add(line);
        }
        String string = joiner.toString();
        pips.add(string);
    }
}

