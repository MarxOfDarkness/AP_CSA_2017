package csa;

public class OldMcDonald {
    public static void main(String[] args){
        Cow c = new Cow();
        Pig p = new Pig();
        Duck d = new Duck();
        Sheep s = new Sheep();
        Chick ch = new Chick();
        buildLyrics(c.getType(), c.getSound());
        buildLyrics(p.getType(), p.getSound());
        buildLyrics(d.getType(), d.getSound());
        buildLyrics(s.getType(), s.getSound());
        buildLyrics(ch.getType(), ch.getSound());
    }

    private static void buildLyrics(String type, String sound) {
        System.out.println("Old McDonald had a farm E-I-E-I-O");
        System.out.println("and on that farm he had a " + type + " E-I-E-I-O");
        System.out.println("With a " + sound + " " + sound + " here and a " + sound + " " + sound + " there here a " + sound + ", there a " + sound + " everywhere a " + sound + " " + sound);
        System.out.println("Old McDonald had a farm E-I-E-I-O");
        System.out.println();
    }
}
