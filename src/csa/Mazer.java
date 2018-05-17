package csa;

public class Mazer {
    private int chance;
    private String[][] maze;

    public Mazer(int rows, int cols){
        maze = new String[rows][cols];
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[0].length; j++){
                chance = (int) ((Math.random() * 10) + 1);
                if (chance == 1 && maze[i][j - 1] == null){
                    maze[i][j] = "|";
                }

                chance = (int) ((Math.random() * 5) + 1);
                if (chance == 1 && maze[i][j - 1] == null){
                    maze[i][j] = "/";
                }

                chance = (int) ((Math.random() * 5) + 1);
                if (chance == 1 && maze[i][j - 1] == null){
                    maze[i][j] = "\\\\";
                }
            }
        }
    }
}
