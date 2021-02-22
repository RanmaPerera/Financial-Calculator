package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HistoryWindow {
    public  static List<String> read(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner fileReader = new Scanner(file);
        List<String> readList = new ArrayList<>();

        while (fileReader.hasNextLine()){
            readList.add(fileReader.nextLine());
        }
        return readList;
    }
}
