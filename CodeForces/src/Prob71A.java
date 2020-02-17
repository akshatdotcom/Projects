import java.util.Scanner;

public class Prob71A {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++) {
            String word = sc.next();
            if (word.length() > 10) {
                System.out.print(word.charAt(0));
                System.out.print(word.length() - 2);
                System.out.print(word.charAt(word.length() - 1));
                System.out.println("");
            } else {
                System.out.println(word);
            }
        }
    }
}
