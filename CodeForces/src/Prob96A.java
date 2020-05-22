import java.util.Scanner;

public class Prob96A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        if(str.contains("0000000") || str.contains("1111111")) System.out.println("YES");
        else System.out.println("NO");
    }
}
