package Studying;

public class FlashCards {
    private String prompt;
    private String answer;
    public FlashCards(String answer, String prompt){
        this.prompt = prompt;
        this.answer = answer;
    }

    public String getPrompt() {

        return prompt;
    }

    public String getAnswer() {

        return answer;
    }
}
