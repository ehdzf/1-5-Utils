package levelone;

import levelone.taskone.FileReaderService;
import levelone.taskone.Output;
import levelone.taskone.StringListToCliOutput;

public class TaskFour {
    private static String path = "src/main/resources/levelone/taskfour/lorem.txt";

    public static void main(String[] args) {
        Output output = new StringListToCliOutput();
        if (args.length > 0) {
            path = args[0];
        }
        FileReaderService service = new FileReaderService(path, output);
        service.show();
    }
}
