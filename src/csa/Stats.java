package csa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Stats {
    public static void main(String[] args)throws Exception{
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String inputs = in.readLine();
        String[] list = inputs.split(" ");
        System.out.println(calcAverage(list));
        System.out.println(calcDeviant(list, calcAverage(list)));
        System.out.println(findMode(list));
    }

    private static double calcAverage (String[] list){
        double sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += Double.parseDouble(list[i]);
        }
        return sum/list.length;
    }

    private static double calcDeviant (String[] list, double avg){
        double deviant = 0;
        for (int i = 0; i < list.length; i++){
            deviant += Math.pow(Double.parseDouble(list[i]) - avg, 2);
        }
        return Math.sqrt(deviant/(list.length - 1));
    }

    private static double findMode (String[] list){
        for (int i = 0; i < list.length; i ++){

        }
        return 1;
    }
}
