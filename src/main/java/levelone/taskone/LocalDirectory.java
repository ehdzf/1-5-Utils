package levelone.taskone;

import java.io.File;

public class LocalDirectory {
    protected final String directoryPath;
    protected final File directory;

    public LocalDirectory(String directoryPath) {
        this.directoryPath = directoryPath;
        this.directory = new File(directoryPath);

    }

    protected File getDirectory() {
        return directory;
    }


}
