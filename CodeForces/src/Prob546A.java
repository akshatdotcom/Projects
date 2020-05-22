import java.util.Scanner;

public class Prob546A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int firstBanana = sc.nextInt();
        long money = sc.nextInt();
        int wants = sc.nextInt();

        int needed = 0;

        for(int i = 1; i <= wants; i++) {
            needed += i * firstBanana;
        }
        long answer = needed - money;
        if(answer > 0) System.out.println(answer);
        else System.out.println("0");
    }
}
