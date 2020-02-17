public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) return false;
        if (number % 2 == 1) return true;
        else return false;
    }

    public static int sumOdd(int start, int end) {
        if ((start < 0) || (end < 0) || end < start) return -1;
        int sum = 0;
        for(int x = start; x <= end; x++) {
            if (isOdd(x)) {
                sum += x;
            }
        }
        return sum;
    }
}
