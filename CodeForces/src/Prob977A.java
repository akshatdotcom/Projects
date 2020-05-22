import java.util.Scanner;

public class Prob977A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long k = sc.nextLong();

        long ans = n;

        for(int i = 0; i < k; i++) {
            if(ans % 10 != 0) {
                ans--;
            } else {
                ans /= 10;
            }
        }

        System.out.println(ans);
    }
}
