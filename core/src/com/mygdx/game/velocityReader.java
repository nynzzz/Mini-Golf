package com.mygdx.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class velocityReader {
    public velocityReader(){}
    
    public ArrayList<Integer> compute() throws FileNotFoundException{
        
        // File file = new File("/Users/mymac/Documents/GitHub/Project-1-2-Group-01/core/src/com/mygdx/game/VelocityTestTXT.txt");
        File file = new File("core/src/com/mygdx/game/VelocityTestTXT.txt");
        //File file = new File("C:\\Users\\maria\\OneDrive\\Documents\\GitHub\\Project-1-2-Group-01\\core\\src\\com\\mygdx\\game\\VelocityTestTXT.txt");
        
        Scanner scanner = new Scanner(file);

        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while(scanner.hasNext()) {
            count++;
            String word = scanner.next();

            if(count%3 == 0){
                result.add(Integer.parseInt(word));
                //System.out.println(word);
            }
        }
        scanner.close();
        return result;
    }
    
}
