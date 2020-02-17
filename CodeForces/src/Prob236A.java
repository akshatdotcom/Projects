import java.util.ArrayList;
import java.util.Scanner;

public class Prob236A {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String word = sc.next();
        if(distinctChar(word) % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }

    public static int distinctChar(String word) {
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < word.length(); i++) {
            if(!(arr.contains(word.charAt(i)))) {
                arr.add(word.charAt(i));
            }
        }
        return arr.size();
    }
}
