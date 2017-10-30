package csa;

/**
 * Write a description of class Basic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
public class Stringtest
{
    public static void main (String[] args){
        int zero, five, x, y;
        
        five = 5;
        zero = 0;
        x = 3; 
        y = 4;
        
        String state = "Hawaii-";
        String tvshow = state + five + "-" + zero;
        System.out.println(tvshow);
        Date d1 = new Date(10,2, 2017);
        Date d2 = new Date(10, 3, 2017);
        Date d3 = new Date();
        System.out.println(d3);
    }
}
