package com.akshatshah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            int number;
            if(first && hasNextInt) {
                number = scanner.nextInt();
                max = number;
                min = number;
                first = false;
            } else {
                if(hasNextInt) {
                    number = scanner.nextInt();
                    if(number > max) max = number;
                    if(number < min) min = number;
                } else {
                    break;
                }
            }

            scanner.nextLine();
        }

        System.out.println("min = " + min + ", max = " + max);

        scanner.close();
    }
}
