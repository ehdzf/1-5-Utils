package levelone.taskone;

import java.io.File;
import java.util.List;

public class RecursiveLocalDirectoryService implements FileService {
    private final Output output;
    private final RecursiveLocalDirectoryLister lister;

    public RecursiveLocalDirectoryService(String path, Output output) {
        this.output = output;
        this.lister = new RecursiveLocalDirectoryLister(path);
    }

    @Override
    public void show() {
        final File directory = lister.getDirectory();
        List<String> dirEntries = lister.recursivelyGetDirectoryFiles(directory);
        output.write(dirEntries);
    }
}