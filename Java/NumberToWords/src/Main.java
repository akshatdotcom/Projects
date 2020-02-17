public class Main {
    public static void main(String[] args) {
//        NumberToWords.numberToWords(100);
//        System.out.println(NumberToWords.getDigitCount(100));
//        System.out.println(NumberToWords.reverse(100));
//        System.out.println(NumberToWords.getDigitCount(20000));
//        System.out.println(NumberToWords.getDigitCount(NumberToWords.reverse(20000)));
//        NumberToWords.numberToWords(150);
//        NumberToWords.numberToWords(101);
//        System.out.println(NumberToWords.getDigitCount(101));
//        System.out.println(NumberToWords.reverse(101));
//        System.out.println(" ");
        NumberToWords.numberToWords(101);
        NumberToWords.numberToWords(900);
        System.out.println(NumberToWords.getDigitCount(900));
        System.out.println(NumberToWords.reverse(900));
        System.out.println(NumberToWords.getDigitCount(NumberToWords.reverse(10)));
        NumberToWords.numberToWords(900);

        System.out.println(NumberToWords.getDigitCount(NumberToWords.reverse(900)));
    }
}