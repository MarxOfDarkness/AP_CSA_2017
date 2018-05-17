package csa;

public abstract class Mail {
    private int id;
    public Mail(int i) {
        id = i;
    }
    public abstract double getCost();
    public String toString() {
        return " id: " + id + " Cost: " + getCost();
    }

}
