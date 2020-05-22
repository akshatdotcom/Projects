import java.util.Scanner;

public class Prob1A {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        System.out.println(((m+a-1)/a)*((n+a-1)/a));
    }
}
