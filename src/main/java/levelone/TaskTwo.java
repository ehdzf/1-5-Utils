package levelone;

import levelone.taskone.Output;
import levelone.taskone.RecursiveLocalDirectoryService;
import levelone.taskone.StringListToCliOutput;

public class TaskTwo {
    public static void main(String[] args) {
        String path;
        if (args.length == 0) {
            path = CliPrompter.prompt("Please enter the path to the folder you wish to use: ");
        } else path = args[0];
        Output output = new StringListToCliOutput();
        RecursiveLocalDirectoryService printer = new RecursiveLocalDirectoryService(path, output);
        printer.show();
    }
}
