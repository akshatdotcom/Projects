import java.util.Scanner;

public class Prob122A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean ans = check(n);
        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean check(int n) {
        String number = Integer.toString(n);
        boolean ans = false;
        if(n % 4 == 0 || n % 7 == 0 || n % 47 == 0) return true;
        if(number.contains("1") || number.contains("2") || number.contains("3") || number.contains("5") || number.contains("6") || number.contains("8") || number.contains("9") || number.contains("0")) {
            return false;
        }

        return true;
    }
}
