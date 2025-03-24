package levelone;

import levelone.taskone.LocalDirectoryCliService;
import levelone.taskone.Output;
import levelone.taskone.StringListToCliOutput;

public class TaskOne {
    public static void main(String[] args) {
        String path;
        if (args.length == 0) {
            path = CliPrompter.prompt("Please enter the path to the folder you wish to use: ");
        } else path = args[0];
        Output output = new StringListToCliOutput();
        LocalDirectoryCliService printer = new LocalDirectoryCliService(path, output);
        printer.show();


    }
}

