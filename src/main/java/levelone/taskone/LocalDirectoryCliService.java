package levelone.taskone;

import java.util.List;

public class LocalDirectoryCliService implements FileService {
    Output output;
    LocalDirectoryLister lister;

    public LocalDirectoryCliService (String path, Output output) {
        this.output = output;
        this.lister = new LocalDirectoryLister(path);

    }


    public void show() {
        List<String> fileEntries = lister.getDirectoryFiles();
        output.write(fileEntries);


    }
}
