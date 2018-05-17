package ToDoList;

import java.util.ArrayList;

public class ListHolder {
    private ArrayList<ToDoList> lists;

    public ListHolder(){
        lists = new ArrayList<>();
    }

    public void addList(ToDoList list){
        lists.add(list);
    }

    public void addToList(Chore chore, String name){
        boolean added = false;

        for (ToDoList i : lists) {
            if (i.getName().equalsIgnoreCase(name)){
                i.addItem(chore);
                added = true;
            }
        }

        if (!added){
            System.out.println("That list does not exist.");
        }

    }

    public void getAllLists(){
        for (ToDoList i : lists) {
            System.out.println(i.getName() + "'s to do list");
            i.getItems();
            System.out.println();
        }
    }

    public void removeList(String name){
        boolean removed = false;
        for (ToDoList i : lists) {
            if (i.getName().equalsIgnoreCase(name)){
                lists.remove(i);
                removed = true;
            }
        }
        if (!removed){
            System.out.println("That list does not exist");
        }
    }

    public void removeFromList(String listName, String choreName){
        boolean removed = false;
        for (ToDoList i : lists) {
            if (i.getName().equalsIgnoreCase(listName)){
                for (int j = 0; j < i.getList().size(); j++){
                    if (i.getList().get(j).getName().equalsIgnoreCase(choreName)){
                        i.removeItem(i.getList().get(j));
                    }
                }
            }
        }
        if (!removed){
            System.out.println("That list does not exist");
        }
    }

}
