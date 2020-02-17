// http://codeforces.com/problemset/problem/1277/A


import java.util.Scanner;

public class Problem1277A {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int queries = sc.nextInt();

        long n = sc.nextLong();
        int b = 0, ans = 0;
        for (int len = 1; len <= 9; len++) {
            b = b * 10 + 1;
            for (int m = 1; m <= 9; m++)
                if (b * m <= n) {
                    ans++;
                }

        }
    }
}
