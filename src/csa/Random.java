package csa;

import java.util.ArrayList;

public class Random {
    public static void main (String[] args){
        ArrayList<String> names = new ArrayList<String>();

        names.add("Brandon");
        names.add("Brenda");
        names.add("Bill");
        names.add("Brennan");
        names.add("Tim");

        String randomName = names.get((int) (Math.random() * names.size()));
        System.out.println(randomName);

        double a = 3;
        double b = 227;
        double r = a + (int)(Math.random() * ((b - a) + 1));
        System.out.println(r);

        if (Math.random() <= 0.25){
            System.out.println("Did it!");
        }
    }
}
