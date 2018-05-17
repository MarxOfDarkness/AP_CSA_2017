package csa;

public class HorseCreate implements Horse {
    private String name;
    private int weight;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public HorseCreate (String n, int w){
        name = n;
        weight = w;
    }
}
