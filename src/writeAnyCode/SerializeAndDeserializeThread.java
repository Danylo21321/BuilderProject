package writeAnyCode;

import java.util.List;

public class SerializeAndDeserializeThread extends Thread {
    List<Object> objects = List.of(new Person("12", "ivan")
            , new Person("12", "ivan")
            , new Person1("33", "petro"));

    @Override
    public void run() {
        Builder builder = new IOBuilder();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        builder.serializeAndDeserialize(objects);
    }
}
