package levelone.taskone;

import java.util.List;

public class StringListToCliOutput implements Output {

    public void write(List<String> list) {

        for (String item : list) {
            System.out.println(item);
        }
    }
}
