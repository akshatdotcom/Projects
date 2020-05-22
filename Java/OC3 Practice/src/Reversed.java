// C163 in Swift
// works perfectly fine

public class Reversed {
    public static void main(String[] args) {
        // do not edit the code below
        String arr[] = {"apple", "banana", "carrot", "rats", "jerk", "microsoft", "google"};
        // do not edit the code above

        String answer;
        StringBuilder reversed;
        char tempArr[];

        for(int i = 0; i < arr.length; i++) {
            answer = arr[i] + ":";
            reversed = new StringBuilder(arr[i]);
            answer += reversed.reverse();
            System.out.println(answer);
        }

    }
}
