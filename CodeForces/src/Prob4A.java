import java.util.Scanner;

public class Prob4A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        if(num % 2 == 0 && num > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
