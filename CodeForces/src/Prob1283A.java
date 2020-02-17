import java.util.Scanner;

public class Prob1283A {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int queries = sc.nextInt();

        for(int i = 0; i < queries; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int totalM = h * 60 + m;
            System.out.println((24*60) - totalM);
        }
    }
}
