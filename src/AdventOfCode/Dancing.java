package AdventOfCode;

import java.util.ArrayList;
import java.util.List;

public class Dancing {
    public static void main(String[] args){
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
        System.out.println(spin(letters, 3));
        System.out.println(partner(letters, 'f','k'));
        System.out.println(exchange(letters, 7, 13));
        String hello = "hello";
        System.out.println(hello.substring(1, 3));
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
