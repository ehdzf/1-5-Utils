package levelone.taskone;

import java.io.*;

public class ObjectToFileService {
    private static final String SEPARATOR = File.separator;
    private  Object object;
    private final String path;
    private File file;

    public ObjectToFileService(String fileName, Object object) {
        this.object = object;
        String projectRoot = System.getProperty("user.dir");
        this.path = projectRoot + SEPARATOR+ "storage" + SEPARATOR + fileName;
        file = new File(this.path);
    }
    private void createDirectory()  {
        file.getParentFile().mkdirs();
        try {
             file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void serialize() {

        if (!file.exists()) {
            createDirectory();
        }
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(this.path))) {
            stream.writeObject(object);
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public Object deserialize() {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(this.path))) {
            return stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
}
