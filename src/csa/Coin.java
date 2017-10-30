package csa;

/**
 * Write a description of class coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class Coin{
    private final int HEADS = 0;
    private final int TAILS = 1;
    
    private int face;
    
    public Coin(){
        flip();
    }
    
    public void flip (){
        face = (int) (Math.random() * 2);
    }
    
    public boolean isHeads (){
        return (face == HEADS);
    }
    
    public String toString(){
        String faceName;
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
            
        return faceName;
    }
}
