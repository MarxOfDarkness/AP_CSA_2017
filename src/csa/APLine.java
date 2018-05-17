package csa;

public class APLine {
    private int a;
    private int b;
    private int c;
    private APLine(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
     private double getSlope(){return ((double) -a/b);}

    private boolean isOnLine(int x, int y){
        return (((a * x) + (b * y) + c) == 0);
    }
    public static void main(String[] args){
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println("Slope: " + slope1);
        if(onLine1)
            System.out.println("Point is on the line");
        else
            System.out.println("Point is not on the line");
        System.out.println();
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(6, -2);
        System.out.println("Slope: " + slope2);
        if(onLine2)
            System.out.println("Point is on the line");
        else
            System.out.println("Point is not on the line");
    }
}
