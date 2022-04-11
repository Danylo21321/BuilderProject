package BestPractise;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - consertator 0 - exit");
            int selected = scanner.nextInt();

            if (selected == 0) {
                break;
            }

            System.out.println("enter currencies (EUR, USD)");
            String selectetedCurencies = scanner.next();;
            double rate = getE(selectetedCurencies);
            System.out.println("Enter amount in "+ selectetedCurencies);
            double amount = scanner.nextDouble();

            double result = amount * rate;
            if (rate == 0){
                System.out.println("error");
            }
            System.out.println(amount + "  " + selectetedCurencies + "=" + result + "UAH");
        }
    }
    public static double getE(String s){
        switch (s){
            case "USD":return Currencies.ESD;
            case "EUR":return Currencies.EUR;
            default:return 0;
        }
    }
}