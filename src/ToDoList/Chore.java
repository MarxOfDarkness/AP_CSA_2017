package ToDoList;

public class Chore {
    private String name;
    private String description;
    public Chore(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
