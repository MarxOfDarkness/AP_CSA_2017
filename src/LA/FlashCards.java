package LA;

public class FlashCards {
    private String definition;
    private String word;
    public FlashCards(String word, String definition){
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
