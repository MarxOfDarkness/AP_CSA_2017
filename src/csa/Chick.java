package csa;

import java.util.Random;

public class Chick implements Animal {
    private String myType;
    private String[] mySound;

    public Chick(){
        myType = "chick";
        mySound = new String[]{"peep", "cluck"};
    }

    public String getSound(){
        int i = (int)(Math.random() * 2);
        return mySound[i];
    }

    public String getType(){
        return myType;
    }

}
