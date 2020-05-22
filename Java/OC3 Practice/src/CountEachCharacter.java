// works perfectly fine

public class CountEachCharacter {
    public static void main(String[] args) {
        // do not edit the code below
        String arr[] = {"screamer", "apple", "banana", "carrot"};
        // do not edit the code above

        String answer;

        char tempChar;
        char tempCharArray[];

        char alphabet[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < arr.length; i++) { // word
            int x[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            answer = arr[i] + ":";

            tempCharArray = arr[i].toCharArray();
            for(int j = 0; j < tempCharArray.length; j++) { // letters
                tempChar = tempCharArray[j];
                for(int k = 0; k < alphabet.length; k++) {
                    if(tempChar == alphabet[k]) {
                        x[k]++;
                    }
                }
            }

            for(int l = 0; l < x.length; l++) {
                if(x[l] > 0) {
                    answer += alphabet[l] + "-" + x[l] + ",";
                }
            }

            System.out.println(answer.substring(0, answer.length() - 1));
        }
    }
}
