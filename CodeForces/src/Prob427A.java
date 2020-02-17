import java.util.Scanner;

public class Prob427A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int policeAvailable = 0;
        int untreatedEvents = 0;
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp < 0) {
                if(policeAvailable > 0) {
                    policeAvailable--;
                } else {
                    untreatedEvents++;
                }
            } else {
                policeAvailable += temp;
            }
        }
        System.out.println(untreatedEvents);
    }
}
