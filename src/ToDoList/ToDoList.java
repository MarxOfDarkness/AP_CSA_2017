package ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Chore> list = new ArrayList<>();
    private String name;

    public ToDoList (String name){
        this.name = name;
    }

    public void addItem(Chore chore){
        list.add(chore);
    }

    public void removeItem(Chore chore){
        list.remove(chore);
    }

    public String getName() {
        return name;
    }

    public void getItems(){
        for (Chore i : list) {
            System.out.println(i.getName() + " : " + i.getDescription());
        }
    }

    public ArrayList<Chore> getList() {
        return list;
    }
}
