package leveltwo;

import levelone.taskone.Output;
import levelone.taskone.RecursiveLocalDirectoryService;
import levelone.taskone.StringListToFileOutput;

public class TaskOne {
    public static void main(String[] args) {
        String path = ConfigLoader.getProperty("file.path");
        System.out.println(path);
        String fileName = ConfigLoader.getProperty("file.output");
        Output output = new StringListToFileOutput(fileName);
        RecursiveLocalDirectoryService printer = new RecursiveLocalDirectoryService(path, output);
        printer.show();
    }
}
