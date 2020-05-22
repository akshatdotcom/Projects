import java.util.Scanner;

public class Prob584A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int t = sc.nextInt();
        String ans = "";
        if(t == 10) {
            if(n == 1) ans = "-1";
            if(n > 1) {
                for(int i = 0; i < n-1; i++) {
                    ans += 1;
                }

                ans += "0";
            }
        } else if(t < 10) {
            for(int i = 0; i < n; i++) {
                ans += t;
            }
        } else {
            ans = "-1";
        }

        System.out.println(ans);
    }
}
