package ToDoList;

public class RunList {
    public static void main(String[] args){
        ListHolder holder = new ListHolder();
        Chore chore = new Chore("Clean the bathroom", "Sink - toilet - mirror");
        ToDoList Teller = new ToDoList("Teller");
        Teller.addItem(chore);
        holder.addList(new ToDoList("Corbin"));
        holder.addList(Teller);
        holder.addToList(chore, "Corbin");
        holder.addToList(chore, "Mom");
        holder.getAllLists();

    }
}
