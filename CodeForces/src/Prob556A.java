import java.util.Scanner;

public class Prob556A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int charNum = sc.nextInt();
        String temp = sc.next();
        int one = 0;
        int zero = 0;
        int working;
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == '1') one++;
            else zero++;
        }
        working = Math.min(one, zero);
        System.out.println(temp.length() - 2 * working);
    }
}
