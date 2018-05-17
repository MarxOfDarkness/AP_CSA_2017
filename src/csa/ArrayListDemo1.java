package csa;
import java.util.ArrayList;

public class ArrayListDemo1
{
    public static void main(String[] args)
    {
        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("carrots");			// carrots
        veggies.add("broccoli");		// carrots, broccoli
        veggies.add("lettuce");			// carrots, broccoli, lettuce
        veggies.add("cauliflower");		// carrots, broccoli, green beans, lettuce, cauliflower
        veggies.remove(0);			// broccoli, green beans, lettuce, cauliflower
        veggies.set(1, "asparagus");		// broccoli, asparagus, lettuce, cauliflower
        veggies.remove(2);			// broccoli, asparagus, cauliflower
        System.out.println(veggies);

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("plums");			// plums
        fruits.add("figs");			// plums, figs
        fruits.add("apples");			// plums, figs, apples
        String mySnack = fruits.get(1); 	// figs
        fruits.add(mySnack);			// plums, figs, apples, figs
        System.out.println(fruits.get(0)); 	// plums
        fruits.remove(0);			// figs, apples, figs
        System.out.println(fruits.remove(0)); 	// figs
        System.out.println(fruits.size());	// 3 (apples, figs)
        System.out.println(fruits.get(fruits.size() - 1)); // figs
        System.out.println(fruits);		// apples, figs

        ArrayList<String> names = new ArrayList<String>();
        names.add("Fran");
        names.add("Alfred");
        names.add("Sally");
        System.out.println("The names that are alphabetically less than M are: ");

        for (String nextSnack : names)
        {
            if (nextSnack.compareTo("M") < 0)
                System.out.println(nextSnack + " ");
        }

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++)
            nums.add(i);			// 1 2 3 4 ... 10

        System.out.println(nums.get(3));	// 4

        for (int i = 0; i < nums.size(); i++)
            if (nums.get(i) % 2 == 0)
                nums.remove(i);

        System.out.println(nums);		// 1 3 5 7 9

        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Jill Miller");		// Jill Miller
        friends.add("Bill Miller");		// Jill Miller, Bill Miller
        friends.add("Carly Sampson");		// Jill Miller, Bill Miller, Carly Sampson
        friends.set(1, "Will Maloney");		// Jill Miller, Will Maloney, Carly Sampson
        friends.add(2, "Phil Collins");		// Jill Miller, Will Maloney, Phil Collins, Carly Sampson
        friends.remove(0);			// Will Maloney, Phil Collins, Carly Sampson
        displayInitials(friends);
        System.out.println(friends);
    }

    public static void displayInitials(ArrayList<String> arr)
    {
        for (String x : arr)
        {
            System.out.print(x.substring(0, 1));
            System.out.println(x.substring(x.indexOf(" ") + 1, x.indexOf(" ") + 2));
        }
    }    // end of displayInitials method

}  // end of ArrayListDemo class

