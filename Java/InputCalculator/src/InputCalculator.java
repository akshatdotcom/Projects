import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average;
        int count = 0;
        while(true) {
            int number;
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                average = Math.round((float) sum / count);
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
