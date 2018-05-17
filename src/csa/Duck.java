package csa;

public class Duck implements Animal{
    private String myType;
    private String mySound;

    public Duck(){
        myType = "duck";
        mySound = "quack";
    }

    public String getSound(){
        return mySound;
    }

    public String getType(){
        return myType;
    }
}
