package csa;

import java.util.ArrayList;

public class ArraysAP {
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(-1);
        List.add(3);
        List.add(28);
        List.add(17);
        List.add(9);
        List.add(33);
        removeBadPairs(List);
        for (int i = 0; i < List.size(); i++){
            System.out.println(List.get(i));
        }
        System.out.println(0 % 2);

    }

    private static void mystery(int[] list){
        for (int i = 1; i < list.length; i++){
            list[i] = list[i] + list[i - 1];
        }
    }

    private static void mystery5 (ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            int element = list.remove(i);
            list.add(0, element + 1);
        }
    }


    private static void switchPairs (ArrayList<String> list){
        String first = "";
        for (int i = 0; i < list.size(); i++){
            if (i % 2 == 0) {
                first = list.get(i);
                list.set(i, list.get(i + 1));
            }
            else{
                list.set(i, first);
            }
        }
    }

    private static void markLength4 (ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4){
                list.add(list.indexOf(list.get(i)), "****");
            }
        }
    }

    private static void removeBadPairs (ArrayList<Integer> ints){
        if (ints.size() % 2 != 0){
            ints.remove(ints.size() - 1);
        }

        for (int i = 0; i < ints.size(); i++){
            int first = ints.get(i);
            int second = ints.get(i + 1);
            if (first > second){
                ints.remove(i + 1);
                ints.remove(i);
            }
            i++;
        }
    }
}
