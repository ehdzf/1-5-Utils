package levelone.taskone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StringListToFileOutput implements Output {
    private static final String SEPARATOR = File.separator;
    private final String projectRoot = System.getProperty("user.dir");
    private final File file;

    public StringListToFileOutput(String fileName) {
        this.file = new File(projectRoot + SEPARATOR + "storage" + SEPARATOR + fileName);
    }

    private void createFile() {
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void write(List<String> dirEntries) {
        if (!file.exists()) {
            createFile();
        }
        try (FileWriter writer = new FileWriter(file)) {
            for (String entry : dirEntries) {
                writer.write(entry + "\n");
            }
        } catch (IOException e) {
            //io
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
