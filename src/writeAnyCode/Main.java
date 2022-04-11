package writeAnyCode;

public class Main {

    public static void main(String[] args) {
        SerializeAndDeserializeThread serAndDeSer = new SerializeAndDeserializeThread();
        serAndDeSer.start();
        CheckTextInListPersonsThread checkText = new CheckTextInListPersonsThread();
        checkText.start();
    }
}
