package csa;

public class CollegeStudent extends Student{
    private String major;
    private int year;

    public CollegeStudent(String myName, int myAge, String myGender, String myIDNum, double myGPA, String major, int year) {
        super(myName, myAge, myGender, myIDNum, myGPA);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + "Major: " + major + "Year: " + year;
    }
}
