package csa;

public class PriorityLetter extends Letter{
    public PriorityLetter(int i) {
        super(i);
    }

    /* a PriotityLetter costs twice as much as a regular letter. – FINISH!  */
    public double getCost() {
        return (super.getCost() * 2);
    }

}
