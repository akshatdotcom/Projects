/*
ID: aksshah1
LANG: JAVA
PROG: friday
 */

import java.io.*;
import java.util.*;



public class friday {

    public static final String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> leapYears = calculateLeapYears(1900, 1900+400);
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        int yearsToCalculate = f.read();
        int startingYear = 1900;
        String lastDayOfPreviousYear = "Sunday";

        for(int i = startingYear; i < startingYear + yearsToCalculate; i++) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(leapYears.contains(i)) {
                daysInMonth[1] = 29;
            }
        }
        System.out.println(nextDayOfWeek(daysOfWeek[3]));
        out.close();
    }

    public static String nextDayOfWeek(String dayOfWeek) {
        ArrayList<String> daysOfWeekArr = new ArrayList<>();
        for (String text : daysOfWeek) {
            daysOfWeekArr.add(text);
        }
        if(!dayOfWeek.equals("Saturday")) {
            return daysOfWeekArr.get(daysOfWeekArr.indexOf(dayOfWeek) + 1);
        } else {
            return "Sunday";
        }


    }

    public static ArrayList<Integer> calculateLeapYears(int lowerBoundYear, int upperBoundYear) {
        ArrayList<Integer> leapYears = new ArrayList<>();
        for(int i = lowerBoundYear; i <= upperBoundYear; i++) {
            if(i % 4 == 0) {
                if(i % 100 == 0) {
                    if(i % 400 == 0) leapYears.add(i);
                } else {
                    leapYears.add(i);
                }
            }
        }
        return leapYears;
    }
}
