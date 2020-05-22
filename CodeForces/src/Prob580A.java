import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

// INCOMPLETE

public class Prob580A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(f.readLine());
        st = new StringTokenizer(f.readLine());
        ArrayList<Integer> lengths = new ArrayList<>();
        int length = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp >= min) {
                length++;
                if(i == num - 1) {
                    lengths.add(length);
                }
                min = temp;
            } else {
                lengths.add(length);
                length = 1;
                min = Integer.MIN_VALUE;
            }
        }
        int max = 1;
        for (int lengthMax :
                lengths) {
            if(lengthMax > max) {
                max = lengthMax;
            }
        }

        out.println(max);

        out.close();
    }
}
