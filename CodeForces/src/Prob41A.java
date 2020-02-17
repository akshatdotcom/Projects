import java.util.Scanner;

public class Prob41A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String temp1 = sc.next();
        String temp2 = sc.next();

        StringBuilder temp = new StringBuilder(temp2);
        temp2 = temp.reverse().toString();
        if(temp1.equals(temp2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
