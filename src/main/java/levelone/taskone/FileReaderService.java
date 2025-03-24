package levelone.taskone;

public class FileReaderService implements FileService {
    private final Output output;
    private final FileReader fileReader;

    public FileReaderService(String path, Output output) {
        this.output = output;
        this.fileReader = new FileReader(path);
    }

    @Override
    public void show() {
        output.write(fileReader.getLines());
    }
}
