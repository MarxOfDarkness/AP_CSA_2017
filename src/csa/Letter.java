package csa;

public class Letter extends Mail{
    private final double COST = 0.46;
    public Letter(int i) {
        super(i);  // runs the default constructor in Mail – reminder!
    }
    public double getCost() {
        return COST;
    }

}
