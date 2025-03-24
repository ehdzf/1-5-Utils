package levelone.taskone;

import java.io.Serializable;

public class ObjectToSerialize implements Serializable {
    private final String name;


    public ObjectToSerialize(String name)  {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ObjectToSerialize{" +
                "name='" + name + '\'' +
                '}';
    }
}
