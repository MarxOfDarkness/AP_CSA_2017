package Game;


import java.util.ArrayList;
import java.util.List;

public class CharacterClass {
    public String className;
    public int hitPoints;
    public int dexterity;
    public int wisdom;
    public int intelligence;
    public int constitution;
    public int charisma;
    List<CharacterClass> classes = new ArrayList<>();
    public CharacterClass(String name, int hp, int dex, int wis, int intel, int con, int cha){
        className = name;
        hitPoints = hp;
        dexterity = dex;
        wisdom = wis;
        intelligence = intel;
        constitution = con;
        charisma = cha;
    }

}
