import java.util.ArrayList;
import java.util.Scanner;

// EXCEEDS TIME LIMIT

public class Prob82A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Sheldon");
        arr.add("Leonard");
        arr.add("Penny");
        arr.add("Rajesh");
        arr.add("Howard");
        for(int i = 0; i < n; i++) {
            arr.add(arr.get(0));
            arr.add(arr.get(0));
            arr.remove(0);
        }

        System.out.println(arr.get(arr.size() - 1));
    }
}
