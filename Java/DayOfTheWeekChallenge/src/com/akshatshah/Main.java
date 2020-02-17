package com.akshatshah;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeekIfElse(-1);
        printDayOfTheWeekIfElse(0);
        printDayOfTheWeekIfElse(1);
        printDayOfTheWeekIfElse(2);
        printDayOfTheWeekIfElse(3);
        printDayOfTheWeekIfElse(4);
        printDayOfTheWeekIfElse(5);
        printDayOfTheWeekIfElse(6);



    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeekIfElse(int day1) {
            if (day1 == 0) System.out.println("Sunday");
            else if (day1 == 1) System.out.println("Monday");
            else if (day1 == 2) System.out.println("Tuesday");
            else if (day1 == 3) System.out.println("Wednesday");
            else if (day1 == 4) System.out.println("Thursday");
            else if (day1 == 5) System.out.println("Friday");
            else if (day1 == 6) System.out.println("Saturday");
            else System.out.println("Invalid day");
    }
}
