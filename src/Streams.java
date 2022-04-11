
public class Streams {
    public static void main(String[] args) {
        Builder person = new Realize();
        person.startProgram().getText("filter age <= 60 and >= 18 ").filterPersonAge().showText().getText("person mid age")
                .getText("sort people - ").sortedPeople().showText().finishProgram();
        Builder persons = new Realize();
        persons.startProgram().filterFor("age <=60 and >= 18").finishProgram();

        _sum("a vs b",12,98);

        MethodCalculator method = new MethodCalculator();

        method.calculator();


    }
    public static void _sum(String s, int a, int b){
        if (a > b){
            System.out.println("a > b");
        }else {
            System.out.println("b > a");
        }
        System.out.println(s);
    }
    }

