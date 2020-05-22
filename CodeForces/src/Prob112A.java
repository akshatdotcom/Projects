import java.util.Scanner;

public class Prob112A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        if(a.compareToIgnoreCase(b) > 0) System.out.println("1");
        if(a.compareToIgnoreCase(b) < 0) System.out.println("-1");
        if(a.compareToIgnoreCase(b) == 0) System.out.println("0");
    }
}
