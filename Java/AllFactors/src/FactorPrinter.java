public class FactorPrinter {
    public static void printFactors(int number) {
        if(number < 1) System.out.println("Invalid Value");
        for(int testNum = 1; testNum <= number; testNum++) {
            if(number % testNum == 0) System.out.println(testNum);
        }
    }
}
