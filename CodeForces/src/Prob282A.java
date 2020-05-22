import java.util.Scanner;

public class Prob282A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int answer = 0;
        for(int i = 0; i < n; i++) {
            String working = sc.next();
            if(working.contains("++")) answer++;
            if(working.contains("--")) answer--;
        }

        System.out.println(answer);
    }
}
