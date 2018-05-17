package AdventOfCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindDistanceDay3a {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Number: ");
        int target = Integer.parseInt(in.readLine());
        int level = (int) (Math.ceil((Math.sqrt(target) - 1)/2));
        int sideLength = (2 * level) + 1;
        int x = level;
        int y = -level;
        int lastInRow = (int)(Math.pow(2 * (level - 1) + 1, 2));
        int stepsRemaining = target - lastInRow;

        int moveBy = Math.min(stepsRemaining, (sideLength - 1));
        y += moveBy;
        stepsRemaining -= moveBy;
        moveBy = Math.min(stepsRemaining, (sideLength - 1));
        x -= moveBy;
        stepsRemaining -= moveBy;
        moveBy = Math.min(stepsRemaining, (sideLength - 1));
        y -= moveBy;
        stepsRemaining -= moveBy;
        moveBy = Math.min(stepsRemaining, (sideLength - 1));
        x += moveBy;
        stepsRemaining -= moveBy;

        System.out.println(x + " " + y);
        System.out.println(Math.abs(x) + Math.abs(y));
    }
}
