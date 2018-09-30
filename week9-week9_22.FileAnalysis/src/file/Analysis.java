package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() {
        Scanner reader = null;
        try {
            reader = new Scanner(file, "UTF-8");
        } catch (Exception e) {
            System.out.println("File is not found " + e.getMessage());
        }
        int lineCount = 0;
        while (reader.hasNextLine()) {
            lineCount++;
            reader.nextLine();
        }
        reader.close();
        return lineCount;
    }

    public int characters() {
        int characters = 0;
        Scanner reader = null;
        try {
            reader = new Scanner(file, "UTF-8");
        } catch (Exception e) {
            System.out.println("File is not found " + e.getMessage());
        }
        while (reader.hasNext()) {
            String line = reader.nextLine() + 1; // +1 for counting line brakes
            characters += line.length();
        }
        return characters;
    }
}
