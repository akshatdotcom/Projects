public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if(number < 1) return false;
        int sum = 0;
        for(int testNum = 1; testNum < number; testNum++) {
            if(number % testNum == 0) {
                sum += testNum;
            }
        }
        return sum == number;
    }
}
