package csa.dice;

/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Die
{
    
    private static Random generator = new Random();
    private int numFaces; //number of sides
    private int faceValue; //current value showing on the die
    
    public Die(){
        numFaces = 6;
        faceValue = 1;
    }
    //Explicitly sets the size of the die. Defaults to a size of six if the
    // parameter is invalid. Initial face value is 1.
    public Die (int faces){
        numFaces = faces;
        faceValue = 1;
    }
    
    //Rolls the die and returns the result.
    
    public int roll() {
        faceValue = generator.nextInt(numFaces) + 1;
        return faceValue;
    }
    
    public int getFaceValue () {
        return faceValue;
    }

    public int getNumFaces() {
        return numFaces;
    }
}
