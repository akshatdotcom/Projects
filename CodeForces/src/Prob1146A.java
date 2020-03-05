import java.io.*;

// COMPLETE

public class Prob1146A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        char[] sArr = f.readLine().toCharArray();
        int length = sArr.length;
        int numA = 0;
        for(char letter:sArr) {
            if(letter == 'a') {
                numA++;
            }
        }
        int numOther = length - numA;
//        System.out.println("A: " + numA);
//        System.out.println("Other: " + numOther);
//        System.out.println("Total: " + length);
        while(numOther>=numA) {
            length--;
            numOther--;
        }
        out.println(length);
        out.close();
    }
}
