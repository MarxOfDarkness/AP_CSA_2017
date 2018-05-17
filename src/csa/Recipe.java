package csa;

import java.util.ArrayList;
import java.util.ListIterator;

public class Recipe {
    public static void main (String[] args){
        ArrayList ingredients = new ArrayList();

        ingredients.add("flour");
        ingredients.add("sugar");
        ingredients.add("cocoa");
        ingredients.add("oil");
        ingredients.add("butter");
        ingredients.add("eggs");
        ingredients.add("baking soda");

        System.out.println("To make a chocolate cake, use the following " + ingredients.size() + " ingredients: ");
        ListIterator iterator = ingredients.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
