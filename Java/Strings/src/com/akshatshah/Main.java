package com.akshatshah;

public class Main {

    public static void main(String[] args) {

	String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
    myString = myString + ", and this is more";
        System.out.println("my string is equal to " + myString);

    int topScore = 80;
    int secondTopScore = 68;
    if  (topScore > secondTopScore && topScore < 100) {
        System.out.println("Greater than top score and less than 100");
    }
    if ((topScore > 90) || (secondTopScore <= 90)) {
        System.out.println("At least one of these tests is true.");
    }


    int newValue = 50;
    if (newValue == 50) {
        System.out.println("This is true");

        boolean isCar = false;
        if (isCar) System.out.println("this is not supposed to happen");

        isCar = true;

        boolean wasCar = isCar ? true : false;
        if (wasCar) System.out.println("wasCar is true");

        double variable = 20;
        double variable2 = 80;

        double variableSum = (variable + variable2) * 25;
        System.out.println(variableSum);
        double variableQuotient = variableSum % 40;
        System.out.println(variableQuotient);
        if (variableQuotient <= 20) System.out.println("Total was over the limit");


        // expressions
        // statements
        // code blocks
        // methods

    }





    }
}
