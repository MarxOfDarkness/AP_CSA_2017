package csa;

public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    private int[][] pixelValues = new int[5][5];
    public int countWhitePixels(){
        int count = 0;
        for (int i = 0; i < pixelValues.length; i++){
            for (int j = 0; j < pixelValues[0].length; i++){
                if (pixelValues[i][j] == 255){
                    count ++;
                }
            }
        }
        return count;
    }

    public void processImage(){
        int row = 0;
        int col = 0;
        for (int i = 0; i < pixelValues.length - 2; i++){
            for (int j = 0; j < pixelValues[0].length - 2; j++){
                pixelValues[i][j] -= pixelValues[i + 2][j + 2];
            }
        }
    }

}
