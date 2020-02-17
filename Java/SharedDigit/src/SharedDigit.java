public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if (((x < 10) || x > 99) || (y < 10) || (y > 99)) return false;
        int xFirst = x % 10;
        int xSecond = x / 10;
        int yFirst = y % 10;
        int ySecond = y / 10;
        if (((xFirst == yFirst) || (xFirst == ySecond)) || ((xSecond == yFirst) || (xSecond == ySecond))) return true;
        else return false;
    }
}
