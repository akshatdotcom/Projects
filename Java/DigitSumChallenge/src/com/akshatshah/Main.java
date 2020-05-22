package com.akshatshah;

public class Main {

    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(23490234);
    }

    public static int sumDigits(int number) {
//        int originalNumber = number;
////        if (number < 10) return -1;
////        int unitsPlace = number % 10;
////        number = number / 10;
////        int tensPlace = number % 100;
////        number = number / 100;
////        int hundredsPlace = number % 1000;
////        number = number / 1000;
////        int thousandsPlace = number % 10000;
////        number = number / 10000;
////        int tenThousandsPlace = number % 100000;
////        number = number / 100000;
////        int sum = unitsPlace + tensPlace + hundredsPlace + thousandsPlace + tenThousandsPlace;
////        System.out.println("The sum of the digits of " + originalNumber + " = " + sum);
////        return sum;
        int originalNumber = number;
        if (number < 10) return -1;
        int sum = 0;
        while (number > 0) {
            // extract least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop least-significant digit
            number /= 10;
        }
        System.out.println("The sum of the digits of the number " + originalNumber + " is " + sum);
        return sum;

    }
}
