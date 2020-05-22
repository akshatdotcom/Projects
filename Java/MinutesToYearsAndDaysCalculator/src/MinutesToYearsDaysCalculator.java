public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long years = (int) (minutes / 525_600);
            long remainingMinutes = minutes % 525_600;
            long days = (int) (remainingMinutes / 1440);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}
