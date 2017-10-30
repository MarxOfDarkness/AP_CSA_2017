package csa;

/**
 * Calculates the answers to a quadratic equation.
 *
 * @author Corbin Estes
 * @version 10-14-17
 */
import java.lang.*;
public class Quadratic{
    public double a;
    public double b;
    public double c;
    public Quadratic(double a, double b, double c){
        //System.out.println("Input a: ");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void calculate(){
        System.out.println(((0-b) + Math.sqrt((b*b) - 4 * a * c))/2*a);
        System.out.println(((0-b) - Math.sqrt((b*b) - 4 * a * c))/2*a);
    }
    public static void main(String[] args){
        Quadratic quad = new Quadratic(1, 4, 4);
        quad.calculate();
    }
}
