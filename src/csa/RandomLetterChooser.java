package csa;

public class RandomLetterChooser extends RandomStringChooser{
    private String string;
    public RandomLetterChooser(String str){
        super(getSingleLetters(str));
    }

    private static String[] getSingleLetters(String str) {
        String[] arr = str.split("");
        return arr;
    }

}
