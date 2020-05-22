// http://codeforces.com/problemset/problem/1281/A

import java.util.Scanner;

// COMPLETE, ACCEPTED

public class Problem1281A {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int queries = sc.nextInt();
        sc.nextLine();
        String a;
        for(int i = 0; i < queries; i++) {
            a = sc.nextLine();
            if(a.substring(a.length() - 2, a.length()).equals("po")) {
                System.out.println("FILIPINO");
                continue;
            }
            if(a.substring(a.length() - 4, a.length()).equals("desu")) {
                System.out.println("JAPANESE");
                continue;
            }
            if(a.substring(a.length() - 4, a.length()).equals("masu")) {
                System.out.println("JAPANESE");
                continue;
            }
            if(a.substring(a.length() - 5, a.length()).equals("mnida")) {
                System.out.println("KOREAN");
            }
        }
    }
}
