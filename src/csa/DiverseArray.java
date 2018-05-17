package csa;
//Author: Corbin Estes
//Version: 2-5-18
//AP test sample question answers

public class DiverseArray {
    //returns sum of values in a given array
    private static int arraySum(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        return sum;
    }

    //returns an array of the sus of the rows of the 2D array
    private static int[] rowSums(int[][] arr2D) {
        int[] sumArr = new int[arr2D.length];
        for (int i = 0; i < arr2D[0].length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr2D.length; j++) {
                rowSum++;
            }
            sumArr[i] = rowSum;
        }
        return sumArr;
    }

    //returns whether a 2D array is diverse (no 2 sums of rows are the same) or not
    private static boolean isDiverse(int[][] arr2D) {
        boolean diverse = true;
        int[] sums = rowSums(arr2D);
        for (int i = 0; i < sums.length; i++) {
            for (int j = 1; j < sums.length; j++) {
                if (sums[i] == sums[j]) {
                    diverse = false;
                }
            }
        }
        return diverse;
    }
}

