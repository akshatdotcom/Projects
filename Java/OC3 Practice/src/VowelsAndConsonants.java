// C164 in Swift
// works perfectly fine

public class VowelsAndConsonants {
    public static void main(String args[]) {

        // do not edit code below

        String arr[]  = {"apples", "carrots", "bananas", "horse", "old", "monopoly"};

        // do not edit code above

        int vowel = 0;
        int consonant = 0;
        char tempChar = 'a';

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length(); j++) {
                tempChar = arr[i].charAt(j);
                if(tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u') {
                    vowel++;
                } else if(tempChar >= 'a' && tempChar <= 'z') {
                    consonant++;
                }
            }
            System.out.println(arr[i] + ":" + vowel + "," + consonant);
            vowel = 0;
            consonant = 0;

        }


    }
}
