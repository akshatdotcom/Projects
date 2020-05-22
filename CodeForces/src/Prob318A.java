import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// INCOMPLETE

public class Prob318A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n = sc.nextDouble();
        double k = sc.nextDouble();
        double kReacher = 0;
        ArrayList<Double> arr = new ArrayList<>();
        for(double i = 1; i <= n; i++) {
            if(-1+2*i <= n && kReacher < k) {
                kReacher++;
                arr.add((-1 + 2 * i));
            } else break;
        }

        for(double i = 1; i <= n; i++) {
            if(2*i <= n && kReacher < k) {
                kReacher++;
                arr.add((double) (2 * i));
            } else break;
        }

        System.out.println(arr.get(((int)k)-1));
    }
}
