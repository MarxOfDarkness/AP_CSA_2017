package csa;

public class Package extends Mail{
    private double weight; // weight in oz.

    public Package(int i, double w) {
        super(i);
        weight = w;
    }

    /* returns cost of mailing a pagkage, (0.75 per ounce)  - FINISH Method! */
    public double getCost() {
        return(.75 * weight);
    }

    public double getWeight()
    { return weight; }

    public String toString() {
        return (super.toString() + "Weight: " + getWeight());
    }

}
