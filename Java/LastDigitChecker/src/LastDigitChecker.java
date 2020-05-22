public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!(isValid(x))) return false;
        if (!(isValid(y))) return false;
        if (!(isValid(z))) return false;
        int xDigit = x % 10;
        int yDigit = y % 10;
        int zDigit = z % 10;
        if ((xDigit == yDigit) || (xDigit == zDigit) || (yDigit == zDigit)) return true;
        else return false;
    }
    public static boolean isValid(int x) {
        if ((x < 10) || (x > 1000)) return false;
        else return true;
    }
}
