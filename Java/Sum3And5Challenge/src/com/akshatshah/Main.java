package com.akshatshah;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    int sum = 0;

	    for(int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println("The number " + i + " is divisible by 3 and 5");
                count++;
                sum += i;
            }
	        if (count == 5) break;
        }

        System.out.println("Sum = " + sum);
    }
}
