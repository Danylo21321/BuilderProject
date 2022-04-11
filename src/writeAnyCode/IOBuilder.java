package writeAnyCode;

import java.io.*;
import java.util.List;

public class IOBuilder implements Builder {

    @Override
    public Builder serialize(List<Object> objectList) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path + File.separator + file1);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(objectList);
        objectOutputStream.flush();
        objectOutputStream.close();
        return this;
    }

    @Override
    public Builder deserialize() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(path + File.separator + file1);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        List<Object> list = (List<Object>) objectInputStream.readObject();
        System.out.println(list.toString());
        objectInputStream.close();
        return this;
    }

    @Override
    public Builder serializeAndDeserialize(List<Object> objects) {
        try {
            serialize(objects.stream().distinct().toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            deserialize();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public Builder writer(List<Object> objects) {
        try {
            FileWriter writer = new FileWriter(path + File.separator + file, false);
            writer.write(objects.stream().distinct().toList().toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public Builder checkText(List<Object> objects) {
        writer(objects.stream().distinct().toList());
        return this;
    }

}
