package writeAnyCode;

import java.io.*;
import java.util.*;

public interface Builder {
     String path = "/Users/khrystyna_nykolyshyn/Documents/writeJava1";
     File file = new File("finalTemp");
     File file1 = new File("tamp");
    Builder serialize(List<Object> objectList) throws IOException;
    Builder deserialize() throws IOException, ClassNotFoundException;
    Builder serializeAndDeserialize(List<Object> objects);
    Builder writer(List<Object> objects);
    Builder checkText(List<Object> objects);


}
