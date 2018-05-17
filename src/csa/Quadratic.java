package csa;

/**
 * Calculates the answers to a quadratic equation.
 *
 * @author Corbin Estes
 * @version 10-14-17
 */
import java.lang.*;
public class Quadratic{
    private double a;
    private double b;
    private double c;
    public static void main(String[] args){

        Quadratic quad = new Quadratic(-2, 48, 252);
        quad.calculate();
    }

    private Quadratic(double a, double b, double c){
        //System.out.println("Input a: ");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private void calculate(){
        System.out.println(((0-b) + Math.sqrt((b*b) - 4 * a * c))/2*a);
        System.out.println(((0-b) - Math.sqrt((b*b) - 4 * a * c))/2*a);
    }

}
