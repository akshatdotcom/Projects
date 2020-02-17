import java.util.Scanner;

public class Prob281A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String working = sc.next();
        char a = working.charAt(0);
        String ans = Character.toString(a).toUpperCase() + working.substring(1, working.length());
        System.out.println(ans);
    }
}
