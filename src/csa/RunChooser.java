package csa;

public class RunChooser {
    public static void main(String[] args){
        String[] words = {"Hello", "GoodBye", "Good morning"};
        RandomStringChooser r = new RandomStringChooser(words);
        for (int i = 0; i < 5; i++){
            System.out.println(r.getNext());
        }
    }
}
