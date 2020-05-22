import java.util.Scanner;

// INCOMPLETE

public class Prob577A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n = sc.nextDouble();
        double x = sc.nextDouble();
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            if(x == 1) {
                ans = 1;
                break;
            }
            for(int j = 1; j <= n; j++) {
                if(i * j == x) ans++;
            }
        }
        System.out.println(ans);
    }
}
