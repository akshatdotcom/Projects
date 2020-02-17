package com.akshatshah;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] =scanner.nextInt();
        }

        scanner.close();

        return values;
    }

    public static void printArray(int[] array) {
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " = " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        System.out.println("What is the capacity you would like?");
        int capacity = scanner.nextInt();

        int[] myIntegers = getIntegers(capacity);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
}
