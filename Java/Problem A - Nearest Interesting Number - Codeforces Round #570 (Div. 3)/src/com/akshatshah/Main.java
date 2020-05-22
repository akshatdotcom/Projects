package com.akshatshah;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = scanner.nextInt();
        if(number >= 1 && number <= 1000) {
            nearestInterestingNumber(number);
        }
    }

    public static int nearestInterestingNumber(int number) {
        int originalNumber = number;
        int sum;
        boolean quit = false;
        do {
            sum = sumDigits(originalNumber);
            if(sum % 4 == 0) {
                System.out.println(originalNumber);
                quit = true;
            } else {
                originalNumber++;
            }
        } while(!quit);

        return sum;
    }

    public static int sumDigits(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            // extract least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop least-significant digit
            number /= 10;
        }

        return sum;
    }
}