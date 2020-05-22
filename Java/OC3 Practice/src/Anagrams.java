import java.util.Arrays;

// C166 in Swift
// works perfectly fine

public class Anagrams {

    public static void main(String[] args) {

        // do not edit code below

        String arr[] = {"apple:censor", "banana:nabana", "carrot:rotcar", "boar:arob", "moment:tmoemn", "electron:screamer"};

        // do not edit code above

        String originalValue;
        boolean answer;
        char tempArr[];
        char tempArrB[];

        for(int i = 0; i < arr.length; i++) {
            originalValue = arr[i];
            String split[] = arr[i].split(":", 0);
            tempArr = split[0].toCharArray();
            tempArrB = split[1].toCharArray();
            Arrays.sort(tempArr);
            Arrays.sort(tempArrB);
            if(Arrays.equals(tempArr, tempArrB)) {
                answer = true;
            } else answer = false;

            System.out.println(originalValue + ":" + answer);
        }

    }
}
