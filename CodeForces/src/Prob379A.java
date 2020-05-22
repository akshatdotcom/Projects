import java.util.Scanner;

// WRONG

public class Prob379A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int candlesLeft = a;
        int candlesWentOut = 0;
        int candlesBurned = 0;

        for(int i = 1; i <= candlesLeft; i++) {
            candlesLeft--;
            candlesWentOut++;
            candlesBurned++;
            if(candlesWentOut == b) {
                candlesLeft++;
                candlesWentOut -= b;
            }
        }

        System.out.println(candlesBurned);

    }
}
