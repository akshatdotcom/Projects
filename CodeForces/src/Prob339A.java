import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// INCOMPLETE

public class Prob339A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String working = sc.next().replace("'+'", " ");
        String arr[] = working.split(" ");

        int list[] = new int[arr.length];

        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

//        for(int j = 0; j < arr.length; j++) {
//            list[j] = Integer.parseInt(arr[j]);
//        }

        Arrays.sort(list);
        String ans = "";
        for(int i = 0; i < list.length; i++) {
            ans += list[i] + "+";
        }

        ans = ans.substring(0, ans.length() - 1);
        System.out.println(ans);
    }
}
