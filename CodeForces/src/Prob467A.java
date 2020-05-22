import java.util.Scanner;

public class Prob467A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int queries = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < queries; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q - p >= 2) ans++;
        }

        System.out.println(ans);
    }
}
