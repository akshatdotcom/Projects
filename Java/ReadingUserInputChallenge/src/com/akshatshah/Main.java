package com.akshatshah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i + ": ");
            boolean hasNextDouble = scanner.hasNextDouble();

            if(!hasNextDouble) {
                System.out.println("Invalid number");
                i--;
            } else {
                sum += scanner.nextDouble();
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("sum = " + sum);
    }
}
