package com.akshatshah;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(readIntegers(5)));
//        int[] array = {5, 2, 6, 1, 4, 5, 234, 2, 3};
//        System.out.println(findMin(array));
        System.out.println("Enter the array element count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = readIntegers(count);
        System.out.println("Min value of array = " + findMin(array));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " integers:");
        for(int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int minValue = array[0];
        int temp;

        for(int i = 0; i < array.length - 1; i++) {
            temp = array[i + 1];
            if(temp < minValue) minValue = temp;
        }

        return minValue;
    }
}
