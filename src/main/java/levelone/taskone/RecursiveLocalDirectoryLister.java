package levelone.taskone;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class RecursiveLocalDirectoryLister extends LocalDirectoryLister {
    private final ArrayList<String> list = new ArrayList<>();

    public RecursiveLocalDirectoryLister(String path) {
        super(path);
    }

    private String buildFileInfo(File file) {
        String date = formatDate(file.lastModified());
        String path = this.getDirectory().toPath().relativize(file.toPath()).toString();
        String info = String.format("| %s | %s", path, date);
        return file.isDirectory() ? String.format("(D) %s", info) : String.format("(F) %s", info);
    }

    private String formatDate(long date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    protected ArrayList<String> recursivelyGetDirectoryFiles(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            File[] sorted = sortFiles(file);

            for (File child : sorted) {
                String info = buildFileInfo(child);
                list.add(info);
                if (child.isDirectory()) {
                    recursivelyGetDirectoryFiles(child);
                }

            }
        }
        return list;
    }


}
