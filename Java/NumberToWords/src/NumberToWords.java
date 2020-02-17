public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        int reverseNum = reverse(number);
        int numberCount = getDigitCount(number);
        int reverseNumCount = getDigitCount(reverseNum);
        int finalZeroCount = numberCount - reverseNumCount;
        int lastDigit;
        String lastDigitWord = "";
        String lastPrint = "";
        while(reverseNum != 0) {

            lastDigit = reverseNum % 10;
            switch (lastDigit) {
                case 0:
                    lastDigitWord = "Zero";
                    break;
                case 1:
                    lastDigitWord = "One";
                    break;
                case 2:
                    lastDigitWord = "Two";
                    break;
                case 3:
                    lastDigitWord = "Three";
                    break;
                case 4:
                    lastDigitWord = "Four";
                    break;
                case 5:
                    lastDigitWord = "Five";
                    break;
                case 6:
                    lastDigitWord = "Six";
                    break;
                case 7:
                    lastDigitWord = "Seven";
                    break;
                case 8:
                    lastDigitWord = "Eight";
                    break;
                case 9:
                    lastDigitWord = "Nine";
                    break;
            }

            lastPrint += lastDigitWord + " ";
            reverseNum /= 10;



        }
        if(numberCount > reverseNumCount) {
            do {
                lastPrint += "Zero ";
                reverseNumCount++;
            } while(reverseNumCount < numberCount);
        }

        System.out.println(lastPrint);
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        int tempNum = 0;
        while (number != 0) {
            tempNum = number % 10;
            reverseNum += tempNum;
            number /= 10;
            if(number != 0) reverseNum *= 10;
        }

        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if(number < 0) return -1;
        if(number == 0) return 1;
        int digitNum = 0;
        while(number != 0) {
            number /= 10;
            digitNum++;
        }
        return digitNum;
    }
}
