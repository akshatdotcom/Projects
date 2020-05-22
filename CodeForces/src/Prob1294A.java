import java.util.Scanner;

// INCOMPLETE, gotta work on hw now lol

public class Prob1294A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long t = sc.nextLong();
        long a;
        long b;
        long c;
        long n;
        long PolyA;
        long PolyB;
        long PolyC;
        boolean flag = false;
        for(int i = 0; i < t; i++) {
            long polyA = 0;
            long polyB = 0;
            long polyC = 0;
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            n = sc.nextLong();
            while(polyA <= n) {
                polyB = 0;
                while(polyB >= 0) {
                    while(polyC >= 0) {
                        polyC = n - polyA - polyB;
                        if(a + polyA == b + polyB && a + polyA == c + polyC) {
                            System.out.println("YES");
                            flag = true;
                            break;
                        }
                        polyB++;
                    }
                }
                polyA++;
            }

            if(!flag) {
                System.out.println("NO");
            }



        }
    }
}
