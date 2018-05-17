package csa;

public class Time {
    int hrs;
    int min;
    int sec;
    public Time(int h, int m, int s){
        hrs = h;
        min = m;
        sec = s;
    }
    public static void main(String[] args){
        Time t = new Time(1, 2, 3);
        System.out.println(t);

    }
}
