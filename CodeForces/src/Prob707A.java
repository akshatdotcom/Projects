import java.util.ArrayList;
import java.util.Scanner;

public class Prob707A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        String temp = "";
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                temp += sc.next();
            }
        }
        if(temp.contains("C") || temp.contains("M") || temp.contains("Y")) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
    }
}
