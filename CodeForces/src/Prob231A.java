import java.util.Scanner;

public class Prob231A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int answer = 0;
        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            if(p + v + t  > 1) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
