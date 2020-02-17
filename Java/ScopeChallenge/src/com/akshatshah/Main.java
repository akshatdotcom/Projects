package com.akshatshah;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int x;

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        if(scanner.hasNextInt()) {
            x = scanner.nextInt();
            scanner.close();
        }
	    for(int x = 0; x <= 12; x++) {
            System.out.println(Main.x + " * " + x + " = " + Main.x * x);
        }
    }
}
