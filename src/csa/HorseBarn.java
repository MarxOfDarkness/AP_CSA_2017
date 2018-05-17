package csa;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn (Horse[] horses){
        spaces = horses;
    }

    public int findHorseSpace(String name){

        int space = -1;
        for (int i = 0; i < spaces.length; i++){

            if (this.spaces[i] != null && spaces[i].getName().equals(name)){
                space = i;
            }
        }
        return space;
    }

    public void consolidate(){
        for (int i = 1; i < spaces.length - 1; i++){
            if (this.spaces[i] == null){
                for (int j = i + 1; j < spaces.length; j++){
                    if (spaces[j] != null){
                        spaces[i] = spaces[j];
                        spaces[j] = null;
                        j = spaces.length - 1;
                    }
                }
            }
        }
    }
}






