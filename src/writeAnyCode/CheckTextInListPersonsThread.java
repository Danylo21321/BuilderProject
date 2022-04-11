package writeAnyCode;

import java.util.List;

public class CheckTextInListPersonsThread extends Thread {
    List<Object> objects = List.of(new Person("12", "ivan")
            , new Person("12", "ivan")
            , new Person1("33", "petro"));

    @Override
    public void run() {
        try {
            sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Builder builder = new IOBuilder();
        builder.checkText(objects);
    }
}
