package AdventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DancingPB{
    public static void main (String[] args) throws Exception{

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String set = in.readLine();
        List<Character> letters = new ArrayList<>(16);
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');
        letters.add('f');
        letters.add('g');
        letters.add('h');
        letters.add('i');
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('m');
        letters.add('n');
        letters.add('o');
        letters.add('p');
        System.out.println(set);
        System.out.println(runList(set, letters));
    }
    private static List<Character> runList(String set, List<Character> characterList){
        String[] commands = set.split(",");
        for (int i = 0; i < commands.length; i++){
            if (commands[i].substring(0, 1).equals("s")){
                for (int j = 0; j < characterList.size(); j++) {
                    characterList.set(j, spin(characterList, Integer.parseInt(commands[i].substring(1))).get(j));
                }
            }
            else if (commands[i].substring(0, 1).equals("x")){
                for (int j = 0; j < characterList.size(); j++) {
                    characterList.set(j, exchange(characterList, Integer.parseInt(commands[i].substring(1, commands[i].indexOf('/'))), Integer.parseInt(commands[i].substring(commands[i].indexOf('/') + 1))).get(j));
                }
            }
            else if (commands[i].substring(0, 1).equals("p")){
                for (int j = 0; j < characterList.size(); j++) {
                    characterList.set(j, partner(characterList, commands[i].charAt(1), commands[i].charAt(3)).get(j));
                }
            }
        }
        return characterList;
    }

    private static List<Character> spin(List<Character> Array, int x){
        List<Character> newArray = new ArrayList<>(Array);
        for (int i = 0; i < Array.size(); i ++){
            if (i >= x){
                newArray.set((i - x), Array.get(i));
            }
            else{
                newArray.set(((16 + i) - x), Array.get(i));
            }
        }
        return newArray;
    }

    private static List<Character> partner (List<Character> Array, char A, char B){
        List<Character> newArray = new ArrayList<>(Array);
        int indexA = newArray.indexOf(A);
        int indexB = newArray.indexOf(B);
        newArray.set(indexA, B);
        newArray.set(indexB, A);
        return newArray;
    }

    private static List<Character> exchange (List<Character> Array, int A, int B){
        List<Character> newArray = new ArrayList<>(Array);
        char charA = newArray.get(A);
        char charB = newArray.get(B);
        newArray.set(A, charB);
        newArray.set(B, charA);
        return newArray;
    }
}
