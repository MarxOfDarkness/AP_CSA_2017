package csa;

import java.util.ArrayList;

public class ArrayLists {

    public static void main (String[] args) {

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++)
            list3.add(i);
        for (int i = 0; i < list3.size(); i++)
            if (list3.get(i) == 3 || list3.get(i) == 4)
                list3.remove(i);
        System.out.println(list3); // output is:
        System.out.println("-------------------------------------");
    }
}
