package levelone.taskone;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalDirectoryLister extends LocalDirectory {

    public LocalDirectoryLister(String path) {
        super(path);
    }

    protected File[] sortFiles(File dir) {
        File[] files = dir.listFiles();
        ensureFilesExists(files);
        Arrays.sort(files, (file1, file2) -> {
            if (file1.isDirectory() && !file2.isDirectory()) {
                return -1;
            } else if (!file1.isDirectory() && file2.isDirectory()) {
                return 1;
            } else {
                return file1.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
            }
        });
        return files;
    }

    private void ensureFilesExists(File[] files) {
        if (files == null) {
            throw new NullPointerException("No files found in directory " + directory.getAbsolutePath());
        }
    }

    private File[] getFiles() {
        return sortFiles(getDirectory());
    }

    protected ArrayList<String> getDirectoryFiles() {
        ArrayList<String> directoryFiles = new ArrayList<>();
        for (File file : getFiles()) {
            directoryFiles.add(file.getName());
        }
        return directoryFiles;
    }
}
