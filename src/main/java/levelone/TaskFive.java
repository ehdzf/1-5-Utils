package levelone;

import levelone.taskone.ObjectToFileService;
import levelone.taskone.ObjectToSerialize;

public class TaskFive {
    private static final String FILE_NAME = "serialized.ser";

    public static void main(String[] args) {
        ObjectToSerialize object = new ObjectToSerialize("example object");
        ObjectToFileService service = new ObjectToFileService(FILE_NAME, object);
        service.serialize();
        Object deserialized = service.deserialize();
        System.out.println("Deserialized object:");
        System.out.println(deserialized);
    }
}

