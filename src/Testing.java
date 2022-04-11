import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;


public class Testing {
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/writeJava1";
    public static final File file = new File("ioTest");

    public static void main(String[] args) {
        inputDo();
    }
    public static void inputDo(){
        try {

            FileInputStream inputStream = new FileInputStream(path + file.getName());

            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();
            StringBuilder profesion = new StringBuilder();
            StringBuilder name1 = new StringBuilder();
            StringBuilder age1 = new StringBuilder();
            StringBuilder profesion1 = new StringBuilder();
            int b = 0;
            while ((b = inputStream.read()) != 44){
                name.append((char) b);
            }
            while ((b = inputStream.read()) != 44){
                age.append((char) b);
            }
            while ((b = inputStream.read()) != 10){
                profesion.append((char) b);
            }

            Person2 personDoctor = new Person2(name.toString(),age.toString());

            while ((b = inputStream.read())!= 44){
                name1.append((char) b);
            }
            while ((b = inputStream.read())!= 44){
                age1.append((char) b);
            }
            while ((b = inputStream.read())!=-1){
                profesion1.append((char) b);
            }

            Person1 personDriver = new Person1(name1.toString(),age1.toString());
            outputDo(personDriver + "\n" + personDoctor);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputDo(String persons){
        try {
            FileOutputStream outputStream = new FileOutputStream(path+File.separator+file);
            outputStream.write(persons.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputDo(Person1 personDriver){
        try {
            FileOutputStream outputStream = new FileOutputStream(path+File.separator+file);
            outputStream.write(personDriver.toString().getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
@Data
@AllArgsConstructor
class Person1{
    String name;
    String age;
}
@Data
@AllArgsConstructor
class Person2{
    String name;
    String age;
}
