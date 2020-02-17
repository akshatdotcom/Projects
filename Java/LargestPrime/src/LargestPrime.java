public class LargestPrime {
    public static int getLargestPrime(int number) {
        //Looping backwards to find largest prime factor faster
        //Loop also checks if number is greater than 1
        for (int i = number; i > 1; i--) {
            //If 'i' is factor of 'number', proceed
            if (number % i == 0) {
                //Boolean will be used if factor is prime
                boolean primeI = true;
                //Checking if factor is prime
                for (int y = 2; y <= i / 2; y++) {
                    if (i % y == 0) {
                        primeI = false;
                        break;
                    }
                }
                if (primeI) {
                    return i;
                }
            }
        }
        return -1;
    }
}