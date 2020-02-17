import java.util.Scanner;

public class Prob996A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = sc.nextDouble();
        long bills = 0;

        bills += balance / 100;
        balance %= 100;

        bills += balance / 20;
        balance %= 20;

        bills += balance / 10;
        balance %= 10;

        bills += balance / 5;
        balance %= 5;

        bills += balance / 1;
        balance %= 1;

        System.out.println(bills);
    }
}
