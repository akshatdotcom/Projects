import java.util.ArrayList;
import java.util.Scanner;

// INCOMPLETE

public class Prob733A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String temp = sc.next();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < temp.length(); i++) {
            if(hasVowel(temp.charAt(i))) {
                arr.add(i);
            }
        }

        arr.add(arr.get(arr.size()) + 1);

        // calculate max difference between list elements
        int maxDiff = 0;
        int workingDiff = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            workingDiff = arr.get(i + 1) - arr.get(i);
            maxDiff = Math.max(workingDiff, maxDiff);
        }

//        if(temp.length() == 1 && !hasVowel(temp.charAt(0))) {
//            maxDiff = 2;
//        }
//
//        if(temp.length() == 1 && hasVowel(temp.charAt(0))) {
//            maxDiff = 1;
//        }

        System.out.println(maxDiff);
    }

    public static boolean hasVowel(char a) {
        if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'Y') {
            return true;
        }

        return false;
    }
}
