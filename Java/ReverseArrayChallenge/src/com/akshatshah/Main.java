package com.akshatshah;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    public static void reverse(int[] originalArray) {
        int[] reverseArray = new int[originalArray.length];
        int x = 0;
        for(int i = originalArray.length - 1; i >= 0; i--) {
            reverseArray[i] = originalArray[x];
            x++;
        }

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Reverse array: " + Arrays.toString(reverseArray));

    }
}
