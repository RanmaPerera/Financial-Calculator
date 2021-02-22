package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculationHistory {
    public static void CalHistory(String text) throws IOException {
        File file = new File("Calculation History.txt");
        FileWriter fileWriter = null;
        PrintWriter output = null;
        try {
            fileWriter = new FileWriter(file,true);
            output = new PrintWriter(fileWriter,true);
            output.print(text);
            output.println("\n\n\n\n");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fileWriter.close();
            output.close();
        }
    }
}
