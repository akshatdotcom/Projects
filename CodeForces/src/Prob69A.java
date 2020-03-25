import java.io.*;
import java.util.StringTokenizer;

// ACCEPTED

public class Prob69A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st;
        int lines = Integer.parseInt(f.readLine());
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(f.readLine());
            sum1 += Integer.parseInt(st.nextToken());
            sum2 += Integer.parseInt(st.nextToken());
            sum3 += Integer.parseInt(st.nextToken());
        }

        out.println(sum1 == 0 && sum2 == 0 && sum3 == 0 ? "YES" : "NO");
        out.close();
    }
}
