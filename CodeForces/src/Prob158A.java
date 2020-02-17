import java.util.ArrayList;
import java.util.Scanner;

public class Prob158A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int working = sc.nextInt();
            arr.add(working);
        }

        int base = arr.get(k - 1);

        for(int j = 0; j < arr.size(); j++) {
            if(arr.get(j) >= base && arr.get(j) > 0) answer++;
        }

        System.out.println(answer);

    }
}
