import java.util.Scanner;

public class Prob1030A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int queries = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < queries; i++) {
            if(sc.nextInt() == 1) {
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
