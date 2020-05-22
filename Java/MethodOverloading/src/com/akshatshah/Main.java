package com.akshatshah;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Akshat", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);

        calcFeetAndInchesToCentimeters(72);

        calcFeetAndInchesToCentimeters(7, 0);


    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            double centimeters = ((feet * 12) * 2.54) + (inches * 2.54);
            System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }

        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = inches % 12;
            System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        System.out.println("Invalid inches parameter");
        return -1;

    }







}
