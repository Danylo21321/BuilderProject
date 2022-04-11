package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lambda lambda = (a, b, c) -> {
            int sum = a + b + c;
            int result = sum / 3;
            System.out.println(result);
        };
        lambda.Sum(12,33,55);


        Lambda lambda1 = (a, b, c) -> {
            int result = a + b + c;
            System.out.println(result);
        };
        lambda1.Sum(1,2,3);

        Lambda lambda2 = (a, b, c) -> {
            System.out.println(Math.max(a,c));
            System.out.println(Math.max(a,b));
        };
        lambda2.Sum(1,2,3);
    }
    public interface Lambda{
        void Sum(int a, int b, int c);
    }
}
