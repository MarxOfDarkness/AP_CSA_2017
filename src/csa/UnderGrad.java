package csa;

public class UnderGrad extends StudentNew {
    //default constructor
    public UnderGrad() {
        super();
    }
    //constructor
    public UnderGrad(String studName, int[] studTests, String studGrade) {
        super(studName, studTests, studGrade);
    }
    public void computeGrade() {
        if (getTestAverage() >= 70)
            setGrade("Pass");
        else
            setGrade("Fail");
    }
}