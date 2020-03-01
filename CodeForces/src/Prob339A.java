import java.io.*;
import java.util.*;

// INCOMPLETE

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

    }

    public static String printArray(String[] strArr) {
        String answer = "";
        for(String str:strArr) {
            answer += str + "+";
        }
        return answer.substring(0, answer.length()-1);
    }
}
