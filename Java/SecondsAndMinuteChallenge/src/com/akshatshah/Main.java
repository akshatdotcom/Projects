package com.akshatshah;

public class Main {

    public static void main(String[] args) {

	    getDurationString(0, 75);
	    getDurationString(1500, 350);
	    getDurationString(15000000);

    }

    public static String getDurationString(long minutes, long seconds) {
        // i have removed the 3rd condition from the if statement which was to check whether the seconds parameter of this method is <= than 59
        if ((minutes < 0) || (seconds < 0)) {
            return "Invalid value";
        }

        long totalSeconds = (minutes * 60) + seconds;
        long finalHours = (int) totalSeconds / 3600;
        long remainingSeconds = totalSeconds % 3600;
        long finalMinutes = (int) remainingSeconds / 60;
        long finalSeconds = remainingSeconds % 60;

        String printOut = minutes + " minutes and " + seconds + " seconds = " + finalHours + " hours " + finalMinutes + " minutes and " + finalSeconds + " seconds";
        System.out.println(printOut);
        return printOut;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) return "Invalid value";

        return getDurationString(0, seconds);
    }
}
