package com.akshatshah;

public class Main {

    public static void main(String[] args) {
        System.out.println("$10,000 at 2% interest = " + calculateInterest(10000, 2.0));
        System.out.println("$10,000 at 3% interest = " + calculateInterest(10000, 3.0));
        System.out.println("$10,000 at 4% interest = " + calculateInterest(10000, 4.0));
        System.out.println("$10,000 at 5% interest = " + calculateInterest(10000, 5.0));
        // for(init; termination; increment)

        for(int i = 0; i <= 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for(int interestRate = 2; interestRate < 9; interestRate++) {
            System.out.println("$10,000 at " + interestRate + "% interest = $" + String.format("%.2f",calculateInterest(10000, interestRate)));
        }
        for(int x = 8; x >= 2; x--) {
            System.out.println("$10,000 at " + x + "% interest = $" + String.format("%.2f", calculateInterest(10000, x)));
        }

        int count = 0;
        for(int i=10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number!");
                if(count == 10) {
                    System.out.println("Exiting the for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
