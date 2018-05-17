package csa;

public class Sheep implements Animal{
    private String myType;
    private String mySound;

    public Sheep(){
        myType = "sheep";
        mySound = "baa";
    }

    public String getSound(){
        return mySound;
    }

    public String getType(){
        return myType;
    }
}
