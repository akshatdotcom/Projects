public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        if (number < 10) return 2 * number;
        int tempNum = number;
        int lastDigit;
        lastDigit = tempNum % 10;
        tempNum /= 10;
//        int firstDigit = tempNum;
        if(tempNum < 10) return tempNum + lastDigit;
        while(tempNum >= 100) {
            tempNum /= 10;
        }
        int firstDigit = tempNum / 10;

        return firstDigit + lastDigit;
    }
}
