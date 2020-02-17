public class Main {
    public static void main(String[] args) {
        int count = 1000;
        for(int testNum = 1; testNum <= count; testNum++) {
            boolean result = PerfectNumber.isPerfectNumber(testNum);
            if(result) System.out.println(testNum);
        }
    }
}
