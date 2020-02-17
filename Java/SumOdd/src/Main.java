public class Main {

    public static void main(String[] args) {
        int x = SumOddRange.sumOdd(1, 100);
        System.out.println(x);
        x = SumOddRange.sumOdd(-1, 100);
        System.out.println(x);
        x = SumOddRange.sumOdd(100, 100);
        System.out.println(x);
    }
}
