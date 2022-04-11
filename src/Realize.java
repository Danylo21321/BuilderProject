
import java.util.List;
import java.util.OptionalDouble;

public class Realize implements Builder{
    List<Person> list = List.of(new Person("man", "ivan", 12)
            , new Person("man", "petro", 19)
            , new Person("man", "igor", 90)
            , new Person("women", "anna", 20));

    @Override
    public Builder startProgram() {  return this;}

    @Override
    public Builder getText(String text) {
        System.out.println(text);
        return this;
    }

    @Override
    public Builder finishProgram() {  return this;}

    @Override
    public Builder showText() {
        System.out.println("  " +
                "  ");
        return this;
    }

    @Override
    public Builder filterPersonAge() {
        list.stream().filter(person -> person.getSex().contains("man")).filter(person -> person.getAge() <= 60)
                .filter(person -> person.getAge() >=18).forEach(System.out::println);
        return this;
    }

    @Override
    public Builder midelAgePerson() {
        OptionalDouble midleAge = list.stream().mapToDouble(Person::getAge).average();
        System.out.println(midleAge);
        return this;
    }

    @Override
    public Builder peopleWhoWork() {
        list.stream().filter(person -> person.getSex().contains("man")).filter(person -> person.getAge() <= 60)
                .forEach(System.out::println);
        list.stream().filter(person -> person.getSex().contains("women")).filter(person -> person.getAge() <= 55)
                .forEach(System.out::println);
        return this;
    }

    @Override
    public Builder sortedPeople() {
        list.stream().sorted((o1, o2) -> o1.name.compareTo(o2.getName())).forEach(System.out::println);
        return this;
    }

    @Override
    public Builder filterFor(String p) {
        list.stream().filter(person -> person.getSex().contains("man")).filter(person -> person.getAge() <= 60)
                .filter(person -> person.getAge() >=18).forEach(System.out::println);
        return this;
    }
}
