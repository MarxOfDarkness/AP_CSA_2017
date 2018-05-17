package csa;

public class TrailClasify {
    private static int[] markers = new int[13];
    static {
        markers[0] = 100;
        markers[1] = 150;
        markers[2] = 105;
        markers[3] = 120;
        markers[4] = 90;
        markers[5] = 80;
        markers[6] = 50;
        markers[7] = 75;
        markers[8] = 75;
        markers[9] = 70;
        markers[10] = 80;
        markers[11] = 90;
        markers[12] = 100;
    }
    public boolean isLevelTrailSegment(int start, int end){
        return (markers[start] - markers[end] <= 10 || markers[end] - markers[start] <= 10);
    }
    public boolean isDifficult(int[] trail){
        int diffCount = 0;
        for(int i = 0; i < trail.length; i++){
            if(trail[i] - (i - 1) <= -30 || trail[i] - (i - 1) >= 30){
                diffCount++;
            }
        }
        return diffCount >= 3;
    }
}
