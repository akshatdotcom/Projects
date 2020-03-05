import java.io.*;
import java.util.*;

// ACCEPTED
// major problem faced was because out.close() was missing lol

public class Prob339A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = f.readLine();
        line = line.replace("+", " ");
        String[] arr = line.split(" ");
        Arrays.sort(arr);
        String finalAns = printArray(arr);
        out.println(finalAns);
        out.close();
    }

    public static String printArray(String[] strArr) {
        String answer = "";
        for(String str:strArr) {
            answer += str + "+";
        }
        return answer.substring(0, answer.length()-1);
    }
}
