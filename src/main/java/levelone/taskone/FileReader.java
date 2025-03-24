package levelone.taskone;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private final String filePath;
    private final List<String> lines = new ArrayList<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
        readFile();

    }

    private void readFile() {

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> getLines() {
        return lines;
    }
}
