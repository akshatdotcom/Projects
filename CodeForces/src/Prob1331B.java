import java.util.ArrayList;
import java.util.Scanner;

// April Fool's Day Contest 2020, ACCEPTED

public class Prob1331B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 2; i < x; i++) {
            if(x % i == 0) {
                factors.add(i);
            }
        }
        if(factors.size() > 0) {
            int temp = factors.get((int) (Math.random() * factors.size()));
            int other = x / temp;
            if(temp > other) {
                System.out.print(other);
                System.out.print(temp);
            } else {
                System.out.print(temp);
                System.out.print(other);
            }
        }

    }
}
