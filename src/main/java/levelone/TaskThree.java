package levelone;

import levelone.taskone.Output;
import levelone.taskone.RecursiveLocalDirectoryService;
import levelone.taskone.StringListToFileOutput;

public class TaskThree {
    private static final String FILE_NAME = "output.txt";

    public static void main(String[] args) {
        String path;
        if (args.length == 0) {
            path = CliPrompter.prompt("Please enter the path to the folder you wish to use: ");
        } else path = args[0];
        Output output = new StringListToFileOutput(FILE_NAME);
        RecursiveLocalDirectoryService printer = new RecursiveLocalDirectoryService(path, output);
        printer.show();
    }
}

