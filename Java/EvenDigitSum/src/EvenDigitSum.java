public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) return -1;
        if(number == 0) return 0;
        if(number % 2 == 0) {
            return number % 10 + getEvenDigitSum(number / 10);
        }
        return getEvenDigitSum(number / 10);
    }
}
