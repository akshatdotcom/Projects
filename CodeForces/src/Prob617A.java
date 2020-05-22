import java.util.Scanner;

public class Prob617A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int ans = 0;

        ans += n / 5;
        n %= 5;

        ans += n / 4;
        n %= 4;

        ans += n / 3;
        n %= 3;

        ans += n / 2;
        n %= 2;

        ans += n / 1;
        n %= 1;

        System.out.println(ans);
    }
}
