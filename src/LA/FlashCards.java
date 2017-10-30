package LA;

public class FlashCards {
    private String definition;
    private String word;
    FlashCards(String definition, String word){
        this.definition = definition;
        this.word = word;
    }

    public String getDefinition() {

        return definition;
    }

    public String getWord() {

        return word;
    }
}
