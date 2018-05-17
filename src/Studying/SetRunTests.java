package Studying;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SetRunTests extends StudyTemplate{
    public static void main(String[] args)throws Exception{
        File file = new File(args[0]);
        BufferedReader input = new BufferedReader(new FileReader(file));
        String test = input.readLine();
        while (test != null) {
            String[] inputs = test.split("-");
            CARDS.add(new FlashCards(inputs[0], inputs[1]));
            test = input.readLine();
        }

        StudyTemplate.main(args);
    }
}
