public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int tempNum = number;
        while (tempNum != 0) {
            reverse = reverse * 10 + tempNum % 10;
            tempNum /= 10;
        }

        return reverse == number;

    }
}
