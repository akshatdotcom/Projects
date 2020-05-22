import java.util.Scanner;

public class Prob791A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int years = 0;
        while(!(a > b)) {
            a *= 3;
            b *= 2;
            years++;
        }

        System.out.println(years);
    }
}
