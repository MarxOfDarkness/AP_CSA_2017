package csa;

public class MyTwoDArray {
    public static void main(String[] args){
        double[][] table = new double[5][5];
        for(int row = 0; row < table.length; row++){
            for (int col = 0; col < table[row].length; col++){
                table[row][col] = Math.random() * 1;
            }
        }
        for (int row = 0; row < table.length; row++){
            for (int col = 0; col < table[row].length; col++){
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
