package com.company;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 5 / 3;
	float myFloatValue = 5f / 3f;
	double myDoubleValue = 5d / 3d;
	System.out.println("myIntValue = " + myIntValue);
	System.out.println("myFloatValue = " + myFloatValue);
	System.out.println("myDoubleValue = " + myDoubleValue);
	// width of int = 32 (4 bytes)
	// width of float = 32 (4 bytes)
	// width of double = 64 (8 bytes)

	double numberOfPounds = 200d; // change this as you go to check work
	double numberOfKilos = numberOfPounds * .45359237d;
		System.out.println("numberOfKilos = " + numberOfKilos);
    }
}
